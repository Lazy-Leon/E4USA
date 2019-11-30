package com.example.E4USA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth


class DashboardActivity : AppCompatActivity() {

    internal lateinit var buttonInfo: Button
    internal lateinit var buttonSwitchTeams: Button

    private lateinit var listViewProjects: ListView

    private var mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)

        buttonSwitchTeams = findViewById<View>(R.id.buttonswitchUser) as Button
        buttonInfo= findViewById<View>(R.id.buttonswitchUser) as Button
        
        //authors = ArrayList()

        buttonInfo.setOnClickListener {
            val intent = Intent(applicationContext, InfoActivity::class.java)

            startActivity(intent)
        }

        listViewProjects = findViewById(R.id.listViewProjects)




        mAuth = FirebaseAuth.getInstance()

    }
}



