package com.bits.learn.program.content

/***********************************************************************************
                         Maximum occurring character in a String
 ***********************************************************************************/

fun main(){
    maximumOccuringCharacter("a")
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

        if(map[it]!! > maxOccuringCharacterCount){
            maxOccuringCharacter = it
            maxOccuringCharacterCount = map[it]!!
        }
    }

    println("Maxmimum occuring character is $maxOccuringCharacter, which is recurring $maxOccuringCharacterCount times")
}

/***********************************************************************************
Notes
 ***********************************************************************************


 ***********************************************************************************/
