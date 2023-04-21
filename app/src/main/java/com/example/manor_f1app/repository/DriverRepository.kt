package com.example.manor_f1app.repository

import androidx.lifecycle.MutableLiveData
import com.example.manor_f1app.driver.Driver
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.lang.Exception

class DriverRepository {

    private val databaseReference : DatabaseReference = FirebaseDatabase.getInstance().getReference("Driver")

    @Volatile private var INSTANCE : DriverRepository?= null

    fun getInstance() : DriverRepository {
        return INSTANCE ?: synchronized(this) {
            val instance = DriverRepository()
            INSTANCE = instance
            instance
        }
    }

    fun loadDrivers(driverList : MutableLiveData<List<Driver>>){

        databaseReference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                try {

                    val _driverList : List<Driver> = snapshot.children.map { dataSnapshot ->

                        dataSnapshot.getValue(Driver::class.java)!!

                    }

                    driverList.postValue(_driverList)

                }catch (e : Exception){

                }

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

    }

}