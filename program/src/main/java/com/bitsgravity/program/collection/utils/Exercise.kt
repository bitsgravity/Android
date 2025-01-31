package com.bitsgravity.program.collection.utils

import com.bitsgravity.program.collection.arrayRotation
import com.bitsgravity.program.collection.amstrongNumber
import com.bitsgravity.program.collection.fibonacciSeries
import com.bitsgravity.program.collection.palindromeNumber
import com.bitsgravity.program.collection.primeNumber
import com.bitsgravity.program.collection.maximumOccuringCharacter
import com.bitsgravity.program.collection.palindromeString
import com.bitsgravity.program.collection.reverseWords
import com.bitsgravity.program.collection.sequentialCountPrint

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
