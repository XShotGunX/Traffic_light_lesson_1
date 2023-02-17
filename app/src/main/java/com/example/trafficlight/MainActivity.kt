package com.example.trafficlight

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rootLayout : ConstraintLayout = findViewById(R.id.root_layout)
        val textView : TextView = findViewById(R.id.textView)
        val redButton : Button = findViewById(R.id.button_red)
        val yellowButton : Button = findViewById(R.id.button_yellow)
        val greenButton : Button = findViewById(R.id.button_green)

        redButton.setOnClickListener {
            textView.text = "Красный"
            rootLayout.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        yellowButton.setOnClickListener {
            textView.setText(R.string.yellow)
            rootLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.yellow))
        }
        greenButton.setOnClickListener {
            textView.text = resources.getText(R.string.green)
            rootLayout.setBackgroundColor(Color.GREEN)
        }
    }
}