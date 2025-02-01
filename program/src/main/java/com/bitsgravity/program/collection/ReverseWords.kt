package com.bitsgravity.program.collection

fun reverseWords(){
    reverseWords("This is a sample string to reverse")
}

fun reverseWords(input : String){
    val words = input.split(" ")
    val reversedSentence = StringBuilder()
    words.reversed().forEach{
        reversedSentence.append(it).append(" ")
    }

    println(reversedSentence.toString())
}