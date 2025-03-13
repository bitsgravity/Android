package com.bits.learn.program.content.leetcode

import java.lang.StringBuilder

fun main(){
    val str1 = "ab"
    val str2 = "pqrs"

    val output = mergeStringsAlternatively(str1,str2)
    println(output)
}

fun mergeStringsAlternatively(str1: String, str2: String): String{
    val output = StringBuilder()

    val largeString = if(str1.length > str2.length) str1 else str2
    val minLength = if(str1.length > str2.length) str2.length else str1.length

    for(i in 0 until largeString.length){
        if(i < minLength){
            output.append(str1[i]).append(str2[i])
        } else {
            output.append(largeString[i])
        }
    }
    return output.toString()
}