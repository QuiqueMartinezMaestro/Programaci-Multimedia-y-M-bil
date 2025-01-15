package com.quique.practica3

import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class NoticiasActivity : AppCompatActivity() {

    companion object {
        const val PREFERENCES_NAME = "NoticiasPreferences"
        const val LAST_NEWS_TITLE_KEY = "lastNewsTitle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)

        val recyclerNoticias = findViewById<RecyclerView>(R.id.recyclerNoticias)

        val noticias = listOf(
            Noticia(1, "Mundial de Qatar 2022", "La Copa Mundial de la FIFA Catar 2022 fue la vigésima segunda edición de la Copa Mundial de Fútbol masculino organizada por la FIFA. Esta edición del evento se desarrolló del 20 de noviembre al 18 de diciembre en el otoño de Catar", "2025-01-14", "https://e00-expansion.uecdn.es/assets/multimedia/imagenes/2022/02/11/16445855972505.jpg", "https://es.wikipedia.org/wiki/Copa_Mundial_de_F%C3%BAtbol_de_2022"),
            Noticia(2, "Exploración espacial", "La NASA lanzó una misión a Marte para estudiar el terreno y buscar signos de vida. La misión incluye un rover que será desplegado para estudiar la atmósfera de Marte", "2025-01-14", "https://www.astrojem.net/wp-content/uploads/2021/04/marte-explo-portada.jpg", "https://es.wikipedia.org/wiki/Exploraci%C3%B3n_de_Marte"),
            Noticia(3, "Cambio climático", "Un informe reciente alerta sobre el aumento de temperaturas globales y sus impactos en el medio ambiente. Se espera que los efectos se intensifiquen en las próximas décadas", "2025-01-14", "https://delegacion.illesbalears.csic.es/wp-content/uploads/2021/02/cambio-climatico-causas-consecuencias-2.jpg", "https://es.wikipedia.org/wiki/Cambio_clim%C3%A1tico"),
            Noticia(4, "Avances en inteligencia artificial", "Recientes desarrollos en IA están cambiando la forma en que las máquinas interactúan con los seres humanos, abriendo nuevas posibilidades en diversas industrias", "2025-01-14", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Dall-e_3_%28jan_%2724%29_artificial_intelligence_icon.png/330px-Dall-e_3_%28jan_%2724%29_artificial_intelligence_icon.png", "https://es.wikipedia.org/wiki/Inteligencia_artificial"),
            Noticia(5, "Futuro de la energía renovable", "Se están haciendo grandes inversiones en energía solar y eólica, impulsadas por la necesidad de reducir las emisiones de carbono a nivel mundial", "2025-01-14", "https://www.factorenergia.com/wp-content/uploads/2018/08/energias-renovables.jpg", "https://es.wikipedia.org/wiki/Energ%C3%ADa_renovable"),
            Noticia(6, "Innovaciones tecnológicas 2025", "Los dispositivos inteligentes de próxima generación están cambiando nuestras vidas, desde hogares conectados hasta avances en dispositivos portátiles y tecnologías de salud", "2025-01-14", "https://elchapuzasinformatico.com/wp-content/uploads/2024/11/Las-10-tecnologias-mas-innovadoras-que-se-esperan-para-2025.jpg", "https://es.wikipedia.org/wiki/Anexo:Tecnolog%C3%ADas_emergentes"),
            Noticia(7, "Tendencias en moda 2025", "La moda para 2025 se caracteriza por un enfoque en la sostenibilidad, con materiales reciclados y diseños ecológicos ganando popularidad en las pasarelas", "2025-01-14", "https://i.pinimg.com/originals/59/d8/71/59d871bb341843b794e43d7541867256.png", "https://es.wikipedia.org/wiki/Moda"),
            Noticia(8, "Deportes y salud", "Los expertos sugieren que la actividad física regular es clave para mantener una buena salud mental y física, lo que motiva a muchas personas a practicar deportes de forma continua", "2025-01-14","https://www.deportesalud.com/wp-content/uploads/2016/06/beneficios-del-deporte-3.png", "https://es.wikipedia.org/wiki/Categor%C3%ADa:Deporte_y_salud"),
            Noticia(9, "Nuevas investigaciones sobre el Alzheimer", "Científicos de todo el mundo están trabajando para desarrollar tratamientos efectivos para la enfermedad de Alzheimer, utilizando tecnología avanzada y estudios genéticos", "2025-01-14", "https://www.alzheimersla.org/wp-content/uploads/2021/04/Understanding-Memory-Loss-Alzheimers-disease-the-basics.jpg.png", "https://en.wikipedia.org/wiki/Alzheimer%27s_disease"),
            Noticia(10, "Exploración de los océanos", "La exploración de los océanos ha permitido descubrir especies nunca antes vistas y estudiar el impacto de la contaminación en las profundidades marinas", "2025-01-14", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2wJxxaZezZ-sjZdPdF4i78Hrq79mgWLyMLQ&s", "https://es.wikipedia.org/wiki/Exploraci%C3%B3n_de_las_profundidades_marinas")
        )

        recyclerNoticias.adapter = NoticiaAdapter(this, noticias) { noticia ->
            ultimaNoticiaLeida(noticia.titulo)
        }


        val lastNewsTitle = tituloNoticiaLeida()
        if (!lastNewsTitle.isNullOrEmpty()) {
            CustomToast("Última noticia leída: $lastNewsTitle")
        }

    }


    private fun ultimaNoticiaLeida(title: String) {
        val sharedPreferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(LAST_NEWS_TITLE_KEY, title)
        editor.apply()
    }


    private fun tituloNoticiaLeida(): String? {
        val sharedPreferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(LAST_NEWS_TITLE_KEY, null)
    }

    private fun CustomToast(message: String) {
        val layoutInflater = layoutInflater
        val customView = layoutInflater.inflate(R.layout.custom_toast, null)

        val toastMessage = customView.findViewById<TextView>(R.id.toastMessage)
        val toastIcon = customView.findViewById<ImageView>(R.id.toastIcon)

        toastMessage.text = message
        toastIcon.setImageResource(R.drawable.ic_news) // Cambia a tu propio icono

        val toast = Toast(this)
        toast.view = customView
        toast.duration = Toast.LENGTH_LONG
        toast.show()
    }

}

