package com.bits.interview

import com.bits.interview.topics.numbers.fibonacciSeries
import com.bits.interview.topics.numbers.palindromeNumber
import com.bits.interview.topics.numbers.primeNumber
import com.bits.interview.topics.strings.palindromeString
import com.bits.interview.topics.strings.specialFormats
import com.bits.interview.utils.Divider.DIVIDER_BOTTOM
import com.bits.interview.utils.Divider.DIVIDER_TOP

fun main(args: Array<String>) {

    print(DIVIDER_TOP)

    fibonacciSeries()
    palindromeNumber()
    primeNumber()

    palindromeString()
    specialFormats()

    print(DIVIDER_BOTTOM)

}