package com.example.myappfirst
fun main(){
  val matem = Riyaziyyat(x = 6, y = 4 )
  val bilgi = Person("Samil","Hesenli",20)
  val person1 = Person("Ali","Esedov",24)
  val person2 = Person("Aysel","Axundova",30)
  val person3 = Person("Nicat","Aliyev",25)
  val person4 = Person("Huseyn","Huseynov",29)
  val personList = mutableListOf<Person>(person1, person2, person3, person4)

//    println(personList)
//    for (i in personList){
//        println(i.ad)
//    }
//    val sss = personList.forEach { println(it.ad) }
//    println(sss)
    val operations =Operation(Riyaziyyat(6,4))
    operations.runmathoperations()
}


class Riyaziyyat(val x: Int, val y: Int){


fun toplama(): Int{
    return x + y
}


fun cixma(): Int{
    return x - y
}


fun vurma(): Int{
    return x * y
}


fun bolme(): Int {
    if (y ==0 ){
        return 0
    }else {
        return x / y
    }

}

}

class Operation(val ededler: Riyaziyyat ){
fun runmathoperations(){
    runtoplama()
    runcixma()
    runvurma()
    runbolme()

}
fun runtoplama(){
    println(ededler.toplama())
}

fun runcixma(){
    println(ededler.cixma())
}

fun runvurma(){
    println(ededler.vurma())
}

fun runbolme(){
    println(ededler.bolme())
}

}





data class Person(val ad: String, val soyad: String, val yas: Int){


fun name(): String{
    return ad
}
fun surname(): String{
    return soyad
}
fun age():Int{
    return yas
}

}



