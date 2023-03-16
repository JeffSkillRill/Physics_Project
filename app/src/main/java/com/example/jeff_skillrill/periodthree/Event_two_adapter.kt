package com.example.jeff_skillrill.periodthree
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.jeff_skillrill.R
import com.example.jeff_skillrill.periodone.Event_one_adapter
import com.example.jeff_skillrill.periodone.Event_one_data

class Event_two_adapter(private var mList: List<Event_one_data>):
    RecyclerView.Adapter<Event_two_adapter.LanguageViewHolder>()
{
    inner class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logo: ImageView = itemView.findViewById(R.id.logoIv)
        val titleTv: TextView = itemView.findViewById(R.id.titleTv)
        val langDescTv: TextView = itemView.findViewById(R.id.langDesc)
        val constraintLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout)

        fun collapseExpandedView(){
            langDescTv.visibility = View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}