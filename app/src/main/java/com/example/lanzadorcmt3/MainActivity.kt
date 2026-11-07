package com.example.lanzadorcmt3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavegador = findViewById<Button>(R.id.btn_navegador)
        val btnCorreo = findViewById<Button>(R.id.btn_correo)

        // Abre el navegador que te manda a la pagina de la uni 
        btnNavegador.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uacm.edu.mx"))
            startActivity(intent)
        }

        // Abre la app de correo
        btnCorreo.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del correo")
            intent.putExtra(Intent.EXTRA_TEXT, "Hola, este es un correo enviado desde mi app.")
            startActivity(intent)
        }
    }
}