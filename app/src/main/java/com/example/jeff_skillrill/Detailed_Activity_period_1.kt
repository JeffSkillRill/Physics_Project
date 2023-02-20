package com.example.jeff_skillrill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detailed_Activity_period_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_period1)

        val event = intent.getParcelableExtra<Events>("event")
        if (event != null)
        {
            val textView:TextView = findViewById(R.id.textView_demo_detailed)
            val imageView:ImageView = findViewById(R.id.imageView_demo_detailed)

            textView.text = event.name
            imageView.setImageResource(event.image)
        }
    }
}