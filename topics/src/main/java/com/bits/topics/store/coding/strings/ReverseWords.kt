package com.bits.topics.store.coding.strings

import com.bits.topics.utils.printGap
import com.bits.topics.utils.printInput
import com.bits.topics.utils.printOutput
import com.bits.topics.utils.printTitle

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