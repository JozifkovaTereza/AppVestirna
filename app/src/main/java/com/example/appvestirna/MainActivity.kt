package com.example.appvestirna

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uvod=MediaPlayer.create(this,R.raw.j)
        val musica= MediaPlayer.create(this,R.raw.kartyty)
        val finance=MediaPlayer.create(this,R.raw.dobry)
        val zehnej=MediaPlayer.create(this,R.raw.zehnam)

        uvod.start()

        ukazkartu.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }
            uvod.stop()
            musica.start()
        }
        koulerad.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
            finance.start()
        }
        btnhodnot.setOnClickListener {
            Intent(this, FourthActivity::class.java).also {
                startActivity(it)
            }
            uvod.stop()
            zehnej.start()
        }


    }
}