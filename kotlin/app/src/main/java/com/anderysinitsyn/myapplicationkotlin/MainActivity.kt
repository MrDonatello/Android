package com.anderysinitsyn.myapplicationkotlin

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mHelloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mHelloTextView = findViewById(R.id.textView)

        val imageButton: ImageButton = findViewById(R.id.imageButton)
        imageButton.setOnClickListener {
            val editText: EditText = findViewById(R.id.editText)
            if (editText.text.isEmpty()) {
                mHelloTextView.text = getString(R.string.hello_def)
            } else {
                mHelloTextView.text = getString(R.string.hello_name, editText.text)
            }
        }
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            mHelloTextView.text = getString(R.string.les_2)
            it.setBackgroundColor(Color.MAGENTA)
        }

    }
}