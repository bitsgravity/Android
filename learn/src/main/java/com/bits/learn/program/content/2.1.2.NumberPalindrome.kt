package com.bits.learn.program.content

import com.bits.learn.program.util.output

 /***********************************************************************************
                                Palindrome Number
 ***********************************************************************************/

fun main(){
    palindromeNumber(525)
}

fun palindromeNumber(number: Int){
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

/***********************************************************************************
Kotlin Play Ground
 ***********************************************************************************/


/***********************************************************************************
Notes
 ***********************************************************************************


 ***********************************************************************************/
