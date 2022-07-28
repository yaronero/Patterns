package com.example.patterns.presentation.factory

class Car(
    private val model: String,
    private val speed: Int
) : Transport {

    override fun move(): String {
        return "Car move"
    }
}