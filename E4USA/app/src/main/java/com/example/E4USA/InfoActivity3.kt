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

class InfoActivity3 : AppCompatActivity() {

    internal lateinit var buttonBack: Button

    //internal lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutcomp3)

        buttonBack = findViewById<View>(R.id.backbutton) as Button

        buttonBack.setOnClickListener {
            startActivity(Intent(this, InfoActivity::class.java))
        }

    }

}
