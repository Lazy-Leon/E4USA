package com.example.E4USA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*


class DashboardActivity : AppCompatActivity() {

    private lateinit var buttonInfo: Button
    private lateinit var buttonSwitchTeams: Button
    private lateinit var profilebutton:Button
    private lateinit var buttonLogout: Button

    private lateinit var listViewProjects: ListView
    private lateinit var databaseTitles: DatabaseReference
    private lateinit var database1: DatabaseReference

    private var mAuth: FirebaseAuth? = null
    private var target: Student ?= null
    private lateinit var prj: String
    private lateinit var finalPrj: MutableList<Project>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)
        val intent1 = intent
        finalPrj = ArrayList()

        databaseTitles =FirebaseDatabase.getInstance().getReference()
        database1 = FirebaseDatabase.getInstance().getReference("Projects/ProjectID")

        target = intent1.getParcelableExtra("TargetStudent")


        buttonSwitchTeams = findViewById<View>(R.id.buttonswitchUser) as Button
        buttonInfo= findViewById<View>(R.id.About) as Button
        profilebutton = findViewById<View>(R.id.profileb) as Button
        buttonLogout = findViewById<View>(R.id.Logout) as Button

        buttonInfo.setOnClickListener {
            val intent = Intent(applicationContext, InfoActivity::class.java)
            intent.putExtra("TargetStudent",target)
            startActivity(intent)
        }

        buttonLogout.setOnClickListener{
            Toast.makeText(
                this,
                "Logout Successfully",
                Toast.LENGTH_LONG
            ).show()
            startActivity(Intent(this@DashboardActivity, MainActivity::class.java))
        }

        listViewProjects = findViewById(R.id.listViewProjects)

        profilebutton.setOnClickListener {
            val intent = Intent(applicationContext, ProfileActivity::class.java)
            intent.putExtra("user",target)
            startActivity(intent)
        }

        mAuth = FirebaseAuth.getInstance()
        prj =""

        listViewProjects.onItemClickListener = AdapterView.OnItemClickListener { _, _, item, _ ->
            //getting the selected artist
            val targetProject = finalPrj[item]

            //creating an intent
            val intent = Intent(applicationContext, ProjectPageActivityActivity::class.java)

            //putting artist name and id to intent
            intent.putExtra("projinfo", targetProject)
            intent.putExtra("something", target)

            //starting the activity with intent
            startActivity(intent)
        }

    }


    override fun onStart() {
        super.onStart()

        var projs:MutableList<Project>



        database1.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                finalPrj.clear()

                prj= ""
                prj = target!!.ProjectList
                var prjArray = prj.split(',')
                val final = ArrayList<Int>()
                for(elem in prjArray)
                {
                    final.add(elem.toInt())
                }
                Log.d("Inside Adapter" , prj.split(',').toString())

                //TODO first, get all the projects from the database and put them in a list
                projs = java.util.ArrayList()


                //iterating through all the nodes
                for (postSnapshot in dataSnapshot.children) {
                    //getting artist
                    //print(postSnapshot.getValue())
                    val student_id = postSnapshot.getValue<Project>(Project::class.java)
                    Log.d("Inside Loop Message","found the user "+student_id!!)

                    //adding author to the list
                    projs.add(student_id)
                }


                //prj = target!!.projects

                //extract the user's projects from the project list and put those in another list called final_prj
                for (each in projs){
                    if (final.contains(each.ProjID))
                    {
                        finalPrj.add(each)
                    }

                }

                val titleListAdapter = ProjectList(this@DashboardActivity, finalPrj)
                listViewProjects.adapter = titleListAdapter
            }

            override fun onCancelled(databaseError: DatabaseError) { /* NA */ }
        })
    }



}

