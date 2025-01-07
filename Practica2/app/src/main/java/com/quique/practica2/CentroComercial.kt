package com.quique.practica2

data class CentroComercial(
    val id: Int,
    val nombre: String,
    val direccion: String,
    val numeroTiendas: Int,
    val tiendas: List<Tienda>
)
