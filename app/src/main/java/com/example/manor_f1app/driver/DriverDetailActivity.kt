package com.example.manor_f1app.driver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.manor_f1app.R
import java.lang.reflect.Array.get

class DriverDetailActivity : AppCompatActivity() {
    private val driverList = ArrayList<Driver>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_detail)

        val position = intent.extras?.getInt("position")

//        val position = driverList.indexOf("Max")

        


    }

    private fun updateUi(rank: Int?) {

    }

}