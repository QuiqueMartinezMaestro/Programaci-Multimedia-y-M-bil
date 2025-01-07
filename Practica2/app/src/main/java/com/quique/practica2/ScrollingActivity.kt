package com.quique.practica2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import androidx.appcompat.app.AppCompatActivity
import com.quique.practica2.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding
    private lateinit var img1: ImageView
    private lateinit var title1: TextView
    private lateinit var address1: TextView
    private lateinit var storeCount1: TextView

    private lateinit var img2: ImageView
    private lateinit var title2: TextView
    private lateinit var address2: TextView
    private lateinit var storeCount2: TextView

    private lateinit var img3: ImageView
    private lateinit var title3: TextView
    private lateinit var address3: TextView
    private lateinit var storeCount3: TextView

    private lateinit var img4: ImageView
    private lateinit var title4: TextView
    private lateinit var address4: TextView
    private lateinit var storeCount4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        img1 = findViewById(R.id.imageButton1)
        title1 = findViewById(R.id.titleTextView1)
        address1 = findViewById(R.id.addressTextView1)
        storeCount1 = findViewById(R.id.storeCountTextView1)

        img2 = findViewById(R.id.imageButton2)
        title2 = findViewById(R.id.titleTextView2)
        address2 = findViewById(R.id.addressTextView2)
        storeCount2 = findViewById(R.id.storeCountTextView2)

        img3 = findViewById(R.id.imageButton3)
        title3 = findViewById(R.id.titleTextView3)
        address3 = findViewById(R.id.addressTextView3)
        storeCount3 = findViewById(R.id.storeCountTextView3)

        img4 = findViewById(R.id.imageButton4)
        title4 = findViewById(R.id.titleTextView4)
        address4 = findViewById(R.id.addressTextView4)
        storeCount4 = findViewById(R.id.storeCountTextView4)

        //Gran Turia
        val centro1 = CentrosComerciales.lista[0]
        Glide.with(this)
            .load("https://s2.ppllstatics.com/lasprovincias/www/multimedia/2024/10/24/Clipboard-0048-kNjF-U2201582417455dYE-1200x840@Las%20Provincias.png")
            .into(img1)
        title1.text = centro1.nombre
        address1.text = centro1.direccion
        storeCount1.text = "${centro1.numeroTiendas}"

        //Saler
        val centro2 = CentrosComerciales.lista[1]
        Glide.with(this)
            .load("https://cdn.valenciaplaza.com/public/Image/2019/9/C.CSaler_2_NoticiaAmpliada.jpg")
            .into(img2)
        title2.text = centro2.nombre
        address2.text = centro2.direccion
        storeCount2.text = "${centro2.numeroTiendas}"

        //Bonaire
        val centro3 = CentrosComerciales.lista[2]
        Glide.with(this)
            .load("https://agendadeisa.com/wp-content/uploads/2023/06/Bonaire-Candle-Light-37-scaled.jpg")
            .into(img3)
        title3.text = centro3.nombre
        address3.text = centro3.direccion
        storeCount3.text = "${centro3.numeroTiendas}"

        //Auqua
        val centro4 = CentrosComerciales.lista[3]
        Glide.with(this)
            .load("https://www.viuvalencia.com/netpublisher/minfo/imagenes/7192_11111.jpg")
            .into(img4)
        title4.text = centro4.nombre
        address4.text = centro4.direccion
        storeCount4.text = "${centro4.numeroTiendas}"


        //Informacion de las tiendas a la segundaScrolling

        img1.setOnClickListener {
            val intent = Intent(this, ScrollingActivity2::class.java)
            val centro1 = CentrosComerciales.lista[0]
            intent.putParcelableArrayListExtra("tiendas", ArrayList(centro1.tiendas))
            intent.putExtra("nombreCentroComercial", centro1.nombre)
            intent.putExtra("imagenCentroComercial", "https://s2.ppllstatics.com/lasprovincias/www/multimedia/2024/10/24/Clipboard-0048-kNjF-U2201582417455dYE-1200x840@Las%20Provincias.png")
            startActivity(intent)
        }

        img2.setOnClickListener {
            val intent = Intent(this, ScrollingActivity2::class.java)
            val centro2 = CentrosComerciales.lista[1]
            intent.putParcelableArrayListExtra("tiendas", ArrayList(centro2.tiendas))
            intent.putExtra("nombreCentroComercial", centro2.nombre)
            intent.putExtra("imagenCentroComercial", "https://cdn.valenciaplaza.com/public/Image/2019/9/C.CSaler_2_NoticiaAmpliada.jpg")
            startActivity(intent)
        }

        img3.setOnClickListener {
            val intent = Intent(this, ScrollingActivity2::class.java)
            val centro3 = CentrosComerciales.lista[2]
            intent.putParcelableArrayListExtra("tiendas", ArrayList(centro3.tiendas))
            intent.putExtra("nombreCentroComercial", centro3.nombre)
            intent.putExtra("imagenCentroComercial", "https://agendadeisa.com/wp-content/uploads/2023/06/Bonaire-Candle-Light-37-scaled.jpg")
            startActivity(intent)
        }

        img4.setOnClickListener {
            val intent = Intent(this, ScrollingActivity2::class.java)
            val centro4 = CentrosComerciales.lista[3]
            intent.putParcelableArrayListExtra("tiendas", ArrayList(centro4.tiendas))
            intent.putExtra("nombreCentroComercial", centro4.nombre)
            intent.putExtra("imagenCentroComercial", "https://www.viuvalencia.com/netpublisher/minfo/imagenes/7192_11111.jpg")
            startActivity(intent)
        }

        //Musica

        val intent = Intent(this, Musica::class.java)
        startService(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        val intent = Intent(this, Musica::class.java)
        stopService(intent)
    }



    }
