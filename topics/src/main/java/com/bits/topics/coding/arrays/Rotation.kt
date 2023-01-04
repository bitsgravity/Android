package com.bits.topics.coding.arrays

import com.bits.topics.coding.utils.*
import java.util.*

fun arrayRotation(){
    rotateLeft()
    rotateRight()
}

fun rotateLeft() {
    title("ARRAY ROTATION LEFT")
    rotateLeft(arrayOf(25,17,14,11,7),2)
    gap()
}

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

fun rotateRight() {
    title("ARRAY ROTATION RIGHT")
    rotateRight(arrayOf(7,11,14,17,25),2)
    gap()
}

fun rotateRight(input : Array<Int>, offset : Int){
    input("${Arrays.toString(input)} should be rotated $offset values to the right side")
    val alteredInput = input.reversed().toIntArray()
    val result = rotateLeft(alteredInput.toTypedArray(),offset).reversed().toTypedArray()
    output("The rotated array is ${result.contentToString()}")
}