package com.example.sendapp.ui.dataclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataClass(
    val name: String ,
    val email: String ,
    val password: String
) : Parcelable
