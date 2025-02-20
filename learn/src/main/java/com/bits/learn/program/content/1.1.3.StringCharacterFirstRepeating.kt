package com.bits.learn.program.content

/***********************************************************************************
                         First repeating character in a String
 ***********************************************************************************/

fun main(){
    val input = "interview"
    println("The first non repeating char is ${findFirstRepeatingCharacter(input)}")
}

fun findFirstRepeatingCharacter(input : String) : Char? { //Using character set [Traditional]
    val characterSet = mutableSetOf<Char>()

    //Iterate through the string to find the first repeating character
    for(char in input){

        //Check if the character is already in the set
        if(characterSet.contains(char)){
            return char
        } else {
            characterSet.add(char)
        }
    }
    return null
}

/***********************************************************************************
                                    Theory
 ***********************************************************************************

 1. findFirstNonRepeatingCharUsingCharacterSet [Traditional]
Time Complexity: O(n)
Space Complexity: O(1)

 ***********************************************************************************/
