package com.example.E4USA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth


class ProjectPageActivityActivity : AppCompatActivity() {

    internal lateinit var buttonInfo: Button
    internal lateinit var buttonSwitchTeams: Button

    private lateinit var textCourse: TextView
    private lateinit var textName: TextView
    private lateinit var textCreate: TextView
    private lateinit var textDue: TextView
    private lateinit var textGrade: TextView
    private lateinit var textSubmit: TextView

    private var mAuth: FirebaseAuth? = null

    private lateinit var studentproject: Project


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        studentproject = intent.getParcelableExtra<Project>("projinfo")

        mAuth = FirebaseAuth.getInstance()

        buttonSwitchTeams = findViewById<View>(R.id.buttonswitchUser) as Button
        buttonInfo = findViewById<View>(R.id.buttonswitchUser) as Button
        textCourse = findViewById<TextView>(R.id.CourseText) as TextView
        textName = findViewById<TextView>(R.id.NameText) as TextView
        textCreate = findViewById<TextView>(R.id.CreatedText) as TextView
        textDue = findViewById<TextView>(R.id.DueText) as TextView
        textGrade = findViewById<TextView>(R.id.GradeText) as TextView
        textSubmit = findViewById<TextView>(R.id.SubmitText) as TextView



        buttonInfo.setOnClickListener {
            startActivity(Intent(applicationContext, InfoActivity::class.java))
        }

        buttonSwitchTeams.setOnClickListener {
            startActivity(Intent(applicationContext, DashboardActivity::class.java))
        }
    }
}


