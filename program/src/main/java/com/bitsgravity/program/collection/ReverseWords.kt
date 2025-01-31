package com.bitsgravity.program.collection

import com.bitsgravity.program.collection.utils.gap
import com.bitsgravity.program.collection.utils.input
import com.bitsgravity.program.collection.utils.output
import com.bitsgravity.program.collection.utils.title

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

fun main(){
    println("Calling inline function")
    inlineFunction { }
}

inline fun inlineFunction(callback : () -> Unit) {
    callback()
    println("Code inside inline function")
}