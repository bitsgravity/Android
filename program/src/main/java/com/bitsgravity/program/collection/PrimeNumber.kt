package com.bitsgravity.program.collection

import com.bitsgravity.program.collection.utils.gap
import com.bitsgravity.program.collection.utils.input
import com.bitsgravity.program.collection.utils.output
import com.bitsgravity.program.collection.utils.title
import kotlin.math.sqrt

fun primeNumber(){
    title("PRIME NUMBER")
    primeNumber(11)
    gap()
}

fun primeNumber(number: Int) : Boolean {
    input(number.toString())

    val squareRoot = sqrt(number.toDouble())

    for (i in 2 until squareRoot.toInt()+1){
        if (number%i == 0){
            output("$number is not a prime number")
            return false
        }
    }

    output("$number is a prime number")
    return true
}