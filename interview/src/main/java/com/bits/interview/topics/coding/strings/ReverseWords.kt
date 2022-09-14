package com.bits.interview.topics.coding.strings

import com.bits.interview.utils.printGap
import com.bits.interview.utils.printInput
import com.bits.interview.utils.printOutput
import com.bits.interview.utils.printTitle

fun reverseWords(){
    printTitle("REVERSE WORDS")
    reverseWords("This is a sample string to reverse")
    printGap()
}

fun reverseWords(input : String){
    printInput(input)

    val words = input.split(" ")
    val reversedSentence = StringBuilder()

    words.reversed().forEach{
        reversedSentence.append(it).append(" ")
    }

    printOutput(reversedSentence.toString())
}