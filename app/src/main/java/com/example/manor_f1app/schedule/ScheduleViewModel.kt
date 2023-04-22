package com.example.manor_f1app.schedule

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.manor_f1app.repository.F1Repository

class ScheduleViewModel : ViewModel() {

    private val repository : F1Repository = F1Repository().getInstance()
    private val _allSchedules = MutableLiveData<List<Schedule>>()
    val allSchedules : LiveData<List<Schedule>> = _allSchedules


    init {

        repository.loadSchedules(_allSchedules)

    }
}