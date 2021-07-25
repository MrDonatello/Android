package com.anderysinitsyn.lesen3

import android.content.Intent
import android.graphics.Color
import android.hardware.display.DisplayManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

 const val EXTRA_MESSAGE = "MESSAGE123"
class MainActivity : AppCompatActivity() {
 
    private var counter: Int = 0
    private lateinit var text: TextView
    private lateinit var button: Button
    private lateinit var buttonCounter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textView)
        text.text = getString(R.string.app_name)
        button = findViewById(R.id.button)
        buttonCounter = findViewById(R.id.button_counter)

        button.setOnClickListener {
            text.text = getString(R.string.click_On_Button)
            it.setBackgroundColor(Color.BLACK)
        }

        buttonCounter.setOnClickListener {
            text.text = getString(R.string.count, ++counter)
        }
    }

    fun sendM(view: View) {
        val message = text.text.toString()
        val intent = Intent (this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}