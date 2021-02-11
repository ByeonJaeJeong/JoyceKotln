package com.example.myapplication
//Singleton pattern
object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}


data class Car(val horsePower :Int )

fun main(){
    val car: Car = CarFactory.makeCar(10)
    val car2 : Car = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}