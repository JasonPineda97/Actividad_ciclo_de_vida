package com.example.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var contador = 0
    var contadorRestart = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)
        boton.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        contador++
        val text_sup = findViewById<TextView>(R.id.títuloRestart)
        text_sup.text = contador.toString()
    }

    override fun onRestart() {
        super.onRestart()
        contadorRestart++
    }
}