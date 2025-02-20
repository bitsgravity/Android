package com.bits.learn.program.content

fun main(){
    val list1 = listOf("a", "b", "c")
    val list2 = listOf("x", "y", "z")

    fuseList(list1,list2)
    fuseList2(list1,list2)
}

fun fuseList(list1: List<String>, list2: List<String>) {
    val result = list1.zip(list2)
    println(result.toString())
}

fun fuseList2(list1: List<String>, list2: List<String>) {
    val result = mutableListOf<List<String>>()
    for (i in list1.indices) {
        result.add(listOf(list1[i], list2[i]))
    }
    println(result)
}