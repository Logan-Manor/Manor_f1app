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
            "Sergio" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Fernando" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Lewis" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Carlos" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Lance" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "George" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Lando" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Nico" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Charles" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Valtteri" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Esteban" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Oscar" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Pierre" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Zhou" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Yuki" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Kevin" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Alexander" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Logan" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
            "Nyck" -> driverImageView.setImageDrawable(resources.getDrawable(R.drawable.max))
        }

        rankTextView.text = numberrank
        firsnameTextView.text = firstname.toString()
        lastnameTextView.text = lastname.toString()
        teamnameTextView.text = teamname.toString()
        numberTextView.text = numbernumber
        championshipsTextView.text = championships.toString()


    }

}