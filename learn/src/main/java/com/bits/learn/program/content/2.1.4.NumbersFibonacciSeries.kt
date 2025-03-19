package com.bits.learn.program.content

 /***********************************************************************************
                                Fibonacci Series
 ***********************************************************************************/

fun main() {
    fibonacciSeries(5)

     val input = 10
     val output1 = fibonacciIterative(input)
     println(output1) // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

     val output2 = List(input) { fibonacciRecursive(it) }
}

fun fibonacciIterative(input: Int): List<Int> {
    if (input <= 0) return emptyList()
    if (input == 1) return listOf(0)

    val output = mutableListOf(0, 1)
    for (i in 2 until input) {
        output.add(output[i - 1] + output[i - 2])
    }
    return output
}

fun fibonacciRecursive(input: Int): Int {
    return if (input <= 1) input else fibonacciRecursive(input - 1) + fibonacciRecursive(input - 2)
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


/***********************************************************************************
Kotlin Play Ground
 ***********************************************************************************/


/***********************************************************************************
Notes
 ***********************************************************************************


 ***********************************************************************************/
