package com.bitsgravity.program.collection

import com.bitsgravity.program.collection.utils.bottomDivider
import com.bitsgravity.program.collection.utils.gap
import com.bitsgravity.program.collection.utils.input
import com.bitsgravity.program.collection.utils.output
import com.bitsgravity.program.collection.utils.title
import com.bitsgravity.program.collection.utils.topDivider

fun main(){
    topDivider()
    characterAndCount()
    bottomDivider()
}

fun characterAndCount() {
    title("CHARACTER AND COUNT")
    characterAndCount("Suneel Kumar e")
    gap()
}

fun characterAndCount(input: String) {
    input(input)

    val map : HashMap<Char,Int> = HashMap()

    input.forEach {
        if (!map.containsKey(it)) {
            map[it] = 1
        } else {
            map[it] = map[it]!!.plus(1)
        }
    }

    output()

    map.forEach {
        print("\n${it.key} - ${it.value}")
    }
}