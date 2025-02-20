package com.bits.learn.program.content


 /***********************************************************************************
                                Reverse words in a String
 ***********************************************************************************/

fun main() {
    val input = "Paris is world's most beautiful city"
    reverseString(input)
}

fun reverseString(input: String) {
    val output = input.split(" ").reversed().joinToString(" ")
    println(output)
}


fun reverseWords(input: String) {
    val words = mutableListOf<String>()
    val word = StringBuilder()

    // Extract words manually
    for (ch in input) {
        if (ch == ' ') {
            if (word.isNotEmpty()) {
                words.add(word.toString())
                word.clear() // Reset for next word
            }
        } else {
            word.append(ch) // Append to StringBuilder
        }
    }

    // Add the last word
    if (word.isNotEmpty()) {
        words.add(word.toString())
    }

    // Reverse words manually
    for (i in words.size - 1 downTo 0) {
        print(words[i])
        if (i > 0) print(" ")
    }
}

/***********************************************

Notes:

Time Complexity
O(N) since:
.split(" ") takes O(N)
.reversed() takes O(N)
.joinToString(" ") takes O(N)
Thus, the overall complexity is O(N), making it an optimal solution.



Time Complexity
O(N) for extracting words.
O(N) for reversing and printing.
Total: O(N) ✅ (Efficient for large inputs)
This approach avoids Kotlin-specific built-ins and demonstrates manual string manipulation, which is often appreciated in interviews. 🚀

Let me know if you need further modifications!



Why Avoid += in a Loop?
word += ch creates a new string object each time, which is inefficient.
Using CharArray or StringBuilder improves performance by modifying the existing structure rather than creating new objects.

 ***************************************************/



//fun reverseWords(){
//    com.bitsgravity.program.latest.reverseWords("This is a sample string to reverse")
//}

fun reverseWords2(input : String){
    val words = input.split(" ")
    val reversedSentence = StringBuilder()
    words.reversed().forEach{
        reversedSentence.append(it).append(" ")
    }

    println(reversedSentence.toString())
}