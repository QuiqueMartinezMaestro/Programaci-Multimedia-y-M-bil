package com.quique.practica3

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NoticiaAdapter(
    private val context: Context,
    private val noticias: List<Noticia>,
    private val onClick: (Noticia) -> Unit
) : RecyclerView.Adapter<NoticiaAdapter.NoticiaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_noticia, parent, false)
        return NoticiaViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoticiaViewHolder, position: Int) {
        val noticia = noticias[position]

        holder.titulo.text = noticia.titulo
        holder.resumen.text = noticia.resumen
        holder.fecha.text = noticia.fecha

        Glide.with(context)
            .load(noticia.imagen)
            .into(holder.imagen)

        holder.itemView.setOnClickListener {
            onClick(noticia)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(noticia.enlace))
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = noticias.size

    class NoticiaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.textTitulo)
        val resumen: TextView = itemView.findViewById(R.id.textResumen)
        val fecha: TextView = itemView.findViewById(R.id.textFecha)
        val imagen: ImageView = itemView.findViewById(R.id.imageNoticia)
    }
}
