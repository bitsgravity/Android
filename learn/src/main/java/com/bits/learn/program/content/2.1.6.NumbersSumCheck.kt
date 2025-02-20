package com.bits.learn.program.content

/***********************************************************************************
                                Kotlin Play Ground
 ***********************************************************************************/

fun findIndices(input: Array<Int>, target: Int): Pair<Int, Int>? {
    val map = mutableMapOf<Int, Int>()

    for ((index, value) in input.withIndex()) {
        val complement = target - value
        if (map.containsKey(complement)) {
            return Pair(map[complement]!!, index)
        }
        map[value] = index
    }
    return null
}

fun main() {
    val inputs = arrayOf(10, 5, 3, 4, 3, 5, 6)
    val targetSum = 8

    val output = findIndices(inputs, targetSum)

    output?.let {
        println("Indices: ${it.first}, ${it.second}")
    } ?: println("No such indices found.")
}


/***********************************************************************************
                                    Theory
 ***********************************************************************************


 ***********************************************************************************/
