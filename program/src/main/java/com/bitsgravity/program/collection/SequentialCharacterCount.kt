package com.bitsgravity.program.collection

/* ------------------------------------------------- /
    Sequential Count Print

    INPUT  : aaHHHyye
    OUTPUT : a2H3y2e1
/ --------------------------------------------------- */

fun main(){
    sequentialCharacterCount("aaHHHyye")
}

fun sequentialCharacterCount(input: String){
    val output = StringBuilder()
    val inputLength = input.length

    var charCount = 1

    input.forEachIndexed { index, char ->
        val nextIndex = index+1
        if (nextIndex != inputLength){
            if (char == input[nextIndex]){
                charCount++
            } else {
                output.append(char).append(charCount)
                charCount = 1
            }
        } else {
            output.append(char).append(charCount)
        }
    }

    println(output.toString())
}