package com.example.primebank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.primebank.databinding.ActivitySaldoBinding

class Saldo : AppCompatActivity() {

    private lateinit var binding: ActivitySaldoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        //abaixo, vamos criar uma toolbar com a seta de voltar de tela.

        toolbarSaldo()
    }

    fun toolbarSaldo(){
        val toolbar = binding.toolbarSaldo
        //abaixo vamos criar um titulo para a toolbar
        toolbar.title = "Saldo"
        //abaixo, vamos colocar uma cor no texto.
        toolbar.setTitleTextColor(getColor(R.color.white))
        //abaixo, vamos centralizar o texto da toolbar
        toolbar.setTitleMargin(200, 0,300,0)
        //abaixo, vamos colocar uma cor de fundo para a toolbar
        toolbar.setBackgroundColor(getColor(R.color.ligth_blue))
        //abaixo, vamos colocar o icone de voltar. Mas sem o evento de click.
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        //abaixo, vamos colocar o evento de click e voltar para a activity que escolhermos
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish() // serve para fechar a activity
        }
    }
}