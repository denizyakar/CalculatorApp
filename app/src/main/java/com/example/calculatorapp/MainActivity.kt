package com.example.calculatorapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {





        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        }

        fun sumFunc(view: View) {
            val number1 = binding.editText.text.toString().toDoubleOrNull()
            val number2 = binding.editText2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val resultnumber = number1 + number2
                binding.textView.text = "Result:${resultnumber.toString()}"

            } else {
                binding.textView.text = "Enter a valid number!"
            }
        }
    fun minusFunc(view: View) {
        val number1 = binding.editText.text.toString().toDoubleOrNull()
        val number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            val resultnumber = number1 - number2
            binding.textView.text = "Result:${resultnumber.toString()}"

        } else {
            binding.textView.text = "Enter a valid number!"
        }
    }

    fun multiplyFunc(view: View) {
        val number1 = binding.editText.text.toString().toDoubleOrNull()
        val number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            val resultnumber = number1 * number2
            binding.textView.text = "Result:${resultnumber.toString()}"

        } else {
            binding.textView.text = "Enter a valid number!"
        }
    }

    fun divideFunc(view: View) {
        val number1 = binding.editText.text.toString().toDoubleOrNull()
        val number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            val resultnumber = number1 / number2
            binding.textView.text = "Result:${resultnumber.toString()}"

        } else {
            binding.textView.text = "Enter a valid number!"
        }
    }



    }









