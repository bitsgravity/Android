package com.bitsgravity.program.collection

/***********************************************************************************
                            Kotlin Playground
 ***********************************************************************************/

fun main() {
    val input1 = "silent" //Apple
    val input2 = "listen" //Plead
    println("The given strings are Anagram : ${checkAnagram1(input1,input2)}")
}

//Using HashMap [Traditional]
fun checkAnagram1(input1: String, input2: String): Boolean {
    if (input1.length != input2.length) return false  // Length mismatch check

    val map = HashMap<Char, Int>()

    // Count occurrences in input1 (without getOrDefault)
    for (char in input1) {
        if (map.containsKey(char)) {
            map[char] = map[char]!! + 1
        } else {
            map[char] = 1
        }
    }

    // Decrease count for input2
    for (char in input2) {
        if (!map.containsKey(char) || map[char] == 0) {
            return false
        }
        map[char] = map[char]!! - 1
    }

    return true
}

//Using Sorting [Traditional]
fun checkAnagram2(input1: String, input2: String): Boolean {
    return input1.length == input2.length && input1.toCharArray().sorted() == input2.toCharArray().sorted()
}

//Using Grouping To Map [Kotlin Specific]
fun checkAnagram3(input1: String, input2: String): Boolean {
    return input1.groupingBy { it }.eachCount() == input2.groupingBy { it }.eachCount()
}

/***********************************************************************************
                                    Performance
 ***********************************************************************************

1. checkAnagramTraditionalWithHashMap
Time Complexity: 𝑂(𝑛)
Space Complexity: O(1) (since only 26 letters for lowercase English letters)
Notes :
Efficient for large input

2. checkAnagramTraditionalWithSorting
Time Complexity: O(nlogn) (due to sorting)
Space Complexity: O(1)
Notes :
Simpler but slower

3. checkAnagramKotlinicWithGroupingToMap
Time Complexity: O(n)
Space Complexity: O(1)
Notes :
Most readable

 ***********************************************************************************/