package com.example.manor_f1app.team

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.manor_f1app.R

class TeamDetailActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_detail)

        val teamImageView = findViewById<ImageView>(R.id.teamimage)
        val rankTextView = findViewById<TextView>(R.id.rank)
        val nameTextView = findViewById<TextView>(R.id.name)
        val chiefTextView = findViewById<TextView>(R.id.chief)
        val driver1TextView = findViewById<TextView>(R.id.driver1)
        val driver1ImageView = findViewById<ImageView>(R.id.driverimage1)
        val driver2TextView = findViewById<TextView>(R.id.driver2)
        val driver2ImageView = findViewById<ImageView>(R.id.driverimage2)
        val championshipsTextView = findViewById<TextView>(R.id.championships)

        val rank = intent.getStringExtra("rank")
        val name = intent.getStringExtra("name")
        val chief = intent.getStringExtra("chief")
        val driver1 = intent.getStringExtra("driver1")
        val driver2 = intent.getStringExtra("driver2")
        val championships = intent.getStringExtra("championships")

        when (name){
            "Red Bull" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Aston Martin" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.astonmartin))
            "Mercedes" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.mercedes))
            "Ferrari" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.ferrari))
            "Mclaren" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.mclaren))
            "Alpine" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.alpine))
            "Haas" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.haas))
            "Alfa Romeo" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.alpharomeo))
            "AlphaTauri" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.alphatauri))
            "Williams" -> teamImageView.setImageDrawable(resources.getDrawable(R.drawable.williams))
        }

        when (driver1){
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Max Verstappen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
        }

        when (driver2){
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.sergio))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.red_bull))
        }


        val numberrank = "#$rank"

        rankTextView.text = numberrank
        nameTextView.text = name.toString()
        chiefTextView.text = chief.toString()
        driver1TextView.text = driver1.toString()
        driver2TextView.text = driver2.toString()
        championshipsTextView.text = championships.toString()
    }
}