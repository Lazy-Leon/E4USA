
package com.example.E4USA

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class InfoActivity2 : AppCompatActivity() {


    private lateinit var buttonLogout: Button
    private lateinit var buttonBack: Button
    private lateinit var compo1a: ImageView
    private lateinit var compo1b: ImageView
    private lateinit var compo1c: ImageView

    private var target: Student ?= null


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutcomp2)

        compo1a = findViewById<View>(R.id.compo1a) as ImageView
        compo1b = findViewById<View>(R.id.compo1b) as ImageView
        compo1c = findViewById<View>(R.id.compo1c) as ImageView

        buttonBack = findViewById<View>(R.id.backbutton) as Button
        buttonLogout = findViewById<View>(R.id.Logout) as Button
        target = intent.getParcelableExtra("TargetStudent")

        buttonBack.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
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

        compo1a.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThe process for generating and comparing possible design solutions was comprehensive, iterative, and consistently defensible, making a viable and well- justified design highly likely; the design solution ultimately chosen was well- justified and demonstrated attention to all design requirements; the plan of action has considerable merit and would easily support repetition and testing for effectiveness by others." +
                    "\n\nScore: 4\nThe process for generating and comparing possible design solutions was thorough, iterative, and generally defensible, making a viable design likely; the design solution chosen was justified and demonstrated attention to most if not all design requirements; the plan of action would support repetition and testing for effectiveness by others." +
                    "\n\nScore: 3\nThe process for generating and comparing possible design solutions was adequate and generally iterative and defensible, making a viable design possible; the choice of design solution was explained with reference to at least some design requirements; the plan of action might not clearly or fully support repetition and testing for effectiveness by others." +
                    "\n\nScore: 2\nThe process for generating a possible design solution was partial or overly general and only somewhat iterative and/or defensible, raising issues with the viability of the design solution chosen; that solution was not sufficiently explained with reference to design requirements; there is insufficient detail to allow for testing for replication of results." +
                    "\n\nScore: 1\nThe process for generating a possible design solution was incomplete and was only minimally iterative and/or defensible; any attempted explanation for the design solution chosen lacked support related to design requirements and cannot be tested." +
                    "\n\nScore: 0\nThere is no evidence an attempt to arrive at a design solution through an iterative process based on design requirements.")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }

        compo1b.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThe proposed solution is well-substantiated with STEM principles and practices applicable to all or nearly all design requirements and functional claims; there is substantial evidence that the application of those principles and practices by the student or a suitable alternate has been reviewed by two or more experts(qualified consultants and/or project mentors) and that those reviews provide confirmation (verification) or detail necessary to inform a corrective response." +
                    "\n\nScore: 4\nThe proposed solution is generally substantiated with STEM principles and practices applicable to some design requirements and functional claims; there is some evidence that the application of those principles and practices by the student or a suitable alternate has been reviewed by at least two experts (qualified consultants and/or project mentors) and that those reviews provide confirmation (verification) or some detail necessary to inform a corrective response." +
                    "\n\nScore: 3\nThe proposed solution is partially substantiated with STEM principles and practices applicable to at least a few design requirements and functional claims; there is some evidence that the application of those principles and practices by the student or a suitable alternate has been reviewed by at least one expert (qualified consultant or project mentor) but this review may not provide clear confirmation (verification) or at least some detail to inform a corrective response." +
                    "\n\nScore: 2\nThe proposed solution is minimally substantiated with STEM principles and practices applicable to at least a few design requirements and functional claims; there is minimal evidence that the application of those principles and practices by the student or a suitable alternate has been reviewed by at least one expert (qualified consultant or project mentor) but there is no evidence of confirmation (verification) or any detail to inform a corrective response." +
                    "\n\nScore: 1\nThe proposed solution is minimally substantiated with STEM principles or practices applicable to at least a few design requirements and functional claims; however, there is no evidence that the application of those principles and practices by the student or a suitable alternate has been reviewed by an expert (qualified consultant or project mentor)." +
                    "\n\nScore: 0\nThe proposed solution is not substantiated with STEM principles or practices applicable to any design requirements and/or functional claims.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }

        compo1c.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThe proposed design was carefully reviewed based on several relevant extra- functional considerations; a judgment about design viability based on those considerations—the capacity of the proposed solution to address the problem—is clearly realistic and well supported with credible evidence.\n\nScore: 4\nThe proposed design was adequately reviewed based on several relevant extra- functional considerations; a judgment about design viability based on those considerations—the capacity of the proposed solution to address the problem—is generally realistic and adequately supported with credible evidence.\n\nScore: 3\nThe proposed design was partially reviewed based on one or two relevant extra- functional considerations; a judgment about design viability based on those considerations—the capacity of the proposed solution to address the problem—is only somewhat/sometimes realistic and is only partially supported with credible evidence.\n\nScore: 2\nThe proposed design was superficially reviewed based on one or two relevant extra-functional considerations; a judgment about design viability based on those considerations—the capacity of the proposed solution to address the problem— may be generally although not completely unrealistic and/or may be inadequately supported with credible evidence.\n\nScore: 1\nThe proposed design was superficially reviewed based on one or two extra- functional considerations of marginal relevance; a judgment about design viability based on those considerations— the capacity of the proposed solution to address the problem—may be unrealistic and/or not supported with any credible evidence.\n\nScore: 0\nThere is no evidence provided that the proposed design was reviewed based on any extra-functional considerations.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }
    }
}