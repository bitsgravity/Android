package com.bits.topics.store.coding.numbers

import com.bits.topics.utils.printGap
import com.bits.topics.utils.printInput
import com.bits.topics.utils.printOutput
import com.bits.topics.utils.printTitle

fun primeNumber(){
    val input = 11
    val output = "11 is a prime number"

    printTitle("PRIME NUMBER")
    primeNumber(11)
    printGap()
}

fun primeNumber(number: Int) : Boolean {
    printInput(number.toString())

    val squareRoot = Math.sqrt(number.toDouble())

    for (i in 2 until squareRoot.toInt()+1){
        if (number%i == 0){
            printOutput("$number is not a prime number")
            return false
        }
    }

    printOutput("$number is a prime number")
    return true
}