package com.bits.topics.store.coding.strings

import com.bits.topics.utils.printGap
import com.bits.topics.utils.printInput
import com.bits.topics.utils.printOutput
import com.bits.topics.utils.printTitle

fun palindromeString(){
    val input = "malayalam"
    val output = "Is malayalam a Palindrome String? : true"

    printTitle("PALINDROME STRING")
    palindromeString("malayalam")
    printGap()
}

fun palindromeString(input: String): Boolean {
    printInput(input)

    var result = true
    val length = input.length
    for (i in 0 until length / 2) {
        if (input[i] != input[length - i - 1]) {
            result = false
            break
        }
    }

    printOutput(result.toString())

    return result
}