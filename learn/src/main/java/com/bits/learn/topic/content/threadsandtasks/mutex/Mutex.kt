package com.bits.learn.topic.content.threadsandtasks.mutex

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock


/*******************************
            Mutex Locking
 ********************************/

fun main() = runBlocking {
    val transactions = listOf(
        async { updateBalance("credit", 500) },
        async { updateBalance("debit", 300) }
    )

    transactions.awaitAll()
    println("Final Account Balance: ₹$accountBalance")
}

var accountBalance = 100
val mutex = Mutex()  // Mutex to ensure thread safety

suspend fun updateBalance(transaction: String, amount: Int) {
    mutex.withLock {
        when (transaction) {
            "credit" -> {
                accountBalance += amount
                println("₹$amount credited. Updated Balance: ₹$accountBalance")
            }

            "debit" -> {
                if (accountBalance >= amount) {
                    accountBalance -= amount
                    println("₹$amount debited. Updated Balance: ₹$accountBalance")
                } else {
                    println("Insufficient balance! Transaction failed.")
                }
            }

            else -> println("Invalid transaction type.")
        }
    }
}

/***********************************************
                    Notes
 ***********************************************

Using Mutex for Synchronization:
Mutex ensures that only one coroutine updates the balance at a time, preventing race conditions.

Using withLock:
This safely locks and updates the balance, ensuring data consistency.

Using async & awaitAll:
Multiple transactions can run concurrently, but due to Mutex, they execute sequentially.

Sample Output:
₹500 credited. Updated Balance: ₹600
₹300 debited. Updated Balance: ₹300
Final Account Balance: ₹300

Would you like to extend this further, like adding user input or more transaction types? 🚀

 ***************************************************/
