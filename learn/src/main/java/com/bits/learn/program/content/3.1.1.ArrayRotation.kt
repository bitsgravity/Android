package com.bits.learn.program.content

import com.bits.learn.program.util.input
import com.bits.learn.program.util.output
import java.util.Arrays


 /***********************************************************************************
                                Array Rotation
 ***********************************************************************************/

fun main() {
    val inputs = arrayListOf(3, 5, 6, 7, 8)
    arrayRotationRight(inputs)
    println(inputs) // Expected output: [8, 3, 5, 6, 7]
}

//fun main() {
//    rotateLeft(arrayOf(25,17,14,11,7),2)
//}

fun arrayRotationRight(inputs: ArrayList<Int>) {
    if (inputs.isEmpty()) return // Edge case: empty list

    val lastElement = inputs[inputs.size - 1] // Store last element

    // Shift elements from right to left
    for (i in inputs.size - 1 downTo 1) {
        inputs[i] = inputs[i - 1]
    }

    // Place last element at the first position
    inputs[0] = lastElement
}

/***********************************************

Notes:

Time Complexity
O(N), where N is the size of the array.
Reason: Each element is shifted once


 ***************************************************/


fun rotateLeft(input : Array<Int>, offset : Int) : Array<Int> {
    input("${Arrays.toString(input)} should be rotated $offset values to the left side")
    val result = input
    var _offset = offset
    while (_offset > 0){
        val firstValue = result[0]
        run Breaking@ {
            result.forEachIndexed { index, element ->
                if (index == input.size -1){
                    return@Breaking
                }
                result[index] = result[index+1]
            }
        }
        result[input.size-1] = firstValue
        _offset--
    }
    output("The rotated array is ${result.contentToString()}")

    return result
}

fun rotateRight(input : Array<Int>, offset : Int){
    input("${Arrays.toString(input)} should be rotated $offset values to the right side")
    val alteredInput = input.reversed().toIntArray()
    val result = rotateLeft(alteredInput.toTypedArray(),offset).reversed().toTypedArray()
    output("The rotated array is ${result.contentToString()}")
}





/***********************************************************************************
Notes
 ***********************************************************************************


 ***********************************************************************************/
