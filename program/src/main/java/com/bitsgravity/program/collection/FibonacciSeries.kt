package com.bitsgravity.program.collection

import com.bitsgravity.program.collection.utils.bottomDivider
import com.bitsgravity.program.collection.utils.gap
import com.bitsgravity.program.collection.utils.input
import com.bitsgravity.program.collection.utils.output
import com.bitsgravity.program.collection.utils.title
import com.bitsgravity.program.collection.utils.topDivider

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