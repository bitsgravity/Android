package com.bits.learn.program.content

/***********************************************************************************
  Arrange Numbers In Order - Even Numbers at first, then Odd Numbers (Google Mock)
 ***********************************************************************************/

fun main(){
    val input = arrayOf(3, 8, 1, 4, 5, 2)
    val output = reArrangeNumbers(input)

    output.forEach {
        println(it)
    }
}

fun reArrangeNumbers(numbers: Array<Int>): Array<Int> {
    var i = 0
    var j = numbers.size - 1

    while (i < j) {
        if (numbers[i] % 2 == 0) { //Even number (Right place)
            i++ //Increment i (Left pointer)
        } else { //Odd number

            if (j % 2 == 0) {//Odd number (Right place) [Doubt here] //Cross check please
                j-- //Decrement j (Right pointer)
            } else { //Swap required
                val temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
                i++
                j--
            }
        }
    }

    return numbers
}

/***********************************************************************************
                                    Notes
 ***********************************************************************************

Given an array of integers A, rearrange the elements such that all even numbers come before all odd numbers.

Example:

Input: A = [3, 8, 1, 4, 5, 2]
Output: A = [8, 4, 2, 3, 1, 5]

(Order within even and odd groups doesn't matter)


Output pattern on iteration will be,
Input: A = [3, 8, 1, 4, 5, 2]
Input: A = [2, 8, 1, 4, 5, 3]
Input: A = [2, 8, 4, 1, 5, 3]




 ***********************************************************************************/
