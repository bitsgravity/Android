package com.bits.learn.program.content

/***********************************************************************************
                           First repeating element in an array
 ***********************************************************************************/

fun main() {

    val inputs = arrayOf(10, 5, 3, 4, 3, 5, 6)

    val countMap = LinkedHashMap<Int,Int>() //Linked HashMap preserves order

    inputs.forEach{
        if(countMap.containsKey(it)){
            countMap[it] = countMap[it]!! + 1
        } else {
            countMap[it] = 1
        }
    }

    var repeatingNumber : Int? = null
    for((number,count) in countMap){
        if(count>1){
            repeatingNumber = number
        }
    }

    println("The repeating number is ${repeatingNumber}")

}

/***********************************************************************************
                                    Theory
 ***********************************************************************************

Find the repeated elements in a given number array

Find a pair of numbers that sum is 8 among the given array

 ***********************************************************************************/
