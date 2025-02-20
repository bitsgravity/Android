package com.bits.learn.program.content

 /***********************************************************************************
                        Separate digits from characters in a String
 ***********************************************************************************/

 fun main() {
     val input = "Str1in3gsRe5su9lt"
     separateDigitsFromString(input)
 }

fun separateDigitsFromString(input: String) {
    val output = StringBuilder()
    val numbers = arrayListOf<Int>()

    input.forEach {
        if (it.isDigit()) {
            numbers.add(it.toString().toInt()) // Convert char to integer and store
        } else {
            output.append(it) // Append characters directly
        }
    }

    numbers.sorted().forEach { // Sorting numbers before appending
        output.append(it)
    }

    println("The expected corrected string is $output")
}

/***********************************************

Notes:


Checking for Digits:
it.isDigit() is used instead of it.toInt(), as toInt() doesn’t work directly on characters.
Storing Numbers Properly:
numbers.add(it.toString().toInt()) ensures numbers are stored as integers (sorted automatically in ascending order when iterated).
Sorting Numbers:
If numbers should always appear in sorted order, use .sorted() before appending them.


Output
The expected corrected string is StringsResult1359

Time Complexity
O(N log N) due to sorting, but can be optimized to O(N) if order doesn't matter.
Let me know if you want any modifications! 🚀


 ***************************************************/
