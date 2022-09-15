package com.bits.topics.store.coding.numbers

import com.bits.topics.utils.*

fun main() {
    print(Divider.DIVIDER_TOP)
    fibonacciSeries()
    print(Divider.DIVIDER_BOTTOM)
}

fun fibonacciSeries(){
    val input = 5
    val output = "0, 1, 1, 2, 3"

    printTitle("FIBONACCI SERIES")
    fibonacciSeries(5)
    printGap()
}

fun fibonacciSeries(limit: Int) {
    printInput(limit.toString())

    var a = 0
    var b = 1
    var c = 1

    printOutput("The fibonacci series upto $limit is ")

    var divider = ","
    for (i in 1..limit) {
        if (i==limit) divider = ""
        print("$a$divider ")
        a = b
        b = c
        c = a + b
    }
}