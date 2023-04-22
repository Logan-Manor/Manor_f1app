package com.example.manor_f1app.repository

import androidx.lifecycle.MutableLiveData
import com.example.manor_f1app.driver.Driver
import com.example.manor_f1app.schedule.Schedule
import com.example.manor_f1app.team.Team
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.lang.Exception

class F1Repository {

    private val driverReference : DatabaseReference = FirebaseDatabase.getInstance().getReference("Driver")
    private val teamReference : DatabaseReference = FirebaseDatabase.getInstance().getReference("Team")
    private val scheduleReference : DatabaseReference = FirebaseDatabase.getInstance().getReference("Schedule")

    @Volatile private var INSTANCE : F1Repository?= null

    fun getInstance() : F1Repository {
        return INSTANCE ?: synchronized(this) {
            val instance = F1Repository()
            INSTANCE = instance
            instance
        }
    }

    fun loadDrivers(driverList: MutableLiveData<List<Driver>>){

        driverReference.addValueEventListener(object : ValueEventListener{
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

    fun loadSchedules(scheduleList : MutableLiveData<List<Schedule>>){
        scheduleReference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                try {

                    val _scheduleList : List<Schedule> = snapshot.children.map { dataSnapshot ->

                        dataSnapshot.getValue(Schedule::class.java)!!

                    }

                    scheduleList.postValue(_scheduleList)

                }catch (e : Exception){

                }
            }
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }

    fun loadTeams(teamList : MutableLiveData<List<Team>>){
        teamReference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                try {

                    val _teamList : List<Team> = snapshot.children.map { dataSnapshot ->

                        dataSnapshot.getValue(Team::class.java)!!

                    }

                    teamList.postValue(_teamList)

                }catch (e : Exception){

                }
            }
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }

}