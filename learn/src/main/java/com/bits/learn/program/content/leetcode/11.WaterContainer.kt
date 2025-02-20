package com.bits.learn.program.content.leetcode

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


 /***********************************************************************************
                                        Notes
 ***********************************************************************************

 # 11. Container With Most Water

 You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

 Find two lines that together with the x-axis form a container, such that the container contains the most water.

 Return the maximum amount of water a container can store.

 Notice that you may not slant the container.

 ![](/Users/nirmalcm/Projects/Android/leetcode/res/images/question_11.jpg)

 Example 1:


 Input: height = [1,8,6,2,5,4,8,3,7]
 Output: 49
 Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 Example 2:

 Input: height = [1,1]
 Output: 1


 Constraints:

 n == height.length
 2 <= n <= 105
 0 <= height[i] <= 104

 ***********************************************************************************/