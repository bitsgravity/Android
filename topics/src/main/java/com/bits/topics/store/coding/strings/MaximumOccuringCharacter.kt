package com.bits.topics.store.coding.strings

import com.bits.topics.utils.printGap
import com.bits.topics.utils.printInput
import com.bits.topics.utils.printOutput
import com.bits.topics.utils.printTitle

fun maximumOccuringCharacter(){
    printTitle("MAXIMUM OCCURING CHARACTER")
    maximumOccuringCharacter("Malayalam is a language !")
    printGap()
}

fun maximumOccuringCharacter(input : String){
    printInput(input)

    var maxOccuringCharacter : Char? = null
    var maxOccuringCharacterCount = 0

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

fun countOccurrences(input: String, ch: Char): Int {
    return input.filter { it == ch }.count()
}