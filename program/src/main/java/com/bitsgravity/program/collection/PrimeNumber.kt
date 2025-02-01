package com.bitsgravity.program.collection

import kotlin.math.sqrt

fun main(){
    primeNumber(11)
}

fun primeNumber(number: Int) : Boolean {
    val squareRoot = sqrt(number.toDouble())

    for (i in 2 until squareRoot.toInt()+1){
        if (number%i == 0){
            println("$number is not a prime number")
            return false
        }
    }

    println("$number is a prime number")
    return true
}