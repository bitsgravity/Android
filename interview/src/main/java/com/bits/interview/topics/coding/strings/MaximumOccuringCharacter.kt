package com.bits.interview.topics.coding.strings

import com.bits.interview.utils.printGap
import com.bits.interview.utils.printInput
import com.bits.interview.utils.printOutput
import com.bits.interview.utils.printTitle

fun maximumOccuringCharacter(){
    printTitle("MAXIMUM OCCURING CHARACTER")
    maximumOccuringCharacter("Malayalam is a language !")
    printGap()
}

fun maximumOccuringCharacter(input : String){
    printInput(input)

    var maxOccuringCharacter : Char? = null
    var maxOccuringCharacterCount : Int = 0

    val map : HashMap<Char,Int> = HashMap()

    input.forEach {
        if (map.containsKey(it)){
            map[it] = map[it]!!+1
        } else {
            map[it] = 1
        }

        if (map[it]!! > maxOccuringCharacterCount){
            maxOccuringCharacterCount = map[it]!!
            maxOccuringCharacter = it
        }
    }

    printOutput("Maxmimum occuring character is $maxOccuringCharacter, which is recurring $maxOccuringCharacterCount times")
}