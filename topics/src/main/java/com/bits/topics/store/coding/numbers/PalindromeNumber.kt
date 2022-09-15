package com.bits.topics.store.coding.numbers

import com.bits.topics.utils.printGap
import com.bits.topics.utils.printInput
import com.bits.topics.utils.printOutput
import com.bits.topics.utils.printTitle

fun palindromeNumber(){
    val input = 525
    val output = "525 is a palindrome Number"

    printTitle("PALINDROME NUMBER")
    palindromeNumber(525)
    printGap()
}

fun palindromeNumber(number: Int){
    printInput(number.toString())

    if (number == reverseNumber2(number)) {
        printOutput("$number is a Palindrome Number")
    } else {
        printOutput("$number is not Palindrome Number")
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