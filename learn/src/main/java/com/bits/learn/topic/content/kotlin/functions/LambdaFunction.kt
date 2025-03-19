package com.bits.learn.topic.content.kotlin.functions

fun main() {
    val sum : (Int,Int) -> Int = {a,b -> a+b}
    println(sum(1,2))

    val numbers = listOf(0,1,2)

    numbers.forEach {
        println(it)
    }

    val name : String? = null

    name.myLet {
        println(it)
    }

}


fun Any?.myLet (callback : (Any) -> Unit){
    if(this!=null)
        callback(this)
}