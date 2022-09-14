package com.bits.interview.utils

fun printTitle(title : String){
    val titleWrapLine = StringBuilder()

    for (i in 1 until title.length+3)
        titleWrapLine.append("-")

    println("\n$titleWrapLine")
    println(" $title")
    println("$titleWrapLine")
}

fun printInput(input : String){
    print("Input  : $input")
}

fun printOutput(output : String){
    print("\nOutput : $output")
}

fun printGap(){
    print("\n")
}

object Divider {
    const val DIVIDER_TOP = "\n/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n"
    const val DIVIDER_BOTTOM = "\n/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n"
}