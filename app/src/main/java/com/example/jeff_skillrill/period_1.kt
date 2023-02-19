package com.example.jeff_skillrill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class period_1 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var eventList: ArrayList<Events>
    private lateinit var eventAdapter: EventAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_period1)
    }
}