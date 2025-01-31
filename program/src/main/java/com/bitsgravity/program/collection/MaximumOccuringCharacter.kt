package com.bitsgravity.program.collection

import com.bitsgravity.program.collection.utils.gap
import com.bitsgravity.program.collection.utils.input
import com.bitsgravity.program.collection.utils.output
import com.bitsgravity.program.collection.utils.title

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