package com.bits.learn.topic.content.kotlin.functions

fun main(){
    println("Calling inline function")
    inlineFunction { }
}

inline fun inlineFunction(callback : () -> Unit) {
    callback()
    println("Code inside inline function")
}