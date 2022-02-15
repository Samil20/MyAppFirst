package com.example.myappfirst

fun main() {
//    val operations = Operations()
//    operations.showCar(NewFlyCars())
    val name = "Samil"
    println(getLetterS(name))
    println(name.getMyLetters())

}
fun String.getMyLetters(): String{
    return "${this.first()} ${this.last()}"
}


fun getLetterS(value: String): String{
    return "${value.first()} ${value.last()}"
}


class Operations(){
    fun showCar(car: NewFlyCars){
        car.drive()
    }
}

open class Cars(){
    var color = "Red"
    protected var brand = "Mercedess"

    open fun drive(){
        println("Drive speed 50 km")
    }

    open fun parking(){

    }
}

open class FlyCars(): Cars() {

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

class NewFlyCars(): FlyCars() {
    init {
        color
    }

}
