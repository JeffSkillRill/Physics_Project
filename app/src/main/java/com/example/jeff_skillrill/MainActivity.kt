package com.example.jeff_skillrill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.example.jeff_skillrill.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = Home()
        val topicsFragment = fragment_topics()
        val fragmentCalculator = fragment_calculator()
        val fragmentEvents = fragment_events()
        val fragmentSettings = Settings()

        makeCurrentFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.topics -> makeCurrentFragment(topicsFragment)
                R.id.events -> makeCurrentFragment(fragmentEvents)
                R.id.calculator -> makeCurrentFragment(fragmentCalculator)
                R.id.settings -> makeCurrentFragment(fragmentSettings)

            }
            true
        }



    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, fragment)
            commit()
        }
}