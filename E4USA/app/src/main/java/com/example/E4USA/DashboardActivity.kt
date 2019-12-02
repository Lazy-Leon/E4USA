package com.example.E4USA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*


class DashboardActivity : AppCompatActivity() {

    internal lateinit var buttonInfo: Button
    internal lateinit var buttonSwitchTeams: Button

    private lateinit var listViewProjects: ListView
    private lateinit var databaseTitles: DatabaseReference

    private var mAuth: FirebaseAuth? = null
    private var target: Student ?= null
    private lateinit var prj: MutableList<Project>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)
        val intent1 = intent

        target = intent1.getParcelableExtra("TargetStudent")

        buttonSwitchTeams = findViewById<View>(R.id.buttonswitchUser) as Button
        buttonInfo= findViewById<View>(R.id.buttonswitchUser) as Button

        //authors = ArrayList()

        buttonInfo.setOnClickListener {
            val intent = Intent(applicationContext, InfoActivity::class.java)

            startActivity(intent)
        }

        listViewProjects = findViewById<ListView>(R.id.listViewProjects)



        mAuth = FirebaseAuth.getInstance()
        prj = ArrayList()

    }


    override fun onStart() {
        super.onStart()

        databaseTitles.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                prj.clear()
                prj = target!!.projects

                val titleListAdapter = ProjectList(this@DashboardActivity, prj)
                listViewProjects.adapter = titleListAdapter
            }

            override fun onCancelled(databaseError: DatabaseError) { /* NA */ }
        })
    }



}



