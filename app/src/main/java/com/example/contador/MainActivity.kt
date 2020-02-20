package com.example.contador

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : Activity() {
    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun incrementa(vista: View){
        contador++
        mostrarResultado()
    }

    fun decrementa(vista: View){
        contador--
        mostrarResultado()
    }
    fun resetea(vista: View){
        contador = 0
        mostrarResultado()
    }

    fun mostrarResultado(){
        val textoResultado: TextView = findViewById(R.id.textCont)
        textoResultado.setText("Contador: " + contador)
    }
}
