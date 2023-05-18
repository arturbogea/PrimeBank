package com.example.primebank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.primebank.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saldo.setOnClickListener {
            saldo()
        }

        binding.fatura.setOnClickListener {
            fatura()
        }

        binding.transferencia.setOnClickListener {
            transferencia()
        }

        binding.poupanca.setOnClickListener {
            poupanca()
        }
    }

    fun saldo(){
        val intent = Intent(this, Saldo::class.java)
        startActivity(intent)
        finish()
    }

    fun fatura(){
        val intent = Intent(this, Fatura::class.java)
        startActivity(intent)
        finish()
    }

    fun transferencia(){
        val intent = Intent(this, Transferencia::class.java)
        startActivity(intent)
        finish()
    }

    fun poupanca(){
        val intent = Intent(this, Poupanca::class.java)
        startActivity(intent)
        finish()
    }
}