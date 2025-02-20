package com.bits.learn.program.content

fun main(){
    palindromeNumber(525)
}

fun palindromeNumber(number: Int){
    if (number == reverseNumber2(number)) {
        com.bits.learn.program.trash.output("$number is a Palindrome Number")
    } else {
        com.bits.learn.program.trash.output("$number is not Palindrome Number")
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