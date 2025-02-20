package com.bits.learn.program.content

fun main(){
    characterAndCount("Suneel Kumar e")
}

fun characterAndCount(input: String) {
    val map : HashMap<Char,Int> = HashMap()
    input.forEach {
        if (!map.containsKey(it)) {
            map[it] = 1
        } else {
            map[it] = map[it]!!.plus(1)
        }
    }
    map.forEach {
        println("\n${it.key} - ${it.value}")
    }
}