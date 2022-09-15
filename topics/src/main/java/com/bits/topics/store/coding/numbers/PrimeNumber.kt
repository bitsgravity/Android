package com.bits.topics.store.coding.numbers

import com.bits.topics.utils.gap
import com.bits.topics.utils.input
import com.bits.topics.utils.output
import com.bits.topics.utils.title

fun primeNumber(){
    title("PRIME NUMBER")
    primeNumber(11)
    gap()
}

fun primeNumber(number: Int) : Boolean {
    input(number.toString())

    val squareRoot = Math.sqrt(number.toDouble())

    for (i in 2 until squareRoot.toInt()+1){
        if (number%i == 0){
            output("$number is not a prime number")
            return false
        }
    }

    output("$number is a prime number")
    return true
}