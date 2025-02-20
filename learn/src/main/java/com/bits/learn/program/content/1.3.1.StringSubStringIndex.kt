package com.bits.learn.program.content

 /***********************************************************************************
                        Index of substring in a String
 ***********************************************************************************/

fun main() {
    val input = "given"
    val givenString = "the given string" // Expected output: 4
    val output = findIndexOfSubstring(input, givenString)
    println("The matching index of \"$input\" in \"$givenString\" is $output")
}

fun findIndexOfSubstring(input: String, givenString: String): Int {

    for (i in 0..givenString.length - input.length) { // Loop till a valid substring can be checked
        var j = 0
        while (j < input.length && givenString[i + j] == input[j]) {
            j++
        }
        if (j == input.length) {
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
