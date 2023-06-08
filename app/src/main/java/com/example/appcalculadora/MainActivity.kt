package com.example.appcalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.inicio)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, calculadora::class.java)
            startActivity(intent)
        }
    }
}