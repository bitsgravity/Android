package com.bits.learn.program.content.interview

data class Transaction(
    val transactionId: String,
    val userId: Int,
    val amount: Double,
    val timestamp: Long,
    val category: String
)

fun aggregateTransactions(transactions: List<Transaction>): Map<Int, Map<String, Double>> {
    // Group the transactions by userId and then by category. Calculate the total amount for each user-category combination
//    val map = HashMap<Int, HashMap<String, Double>>()
//    transactions.forEach{
//    }

    return transactions
        .groupBy { it.userId }  // Group by userId
        .mapValues { (_, userTransactions) ->
            userTransactions.groupBy { it.category }  // Group by category
                .mapValues { (_, categoryTransactions) ->
                    categoryTransactions.sumOf { it.amount } // Sum amounts for each category
                }
        }
}

fun topNCategories(
    userTransactions: Map<String, Double>,
    n: Int
): List<Pair<String, Double>> {
    // Top N Categories: For each user, find the top N categories with the highest total transaction amounts (N is a given input).
    return listOf(Pair<String,Double>("S",2.0))
}

fun filterTransactionsByTime(
    transactions: List<Transaction>,
    startTime: Long,
    endTime: Long
): List<Transaction> {
    // Time-Based Filtering: Filter the transactions within a given time range (start and end timestamps).
    return transactions
}

fun averageTransactionAmount(
    transactions: List<Transaction>,
    userId: Int,
    category: String,
    startTime: Long,
    endTime: Long
): Double? {
    // Data Analysis: Calculate the average transaction amount for a specific user and category within a given time range
    return 0.0
}

fun main() {
    val transactions = listOf(
        Transaction("tx1", 1, 100.0, 1678886400000, "Salary"), // March 15, 2023
        Transaction("tx2", 1, -50.0, 1678972800000, "Groceries"), // March 16, 2023
        Transaction("tx3", 2, 200.0, 1679059200000, "Salary"), // March 17, 2023
        Transaction("tx4", 1, -25.0, 1679145600000, "Groceries"), // March 18, 2023
        Transaction("tx5", 2, -100.0, 1679232000000, "Rent"), // March 19, 2023
        Transaction("tx6", 1, -75.0, 1679318400000, "Rent"), // March 20, 2023
        Transaction("tx7", 1, 300.0, 1679404800000, "Salary") // March 21, 2023
    )

    // Transaction Aggregation
    val aggregated = aggregateTransactions(transactions)
    println("Aggregated Transactions: $aggregated")

    // Top N Categories
    val top2CategoriesUser1 = topNCategories(aggregated[1] ?: emptyMap(), 2)
    println("Top 2 categories for user 1: $top2CategoriesUser1")

    // Time-Based Filtering
    val startTime = 1678972800000 // March 16, 2023
    val endTime = 1679318400000 // March 20, 2023
    val filtered = filterTransactionsByTime(transactions, startTime, endTime)
    println("Filtered Transactions: $filtered")

    // Data Analysis
    val average = averageTransactionAmount(transactions, 1, "Groceries", startTime, endTime)
    println("Average Groceries amount for user 1: $average")
}