package com.example.appcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class calculadora : AppCompatActivity() {

    lateinit var numero1 : EditText
    lateinit var numero2 : EditText
    lateinit var txtresultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val spinner: Spinner = findViewById(R.id.spinner)
        val opciones = arrayOf("Suma", "Resta", "Multiplicación", "División")

        numero1 = findViewById(R.id.n1)
        numero2 = findViewById(R.id.n2)
        txtresultado = findViewById(R.id.resultado)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val btnCalcular: Button = findViewById(R.id.calcular)
        btnCalcular.setOnClickListener {

            val operacion = spinner.selectedItem.toString()
            val numero1 = numero1.text.toString().toDouble()
            val numero2 = numero2.text.toString().toDouble()

            when (operacion) {
                "Suma" -> {
                    val resultado = numero1 + numero2
                    txtresultado.text = "Resultado: ${resultado.toInt()}"
                }

                "Resta" -> {
                    val resultado = numero1 - numero2
                    txtresultado.text = "Resultado: ${resultado.toInt()}"
                }

                "Multiplicación" -> {
                    val resultado = numero1 * numero2
                    txtresultado.text = "Resultado: ${resultado.toInt()}"
                }

                "División" -> {
                    if (numero2 != 0.0) {
                        val resultado = numero1 / numero2
                        txtresultado.text = "Resultado: ${format(resultado)}"
                    } else {
                        txtresultado.text = "Infinito"
                    }
                }
            }
        }

    }

    fun format(number: Double): String {
        return if (number % 1 == 0.0) {
            number.toInt().toString()
        } else {
            String.format("%.2f", number)
        }
        }
    }
