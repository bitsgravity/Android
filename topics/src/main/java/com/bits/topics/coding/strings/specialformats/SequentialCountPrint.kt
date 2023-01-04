package com.bits.topics.coding.strings.specialformats

import com.bits.topics.coding.utils.gap
import com.bits.topics.coding.utils.input
import com.bits.topics.coding.utils.output
import com.bits.topics.coding.utils.title
import java.lang.StringBuilder

/* ------------------------------------------------- /
    Sequential Count Print

    INPUT  : aaHHHyye
    OUTPUT : a2H3y2e1
/ --------------------------------------------------- */

fun sequentialCountPrint(){
    title("SPECIAL FORMATS : SEQUENTIAL COUNT PRINT")
    sequentialCountPrint("aaHHHyye")
    gap()
}

fun sequentialCountPrint(input: String){
    input(input)

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

    output(output.toString())
}