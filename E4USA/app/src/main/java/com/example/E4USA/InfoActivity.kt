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

class InfoActivity : AppCompatActivity() {


    private lateinit var buttonBack: Button

    private lateinit var buttoncomp1: Button
    private lateinit var buttoncomp2: Button
    private lateinit var buttoncomp3: Button
    private lateinit var buttoncomp4: Button
    private lateinit var buttonLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        buttonBack= findViewById<View>(R.id.backbutton) as Button
        buttoncomp1 = findViewById<View>(R.id.buttona) as Button
        buttoncomp2 = findViewById<View>(R.id.buttonb) as Button
        buttoncomp3 = findViewById<View>(R.id.buttonc) as Button
        buttoncomp4 = findViewById<View>(R.id.buttond) as Button


        buttonBack.setOnClickListener {
            val intent = Intent(applicationContext, DashboardActivity::class.java)

            startActivity(intent)
        }

        buttoncomp1.setOnClickListener {
            startActivity(Intent(this@InfoActivity, InfoActivity1::class.java))
        }

        buttoncomp2.setOnClickListener {
            startActivity(Intent(this@InfoActivity, InfoActivity2::class.java))
        }

        buttoncomp3.setOnClickListener {
            startActivity(Intent(this@InfoActivity, InfoActivity3::class.java))
        }

        buttoncomp4.setOnClickListener {
            startActivity(Intent(this@InfoActivity, InfoActivity4::class.java))
        }

    }

}