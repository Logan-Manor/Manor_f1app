package com.example.manor_f1app.schedule

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.manor_f1app.R

class ScheduleDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_detail)

        val roundTextView = findViewById<TextView>(R.id.round)
        val nameTextView = findViewById<TextView>(R.id.name)
        val countryTextView = findViewById<TextView>(R.id.country)
        val trackImageView = findViewById<ImageView>(R.id.track_image)
        val trackTextView = findViewById<TextView>(R.id.track)
        val turnsTextView = findViewById<TextView>(R.id.turns)
        val firstTextView = findViewById<TextView>(R.id.first)

        val round = intent.getStringExtra("round")
        val name = intent.getStringExtra("name")
        val country = intent.getStringExtra("country")
        val track = intent.getStringExtra("track")
        val turns = intent.getStringExtra("turns")
        val first = intent.getStringExtra("first")

        when (round){
            "1" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.bahrain))
            "2" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.saudi_arabia))
            "3" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.australia))
            "4" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.azerbaijan))
            "5" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.miami))
            "6" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.italy))
            "7" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.monaco))
            "8" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.spain))
            "9" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.canada))
            "10" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.austria))
            "11" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.britian))
            "12" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.hungary))
            "13" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.belgium))
            "14" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.netherlands))
            "15" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.monza))
            "16" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.signapore))
            "17" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.japan))
            "18" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.qatar))
            "19" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.americas))
            "20" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.mexico))
            "21" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.brazil))
            "22" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.vegas))
            "23" -> trackImageView.setImageDrawable(resources.getDrawable(R.drawable.abudhabi))
        }

        roundTextView.text = round.toString()
        nameTextView.text = name.toString()
        countryTextView.text = country.toString()
        trackTextView.text = track.toString()
        turnsTextView.text = turns.toString()
        firstTextView.text = first.toString()
    }
}