package com.bitsgravity.theory

//input = 2,7,8,5,6,9,12

//output = 2,7,8,9,12

/**
* You can edit, run, and share this code.
* play.kotlinlang.org
  */

//Sort list and group numbers
fun main() {
val inputNumbers = mutableListOf(4, 6, 9, 2, 3, 4, 9, 6, 10, 4)
sort(inputNumbers)
}

fun sort(inputNumbers : MutableList<Int>){

//    for(i in 0..inputNumbers.size-1){
//        for(j in 0..inputNumbers.size-1){
//            if(inputNumbers[i]>inputNumbers[j]){
//                val temp = inputNumbers[j]
//                inputNumbers[j] = inputNumbers[i]
//                inputNumbers[i] = temp
//            }
//        }
//    }
//
//    inputNumbers.reversed().forEach{
//        println(it)
//    }

    val map = HashMap<Int,Int>()

    inputNumbers.forEach{
        if(!map.containsKey(it)){
            map[it] = 1
        } else {
            map[it] = map[it]?.plus(1)!!
        }
    }

    map.forEach{
        for(i in 1..it.value){
            println(it.key)
        }
    }
}



//fun main() {
//    var input = mutableListOf(2,7,8,5,6,9,12)
//    filter(input)
//}


fun filter(input : MutableList<Int>){

    var maxLevel = input[0]

    var deleteValues : MutableList<Int> = mutableListOf()

    for(i in 1..input.size-1){
        if(input[i]>maxLevel){
            maxLevel = input[i]
        } else if (input[i]<maxLevel){
//             input.remove(input[i])
deleteValues.add(input[i])
}
}

    deleteValues.forEach{
        input.remove(it)
    }

    input.forEach{
        println(it)
    }
}

//@Singleton
//Class AppDatabase {}
//
//achieve static class in kotlin
//
//static class AppDatabase {
//    public static AppDatabase(){
//    }
//}

//usage of companion object what actually it is
//
//final class AppDatabase {
//    companion object {
//    }
//
//    constructor(){
//    }
//
//}

//how we can write access modifiers in kolin
//
//what is the use of parcelable
//class Person() : Parcelable {
//
//    private var name : String
//    var country : String
//    var age : Int
//
//    companion object {
//        country = "India"
//    }
//
//}

//fun main(){
//    println(Person().country)
//
//}

//wrong in this
//class Student (var name: String) {
//    init() {
//        println("Student has got a name as $name")
//    }
//    constructor(var sectionName: String, var id: Int) : this(sectionName) {
//    }
//}


//swap withoutr third variable
//X = X + Y = 25 +23 = 48
//Y = X - Y = 48 - 23 = 25
//X = X -Y = 48 - 25 = 23

//https://www.javatpoint.com/program-to-swap-two-numbers-without-using-the-third-variable

//select second maximum from a column
//
//aabvcfhjnaavbavhhanjiaa
//
//from the above string find aa occurances

var a = 30
var b =67


//*
//**
//***
//****
//*****

fun star(){

    var step = 1
    for(i in 1..5){
        for( j in 1..step){
            print("*")
        }
        print("\n")
        step++
    }
}
