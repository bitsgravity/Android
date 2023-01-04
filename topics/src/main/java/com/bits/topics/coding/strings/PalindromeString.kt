package com.bits.topics.coding.strings

import com.bits.topics.coding.utils.gap
import com.bits.topics.coding.utils.input
import com.bits.topics.coding.utils.output
import com.bits.topics.coding.utils.title

fun palindromeString(){
    title("PALINDROME STRING")
    palindromeString("malayalam")
    gap()
}

fun palindromeString(input: String): Boolean {
    input(input)

    var result = true
    val length = input.length
    for (i in 0 until length / 2) {
        if (input[i] != input[length - i - 1]) {
            result = false
            break
        }
    }

    output(result.toString())

    return result
}