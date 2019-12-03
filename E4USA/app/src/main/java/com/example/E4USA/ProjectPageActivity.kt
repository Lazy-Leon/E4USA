package com.example.E4USA

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth


class ProjectPageActivityActivity : AppCompatActivity() {

    internal lateinit var buttonInfo: Button
    internal lateinit var buttonSwitchTeams: Button


    internal lateinit var buttonStepa: Button
    internal lateinit var buttonStepb: Button
    internal lateinit var buttonStepc: Button
    internal lateinit var buttonStepd: Button
    internal lateinit var buttonStepe: Button
    internal lateinit var buttonStepf: Button
    internal lateinit var buttonStepg: Button
    internal lateinit var buttonSteph: Button
    internal lateinit var buttonStepi: Button
    internal lateinit var buttonStepj: Button
    internal lateinit var buttonStepk: Button
    internal lateinit var buttonStepl: Button













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

        buttonStepa = findViewById<View>(R.id.button1) as Button
        buttonStepb = findViewById<View>(R.id.button2) as Button
        buttonStepc = findViewById<View>(R.id.button3) as Button
        buttonStepd = findViewById<View>(R.id.button4) as Button
        buttonStepe = findViewById<View>(R.id.button5) as Button
        buttonStepf = findViewById<View>(R.id.button6) as Button
        buttonStepg = findViewById<View>(R.id.button7) as Button
        buttonSteph = findViewById<View>(R.id.button8) as Button
        buttonStepi = findViewById<View>(R.id.button9) as Button
        buttonStepj = findViewById<View>(R.id.button10) as Button
        buttonStepk = findViewById<View>(R.id.button11) as Button
        buttonStepl = findViewById<View>(R.id.button12) as Button


        buttonInfo.setOnClickListener {
            startActivity(Intent(applicationContext, InfoActivity::class.java))
        }

        buttonSwitchTeams.setOnClickListener {
            startActivity(Intent(applicationContext, DashboardActivity::class.java))
        }

        textCourse.setText(studentproject.Course)
        textName.setText(studentproject.Name)
        textCreate.setText(studentproject.Created)
        textDue.setText(studentproject.Due)
        textGrade.setText(studentproject.Grade)
        textSubmit.setText(studentproject.Submitted)

        buttonStepa.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepb.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepc.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepd.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepe.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepf.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepg.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonSteph.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepi.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepj.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepk.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        buttonStepl.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage(" Project Description Project Description  Project Description  Project Description  Project Description  Project Description  Project Description ")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }
    }
}
