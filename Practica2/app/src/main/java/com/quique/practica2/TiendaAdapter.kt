package com.quique.practica2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TiendaAdapter(private val tiendas: List<Tienda>) : RecyclerView.Adapter<TiendaAdapter.TiendaViewHolder>() {

    class TiendaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombre: TextView = view.findViewById(R.id.tvNombreTienda)
        val descripcion: TextView = view.findViewById(R.id.tvDescripcionTienda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TiendaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tienda, parent, false)
        return TiendaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TiendaViewHolder, position: Int) {
        val tienda = tiendas[position]
        holder.nombre.text = tienda.nombre
        holder.descripcion.text = tienda.descripcion
    }

    override fun getItemCount(): Int = tiendas.size
}
