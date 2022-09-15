package com.bits.topics.store.coding.numbers

import com.bits.topics.utils.gap
import com.bits.topics.utils.input
import com.bits.topics.utils.output
import com.bits.topics.utils.title

fun palindromeNumber(){
    title("PALINDROME NUMBER")
    palindromeNumber(525)
    gap()
}

fun palindromeNumber(number: Int){
    input(number.toString())

    if (number == reverseNumber2(number)) {
        output("$number is a Palindrome Number")
    } else {
        output("$number is not Palindrome Number")
    }
}

var reversedNumber1 = 0
fun reverseNumber1(number : Int){
    if (number <= 0) return
    val remainder = number % 10
    reversedNumber1 = reversedNumber1 * 10 + remainder
    reverseNumber1(number / 10)
}

fun reverseNumber2(inputNumber: Int): Int {
    var number = inputNumber
    var reversedNumber = 0
    var remainder: Int

    while (number > 0) {
        remainder = number % 10
        reversedNumber = reversedNumber * 10 + remainder
        number = number / 10
    }

    return reversedNumber
}