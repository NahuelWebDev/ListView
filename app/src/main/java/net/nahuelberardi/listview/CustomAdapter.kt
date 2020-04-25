package net.nahuelberardi.listview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(val context : Activity,private val lista: MutableList<String>) : ArrayAdapter<String>(context,R.layout.nome_layout,lista) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.nome_layout,null,true)

        val txtNome = rowView.findViewById(R.id.txtNome) as TextView
        val txtTitoloNome = rowView.findViewById(R.id.txtTitoloNome) as TextView
        txtNome.text = lista.get(position)
        txtTitoloNome.text = "Nome n°" + position

        return rowView
    }
    }
