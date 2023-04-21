package com.example.manor_f1app.driver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.manor_f1app.R
import java.lang.reflect.Array.get

class DriverDetailActivity : AppCompatActivity() {
    private val driverList = ArrayList<Driver>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_detail)

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

        rankTextView.text = rank.toString()
        firsnameTextView.text = firstname.toString()
        lastnameTextView.text = lastname.toString()
        teamnameTextView.text = teamname.toString()
        numberTextView.text = number.toString()
        championshipsTextView.text = championships.toString()


    }

}