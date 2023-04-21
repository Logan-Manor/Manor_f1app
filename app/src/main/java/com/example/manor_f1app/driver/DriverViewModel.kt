package com.example.manor_f1app.driver

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.manor_f1app.repository.DriverRepository

class DriverViewModel : ViewModel() {

    private val repository : DriverRepository
    private val _allDrivers = MutableLiveData<List<Driver>>()
    val allDrivers : LiveData<List<Driver>> = _allDrivers


    init {

        repository = DriverRepository().getInstance()
        repository.loadDrivers(_allDrivers)

    }



}