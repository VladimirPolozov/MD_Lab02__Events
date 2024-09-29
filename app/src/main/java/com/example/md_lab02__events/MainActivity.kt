package com.example.md_lab02__events

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextField: EditText = findViewById(R.id.editTextField)
        val buttonSetTextColorToBlack: Button = findViewById(R.id.buttonSetTextColorToBlack)
        val buttonSetTextColorToRed: Button = findViewById(R.id.buttonSetTextColorToRed)
        val buttonSetTextSizeTo8SP: Button = findViewById(R.id.buttonSetTextSizeTo8SP)
        val buttonSetTextSizeTo24SP: Button = findViewById(R.id.buttonSetTextSizeTo24SP)
        val buttonBackgroundColorToWhite: Button = findViewById(R.id.buttonBackgroundColorToWhite)
        val buttonBackgroundColorToYellow: Button = findViewById(R.id.buttonBackgroundColorToYellow)

        buttonSetTextColorToBlack.setOnClickListener {
            editTextField.setTextColor(Color.BLACK)
        }

        buttonSetTextColorToRed.setOnClickListener {
            editTextField.setTextColor(Color.RED)
        }

        buttonSetTextSizeTo8SP.setOnClickListener {
            editTextField.textSize = 8F
        }

        buttonSetTextSizeTo24SP.setOnClickListener {
            editTextField.textSize = 24F
        }

        buttonBackgroundColorToWhite.setOnClickListener {
            editTextField.setBackgroundColor(Color.WHITE)
        }

        buttonBackgroundColorToYellow.setOnClickListener {
            editTextField.setBackgroundColor(Color.YELLOW)
        }
    }
}