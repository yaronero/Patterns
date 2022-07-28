package com.example.patterns.presentation.factory

class Plane(
    private val model: String,
    private val speed: Int
) : Transport {

    override fun move(): String {
        return "Plane move"
    }
}