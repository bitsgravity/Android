package com.bits.learn.program.content.leetcode

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


 /***********************************************************************************
                                        Notes
 ***********************************************************************************

 # 945. Minimum Increment to Make Array Unique
 You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.

 Return the minimum number of moves to make every value in nums unique.

 The test cases are generated so that the answer fits in a 32-bit integer.



 Example 1:

 Input: nums = [1,2,2]
 Output: 1
 Explanation: After 1 move, the array could be [1, 2, 3].
 Example 2:

 Input: nums = [3,2,1,2,1,7]
 Output: 6
 Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
 It can be shown with 5 or less moves that it is impossible for the array to have all unique values.


 Constraints:

 1 <= nums.length <= 105
 0 <= nums[i] <= 105


 ***********************************************************************************/