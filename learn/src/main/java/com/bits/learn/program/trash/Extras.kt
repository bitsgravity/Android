package com.bits.learn.program.trash

import com.bits.learn.program.util.bottomDivider
import com.bits.learn.program.util.gap
import com.bits.learn.program.util.input
import com.bits.learn.program.util.output
import com.bits.learn.program.util.title
import com.bits.learn.program.util.topDivider

fun amstrongNumber(){
    title("AMSTRONG NUMBER")
    amstrongNumber(371)
    gap()
}

fun amstrongNumber(input : Int){
    input(input.toString())

    var number = input
    var reminder = 0
    var result = 0

    while (number > 0){
        reminder = number % 10
        result = result + reminder * reminder * reminder
        number = number/10
    }

    if (input == result) output("$input is an amstrong number")
    else output("$input is not an amstrong number")
}

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



fun fibonacciSeries(){
    title("FIBONACCI SERIES")
    fibonacciSeries(5)
    gap()
}

fun fibonacciSeries(limit: Int) {
    input(limit.toString())

    var a = 0
    var b = 1
    var c = 1

    output("The fibonacci series upto $limit is ")

    var divider = ","
    for (i in 1..limit) {
        if (i==limit) divider = ""
        print("$a$divider ")
        a = b
        b = c
        c = a + b
    }
}