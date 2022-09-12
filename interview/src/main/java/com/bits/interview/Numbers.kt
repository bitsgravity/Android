package com.bits.interview

fun main(args : Array<String>){

    print("\n---------------------------------------")


    fibonacciSeries(5)

    primeNumber(7)

    reverseNumber1(1725)
    print("\n\nThe reverse of 1725 is $reversedNumber1")

    reverseNumber2(5275)

    palindromeNumber(525)

    print("\n\n----------------------------------------\n")

}

private fun fibonacciSeries(limit: Int) {
    var divider = ","

    var a = 0
    var b = 1
    var c = 1

    print("\n\nThe fibonacci series upto $limit is,\n")
    for (i in 1..limit) {

        if (i==limit) divider = ""
        print("$a$divider ")

        a = b
        b = c
        c = a + b
    }
}

private fun primeNumber(number: Int) : Boolean {
    val squareRoot = Math.sqrt(number.toDouble())

    for (i in 2 until squareRoot.toInt()+1){
        if (number%i == 0){
            print("\n\n$number is not a prime number")
            return false
        }
    }

    print("\n\n$number is a prime number")
    return true
}

fun palindromeNumber(number: Int){
    if (number == reverseNumber2(number)) {
        println("\n\n$number is a Palindrome Number")
    } else {
        println("\n\n$number is not Palindrome Number")
    }
}

var reversedNumber1 = 0
private fun reverseNumber1(number : Int){
    if (number <= 0) return
    val remainder = number % 10
    reversedNumber1 = reversedNumber1 * 10 + remainder
    reverseNumber1(number / 10)
}

fun reverseNumber2(inputNumber: Int): Int {
    var number = inputNumber
    var reversedNumber = 0
    var remainder: Int

    while (number > 0) {
        remainder = number % 10
        reversedNumber = reversedNumber * 10 + remainder
        number = number / 10
    }

    print("\n\nThe reverse of $inputNumber is $reversedNumber")

    return reversedNumber
}