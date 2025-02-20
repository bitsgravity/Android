package com.bits.learn.topic.content.kotlin.functions

fun main(){

    val john = Person(
        name = "John",
        weight = 78.0,
        height = 1.75
    )

    //LET Example [Null safety Check]
    john.name?.let { //Will enter block
        println("Name is $it")
    }
    john.isIndian?.let { //Wont enter this block [Since isIndian is not initialized and its null]
        println("Is Indian : $it")
    }

    //RUN Example [Calculations] - Return the result of last statement in block
    val johnBodyMassIndex = john.run {
        println("Calculating BMI...")
        weight!! / (height!! * height!!)
    }
    println("Body mass index of john is $johnBodyMassIndex")

    //WITH Example [Improves Readability]
    with(john){
        println("Name is $name")
        println("Is Indian : $isIndian")
    }

    //ALSO Example [Assigning more details after initialization]
    john.apply {
        isIndian = true
    }
    println("Is Indian : ${john.isIndian}")

    //APPLY Example [Logging]
    john.also {
        println("Updating John details...")
        println("Name : ${it.name}")
        println("isIndian : ${it.isIndian}")
    }
}

data class Person(
    var name: String? = null,
    var isIndian: Boolean? = null,
    var weight: Double? = null, //In kilograms
    var height: Double? = null //In meters
)