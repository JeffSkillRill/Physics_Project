package com.example.jeff_skillrill

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_events.layout_era_1
import kotlinx.android.synthetic.main.fragment_events.layout_era_2
import kotlinx.android.synthetic.main.fragment_events.layout_era_3


class fragment_events : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_events, container, false)

    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        layout_era_1.setOnClickListener {
            val intent1 = Intent (activity, period_1::class.java)
            activity?.startActivity(intent1)
        }

        layout_era_2.setOnClickListener {
            val intent2 = Intent (activity, period_2::class.java)
            activity?.startActivity(intent2)
        }

        layout_era_3.setOnClickListener {
            val intent3 = Intent (activity, period_3::class.java)
            activity?.startActivity(intent3)
        }
    }


}

