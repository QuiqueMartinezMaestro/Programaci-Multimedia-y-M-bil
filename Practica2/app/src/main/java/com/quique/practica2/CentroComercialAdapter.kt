package com.quique.practica2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CentroComercialAdapter(private val centros: List<CentroComercial>) :
    RecyclerView.Adapter<CentroComercialAdapter.CentroViewHolder>() {

    inner class CentroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageButton: ImageButton = view.findViewById(R.id.imageButton1)
        val titleTextView: TextView = view.findViewById(R.id.titleTextView1)
        val addressTextView: TextView = view.findViewById(R.id.addressTextView1)
        val storeCountTextView: TextView = view.findViewById(R.id.storeCountTextView1)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CentroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_centro_comercial, parent, false)
        return CentroViewHolder(view)
    }

    override fun onBindViewHolder(holder: CentroViewHolder, position: Int) {
        val centro = centros[position]
        holder.titleTextView.text = centro.nombre
        holder.addressTextView.text = centro.direccion
        holder.storeCountTextView.text = "Número de tiendas: ${centro.numeroTiendas}"
        Glide.with(holder.imageButton.context).load("https://eiffage.es/wp-content/uploads/2021/07/Gran-Turia.png").into(holder.imageButton)
    }

    override fun getItemCount(): Int = centros.size
}
