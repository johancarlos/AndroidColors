package com.example.estudiante.colores

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRed.setOnClickListener({
            toast("RED")
            layoutPrincipal.setBackgroundColor(Color.RED)

        })

        btnWhite.setOnClickListener{
            //Toast.makeText(this, "MENSJAE", Toast.LENGTH_SHORT).show()
            toast("WHITE")
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }

    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()

}

