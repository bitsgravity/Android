package com.bits.learn.program.content

import kotlin.math.sqrt

fun main(){
    primeNumber(11)
}

fun primeNumber(number: Int) : Boolean {
    val squareRoot = sqrt(number.toDouble())
    for (i in 2 until squareRoot.toInt()+1){
        if (number%i == 0){
            return false
        }
    }
    return true
}