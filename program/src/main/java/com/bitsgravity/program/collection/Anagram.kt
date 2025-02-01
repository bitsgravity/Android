package com.bitsgravity.program.collection

fun main() {

    val str1 = "silent" //Apple
    val str2 = "listen" //Plead

    println("The given strings are Anagram : ${checkAnagram(str1,str2)}")
}

fun checkAnagram(str1 : String,str2 : String):Boolean {
    var map = HashMap<Char,Int>()

    str1.forEach{ char ->
        map[char] = 1
    }

    str2.forEach{ char ->
        if(map.containsKey(char)){
            map[char] = map[char]!!-1
        } else {
            return false
        }
    }

    str1.forEach{ char ->
        if(map[char]!=0)
            return false
    }

    return true

}