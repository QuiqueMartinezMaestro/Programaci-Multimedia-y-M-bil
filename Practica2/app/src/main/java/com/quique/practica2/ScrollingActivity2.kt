package com.quique.practica2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ScrollingActivity2 : AppCompatActivity() {

    // En ScrollingActivity2.kt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_pantalla)

        val nombreCentroComercial = intent.getStringExtra("nombreCentroComercial")
        val imagenCentroComercial = intent.getStringExtra("imagenCentroComercial")

        val tiendas = intent.getParcelableArrayListExtra<Tienda>("tiendas") ?: listOf()

        val centroComercialName = findViewById<TextView>(R.id.nombreCentro)
        centroComercialName.text = nombreCentroComercial


        val centroComercialImage = findViewById<ImageView>(R.id.imagenCentro)
        Glide.with(this)
            .load(imagenCentroComercial)
            .into(centroComercialImage)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TiendaAdapter(tiendas)
    }

}
