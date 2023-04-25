package com.example.manor_f1app.driver

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.example.manor_f1app.R
import java.lang.reflect.Array.get

class DriverDetailActivity : AppCompatActivity() {
    private val driverList = ArrayList<Driver>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_detail)

        val driverImageView = findViewById<ImageView>(R.id.driverimage)
        val rankTextView = findViewById<TextView>(R.id.rank)
        val firsnameTextView = findViewById<TextView>(R.id.firstname)
        val lastnameTextView = findViewById<TextView>(R.id.lastname)
        val teamnameTextView = findViewById<TextView>(R.id.teamname)
        val numberTextView = findViewById<TextView>(R.id.number)
        val championshipsTextView = findViewById<TextView>(R.id.championships)

        val rank = intent.getStringExtra("rank")
        val firstname = intent.getStringExtra("firstname")
        val lastname = intent.getStringExtra("lastname")
        val teamname = intent.getStringExtra("teamname")
        val number = intent.getStringExtra("number")
        val championships = intent.getStringExtra("championships")

        val numberrank = "#$rank"
        val numbernumber = "#$number"

        when (firstname){
            "Max" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Sergio" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.sergio))
            "Fernando" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.fernando))
            "Lewis" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.lewis))
            "Carlos" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.carlos))
            "Lance" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.lance))
            "George" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.george))
            "Lando" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.lando))
            "Nico" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.nico))
            "Charles" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.charles))
            "Valtteri" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.valtteri))
            "Esteban" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.esteban))
            "Oscar" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.oscar))
            "Pierre" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.pierre))
            "Zhou" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.zhou))
            "Yuki" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.yuki))
            "Kevin" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.kevin))
            "Alexander" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.alexander))
            "Logan" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.logan))
            "Nyck" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.nyck))
        }

        rankTextView.text = numberrank
        firsnameTextView.text = firstname.toString()
        lastnameTextView.text = lastname.toString()
        teamnameTextView.text = teamname.toString()
        numberTextView.text = numbernumber
        championshipsTextView.text = championships.toString()


    }

}