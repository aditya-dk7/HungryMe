package com.example.hungryme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.action_bar_gradient))
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.action_bar_gradient))
        setContentView(R.layout.activity_main)
    }

}