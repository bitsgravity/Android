package com.bits.leetcode.solutions

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