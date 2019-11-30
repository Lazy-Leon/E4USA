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


    private lateinit var userEmail: EditText
    private lateinit var userPassword: EditText
    private lateinit var loginBtn: Button
    private lateinit var registarBtn: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var listViewProjects: ListView

    private var mAuth: FirebaseAuth? = null
    private lateinit var dbref: DatabaseReference

    private lateinit var projects: MutableList<Project>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()

        initializeUI()

        loginBtn.setOnClickListener { loginUserAccount() }

        registarBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegistrationActivity::class.java ))

        }

    }


    private fun loginUserAccount() {

        val email: String = userEmail.text.toString()
        val password: String = userPassword.text.toString()

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
//                    Toast.makeText(applicationContext, "Login successful!", Toast.LENGTH_LONG)
//                        .show()

                    val dashboard = Intent(
                        this@MainActivity,
                        DashboardActivity::class.java
                    )

                    var all_userids: MutableList<Int>
                    dbref = FirebaseDatabase.getInstance().getReference("Users/UserID")

                    dbref.addValueEventListener(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(String::class.java)

                        }

                        override fun onCancelled(error: DatabaseError) {
                            // Failed to read value
                            Log.i(
                                "Failed to read value.",
                                "Failed to read value."
                            )
                        }
                    })

                    //dashboard.putExtra("UserId",  )

                    // Use the Intent to start the HelloAndroid Activity
                    startActivity(dashboard)


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
