package com.example.farmacia

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_cadastro -> {
                abrirCadastroActivity()
                true
            }
            R.id.action_consulta -> {
                abrirConsultaActivity()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun abrirCadastroActivity() {
        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

    private fun abrirConsultaActivity() {
        val intent = Intent(this, ConsultaActivity::class.java)
        startActivity(intent)
    }
}
