package com.bits.topics.store.coding.numbers

import com.bits.topics.utils.*

fun main(){
    topDivider()
    amstrongNumber()
    bottomDivider()
}

fun amstrongNumber(){
    title("AMSTRONG NUMBER")
    amstrongNumber(371)
    gap()
}

fun amstrongNumber(input : Int){
    input(input.toString())

    var number = input
    var reminder = 0
    var result = 0

    while (number > 0){
        reminder = number % 10
        result = result + Math.pow(reminder.toDouble(),3.0).toInt()
        number = number/10
    }

    if (input == result) output("$input is an amstrong number")
    else output("$input is not an amstrong number")
}