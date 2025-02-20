package com.bits.learn.program.trash

fun amstrongNumber(){
    com.bits.learn.program.trash.title("AMSTRONG NUMBER")
    amstrongNumber(371)
    com.bits.learn.program.trash.gap()
}

fun amstrongNumber(input : Int){
    com.bits.learn.program.trash.input(input.toString())

    var number = input
    var reminder = 0
    var result = 0

    while (number > 0){
        reminder = number % 10
        result = result + reminder * reminder * reminder
        number = number/10
    }

    if (input == result) com.bits.learn.program.trash.output("$input is an amstrong number")
    else com.bits.learn.program.trash.output("$input is not an amstrong number")
}

fun main(){
    com.bits.learn.program.trash.topDivider()
    characterAndCount()
    com.bits.learn.program.trash.bottomDivider()
}

fun characterAndCount() {
    com.bits.learn.program.trash.title("CHARACTER AND COUNT")
    characterAndCount("Suneel Kumar e")
    com.bits.learn.program.trash.gap()
}

fun characterAndCount(input: String) {
    com.bits.learn.program.trash.input(input)

    val map : HashMap<Char,Int> = HashMap()

    input.forEach {
        if (!map.containsKey(it)) {
            map[it] = 1
        } else {
            map[it] = map[it]!!.plus(1)
        }
    }

    com.bits.learn.program.trash.output()

    map.forEach {
        print("\n${it.key} - ${it.value}")
    }
}



fun fibonacciSeries(){
    com.bits.learn.program.trash.title("FIBONACCI SERIES")
    fibonacciSeries(5)
    com.bits.learn.program.trash.gap()
}

fun fibonacciSeries(limit: Int) {
    com.bits.learn.program.trash.input(limit.toString())

    var a = 0
    var b = 1
    var c = 1

    com.bits.learn.program.trash.output("The fibonacci series upto $limit is ")

    var divider = ","
    for (i in 1..limit) {
        if (i==limit) divider = ""
        print("$a$divider ")
        a = b
        b = c
        c = a + b
    }
}