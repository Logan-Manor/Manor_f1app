package com.example.manor_f1app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.nav_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_schedule -> Toast.makeText(this, "schedule selected", Toast.LENGTH_LONG).show()
            R.id.nav_driver -> Toast.makeText(this, "driver selected", Toast.LENGTH_LONG).show()
            R.id.nav_team -> Toast.makeText(this, "team selected", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }
}