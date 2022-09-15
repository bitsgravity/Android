package com.bits.topics.store.coding.strings

import com.bits.topics.utils.gap
import com.bits.topics.utils.input
import com.bits.topics.utils.output
import com.bits.topics.utils.title

fun maximumOccuringCharacter(){
    title("MAXIMUM OCCURING CHARACTER")
    maximumOccuringCharacter("Malayalam is a language !")
    gap()
}

fun maximumOccuringCharacter(input : String){
    input(input)

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

    output("Maxmimum occuring character is $maxOccuringCharacter, which is recurring $maxOccuringCharacterCount times")
}

fun countOccurrences(input: String, ch: Char): Int {
    return input.filter { it == ch }.count()
}