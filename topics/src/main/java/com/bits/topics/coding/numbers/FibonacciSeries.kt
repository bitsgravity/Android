package com.bits.topics.coding.numbers

import com.bits.topics.coding.utils.*

fun main() {
    topDivider()
    fibonacciSeries()
    bottomDivider()
}

fun fibonacciSeries(){
    title("FIBONACCI SERIES")
    fibonacciSeries(5)
    gap()
}

fun fibonacciSeries(limit: Int) {
    input(limit.toString())

    var a = 0
    var b = 1
    var c = 1

    output("The fibonacci series upto $limit is ")

    var divider = ","
    for (i in 1..limit) {
        if (i==limit) divider = ""
        print("$a$divider ")
        a = b
        b = c
        c = a + b
    }
}