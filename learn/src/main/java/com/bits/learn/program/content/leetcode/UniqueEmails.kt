package com.bits.learn.program.content.leetcode

fun main() {
    val emails = arrayOf("test.email+alex@leetcode.com",
        "test.e.mail+bob.cathy@leetcode.com",
        "testemail+david@lee.tcode.com")

    val solution = UniqueEmailsSolution()
    println(solution.numUniqueEmails(emails))

}

class UniqueEmailsSolution {
    fun numUniqueEmails(emails: Array<String>): Int {
        val actualEmails = mutableSetOf<String>()
        for(email in emails){
            val localName = StringBuilder()
            val domainName = StringBuilder()
            var isPlusFound = false
            var isAtFound = false
            email.forEach {
                when(it){
                    '@'-> {
                        isAtFound = true
                    }

                    else -> {
                        if(isAtFound){
                            domainName.append(it)
                        } else {
                            if (!isPlusFound){
                                when(it){
                                    '.' -> {
                                        //Remove this dot
                                    }

                                    '+' -> {
                                        //Remove this plus
                                        //Remove all the next characters untill character @
                                        isPlusFound = true
                                    }

                                    else -> {
                                        localName.append(it)
                                    }
                                }
                            }
                        }
                    }
                }
            }
            val actualEmail = "$localName@$domainName"
            actualEmails.add(actualEmail)
        }

        return actualEmails.size
    }
}