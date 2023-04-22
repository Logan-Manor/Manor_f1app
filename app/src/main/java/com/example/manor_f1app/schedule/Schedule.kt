package com.example.manor_f1app.schedule

data class Schedule(
    var round: Int ?= null,
    var name: String ?= null,
    var country: String ?= null,
    var track: String ?= null,
    var turns: Int ?= null,
    var first: Int ?= null
)
