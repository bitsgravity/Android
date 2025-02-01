package com.bitsgravity.program.collection

fun main(){
    maximumOccuringCharacter("Malayalam is a language !")
}

fun maximumOccuringCharacter(input : String){

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

    println("Maxmimum occuring character is $maxOccuringCharacter, which is recurring $maxOccuringCharacterCount times")
}