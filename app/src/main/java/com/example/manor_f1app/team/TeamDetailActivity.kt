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
            "Fernando Alonso" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.fernando))
            "Lewis Hamilton" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.lewis))
            "Charles Leclerc" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.charles))
            "Lando Norris" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.lando))
            "Pierre Gasly" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.pierre))
            "Kevin Magnussen" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.kevin))
            "Valtteri Bottas" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.valtteri))
            "Yuki Tsunoda" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.yuki))
            "Alexander Albon" -> driver1ImageView.setImageDrawable(resources.getDrawable(R.drawable.alexander))
        }

        when (driver2){
            "Sergio Perez" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.sergio))
            "Lance Stroll" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.lance))
            "George Russell" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.george))
            "Carlos Sainz" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.carlos))
            "Oscar Piastri" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.oscar))
            "Esteban Ocon" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.esteban))
            "Nico Hulkenberg" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.nico))
            "Zhou Guanyu" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.zhou))
            "Nyck De Vries" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.nyck))
            "Logan Sargeant" -> driver2ImageView.setImageDrawable(resources.getDrawable(R.drawable.logan))
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