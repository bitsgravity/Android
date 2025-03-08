package com.bits.learn.program.content

/***********************************************************************************
                            Common characters in Strings
 ***********************************************************************************/

fun main() {
    val inputs = arrayListOf("ram","mohan","shyam")
    findCommonCharacter(inputs)
}

fun findCommonCharacter(inputs : ArrayList<String>) {
    val expectedCharacters = mutableSetOf<Char>()
    inputs[0].forEach{
        expectedCharacters.add(it)
    }

    for(i in 1..inputs.size-1){
        val iterator = expectedCharacters.iterator()
        while(iterator.hasNext()){
            val char = iterator.next()
            if(inputs[i].contains(char)){
                println("$char")
            } else {
                println("$char Removed")
                iterator.remove()
            }
        }
    }

    println("\nThe expected characters via set are,")
    expectedCharacters.forEach{
        println(it)
    }
}

/***********************************************************************************
                                    Notes
 ***********************************************************************************

We are having an array of strings? how to find charcters in common for all strings? which will be the best preffered method in less time complexity
Array of strings [ram,mohan,shyam]
a,m
Need to find common corrector


 ***********************************************************************************/