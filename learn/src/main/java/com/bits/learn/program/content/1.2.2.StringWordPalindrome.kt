package com.bits.learn.program.content

/***********************************************************************************
                            String Palindrome
 ***********************************************************************************/

fun main(){
    val input = "malayalam"
    println("The given string is palindrome : ${checkPalindrome1(input)}")
}

fun checkPalindrome1(input: String): Boolean { //Using halfway check [Traditional]
    for (i in 0 until input.length / 2) {
        if (input[i] != input[input.length - i - 1]) {
            return false
        }
    }
    return true
}

//Using Recursion [Traditional]
fun checkPalindrome2(str: String, start: Int = 0, end: Int = str.length - 1): Boolean {
    if (start >= end) return true
    if (str[start] != str[end]) return false
    return checkPalindrome2(str, start + 1, end - 1)
}


fun checkPalindrome3(input: String): Boolean { //Using Reversed [Kotlin]
    return input == input.reversed()
}


/***********************************************************************************
                                    Theory
 ***********************************************************************************

Problem: Check if a String is a Palindrome

A palindrome is a string that reads the same forward and backward.
For example:
✅ "racecar" → Palindrome
❌ "hello" → Not a Palindrome

Solution:

1. checkPalindromeUsingHalfwayCheck [Traditional]
Time Complexity: O(n)
Space Complexity: O(1) (No extra space used)
Notes:
This is the best traditional way to approach

2. checkPalindromeUsingRecursiveFunction [Traditional]
Time Complexity: O(n)
Space Complexity: O(n) (Recursive calls use stack space)

3. checkPalindromeSpecificUsingReversed [Kotlin]
Time Complexity: O(n)
Space Complexity: O(n) (since reversed() creates a new string)
Notes:
Simple and concise

 ***********************************************************************************/
