package com.example.patterns.presentation.factory

class Ship(
    private val model: String,
    private val speed: Int
) : Transport {

    override fun move(): String {
        return "Ship move"
    }
}