
package com.example.E4USA

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class InfoActivity4 : AppCompatActivity() {

    internal lateinit var buttonBack: Button
    private lateinit var compo1a: ImageView
    private lateinit var compo1b: ImageView
    private lateinit var compo1c: ImageView

    internal lateinit var buttonlogout: Button

    private var target: Student ?= null

    //internal lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutcomp4)


        compo1a = findViewById<View>(R.id.compo1a) as ImageView
        compo1b = findViewById<View>(R.id.compo1b) as ImageView
        compo1c = findViewById<View>(R.id.compo1c) as ImageView

        target = intent.getParcelableExtra("TargetStudent")

        buttonlogout = findViewById<View>(R.id.Logout) as Button

        buttonBack = findViewById<View>(R.id.backbutton) as Button

        buttonBack.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)
        }

        compo1a.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nDocumentation of project evaluation by multiple, demonstrably qualified stakeholders and field experts is presented and is synthesized in a consistently specific, detailed, and thorough way; documentation is sufficient in two or more categories to yield meaningful analysis of that evaluation data; the synthesis of evaluations consistently addresses evaluators’ specific questions, concerns, and opinions related to design requirements.\n\nScore: 4\nDocumentation of project evaluation by two or more demonstrably qualified stakeholders and field experts is presented and is synthesized in a generally specific, detailed, and thorough way; documentation is sufficient in at least one category to yield a meaningful analysis of that evaluation data; the synthesis of evaluations generally addresses evaluators’ specific questions, concerns, and opinions related to design requirements.\n\nScore: 3\nDocumentation of project evaluation by three or four demonstrably qualified stakeholders and/or field experts is presented and is synthesized in a somewhat specific and detailed way, but may not be thorough; documentation may not be sufficient in any category to yield a meaningful analysis of that evaluation data; the synthesis of evaluations addresses at least some of evaluators’ specific questions, concerns, and opinions related to design requirements.\n\nScore: 2\nDocumentation of project evaluation by two or three representatives of stakeholders and/or field experts (some of whom may not be demonstrably qualified) is presented and is synthesized in a somewhat specific and/or detailed but incomplete or overly general way; the synthesis of evaluations addresses at least a few of evaluators’ specific questions, concerns, and/or opinions related to design requirements.\n\nScore: 1\nDocumentation of project evaluation by one or two representatives of stakeholders and/or field experts is presented but synthesis is sparse, with few specifics/details; the synthesis of evaluations addresses only one or two of an evaluator’s questions, concerns, and/or opinions related to design requirements.\n\nScore: 0\nDocumentation of project evaluation by any representative stakeholder or field expert is non-existent OR if included is minimal; synthesis is minimal or missing and if present, does not address any questions, concerns, or opinions of an evaluator related to design requirements.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }
        compo1b.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThe project designer provides a consistently clear, insightful, and comprehensive reflection on, and value judgment of, each major step in the project; the reflection includes a substantive summary of lessons learned that would be clearly useful to others attempting the same or similar project.\n\nScore: 4\nThe project designer provides a clear, insightful and well-developed reflection on, and value judgment of, each major step in the project; the reflection includes a summary of lessons learned that would be clearly useful to others attempting the same or similar project.\n\nScore: 3\nThe project designer provides a generally clear and insightful, adequately- developed reflection on, and value judgment of, major steps in the project, although one or two steps may be addressed in a more cursory manner; the reflection includes a summary of lessons learned, at least most of which would be useful to others attempting the same or similar project.\n\nScore: 2\nThe project designer provides a generally clear, at least somewhat insightful, and partially developed reflection on, and value judgment of, most if not all of the major steps in the project; the reflection includes some lessons learned which would be useful to others attempting the same or similar project.\n\nScore: 1\nThe project designer provides a reflection on, and value judgment of, at least some of the major steps in the project, although the reflection may be partial, overly-general and/or superficial; the reflection includes a few lessons learned of which at least one would be useful to others attempting the same or similar project.\n\nScore: 0\nThe project designer attempts a reflection on, and value judgment of, at least one or two of the major steps in the project, although the reflection may be minimal, unclear, and/or extremely superficial; any lessons learned are unclear and/or of no likely use to others attempting the same or similar project; OR there is no evidence of a reflection and/or lessons learned.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }
        compo1c.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThe project designer includes consistently detailed and salient recommendations regarding the conduct of the same or similar project in the future; recommendations include caveats as warranted and specific ways the project could be improved with consistently detailed plans for the implementation of those improvements.\n\nScore: 4\nThe project designer includes generally detailed and salient recommendations regarding the conduct of the same or similar project in the future; recommendations include caveats as warranted and specific ways the project could be improved with generally detailed plans for the implementation of those improvements.\n\nScore: 3\nThe project designer includes a few detailed and salient recommendations regarding the conduct of the same or similar project in the future; recommendations include some specific ways the project could be improved along with what may be only minimally detailed plans for the implementation of those improvements and may also include one or two caveats for others.\n\nScore: 2\nThe project designer includes recommendations regarding the conduct of the same or similar project in the future; recommendations may include some specific ways the project could be improved but plans for the implementation of those improvements may be missing OR the recommendations (with or without plans) may be partial and/or overly general.\n\nScore: 1\nThe project designer includes one or two overly general and/or questionably relevant recommendations regarding the conduct of the same or similar project in the future; any plans for implementation included are vague/unclear or minimally related to the recommendations provided.\n\nScore: 0\nThe project designer includes one or two recommendations (with or without plans) that bear little/no relation to the conduct of the same or similar project in the future OR fails to offer any recommendations or plans regarding the conduct of the same or similar project in the future.")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }

        buttonlogout.setOnClickListener{

            startActivity(Intent(applicationContext, MainActivity::class.java))
        }


    }

}