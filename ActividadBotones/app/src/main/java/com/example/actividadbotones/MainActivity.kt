package com.example.actividadbotones

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonAzul = findViewById<Button>(R.id.BlueButton)
        val botonRojo = findViewById<Button>(R.id.RedButton)
        val botonVerde = findViewById<Button>(R.id.GreenButton)
        val botonMorado = findViewById<Button>(R.id.PurpleButton)
        val botonRosa = findViewById<Button>(R.id.PinkButton)
        val textoSuperior = findViewById<TextView>(R.id.textoSuperior)

        var textoCapturado:String = ""
        botonAzul.setOnClickListener{
            textoCapturado = findViewById<EditText>(R.id.textEdit).text.toString()
            textoSuperior.text = textoCapturado
            val texto = findViewById<EditText>(R.id.textEdit)
            texto.setText("")
            textoSuperior.setBackgroundColor(Color.parseColor("#2C45E3"))
        }

        botonRojo.setOnClickListener{
            textoCapturado = findViewById<EditText>(R.id.textEdit).text.toString()
            textoSuperior.text = textoCapturado
            val texto = findViewById<EditText>(R.id.textEdit)
            texto.setText("")
            textoSuperior.setBackgroundColor(Color.parseColor("#E32C43"))
        }

        botonVerde.setOnClickListener{
            textoCapturado = findViewById<EditText>(R.id.textEdit).text.toString()
            textoSuperior.text = textoCapturado
            val texto = findViewById<EditText>(R.id.textEdit)
            texto.setText("")
            textoSuperior.setBackgroundColor(Color.parseColor("#3AE32C"))
        }

        botonMorado.setOnClickListener{
            textoCapturado = findViewById<EditText>(R.id.textEdit).text.toString()
            textoSuperior.text = textoCapturado
            val texto = findViewById<EditText>(R.id.textEdit)
            texto.setText("")
            textoSuperior.setBackgroundColor(Color.parseColor("#592CDC"))
        }

        botonRosa.setOnClickListener{
            textoCapturado = findViewById<EditText>(R.id.textEdit).text.toString()
            textoSuperior.text = textoCapturado
            val texto = findViewById<EditText>(R.id.textEdit)
            texto.setText("")
            textoSuperior.setBackgroundColor(Color.parseColor("#C458D5"))
        }

    }

}