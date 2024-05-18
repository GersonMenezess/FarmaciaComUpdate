package com.example.farmacia
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.farmacia.R.id.buttonCadastrar

class CadastroActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val buttonCadastrar = findViewById<Button>(buttonCadastrar)
        buttonCadastrar.setOnClickListener {

            cadastrarRemedio()
        }
    }

    private fun cadastrarRemedio() {
        val editTextNome = findViewById<EditText>(R.id.editTextNomeRemedio)
        val editTextDescricao = findViewById<EditText>(R.id.editTextDescricaoRemedio)
        val nomeRemedio = editTextNome.text.toString()
        val descricaoRemedio = editTextDescricao.text.toString()
        val mensagem = "Cadastro do remédio:\nNome: $nomeRemedio\nDescrição: $descricaoRemedio"
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
    }
}

