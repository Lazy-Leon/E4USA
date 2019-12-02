package com.example.E4USA

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student (val Grade: String ="", val ID:Int=-1, val Name: String = "", val ProjectList:String="", val Team: String = "",val Username: String = "",val email: String = ""):Parcelable
