package com.example.projeto_jogo_da_velha

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class jogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo)
        

        fun btClick(cellID: Int, view: View) {
            val btSelecionado = view as Button
            var cellID = 0

            when (btSelecionado.id) {
                R.id.bt1 -> cellID = 1
                R.id.bt2 -> cellID = 2
                R.id.bt3 -> cellID = 3
                R.id.bt4 -> cellID = 4
                R.id.bt5 -> cellID = 5
                R.id.bt6 -> cellID = 6
                R.id.bt7 -> cellID = 7
                R.id.bt8 -> cellID = 8
                R.id.bt9 -> cellID = 9

            }

            btClick(cellID, btSelecionado)
        }

        var player1 = ArrayList<Int>()
        var player2 = ArrayList<Int>()

        //turnos dos jogadores

        var activeplayer = 1


        fun btClick(cellId: Int, btSelecionado: Button) {
            if(activeplayer == 1) {
                btSelecionado.text = "X"
                btSelecionado.setBackgroundColor(Color.BLUE)
                player1.add(cellId)
                activeplayer = 2
            }else{
                btSelecionado.text = "O"
                btSelecionado.setBackgroundColor(Color.GREEN)
                player2.add(cellId)
                activeplayer = 1

            }
            btSelecionado.isEnabled = false
        }
        fun checkWiner (){
             var winer = -1


            //linha 1
            if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
                winer = 1
            }

            if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
                winer = 2
            }

            //linha 2
            if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
                winer = 1
            }

            if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
                winer = 2
            }

            //linha 3
            if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
                winer = 1
            }

            if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
                winer = 2
            }

            ////////////////********** COLUNAS ************ //////////////

            //coluna 1
            if(player1.contains(1) && player1.contains(4) && player1.contains(7)) {
                winer = 1
            }

            if(player2.contains(1) && player2.contains(4) && player2.contains(7)) {
                winer = 2
            }

            //coluna 2
            if(player1.contains(2) && player1.contains(5) && player1.contains(8)) {
                winer = 1
            }

            if(player2.contains(2) && player2.contains(5) && player2.contains(8)) {
                winer = 2
            }

            //coluna 3
            if(player1.contains(3) && player1.contains(6) && player1.contains(9)) {
                winer = 1
            }

            if(player2.contains(3) && player2.contains(6) && player2.contains(9)) {
                winer = 2
            }


            ////////////////********** DIAGONAL ************ //////////////

            //principal
            if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
                winer = 1
            }

            //principal
            if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
                winer = 1
            }

            if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
                winer = 2
            }

            //coluna secundária
            if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
                winer = 1
            }

            if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
                winer = 2
            }





           // WINER
            if(winer != 1) {
                if(winer == 1 ){
                    Toast.makeText(this, "O jogador 1 ganhou", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "O computador ganhou", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}

