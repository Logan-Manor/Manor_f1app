package com.example.manor_f1app.team

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.manor_f1app.R

class TeamDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_detail)

        val rankTextView = findViewById<TextView>(R.id.rank)
        val nameTextView = findViewById<TextView>(R.id.name)
        val chiefTextView = findViewById<TextView>(R.id.chief)
        val driver1TextView = findViewById<TextView>(R.id.driver1)
        val driver2TextView = findViewById<TextView>(R.id.driver2)
        val championshipsTextView = findViewById<TextView>(R.id.championships)

        val rank = intent.getStringExtra("rank")
        val name = intent.getStringExtra("name")
        val chief = intent.getStringExtra("chief")
        val driver1 = intent.getStringExtra("driver1")
        val driver2 = intent.getStringExtra("driver2")
        val championships = intent.getStringExtra("championships")

        rankTextView.text = rank.toString()
        nameTextView.text = name.toString()
        chiefTextView.text = chief.toString()
        driver1TextView.text = driver1.toString()
        driver2TextView.text = driver2.toString()
        championshipsTextView.text = championships.toString()
    }
}