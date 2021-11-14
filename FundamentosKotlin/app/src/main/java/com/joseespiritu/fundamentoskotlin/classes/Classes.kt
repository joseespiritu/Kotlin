package com.joseespiritu.fundamentoskotlin.classes

import com.joseespiritu.fundamentoskotlin.newTopic

fun main() {
    newTopic("Clases")
    val phone: Phone = Phone(1234567)
    phone.call()
    phone.showNumber()
    println(phone.number)
}