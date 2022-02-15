package com.example.myappfirst

fun main(){
    val math = Math(3,2)
    math.setX(23)
    println(math.getX())
}

class Math (x: Int, y: Int){
    private var x: Int? = null
    private var y: Int? = null

    fun setX(newValue: Int){
        x = newValue
    }
    fun getX() = x
}

