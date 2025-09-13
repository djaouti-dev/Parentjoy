package com.parentjoy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // نلقاو الزر "ابدأ"
        val btnStart = findViewById<Button>(R.id.btnStart)

        // كي يضغط المستخدم على الزر يفتح شاشة المهام
        btnStart.setOnClickListener {
            val intent = Intent(this, TasksActivity::class.java)
            startActivity(intent)
        }
    }
}
