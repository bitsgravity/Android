package com.bits.learn.program.content

/***********************************************************************************
                                Kotlin Play Ground
 ***********************************************************************************/

fun main() {
    val input = intArrayOf(2, 3, 4, 5, 6)
    val target = 7
    val output = findTarget(input, target)
    println(output ?: "No pair found")  // Expected Output: (0, 3) → (2 + 5 = 7)
}

fun findTarget(input: IntArray, target: Int): Pair<Int, Int>? {
    var left = 0
    var right = input.size - 1

    while (left < right) {
        val sum = input[left] + input[right]
        when {
            sum == target -> return Pair(left, right)
            sum < target -> left++
            else -> right--
        }
    }
    return null  // No pair found
}

/***********************************************************************************
                                    Notes
 ***********************************************************************************


 ***********************************************************************************/
