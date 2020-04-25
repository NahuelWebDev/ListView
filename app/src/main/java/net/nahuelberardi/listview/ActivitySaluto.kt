package net.nahuelberardi.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivitySaluto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saluto)

        var txtNomeSaluto = findViewById<TextView>(R.id.txtNomeSaluto)
        val nome = intent.getStringExtra("Nome")
        txtNomeSaluto.text = nome

    }
}
