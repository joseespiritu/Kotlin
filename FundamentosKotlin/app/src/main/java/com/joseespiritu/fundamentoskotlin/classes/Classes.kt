package com.joseespiritu.fundamentoskotlin.classes

import com.joseespiritu.fundamentoskotlin.newTopic

fun main() {
    newTopic("Clases")
    val phone: Phone = Phone(1234567)
    phone.call()
    phone.showNumber()
    // println(phone.number)

    newTopic("Herencia")
    val smartphone = Smartphone(354421, true)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

    newTopic("Data Classes")
    val myUser = User(0, "Jose", "Espiritu", 0)
    println(myUser.component3())
    println(myUser)
}