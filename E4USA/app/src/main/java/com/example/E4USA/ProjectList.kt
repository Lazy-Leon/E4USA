package com.example.E4USA

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ProjectList(private val context: Activity, private var projects: List<Project>) :
  ArrayAdapter<Project>(context, R.layout.activity_dash, projects) {


  @SuppressLint("ViewHolder")
  override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
    val inflater = context.layoutInflater
    val listViewItem =
      inflater.inflate(R.layout.activity_dash, parent, false)

    val textViewName = listViewItem.findViewById<TextView>(R.id.textViewName)
    val textViewRating = listViewItem.findViewById<TextView>(R.id.textViewCountry)

    val title = projects[position]
    textViewName.text = title.name
    textViewRating.text = title.teacher

    return listViewItem
  }
}
