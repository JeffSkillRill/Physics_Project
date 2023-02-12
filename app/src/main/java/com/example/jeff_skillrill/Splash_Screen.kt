package com.example.jeff_skillrill

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class Splash_Screen : AppCompatActivity() {
    val SPLASH_SCREEN = 7000
    private lateinit var topanimation: Animation
    private lateinit var bottomanimation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_splash_screen)



        topanimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomanimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        splash_image.animation = topanimation
        splash_text.animation = bottomanimation

        Handler().postDelayed(
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            },SPLASH_SCREEN.toLong()
        )
    }
}