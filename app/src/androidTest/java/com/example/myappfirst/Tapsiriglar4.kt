package com.example.myappfirst

fun main(){
    var birinci = mutableListOf<Int>(1, 2, 3, 4, 5 )
    var ikinci = mutableListOf<Int>(1, 2, 3, 4, )
    println(tapsiriq(birinci, ikinci))
    //println(tapsiriq1(birinci, ikinci))
}

fun tapsiriq1(birinci: List<Int>, ikinci: List<Int>): Int {

    var list = 1
    var list2 =1
    for (i in birinci){
        list *= i
    }
    return list
}
fun tapsiriq2(birinci: List<Int>, ikinci: List<Int>): Int {

    var list = 1
    var list2 =1
    for (i in ikinci){
        list2 *= i
    }
    return list2
}







fun tapsiriq(birinci: List<Int>, ikinci: List<Int>): Set<List<Int>> {

    var list = mutableListOf(birinci)
    var list2 = mutableListOf(ikinci)
    var setList = list.toSet()
    var setList2 = list2.toSet()
    var setlist3 = (setList union setList2)
    return setlist3
}

