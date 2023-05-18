package com.example.primebank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.primebank.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        //aqui estamos criando uma tela splash, onde terar uma duração que iremos escolher e logo terminar o tempo de duração escolhido, irá para a tela que escolhi como princial.
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }, 3500)

    }


}