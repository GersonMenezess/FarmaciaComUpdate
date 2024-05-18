package com.example.farmacia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.Toast

class ConsultaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulta)

        val buttonConsultar = findViewById<Button>(R.id.buttonConsultar)
        buttonConsultar.setOnClickListener {
            // Lógica para a consulta
            realizarConsulta()
        }
    }

    private fun realizarConsulta() {
        // Aqui você pode adicionar a lógica para consultar os dados da farmácia
        // Por exemplo, fazer uma requisição HTTP para um servidor ou consultar um banco de dados local
        // Aqui, apenas exibimos uma mensagem de exemplo
        Toast.makeText(this, "Consulta realizada!", Toast.LENGTH_SHORT).show()
    }
}



