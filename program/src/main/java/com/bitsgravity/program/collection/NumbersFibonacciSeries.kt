package com.bitsgravity.program.collection

fun main() {
    fibonacciSeries(5)
}

fun fibonacciSeries(limit: Int) {
    var a = 0
    var b = 1
    var c = 1

    println("The fibonacci series upto $limit is ")

    var divider = ","
    for (i in 1..limit) {
        if (i==limit) divider = ""
        print("$a$divider ")
        a = b
        b = c
        c = a + b
    }
}