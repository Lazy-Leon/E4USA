package com.example.E4USA

import android.content.DialogInterface
import android.content.Intent
import android.icu.text.IDNA
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class InfoActivity1 : AppCompatActivity() {

    private lateinit var buttonBack: Button
    private lateinit var compo1a: ImageView
    private lateinit var compo1b: ImageView
    private lateinit var compo1c: ImageView
    private var target: Student ?= null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutcomp1)

        target = intent.getParcelableExtra("TargetStudent")

        buttonBack = findViewById<View>(R.id.backbutton) as Button

        buttonBack.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)
        }

        compo1a = findViewById<View>(R.id.compo1a) as ImageView
        compo1b = findViewById<View>(R.id.compo1b) as ImageView
        compo1c = findViewById<View>(R.id.compo1c) as ImageView


        compo1a.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThe problem is clearly and objectively identified and defined with considerable depth, and it is well elaborated with specific detail; the justification of the problem highlights the concerns of many primary stakeholders and is based on comprehensive, timely, and consistently credible sources; it offers consistently objective detail from which multiple measurable design requirements can be determined." +
                    "\n\nScore: 4\nThe problem is clearly and objectively identified and defined with some depth, and it is generally elaborated with specific detail; the justification of the problem highlights the concerns of some primary stakeholders and is based on various timely and generally credible sources; it offers generally objective detail from which multiple measurable design requirements can be determined." +
                    "\n\nScore: 3\nThe problem is somewhat clearly and objectively identified and defined with adequate depth, and it is sometimes elaborated with specific detail, although some information intended as elaboration may be imprecise or general; the justification of the problem highlights the concerns of at least a few primary stakeholders and is based on at least a few sources which are timely and credible; although not all information included may be objective, the justification of the problem offers enough objective detail to allow at least a few measurable design requirements to be determined." +
                    "\n\nScore: 2\nThe problem is identified only somewhat clearly and/or objectively and defined in a manner that is somewhat superficial and/or minimally elaborated with specific detail; the justification of the problem highlights the concerns of only one or two primary stakeholders and/or may be based on insufficient sources or ones that are outdated or of dubious credibility; although little information included is objective, the justification of the problem offers enough objective detail to allow at least a few design requirements to be determined; however, these may not be ones that are measurable." +
                    "\n\nScore: 1\nThe identification and/or definition of the problem is unclear, is unelaborated, and/or is clearly subjective; any intended justification of the problem does not highlight the concerns of any primary stakeholders and/or is based on sources that are overly general, outdated, and/or of dubious credibility; information included is insufficient to allow for the determination any measurable design requirements." +
                    "\n\nScore: 0\nThe identification and/or definition of the problem are missing OR cannot be inferred from information included. A justification of the problem is missing, cannot be inferred from information included as evidence, OR is essentially only the opinion of the researcher.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

        compo1b.setOnClickListener{

            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nDocumentation of plausible prior attempts to solve the problem and/or related problems is drawn from a wide array of clearly identified and consistently credible sources; the analysis of past and current attempts to solve the problem— including both strengths and shortcomings—is consistently clear, detailed, and supported by relevant data." +
                    "\n\nScore: 4\nDocumentation of existing attempts to solve the problem and/or related problems is drawn from a variety of clearly identified and consistently credible sources; the analysis of past and current attempts to solve the problem—including both strengths and shortcomings— is clear and is generally detailed and supported by relevant data." +
                    "\n\nScore: 3\nDocumentation of existing attempts to solve the problem and/or related problems is drawn from several—but not necessarily varied—clearly identified and generally credible sources; the analysis of past and current attempts to solve the problem—including both strengths and shortcomings— is generally clear and contains some detail and relevant supporting data." +
                    "\n\nScore: 2\nDocumentation of existing attempts to solve the problem and/or related problems is drawn from a limited number of sources, some of which may not be clearly identified and/or credible; the analysis of past and current attempts to solve the problem— including strengths and/or shortcomings—is overly general and contains little detail and/or relevant supporting data." +
                    "\n\nScore: 1\nDocumentation of existing attempts to solve the problem and/or related problems is drawn from only one or two sources that may not be clearly identified and/or credible; the analysis of past and current attempts to solve the problem— including strengths and/or shortcomings—is vague and is missing any relevant details and/or relevant supporting data." +
                    "\n\nScore: 0\nDocumentation of existing attempts to solve the problem and/or related problems is missing or minimal (a single source that is not clearly identified and/or credible) OR cannot be inferred from information intended as analysis of past and/or current attempts to solve the problem.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()


        }

        compo1c.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nDesign requirements are listed and prioritized, and they are consistently clear and detailed; these design requirements presented are consistently objective, measurable, and they would be highly likely to lead to a tangible and viable solution to the problem identified; there is evidence that requirements represent the needs of, and have been validated by, many if not all primary stakeholder groups." +
                    "\n\nScore: 4\nDesign requirements are listed and prioritized, and they are generally clear and detailed; these design requirements presented are nearly always objective and measurable, and they would be likely to lead to a tangible and viable solution to the problem identified; there is evidence that requirements represent the needs of, and have been validated by, several primary stakeholder groups." +
                    "\n\nScore: 3\nDesign requirements are listed and prioritized, and they are generally clear and somewhat detailed; these design requirements presented are generally objective and measurable, and they have the potential to lead to a tangible and viable solution to the problem identified; there is evidence that requirements represent the needs of, and have been validated by, at least a few primary stakeholder groups." +
                    "\n\nScore: 2\nDesign requirements are listed and prioritized, but some/all of these may be incomplete and/or lack specificity; these design requirements may be only sometimes objective and/or measurable, and it is not clear that they will lead to a tangible and viable solution to the problem identified; there is evidence that the requirements represent the needs, of/and or have been validated by, only one primary stakeholder group." +
                    "\n\nScore: 1\nAn attempt is made to list, format, and prioritize requirements, but these may be partial and/or overly general, making them insufficiently measurable to support a viable solution to the problem identified; there is no evidence that the requirements represent the needs of, or have been validated by, any primary stakeholder groups." +
                    "\n\nScore: 0\nDesign requirements are either not presented or are too vague to be used to outline the measurable attributes of a possible design solution to the problem identified.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()

        }

    }

}