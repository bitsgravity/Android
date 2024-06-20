package com.bits.leetcode.solutions

fun main(){

    val input = intArrayOf(1,8,6,2,5,4,8,3,7)

    val output = maxArea(input)

    print(output)
}

fun maxArea(height: IntArray): Int {

    val heightsArray = mutableListOf<Int>()
    heightsArray.add(0,0)
    height.forEachIndexed { index, height ->
        heightsArray.add(index+1,height)
    }

    var maxArea = 0

    var left = 0
    var right = heightsArray.size - 1

    while (left < right) {
        val currentArea = minOf(heightsArray[left], heightsArray[right]) * (right - left)

        if (currentArea > maxArea) {
            maxArea = currentArea
        }

        if (heightsArray[left] < heightsArray[right]) {
            left++
        } else {
            right--
        }
    }

    return maxArea
}

//2 pointer approach
//Make 2 poniters - one at right and one at left
//Calculate area each time and move the pointers