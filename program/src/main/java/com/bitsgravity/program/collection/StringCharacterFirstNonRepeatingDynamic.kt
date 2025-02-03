package com.bitsgravity.program.collection

/***********************************************************************************
                                Kotlin Play Ground
 ***********************************************************************************/

fun main(){
    val input = "kkotolin"
    println("The first non repeating character in the given dynamic character stream is ${checkFirstNonRepeatingCharacterDynamic1(input)}")
}

fun checkFirstNonRepeatingCharacterDynamic1(input : String) : Char? { //Using Linked Hash Map
    val characterCountMap = LinkedHashMap<Char,Int>()
    for(char in input){
        if(characterCountMap.containsKey(char)){
            characterCountMap[char] = characterCountMap[char]!! + 1
        } else {
            characterCountMap[char] = 1
        }
    }
    for((char,count) in characterCountMap){
        if(count==1){
            return char
        }
    }
    return null
}

/***********************************************************************************
                                    Theory
 ***********************************************************************************

Problem
--------
First Non-Repeating Character in a Stream (One-Pass Solution)

Given a string (stream of characters), find the first character that appears only once while iterating through it.
Unlike the previous approach, we need to find this in one pass.

Example 1:
Input: "kotlin"
Output: 'k'

Example 2:
Input: "aabbcc"
Output: null (since all characters repeat)

Solution
--------
1. checkFirstNonRepeatingCharacterDynamicUsingLinkedHashMap [Traditional]
    Time Complexity: O(n) (Two linear passes)
    Space Complexity: O(1) (At most 26 entries for lowercase letters)
    We use a LinkedHashMap to count occurrences while preserving insertion order.

Difference Between the Two Programs
------------------------------------
Feature
    Find First Non-Repeating Character
    Find First Non-Repeating Character in a Stream (One-Pass)

Order of Processing
    Two-pass approach (First count, then find)
    One-pass approach (Process while reading)

Data Structure Used
    HashMap<Char, Int> (unordered)
    LinkedHashMap<Char, Int> (preserves order)

Use Case
    Used for a fixed string (entire input available at once)
    Used for a continuous stream (characters processed as they arrive)

Efficiency
    Slightly less optimized due to two passes
    More optimized for real-time processing

When to Use Which?
------------------
    If you have a static string and need to find the first non-repeating character,
    the first approach (two-pass) is good.

    If you are dealing with a live stream of characters (e.g., real-time input),
    the one-pass solution is better.

Example to Understand the Difference
----------------------------------------
First Non-Repeating Character in a String (Two-Pass)
    println(firstNonRepeatingCharTraditional("kotlin"))  // Output: 'k'
    println(firstNonRepeatingCharTraditional("aabbcc"))  // Output: '_'

    First, we count all occurrences.
    Then, we loop again to find the first one that appears once.

First Non-Repeating Character in a Stream (One-Pass)
    println(firstNonRepeatingCharOnePass("kotlin"))  // Output: 'k'
    println(firstNonRepeatingCharOnePass("aabbcc"))  // Output: null
    While reading, we count & track order simultaneously.

Summary
--------
    If you already have the full string → Use the two-pass approach.
    If the input is arriving in a stream → Use the one-pass approach with LinkedHashMap.

 ***********************************************************************************/
