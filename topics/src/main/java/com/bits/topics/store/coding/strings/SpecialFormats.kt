package com.bits.topics.store.coding.strings

import com.bits.topics.utils.printGap
import com.bits.topics.utils.printInput
import com.bits.topics.utils.printOutput
import com.bits.topics.utils.printTitle
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