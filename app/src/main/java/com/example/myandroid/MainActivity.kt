package com.example.myandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var edt_name : EditText
    lateinit var txt_demo : TextView
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_name = findViewById(R.id.edt_name)
        txt_demo=findViewById(R.id.txt_demo)
        btn = findViewById(R.id.btn_demo)

        val convertor : Convertor = Convertor()

        btn.setOnClickListener {
            //txt_demo.text = edt_name.text
            //finish()
            //Toast.makeText( getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show()
            val celsius = edt_name.text.toString()
           // val fahrenheit = edt_name.text.toString()
            txt_demo.text = "Fahernheit is" + convertor.cTof(celsius .toDouble())

        }




    }
}



