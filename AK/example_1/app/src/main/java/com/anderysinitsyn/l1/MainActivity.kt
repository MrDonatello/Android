package com.anderysinitsyn.l1

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mHelloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mHelloTextView = findViewById(R.id.textView2)
        val imageButton: ImageButton = findViewById(R.id.imageButton2)

        imageButton.setOnClickListener {
            mHelloTextView.text = "hello Kitty"
        }
    }
}