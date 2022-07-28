package com.example.patterns.presentation.factory

class TransportFactory(
    private val model: String,
    private val speed: Int
) {

    fun <T: Transport> create(transportClass: Class<T>): T {
        val transport = when(transportClass) {
            Car::class.java -> Car(model, speed)
            Ship::class.java -> Ship(model, speed)
            Plane::class.java -> Plane(model, speed)
            else -> IllegalStateException("Such transport doesn't exist")
        }
        return transport as T
    }
}