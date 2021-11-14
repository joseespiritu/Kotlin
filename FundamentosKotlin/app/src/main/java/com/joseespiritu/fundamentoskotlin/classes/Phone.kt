package com.joseespiritu.fundamentoskotlin.classes

class Phone (val number: Int) {
    fun call() {
        println("Llamando...")
    }

    fun showNumber() {
        println("Mi número es: $number")
    }
}