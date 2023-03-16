package com.example.jeff_skillrill

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.fragment_events.layout_era_1
import kotlinx.android.synthetic.main.fragment_home.*


class Home : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
            val animation = AnimationUtils.loadAnimation(activity,R.anim.text_intoduction_anim)
            introduction_text.startAnimation(animation)
        layout_basic_cal.setOnClickListener {
            val intent1 = Intent (activity, Calculator::class.java)
            activity?.startActivity(intent1)
            val personintent = Intent(activity, person_daily::class.java)
            activity?.startActivity(personintent)
        }


    }


}