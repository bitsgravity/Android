package com.bits.interview.topics.coding.strings

import com.bits.interview.utils.printGap
import com.bits.interview.utils.printInput
import com.bits.interview.utils.printOutput
import com.bits.interview.utils.printTitle
import java.lang.StringBuilder

fun specialFormats(){
    val input = "aaaHHHyyyH"
    val output = "a3H3y3H1"

    printTitle("SPECIAL FORMATS")
    specialFormats1("aaaHHHyyyH")
    printGap()
}

fun specialFormats1(input: String){
    printInput(input)

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

    printOutput(output.toString())
}