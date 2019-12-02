package com.example.E4USA

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import androidx.appcompat.app.AlertDialog
import com.google.firebase.database.*
import java.util.*
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.ValueEventListener




class MainActivity : AppCompatActivity() {

    companion object {
        const val STUDENT_NAME = "com.example.E4USA.studentname"
        const val STUDENT_ID = "com.example.E4USA.student_id"
    }


    private lateinit var userEmail: EditText
    private lateinit var userPassword: EditText
    private lateinit var loginBtn: Button
    private lateinit var registarBtn: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var listViewStudents: ListView

    private var mAuth: FirebaseAuth? = null
    private lateinit var dbref: DatabaseReference
    private lateinit var changingref: DatabaseReference

    private lateinit var students: MutableList<Student>
    private lateinit var allStudents: MutableList<Student>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        students =  ArrayList()
        allStudents = ArrayList()

        dbref = FirebaseDatabase.getInstance().getReference("Users/UserID")
        changingref =  FirebaseDatabase.getInstance().getReference()
        mAuth = FirebaseAuth.getInstance()

        initializeUI()

        loginBtn.setOnClickListener {
            loginUserAccount()


        }

        registarBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegistrationActivity::class.java ))

        }




    }
    override fun onStart() {
        super.onStart()

        //attaching value event listener
        dbref = FirebaseDatabase.getInstance().getReference("Users/UserID")
//        var child = dbref
        dbref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                //clearing the previous artist list
                students.clear()
                allStudents = ArrayList()

                //iterating through all the nodes
                for (postSnapshot in dataSnapshot.children) {
                    //getting artist
                    //print(postSnapshot.getValue())
                    val student_id = postSnapshot.getValue<Student>(Student::class.java)
                    Log.d("Inside Loop Message","found the user "+student_id!!.ProjectList)

                    //adding author to the list
                    students.add(student_id!!)
                }

                //creating adapter
                //val authorAdapter = AuthorList(this@MainActivity, authors)
                //attaching adapter to the listview
                //listViewAuthors.adapter = authorAdapter
            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        })

        val i =0
        for (i in students){
            changingref = (FirebaseDatabase.getInstance().getReference("Users/UserID/"+i))
            changingref.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {

                    //clearing the previous artist list
                    allStudents.clear()

                    //iterating through all the nodes
                    for (postSnapshot in dataSnapshot.children) {
                        //getting artist
                        val studentObj = postSnapshot.getValue<Student>(Student::class.java)
                        //adding author to the list
                        allStudents.add(studentObj!!)
                    }

                    //creating adapter
                }

                override fun onCancelled(databaseError: DatabaseError) {

                }
            })

        }

    }


    private fun loginUserAccount() {

        val email: String = userEmail.text.toString()
        val password: String = userPassword.text.toString()
        var targetStudent:Student ?= null

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(applicationContext, "Please enter email...", Toast.LENGTH_LONG).show()
            return
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(applicationContext, "Please enter password!", Toast.LENGTH_LONG).show()
            return
        }

        mAuth!!.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                progressBar.visibility = View.GONE
                if (task.isSuccessful) {
                    Toast.makeText(applicationContext, "Login successful!", Toast.LENGTH_LONG)
                        .show()

                    // I am making an intent for the dashboard to take on
                    val dashboard = Intent(
                        this@MainActivity,
                        DashboardActivity::class.java
                    )

                    //Log.d("Debug Message","found the user"+allStudents.size)


                    //getting the the logged-in user's object, aka the right student
                    for (usr in students){
                        if (usr.email == email)
                        {
//                            Log.d("Debug Message","found the user "+usr)
                            targetStudent = usr
                            Log.d("Debug Message","found the user "+targetStudent)


                        }
                    }


                    dashboard.putExtra("TargetStudent", targetStudent)
                    // Use the Intent to start the HelloAndroid Activity
                    this.startActivity(dashboard)


                } else {
                    Toast.makeText(
                        applicationContext,
                        "Login failed! Please try again later",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

    }

    private fun initializeUI() {
        userEmail = findViewById(R.id.email)
        userPassword = findViewById(R.id.password)

        loginBtn = findViewById(R.id.login)
        registarBtn = findViewById(R.id.register)
        progressBar = findViewById(R.id.progressBar)
    }

}


