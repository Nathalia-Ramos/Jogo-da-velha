package com.example.projeto_jogo_da_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val playerVSplayer = findViewById<Button>(R.id.playerVSplayer)
        val playerVScomp = findViewById<Button>(R.id.playerVScomp)

        playerVSplayer.setOnClickListener{
           val intent = Intent(this, playerVSplayer::class.java)
            startActivity(intent)
        }

        playerVScomp.setOnClickListener({
            val intent = Intent(this,playerVScomp::class.java )
            startActivity(intent)
        })

    }
}