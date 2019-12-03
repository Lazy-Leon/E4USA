package com.example.E4USA

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {


    internal lateinit var buttonBack: Button

    private lateinit var email: TextView
    private lateinit var student: TextView
    private lateinit var username: TextView
    internal lateinit var teams: TextView
    private lateinit var userInfo:Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_profile)
        userInfo = intent.getParcelableExtra("user")

        email = findViewById<TextView>(R.id.email)
        student = findViewById<TextView>(R.id.student)
        username = findViewById<TextView>(R.id.username)
        teams = findViewById<TextView>(R.id.teams)

        buttonBack = findViewById(R.id.backbutton)


        buttonBack.setOnClickListener {
            val intent = Intent(this@ProfileActivity, DashboardActivity::class.java)
            startActivity(intent)

        }

        email.setText(userInfo.email)// = userInfo.email
        student.setText(userInfo.Name)// = userInfo.Name
        username.setText(userInfo.Username)// = userInfo.Username
        teams.setText(userInfo.Team)// = userInfo.Team
    }

}