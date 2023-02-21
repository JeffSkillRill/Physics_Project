package com.example.jeff_skillrill

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trendyol.bubblescrollbarlib.BubbleTextProvider
import kotlinx.android.synthetic.main.activity_period1.bubble_scroll_ber
import kotlinx.android.synthetic.main.activity_period1.recyclerView_period_1

class period_1 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var eventList: ArrayList<Events>
    private lateinit var eventAdapter: EventAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_period1)

        recyclerView = findViewById(R.id.recyclerView_period_1)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        eventList = ArrayList()

        eventList.add(Events(R.drawable.topic_demo, "Topic_1"))
        eventList.add(Events(R.drawable.topic_demo, "Topic_2"))
        eventList.add(Events(R.drawable.topic_demo, "Topic_3"))
        eventList.add(Events(R.drawable.topic_demo, "Topic_4"))
        eventList.add(Events(R.drawable.topic_demo, "Topic_5"))
        eventList.add(Events(R.drawable.topic_demo, "Topic_6"))

        eventAdapter = EventAdapter(eventList)
        recyclerView.adapter = eventAdapter

        bubble_scroll_ber.attachToRecyclerView(recyclerView_period_1)
        bubble_scroll_ber.bubbleTextProvider = BubbleTextProvider {
            position -> StringBuilder(eventList[position].substring(0,1)).toString()
        }

        eventAdapter.onItemClick = {
            val intent = Intent(this, Detailed_Activity_period_1::class.java)
            intent.putExtra("Event", it)
            startActivity(intent)
        }

    }
}


