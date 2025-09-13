package com.parentjoy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val appTitle = findViewById<TextView>(R.id.appTitle)

        btnStart.setOnClickListener {
            // يغير نص الـ TextView ويعرض Toast
            appTitle.text = "تجربة ناجحة — اضغت الزر ✅"
            Toast.makeText(this, "تم الضغط", Toast.LENGTH_SHORT).show()
        }
    }
}
