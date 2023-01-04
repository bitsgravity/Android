package com.bits.topics.coding

import com.bits.topics.coding.arrays.arrayRotation
import com.bits.topics.coding.numbers.amstrongNumber
import com.bits.topics.coding.numbers.fibonacciSeries
import com.bits.topics.coding.numbers.palindromeNumber
import com.bits.topics.coding.numbers.primeNumber
import com.bits.topics.coding.strings.maximumOccuringCharacter
import com.bits.topics.coding.strings.palindromeString
import com.bits.topics.coding.strings.reverseWords
import com.bits.topics.coding.strings.specialformats.sequentialCountPrint
import com.bits.topics.coding.utils.bottomDivider
import com.bits.topics.coding.utils.topDivider

//-------------------------------- Exercise ------------------------------//

fun main(){
    topDivider()
    programs()
    bottomDivider()
}

fun programs() {
    strings()
    numbers()
    arrays()
}

fun strings() {
    maximumOccuringCharacter()
    palindromeString()
    reverseWords()
    sequentialCountPrint()
}

fun numbers() {
    amstrongNumber()
    fibonacciSeries()
    palindromeNumber()
    primeNumber()
}

fun arrays() {
    arrayRotation()
}
