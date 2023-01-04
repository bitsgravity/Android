package com.bits.topics.coding.utils

fun title(title : String){
    val titleWrapLine = StringBuilder()

    for (i in 1 until title.length+3)
        titleWrapLine.append("-")

    println("\n$titleWrapLine")
    println(" $title")
    println("$titleWrapLine")
}

fun input(){
    print("Input :")
}

fun input(input : String){
    print("Input  : $input")
}

fun output(output : String){
    print("\nOutput : $output")
}

fun output(){
    print("\nOutput :")
}

fun gap(){
    print("\n")
}

fun topDivider(){
    print(Divider.DIVIDER_TOP)
}

fun bottomDivider(){
    print(Divider.DIVIDER_BOTTOM)
}

object Divider {
    const val DIVIDER_TOP = "\n/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n"
    const val DIVIDER_BOTTOM = "\n/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n"
}