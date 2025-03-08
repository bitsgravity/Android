package com.bits.learn.program.content


/***********************************************************************************
                                Array Subsets
 ***********************************************************************************/

fun main() {
    val input = intArrayOf(0, 1, 2, 3, 4, -4)
    val output = maxLenZeroSumSubarray(input)
    println("Maximum length subarray with sum 0: $output") // Output: 2
}

fun generateSubsets(input: IntArray): List<List<Int>> {
    val subsets = mutableListOf<List<Int>>()
    val n = input.size
    val totalSubsets = 1 shl n // 2^n

    for (mask in 0 until totalSubsets) {
        val subset = mutableListOf<Int>()
        for (i in input.indices) {
            if ((mask and (1 shl i)) != 0) { // Check if the i-th bit is set
                subset.add(input[i])
            }
        }
        subsets.add(subset)
    }
    return subsets
}

fun maxLenZeroSumSubarray(input: IntArray): Int {
    val prefixSumMap = mutableMapOf<Int, Int>() // Map to store prefix sum and index
    var maxLength = 0
    var sum = 0

    for ((index, value) in input.withIndex()) {
        sum += value

        // If sum is zero, update maxLength from start of array
        if (sum == 0) {
            maxLength = index + 1
        }

        // If sum was seen before, update maxLength
        if (prefixSumMap.containsKey(sum)) {
            maxLength = maxOf(maxLength, index - prefixSumMap[sum]!!)
        } else {
            // Store first occurrence of sum
            prefixSumMap[sum] = index
        }
    }

    return maxLength
}

/***********************************************************************************
                                    Notes
 ***********************************************************************************


 ***********************************************************************************/
