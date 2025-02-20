package com.bits.learn.program.content

/***********************************************************************************
           Sequential character and it's count print (Compress String)
 ***********************************************************************************/

fun main(){
    println("${compressString1("aaHHHyyee")}")
}

fun compressString1(input: String) : String {
    val output = StringBuilder()
    var charCount = 1

    for(i in input.indices){
        if (i+1 != input.length){
            if (input[i] == input[i+1]){
                charCount++
            } else {
                output.append(input[i]).append(charCount)
                charCount = 1
            }
        } else {
            output.append(input[i]).append(charCount)
        }
    }

    return output.toString()
}

fun compressString2(input: String): String {
    if (input.isEmpty()) return ""

    val output = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            output.append(input[i - 1]).append(count)
            count = 1
        }
    }
    output.append(input.last()).append(count)

    return output.toString()
}

/***********************************************************************************
Notes
 ***********************************************************************************

INPUT  : aaHHHyye
OUTPUT : a2H3y2e1

 ***********************************************************************************/
