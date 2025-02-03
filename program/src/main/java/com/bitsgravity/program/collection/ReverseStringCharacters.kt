package com.bitsgravity.program.collection

/***********************************************************************************
                                Kotlin Playground
 ***********************************************************************************/

fun main(){
    val input = "StrinG"
    println("Reversed string is ${reverseString1(input)}")
}

fun reverseString1(input : String) : String { //Using String builder [Traditional]
    val output = StringBuilder()
    for(i in input.length-1 downTo 0){
        output.append(input[i])
    }
    return output.toString()
}

fun reverseString2(input : String) : String { //Using += operator [Traditional]
    var output = ""
    for(i in input.length-1 downTo 0){
        output += input[i]
    }
    return output
}

fun reverseString3(input : String) : String { //Using Char array [Traditional]
    val output = CharArray(input.length)
    var index = 0
    for(i in input.length-1 downTo 0){
        output[index] = input[i]
        index++
    }
    return String(output)
}

fun reverseString4(input : String) : String { //Using reversed() [Kotlin Specific]
    return input.reversed()
}


/***********************************************************************************
                                Performance
 ***********************************************************************************

1. reverseStringTraditionalWithPlusEqualConcat
Time Complexity: O(n), where n is the length of the string.
Space Complexity: O(n), as we store the reversed string.

2. reverseStringTraditionalWithCharArray
Time Complexity: O(n), where n is the length of the string.
Space Complexity: O(n), as we store the reversed string.

3. reverseStringTraditionalWithStringBuilder
Time Complexity: O(n), where n is the length of the string.
Space Complexity: O(n), as StringBuilder still uses the same amount of space to store the final string.

4. reverseStringKotlinSpecificWithReversed
Time Complexity: O(n)
Space Complexity: O(n)

 ***********************************************************************************/
