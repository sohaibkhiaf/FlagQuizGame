package com.example.flagquizgame

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Country (val id: Int, val name:String?, val code: String?,
               val flag: String?, val area: String?,
               val population: String?) : Parcelable