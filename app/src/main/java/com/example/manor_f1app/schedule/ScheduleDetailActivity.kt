package com.example.manor_f1app.schedule

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.manor_f1app.R

class ScheduleDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_detail)

        val roundTextView = findViewById<TextView>(R.id.round)
        val nameTextView = findViewById<TextView>(R.id.name)
        val countryTextView = findViewById<TextView>(R.id.country)
        val trackTextView = findViewById<TextView>(R.id.track)
        val turnsTextView = findViewById<TextView>(R.id.turns)
        val firstTextView = findViewById<TextView>(R.id.first)

        val round = intent.getStringExtra("round")
        val name = intent.getStringExtra("name")
        val country = intent.getStringExtra("country")
        val track = intent.getStringExtra("track")
        val turns = intent.getStringExtra("turns")
        val first = intent.getStringExtra("first")

        roundTextView.text = round.toString()
        nameTextView.text = name.toString()
        countryTextView.text = country.toString()
        trackTextView.text = track.toString()
        turnsTextView.text = turns.toString()
        firstTextView.text = first.toString()
    }
}