package com.example.appvestirna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*
import java.security.SecureRandomSpi
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    lateinit var odpovedet:TextView
    val odpovedi= arrayOf(
        "Ano",
        "Ne",
        "Možná"
    )
    lateinit var random: Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        random=Random
        odpovedet=odpoved

        btnrad.setOnClickListener {
            odpovedet.text=odpovedi[random.nextInt(odpovedi.size)]
        }


        btnzpet1.setOnClickListener {
            finish()
        }

    }
}