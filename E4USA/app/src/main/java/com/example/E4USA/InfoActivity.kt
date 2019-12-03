package com.example.E4USA

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_aboutcomp1.*

class InfoActivity : AppCompatActivity() {


    private lateinit var buttonBack: Button

    private lateinit var buttoncomp1: Button
    private lateinit var buttoncomp2: Button
    private lateinit var buttoncomp3: Button
    private lateinit var buttoncomp4: Button
    private lateinit var buttonLogout: Button
    private var target: Student ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        target = intent.getParcelableExtra("TargetStudent")

        buttonBack = findViewById<View>(R.id.backbutton) as Button
        buttonLogout = findViewById<View>(R.id.Logout) as Button
        buttoncomp1 = findViewById<View>(R.id.buttona) as Button
        buttoncomp2 = findViewById<View>(R.id.buttonb) as Button
        buttoncomp3 = findViewById<View>(R.id.buttonc) as Button
        buttoncomp4 = findViewById<View>(R.id.buttond) as Button


        buttonBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)
        }

        buttoncomp1.setOnClickListener {
            val intent = Intent(this, InfoActivity1::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)
        }

        buttoncomp2.setOnClickListener {
            val intent = Intent(this, InfoActivity2::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)
        }

        buttoncomp3.setOnClickListener {
            val intent = Intent(this, InfoActivity3::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)


        }

        buttoncomp4.setOnClickListener {
            val intent = Intent(this, InfoActivity4::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)
        }

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