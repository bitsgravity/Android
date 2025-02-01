package com.bitsgravity.program.collection

import com.bitsgravity.program.collection.trash.gap
import com.bitsgravity.program.collection.trash.input
import com.bitsgravity.program.collection.trash.output
import com.bitsgravity.program.collection.trash.title

fun main(){
    palindromeString("malayalam")
}

fun palindromeString(input: String): Boolean {

    var result = true
    val length = input.length
    for (i in 0 until length / 2) {
        if (input[i] != input[length - i - 1]) {
            result = false
            break
        }
    }

    println(result.toString())

    return result
}