package com.example.E4USA

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student (val Grade: String ="", val ID:Int, val Name: String = "", val projects:MutableList<Project>, val Team: String = "",val Username: String = "",val email: String = ""):Parcelable
