package com.example.manor_f1app.team

data class Team(
    var rank: Int ?= null,
    var name: String ?= null,
    var chief: String ?= null,
    var driver1: String ?= null,
    var driver2: String ?= null,
    var championships: Int ?= null
)
