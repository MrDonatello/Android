package com.anderysinitsyn.udacity_2

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.done_button).setOnClickListener {
          addNickname(it)
        }


    }


    private fun addNickname(view: View) {

        val editText = findViewById<EditText>(R.id.nicname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.name_text)


            nicknameTextView.text = editText.text
            editText.visibility = View.GONE
            view.visibility = View.GONE
            nicknameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
