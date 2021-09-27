package com.joseespiritu.fundamentoskotlin

fun main(){
    newTopic("Bucles")
    showPerson("Angel", "Mary", "Fany")
    showPerson("Angel", "Mary", "Sergio", "Alex", "Carla")
}

fun showPerson(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPerson(vararg persons: String){
    newTopic("For")
    for (person in persons) println(person)

    newTopic("While")
    var index = 0
    while (index < persons.size) {
        if (persons[index] == "Mary") println("Es Mary!")
        println(persons[index])
        index = index + 1
    }

    newTopic("When")
    index = (0..persons.size-1).random()
    println(index)
    when (persons[index]) {
        "Angel" -> println("Es Angel!")
        "Mary" -> {
            println("Ir a otra pantalla")
            println(2+4)
        }
        else -> println(persons[index])
    }
}