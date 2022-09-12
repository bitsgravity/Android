package com.bits.interview

import java.lang.StringBuilder

fun main(args: Array<String>) {
    palindromeString(inputPalindromeString)
    specialFormatting(inputSpecialFormatting)
}

val inputPalindromeString = "MALAYALAM"
val outputPalindromeString = true
private fun palindromeString(input: String): Boolean {
    var result = true
    val length = input.length
    for (i in 0 until length / 2) {
        if (input[i] != input[length - i - 1]) {
            result = false
            break
        }
    }
    println("\nPalindrome : $result")
    return result
}

val inputSpecialFormatting = "aaaHH"
val outputSpecialFormatting = "a3H2"
private fun specialFormatting(input: String){
    val output = StringBuilder()
    val inputLength = input.length

    var charCount = 1

    input.forEachIndexed { index, char ->
        val nextIndex = index+1
        if (nextIndex != inputLength){
            if (char == input[nextIndex]){
                charCount++
            } else {
                output.append(char).append(charCount)
                charCount = 1
            }
        } else {
            output.append(char).append(charCount)
        }
    }
    print(output)
}