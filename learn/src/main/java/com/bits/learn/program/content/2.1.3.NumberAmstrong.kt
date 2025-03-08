package com.bits.learn.program.content

 /***********************************************************************************
                                Armstrong Number
 ***********************************************************************************/

fun main(){
    amstrongNumber(371)
}

fun amstrongNumber(input : Int){
    var number = input
    var reminder : Int
    var result = 0

    while (number > 0){
        reminder = number % 10
        result = result + reminder * reminder * reminder
        number = number/10
    }

    if (input == result)
        println("$input is an amstrong number")
    else
        println("$input is not an amstrong number")
}

/***********************************************************************************
Kotlin Play Ground
 ***********************************************************************************/


/***********************************************************************************
Notes
 ***********************************************************************************


 ***********************************************************************************/
