package com.example.patterns.presentation.adapter

data class RoundHole(
    var radius: Double
) {

    fun fits(roundRep: RoundPeg): Boolean {
        return radius >= roundRep.radius
    }
}