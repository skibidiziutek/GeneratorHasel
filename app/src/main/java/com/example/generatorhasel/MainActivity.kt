package com.example.generatorhasel

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dlugoscInput = findViewById<EditText>(R.id.dlugosc)
        val generujBtn = findViewById<Button>(R.id.przycisk)
        val wynikTv = findViewById<TextView>(R.id.wynik)

        generujBtn.setOnClickListener {
            val tekst = dlugoscInput.text.toString()
            var dlugosc = 8
            if (tekst.isNotEmpty()) {
                dlugosc = tekst.toInt()
            }

            val znaki = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()"
            var haslo = ""

            for (i in 0 until dlugosc) {
                val losowyIndeks = Random.nextInt(znaki.length)
                haslo += znaki[losowyIndeks]
            }

            wynikTv.text = haslo
        }
    }
}