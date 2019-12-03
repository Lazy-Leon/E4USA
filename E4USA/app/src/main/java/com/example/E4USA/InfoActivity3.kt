package com.example.E4USA

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class InfoActivity3 : AppCompatActivity() {

    internal lateinit var buttonBack: Button

    private lateinit var compo1a: ImageView
    private lateinit var compo1b: ImageView
    private lateinit var compo1c: ImageView

    private var target: Student ?= null


    private lateinit var buttonlogout: Button


    //internal lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutcomp3)


        compo1a = findViewById<View>(R.id.compo1a) as ImageView
        compo1b = findViewById<View>(R.id.compo1b) as ImageView
        compo1c = findViewById<View>(R.id.compo1c) as ImageView

        buttonBack = findViewById<View>(R.id.backbutton) as Button

        buttonlogout = findViewById<View>(R.id.Logout) as Button

        target = intent.getParcelableExtra("TargetStudent")

        buttonBack.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("TargetStudent", target)
            startActivity(intent)
        }

        buttonlogout.setOnClickListener {
            Toast.makeText(
                this,
                "Logout Successfully",
                Toast.LENGTH_LONG
            ).show()
            startActivity(Intent(this, MainActivity::class.java))
        }

        compo1a.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThe final prototype iteration is clearly and fully explained and is constructed with enough detail to assure that objective data on all or nearly all design requirements could be determined; all attributes (sub-systems) of the unique solution that can be tested or modeled mathematically are addressed and a well- supported justification is provided for those that cannot be tested or modeled mathematically and thus require expert review.\n\nScore: 4\nThe final prototype iteration is clearly and adequately explained and is constructed with enough detail to assure that objective data on many design requirements could be determined; most attributes (sub-systems) of the unique solution that can be tested or modeled mathematically are addressed and a generally supported justification is provided for those that cannot be tested or modeled mathematically and thus require expert review.\n\nScore: 3\nThe final prototype iteration is clearly and adequately explained and is constructed with enough detail to assure that objective data on some design requirements could be determined; some attributes (sub-systems) of the unique solution that can be tested or modeled mathematically are addressed and an adequately supported justification is provided for those that cannot be tested or modeled mathematically and thus require expert review.\n\nScore: 2\nThe final prototype iteration is explained only somewhat clearly and/or completely and is constructed with enough detail to assure that objective data on at least a few design requirements could be determined; a few attributes (sub- systems) of the unique solution that can be tested or modeled mathematically are addressed but there may be insufficient justification for those that cannot be tested or modeled mathematically and thus require expert review.\n\nScore: 1\nThe final prototype iteration is only minimally explained and/or is not constructed with enough detail to assure that objective data on at least one design requirements could be determined; no more than one attribute (sub-system) of the unique solution that can be tested or modeled mathematically is addressed and any attempt at justification for those that cannot be tested or modeled mathematically and thus require expert review is missing.\n\nScore: 0\nAny attempt to explain the final prototype iteration is unclear or is missing altogether; there is no evidence that the prototype would facilitate testing by suitable means for any of the design requirements.")

                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }

        compo1b.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nDocumentation of plausible prior attempts to solve the problem and/or related problems is drawn from a wide array of clearly identified and consistently credible sources; the analysis of past and current attempts to solve the problem— including both strengths and shortcomings—is consistently clear, detailed, and supported by relevant data. The testing plan addresses all or nearly all of the high priority design requirements by effectively describing the conduct (through physical and/or mathematical modeling) of those tests that are feasible based on the instructional context and providing for others a logical and well-developed explanation confirmed by one or more field experts of how testing would yield objective data regarding the effectiveness of the design.\n\nScore: 4\nThe testing plan addresses many of the high priority design requirements by describing in a generally effective way the conduct (through physical and/or mathematical modeling) of those tests that are feasible based on the instructional context and providing for others a logical and generally developed explanation confirmed by one or more field experts of how testing would yield objective data regarding the effectiveness of the design.\n\nScore: 3\nThe testing plan addresses some of the high priority design requirements by adequately describing the conduct (through physical and/or mathematical modeling) of those tests that are feasible based on the instructional context and providing for others a generally logical and adequately developed explanation confirmed by one or more field experts of how testing would yield objective data regarding the effectiveness of the design.\n\nScore: 2\nThe testing plan addresses a few of the high priority design requirements by at least partially describing the conduct (through physical and/or mathematical modeling) of those tests that are feasible based on the instructional context and providing for others an only somewhat logical and/or partially developed explanation confirmed by one or more field experts of how testing would yield objective data regarding the effectiveness of the design.\n\nScore: 1\nThe testing plan addresses one of the high priority design requirements by describing at least minimally the conduct (through physical and/or mathematical modeling) of a test that is feasible based on the instructional context and/or providing for an at least generally logical and/or partially developed explanation of how testing would yield objective data regarding the effectiveness of the design; confirmation of that explanation by even one field expert may be missing.\n\nScore: 0\nAny testing plan included fails to address at least one of the high priority design requirements by describing at least minimally the conduct (through physical and/or mathematical modeling) of a test that is feasible based on the instructional context and/or providing for an at least generally logical and/or partially developed explanation of how testing would yield objective data regarding the effectiveness of the design; OR a testing plan is missing altogether.")
                .setCancelable(false)

                .setNegativeButton("Back", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.show()
        }

        compo1c.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Score: 5\nThrough the conduct of several tests for high priority requirements that are reasonable based on instructional contexts, or through physical or mathematical modeling, the student demonstrates considerable understanding of testing procedure, including the gathering and analysis of resultant data; the analysis of the effectiveness with which the design met stated goals includes a consistently detailed explanation [and summary] of the data from each portion of the testing procedure and from expert reviews, generously supported by pictures, graphs, charts and other visuals; the analysis includes an overall summary of the implications of all data for proceeding with the design and solving the problem.\n\nScore: 4\nThrough the conduct of several tests for high priority requirements that are reasonable based on instructional contexts, or through physical or mathematical modeling, the student demonstrates ample understanding of testing procedure, including the gathering and analysis of resultant data; the analysis of the effectiveness with which the design met stated goals includes a generally detailed explanation [and summary] of the data from each portion of the testing procedure and from expert reviews, generally supported by pictures, graphs, charts and other visuals; the analysis includes an overall summary of the implications of most if not all of the data for proceeding with the design and solving the problem.\n\nScore: 3\nThrough the conduct of a few tests for high priority requirements that are reasonable based on instructional contexts, or through physical or mathematical modeling, the student demonstrates adequate understanding of testing procedure, including the gathering and analysis of resultant data; the analysis of the effectiveness with which the design met stated goals includes a somewhat detailed explanation [and summary] of the data from each portion of the testing procedure and from expert reviews, at least somewhat supported by pictures, graphs, charts and other visuals; the analysis includes a summary of the implications of at least some of the data for proceeding with the design and solving the problem.\n\nScore: 2\nThrough the conduct of one or two tests for high priority requirements that are reasonable based on instructional contexts, or through physical or mathematical modeling, the student demonstrates partial or overly general understanding of testing procedure, including the gathering and analysis of resultant data; the analysis of the effectiveness with which the design met stated goals includes a partial explanation [and summary] of the data (partially complete and/or partially correct), at least minimally supported by pictures, graphs, charts and other visuals; the analysis includes a partial and/or overly-general summary of the implications of at least some of the data for proceeding with the design and solving the problem.\n\nScore: 1\nThrough the conduct of one or two tests for requirements (which may or may not be high priority) that are reasonable based on instructional contexts, or through physical or mathematical modeling, the student demonstrates minimal understanding of testing procedure, including the gathering and analysis of resultant data; the analysis of the effectiveness with which the design met stated goals includes an attempted explanation [and summary] of the data but may not be supported by any pictures, graphs, charts or other visuals; the analysis may be missing even a partial and/or overly-general summary of the implications of any of the data for proceeding with the design and solving the problem.\n\nScore: 0\nAny test(s) for requirement(s) or attempts at physical or mathematical modeling fail to demonstrate even minimal understanding of testing procedure, including the gathering and analysis of resultant data; OR there is no evidence of testing or physical or mathematical modeling to address any requirements.")
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