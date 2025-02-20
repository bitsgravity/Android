package com.bits.learn.program.content

/***********************************************************************************
                    First non-repeating character in a String (Static)
 ***********************************************************************************/

fun main(){
    val input = "aciikac"
    println("Output is ${checkFirstNonRepeatingCharacter1(input)}")
}

fun checkFirstNonRepeatingCharacter1(input: String): Char? { //Using Character Count Map [Traditional]
    var map = HashMap<Char,Int>()
    for(char in input){
        if(map.containsKey(char)){
            map[char] = map[char]!! + 1
        } else {
            map[char] = 1
        }
    }

    //Iterate through the string again to find the first non-repeating character
    for(char in input){
        if(map[char] == 1)
            return char
    }
    return null
}

fun checkFirstNonRepeatingCharacter2(input: String): Char? { //Using Grouping by Frequency Map [Kotlin]
    val charCount = input.groupingBy { it }.eachCount()
    return input.firstOrNull { charCount[it] == 1 }
}

/***********************************************************************************
                                    Theory
 ***********************************************************************************

Problem: Find the First Non-Repeating Character in a String

Given a string, find the first character that does not repeat anywhere in the string.
If all characters repeat, return '_' or any indication of no unique character.

Example 1:
Input: "kotlin"
Output: 'k'

Example 2:
Input: "aabbcc"
Output: '_' (since all characters repeat)

 1. checkFirstNonRepeatingCharacterUsingCharacterCountMap [Traditional]
Time Complexity: O(n) → Two loops, but each runs in linear time.
Space Complexity: O(1) → HashMap stores at most 26 entries (for lowercase letters).
Efficient & readable

2. checkFirstNonRepeatingCharacter2UsingGroupingByFrequencyMap [Kotlin]
Time Complexity: O(n)
Space Complexity: O(1)
Cleaner & concise

 ***********************************************************************************/
