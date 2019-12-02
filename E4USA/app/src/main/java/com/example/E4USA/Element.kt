package com.example.E4USA

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Element (val description: String ="", val submitted: String = "", val assigned: String = ""):Parcelable
