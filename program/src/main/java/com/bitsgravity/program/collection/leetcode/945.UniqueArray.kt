package com.bitsgravity.program.collection.leetcode

fun main(){

    val input = intArrayOf(3,2,1,2,1,7)

    val output = minIncrementForUnique(input)

    print(output)
}

var minMoves = 0
fun minIncrementForUnique(numbers: IntArray): Int {
    val numbersMap = HashMap<Int, Boolean>()


    checkForKeys(numbersMap,numbers)

    return minMoves
}

fun checkForKeys(numbersMap: java.util.HashMap<Int, Boolean>, numbers: IntArray) {
    numbers.forEachIndexed { index, num ->
        if (!numbersMap.containsKey(num)) {
            numbersMap[num] = true
        } else {
            numbers[index] = numbers[index] + 1
            minMoves++
            checkForKeys(numbersMap,numbers)
        }
    }
}


fun minIncrementForUnique2(numbers: IntArray): Int {
    var minMoves = 0

    val numbersMap = HashMap<Int, Boolean>()

    var i = 0
    var restart: Boolean
    while (i<=numbers.size){
        var number = numbers[i]
        if (!numbersMap.containsKey(numbers[i])) {
            numbersMap[numbers[i]] = true
            restart = false
        } else {
            numbers[i] = numbers[i] + 1
            minMoves++
            restart = true
        }

        if (restart)
            i= 0
        else
            i++
    }

    return minMoves
}