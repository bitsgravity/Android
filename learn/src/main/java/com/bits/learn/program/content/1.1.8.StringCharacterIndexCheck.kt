package com.bits.learn.program.content

 /***********************************************************************************
                            Index of a character in a String
 ***********************************************************************************/

fun main() {
    val input = "Nirmal@Android"

    var expectedIndex: Int? = null

    for (i in input.indices) {
        if (input[i] == '@') {
            expectedIndex = i
            break // Stop looping after finding '@'
        }
    }

    input.forEachIndexed { index, element -> //Another method to iterate through the string
        if (element == '@') {
            expectedIndex = index
        }
    }


    println("Expected index is $expectedIndex")
}


/***********************************************

Notes:


 ***************************************************/
