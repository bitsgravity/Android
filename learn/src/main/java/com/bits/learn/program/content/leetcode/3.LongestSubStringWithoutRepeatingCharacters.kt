package com.bits.learn.program.content.leetcode

fun main(){
    val input = "dvdf"

    val output = lengthOfLongestSubString(input)

    println(output)
}

fun lengthOfLongestSubString(s: String): Int {
    var input = s
    var output = 0
    val subString = StringBuilder()
    val map = HashMap<String,Int>()

    var i=0
    do {
        input.forEachIndexed { index, char ->
            if (!subString.contains(char)){
                subString.append(char)
                if (index == input.length-1){
                    map[subString.toString()] = subString.length
                }
            } else {
                map[subString.toString()] = subString.length
                subString.clear()
                subString.append(char)
            }

        }
        if (input.isNotEmpty()){
            i += 1
            input = input.substring(i,input.length)
        }

    } while (input.isNotEmpty())

    if (map.isNotEmpty()){
        output = map.maxOf { it.value }
    }
    return output
}

/***********************************************************************************
                                        Notes
 ***********************************************************************************

# 3. Longest SubString without repeating characters

Given a string s, find the length of the longest
substring
without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

 ***********************************************************************************/
