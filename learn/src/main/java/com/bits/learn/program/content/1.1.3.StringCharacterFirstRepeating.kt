package com.bits.learn.program.content

/***********************************************************************************
                                Kotlin Play Ground
 ***********************************************************************************/

fun main(){
    val input = "interview"
    println("The first non repeating char is ${findFirstNonRepeatingChar(input)}")
}

fun findFirstNonRepeatingChar(input : String) : Char? { //Using character set [Traditional]
    val characterSet = mutableSetOf<Char>()
    var output : Char? = null
    for(char in input){
        if(characterSet.contains(char)){
            output = char
            break
        } else {
            characterSet.add(char)
        }
    }
    return output
}

/***********************************************************************************
                                    Theory
 ***********************************************************************************

 1. findFirstNonRepeatingCharUsingCharacterSet [Traditional]
Time Complexity: O(n)
Space Complexity: O(1)

 ***********************************************************************************/
