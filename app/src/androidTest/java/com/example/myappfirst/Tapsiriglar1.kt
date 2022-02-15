package com.example.myappfirst

fun main() {
    val standardCar = Car()
    standardCar.drive()
    println(standardCar.color)

    val flyCar = FlyCar()
    flyCar.drive()
    println(flyCar.color)
//    println(flyCar.brand)
}

open class Car(){
    var color = "Red"
    protected var brand = "Mercedess"

    open fun drive(){
        println("Drive speed 50 km")
    }

    open fun parking(){

    }
}

class FlyCar(): Car() {

    init {
        color = "Yellow"
        brand = "BWE"
    }

    override fun drive() {
        println("Drive speed 80 km")
    }

    override fun parking() {
        super.parking()
    }

    fun fly(){

    }
}






