package net.nahuelberardi.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var lista = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Binding delle View

        var listaNome : ListView = findViewById(R.id.listaNomi)


        popolaLista()
        //Creazione di un adapter semplice con la view messa a disposizione di default dal progetto
        var adapter = CustomAdapter(this,lista)
        listaNome.setAdapter(adapter)
        listaNome.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            var intent = Intent(this,ActivitySaluto::class.java).apply {
                putExtra("Nome", lista.get(position))
            }
            startActivity(intent)
        })
    }

    //Funzione per popolare la lista per la ListView
    private fun popolaLista () {
        lista.add("Tony Stark")
        lista.add("Nemo")
        lista.add("Luke Skywalker")
        lista.add("Doctor Who")
        lista.add("Mario Mario")

    }
}
