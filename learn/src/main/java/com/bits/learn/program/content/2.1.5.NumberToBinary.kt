package com.bits.learn.program.content

 /***********************************************************************************
                            Decimal Number to Binary
 ***********************************************************************************/

fun main() {
    convertToBinary(7) // Example input
}

fun convertToBinary(input: Int) {
    var num = input
    val binaryArray = ArrayList<Int>()

    while (num > 0) {
        val remainder = num % 2
        binaryArray.add(remainder) // Store remainder (binary bit)
        num = num/2 // Reduce number by dividing by 2
    }

    // Binary representation is in reverse order, so we need to reverse it
    println("Binary representation of $input is: " + binaryArray.reversed().joinToString(""))
}

fun convertToBinaryEfficient(input: Int) {
    var num = input
    val result = StringBuilder()

    while (num > 0) {
        result.append(num % 2) // Append remainder (binary bit)
        num /= 2
    }

    println("Binary representation of $input is: ${result.reverse()}")
}

/***********************************************

Notes:

Explanation
Keep dividing the number by 2 and store the remainder.
Repeat until the number becomes 0.
Since binary digits are stored in reverse order, reverse the list before printing.
Example Output
vbnet
Copy
Edit
Binary representation of 7 is: 111

Time Complexity
O(log N) → Since we're repeatedly dividing by 2, the number of steps is proportional to the number of bits.

 ***************************************************/
