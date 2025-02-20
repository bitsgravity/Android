package com.bits.learn.program.content

/*******************************
Program to find
 ********************************/

fun main() {
    val input = "Nirmal@Android"

    var expectedIndex: Int? = null

    for (i in input.indices) {
        if (input[i] == '@') {
            expectedIndex = i
            break // Stop looping after finding '@'
        }
    }

    input.forEachIndexed { index, element ->
        if (element == '@') {
            expectedIndex = index
        }
    }


    println("Expected index is $expectedIndex")
}


/***********************************************

Notes:


 ***************************************************/
