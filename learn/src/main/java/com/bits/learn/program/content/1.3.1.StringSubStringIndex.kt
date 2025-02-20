package com.bits.learn.program.content

/*******************************
Program to find substring index
 ********************************/

//fun main() {
//    val input = "given"
//    val givenString = "the given string" // Expected output: 4
//    val output = findIndexOfSubstring(input, givenString)
//    println("The matching index of \"$input\" in \"$givenString\" is $output")
//}

fun findIndexOfSubstring(input: String, givenString: String): Int {
    val inputLength = input.length
    val givenLength = givenString.length

    for (i in 0..givenLength - inputLength) { // Loop till a valid substring can be checked
        var j = 0
        while (j < inputLength && givenString[i + j] == input[j]) {
            j++
        }
        if (j == inputLength) {
            return i // If all characters matched, return starting index
        }
    }
    return -1 // Not found
}

fun findIndexOfSubstringKotlinic(input: String, givenString: String): Int {
    return givenString.indexOf(input) // `indexOf()` finds the first occurrence of a substring
}

/***********************************************

Notes:

Why is this a better manual approach?
Avoids Unnecessary Comparisons
Instead of nested loops comparing every character, it compares substrings efficiently.
Uses the Sliding Window Technique
We check from i to i + input.length, ensuring we only match when necessary.
Time Complexity: O(N * M)
N = length of givenString, M = length of input. This is better than checking every character blindly.

 ***************************************************/
