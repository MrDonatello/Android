package com.anderysinitsyn.l2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    private var counterCat: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            textView.text = getString(R.string.Hello_Kitty)
            it.setBackgroundColor(Color.DKGRAY)
        }

        val buttonCounter: Button = findViewById(R.id.button_counter)

        buttonCounter.setOnClickListener {
            textView.text = "Я насчитал ${++counter} ворон и ${counterCat} котов"
        }

        val buttonCounterCat: Button = findViewById(R.id.button_count_cat)

        buttonCounterCat.setOnClickListener {

            textView.text = "Я насчиал ${counter} ворон и ${++counterCat} котов"
        }
    }
}