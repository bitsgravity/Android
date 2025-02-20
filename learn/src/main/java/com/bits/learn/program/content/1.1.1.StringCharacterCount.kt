package com.bits.learn.program.content

/***********************************************************************************
                            Count characters in a String
 ***********************************************************************************/

fun main(){
    characterAndCount("Suneel Kumar e")
}

fun characterAndCount(input: String) {
    val map : HashMap<Char,Int> = HashMap()

    //val map2 = HashMap<Char,Int>() //Different way of declaring hashmap

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

 /***********************************************************************************
                                        Notes
 ***********************************************************************************


 ***********************************************************************************/
