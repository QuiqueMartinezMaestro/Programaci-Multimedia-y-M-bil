package com.quique.practica2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tienda(
    val nombre: String,
    val descripcion: String
) : Parcelable
