package com.example.E4USA
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable



@Parcelize
data class Project(val ProjID: Int =0, val Course:String = "", val Created: String = "",
                   val Due: String = "", val Elements: String = "", val Grade:String = "",
                   val Name:String = "", val Submitted:String = "", val Teacher:String = ""):Parcelable
