package com.example.jeff_skillrill

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventAdapter(private var eventlist:ArrayList<Events>)
    :RecyclerView.Adapter<EventAdapter.EventViewHolder>()
{
    class EventViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)
    {
        val imageView : ImageView = itemView.findViewById(R.id.topic_image)
        val textView : TextView = itemView.findViewById(R.id.topic_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_period_1_each_item, parent, false)
        return EventViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventlist.size
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = eventlist[position]
        holder.imageView.setImageResource(event.image)
        holder.textView.text = event.name
    }
}