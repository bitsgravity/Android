package com.bits.topics.store.coding.strings

import com.bits.topics.utils.gap
import com.bits.topics.utils.input
import com.bits.topics.utils.output
import com.bits.topics.utils.title

fun reverseWords(){
    title("REVERSE WORDS")
    reverseWords("This is a sample string to reverse")
    gap()
}

fun reverseWords(input : String){
    input(input)

    val words = input.split(" ")
    val reversedSentence = StringBuilder()

    words.reversed().forEach{
        reversedSentence.append(it).append(" ")
    }

    output(reversedSentence.toString())
}