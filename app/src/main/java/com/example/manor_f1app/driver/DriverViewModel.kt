package com.example.manor_f1app.driver

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.manor_f1app.repository.F1Repository

class DriverViewModel : ViewModel() {

    private val repository : F1Repository = F1Repository().getInstance()
    private val _allDrivers = MutableLiveData<List<Driver>>()
    val allDrivers : LiveData<List<Driver>> = _allDrivers


    init {

        repository.loadDrivers(_allDrivers)

    }



}