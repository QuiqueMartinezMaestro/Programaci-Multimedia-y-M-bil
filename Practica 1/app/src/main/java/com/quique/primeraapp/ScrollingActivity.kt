package com.quique.primeraapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.quique.primeraapp.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding
    private lateinit var img1: ImageView
    private lateinit var button1: Button
    private lateinit var img2: ImageView
    private lateinit var button2: Button
    private lateinit var img3: ImageView
    private lateinit var button3: Button
    private lateinit var img4: ImageView
    private lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        img1 = findViewById(R.id.imageView1)
        val imagePablo = "https://s1.elespanol.com/2024/06/13/bluper/862674622_244004801_1024x576.jpg"
        Glide.with(this)
            .load(imagePablo)
            .into(img1)

        button1 = findViewById(R.id.wikiButton1)
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://es.wikipedia.org/wiki/Pablo_Motos")
            startActivity(intent)
        }


        img2 = findViewById(R.id.imageView2)
        val imageRafa = "https://i.eurosport.com/2022/06/05/3388352-69247308-2560-1440.jpg"
        Glide.with(this)
            .load(imageRafa)
            .into(img2)

        button2 = findViewById(R.id.wikiButton2)
        button2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://es.wikipedia.org/wiki/Rafael_Nadal")
            startActivity(intent)
        }


        img3 = findViewById(R.id.imageView3)
        val imageDudu = "https://s1.abcstatics.com/Media/201508/02/dudu-youtube-edu-garcia--644x362.jpg"
        Glide.with(this)
            .load(imageDudu)
            .into(img3)

        button3 = findViewById(R.id.wikiButton3)
        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data =
                Uri.parse("https://es.wikipedia.org/wiki/Eduardo_Garc%C3%ADa_Mart%C3%ADnez")
            startActivity(intent)
        }
        img4 = findViewById(R.id.imageView4)
        val imageIker = "https://s03.s3c.es/imag/_v0/1200x655/2/d/d/iker-jiemenz-cuarto-milenio.jpg"
        Glide.with(this)
            .load(imageIker)
            .into(img4)

        button4 = findViewById(R.id.wikiButton4)
        button4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data =
                Uri.parse("https://es.wikipedia.org/wiki/Iker_Jim%C3%A9nez")
            startActivity(intent)


        }
    }
}