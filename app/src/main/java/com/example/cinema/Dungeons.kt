package com.example.cinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Dungeons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dungeons)

        supportActionBar?.hide()
    }
}