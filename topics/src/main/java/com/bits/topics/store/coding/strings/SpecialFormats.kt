package com.bits.topics.store.coding.strings

import com.bits.topics.utils.gap
import com.bits.topics.utils.input
import com.bits.topics.utils.output
import com.bits.topics.utils.title
import java.lang.StringBuilder

fun specialFormats(){
    title("SPECIAL FORMATS")
    specialFormats1("aaaHHHyyyH")
    gap()
}

fun specialFormats1(input: String){
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