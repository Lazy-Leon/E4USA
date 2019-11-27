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
import com.google.firebase.auth.FirebaseAuth

class RegistrationActivity : AppCompatActivity() {

    private lateinit var emailTV: EditText
    private lateinit var passwordTV: EditText
    private lateinit var regBtn: Button
    private lateinit var progressBar: ProgressBar

    private var mAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registraction)

        mAuth = FirebaseAuth.getInstance()

        initializeUI()

        regBtn.setOnClickListener { registerNewUser() }
    }

    private fun registerNewUser() {
        progressBar.visibility = View.VISIBLE

        val email: String = emailTV.text.toString()
        val password: String = passwordTV.text.toString()

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(applicationContext, "Please enter email...", Toast.LENGTH_LONG).show()
            return
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(applicationContext, "Please enter password!", Toast.LENGTH_LONG).show()
            return
        }

        val x = mAuth!!.createUserWithEmailAndPassword(email, password)


        var tempSuccess = "you have successfully created an account"
        var tempFailed = "you have failed in creating an account"

        x.addOnCompleteListener { task ->
            progressBar.visibility = View.GONE
            if (task.isSuccessful) {
                Toast.makeText(applicationContext, tempSuccess, Toast.LENGTH_LONG).show()
                startActivity(Intent(this@RegistrationActivity, LoginActivity::class.java))
            } else {
                Toast.makeText(applicationContext, tempFailed, Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun initializeUI() {
        emailTV = findViewById(R.id.email)
        passwordTV = findViewById(R.id.password)
        regBtn = findViewById(R.id.register)
        progressBar = findViewById(R.id.progressBar)
    }
}