package com.example.E4USA

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {


    private lateinit var buttonBack: Button
    private lateinit var buttonLogout: Button

    private lateinit var email: TextView
    private lateinit var student: TextView
    private lateinit var username: TextView
    internal lateinit var teams: TextView
    private lateinit var userInfo:Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_profile)
        email = findViewById<TextView>(R.id.email)
        student = findViewById<TextView>(R.id.student)
        username = findViewById<TextView>(R.id.username)
        teams = findViewById<TextView>(R.id.teams)


        val temp:Student? = intent.getParcelableExtra("user")
        if (temp != null) {
            userInfo = temp
            email.setText(userInfo.email)// = userInfo.email
            student.setText(userInfo.Name)// = userInfo.Name
            username.setText(userInfo.Username)// = userInfo.Username
            teams.setText(userInfo.Team)// = userInfo.Team
        }
        buttonBack = findViewById(R.id.backbutton)

        buttonBack.setOnClickListener {
            val intent = Intent(applicationContext, DashboardActivity::class.java)
            intent.putExtra("TargetStudent",userInfo)
            startActivity(intent)

        }

        buttonLogout = findViewById(R.id.Logout)

        buttonLogout.setOnClickListener {
            Toast.makeText(
                this,
                "Logout Successfully",
                Toast.LENGTH_LONG
            ).show()
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}