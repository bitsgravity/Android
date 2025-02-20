package com.bits.learn.program.content.leetcode

fun main(){
    val input = intArrayOf(2,5,5,11)
    val target = 10

    val solution = Solution()

    val output = solution.twoSum(input,target)

    print(output)
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): ArrayList<Int> {
        val result : ArrayList<Int> = arrayListOf()
        run solution@{
            for(i in 0 until nums.size){
                for(j in 1 until nums.size){
                    if(i!=j){
                        val sum = nums[i] + nums[j]
                        if(sum == target){
                            result.add(0,i)
                            result.add(1,j)
                            return@solution
                        }
                    }
                }
            }
        }
        return result
    }
}


 /************************************************************************
                            Notes
 ************************************************************************

 # 1. Two Sum

 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 You can return the answer in any order.

 Example 1:

 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 Example 2:

 Input: nums = [3,2,4], target = 6
 Output: [1,2]
 Example 3:

 Input: nums = [3,3], target = 6
 Output: [0,1]


 Constraints:

 2 <= nums.length <= 104
 -109 <= nums[i] <= 109
 -109 <= target <= 109
 Only one valid answer exists.


 Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


 ************************************************************************/