package com.bitsgravity.program.collection

import com.bitsgravity.program.collection.utils.gap
import com.bitsgravity.program.collection.utils.input
import com.bitsgravity.program.collection.utils.output
import com.bitsgravity.program.collection.utils.title

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