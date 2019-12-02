package com.example.E4USA
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable



@Parcelize
data class Project(val projectId: String ="", val course:String = "", val createDate: String = "",
                   val dueDate: String = "", val elements: MutableList<Element>, val grade:String = "",
                   val name:String = "", val submitted:Boolean = false, val teacher:String = ""):Parcelable
