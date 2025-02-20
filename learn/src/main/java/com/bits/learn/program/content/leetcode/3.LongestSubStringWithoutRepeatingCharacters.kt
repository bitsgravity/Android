package com.bits.learn.program.content.leetcode

fun main(){
    val input = "dvdf"

    val output = lengthOfLongestSubString(input)

    println(output)
}

fun lengthOfLongestSubString(s: String): Int {
    var input = s
    var output = 0
    val subString = StringBuilder()
    val map = HashMap<String,Int>()

    var i=0
    do {
        input.forEachIndexed { index, char ->
            if (!subString.contains(char)){
                subString.append(char)
                if (index == input.length-1){
                    map[subString.toString()] = subString.length
                }
            } else {
                map[subString.toString()] = subString.length
                subString.clear()
                subString.append(char)
            }

        }
        if (input.isNotEmpty()){
            i += 1
            input = input.substring(i,input.length)
        }

    } while (input.isNotEmpty())

    if (map.isNotEmpty()){
        output = map.maxOf { it.value }
    }
    return output
}