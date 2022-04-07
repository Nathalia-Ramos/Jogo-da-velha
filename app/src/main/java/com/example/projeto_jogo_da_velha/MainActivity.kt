package com.example.projeto_jogo_da_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Fácil = findViewById<Button>(R.id.facil)
        val medio = findViewById<Button>(R.id.medio)
        val dificil = findViewById<Button>(R.id.dificil)


        Fácil.setOnClickListener{
            val intent  = Intent (this, Fácil::class.java )
            startActivity(intent)
        }

       medio.setOnClickListener{
            val intent  = Intent (this, medio::class.java )
            startActivity(intent)
        }

       dificil.setOnClickListener{
            val intent  = Intent (this, dificil::class.java )
            startActivity(intent)
        }
    }
}