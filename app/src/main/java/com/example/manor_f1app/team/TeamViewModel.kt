package com.example.manor_f1app.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.manor_f1app.repository.F1Repository

class TeamViewModel : ViewModel() {

    private val repository : F1Repository = F1Repository().getInstance()
    private val _allTeams = MutableLiveData<List<Team>>()
    val allTeams : LiveData<List<Team>> = _allTeams


    init {

        repository.loadTeams(_allTeams)

    }
}