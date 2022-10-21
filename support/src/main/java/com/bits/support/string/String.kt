package com.bits.support.string

fun String.removeStartingSlash() : String {
    return removePrefix("/")
}

fun CharSequence.countWords() : Int {
    val sentence = this.toString().trim()
//    sentence.split("\\s+").first().length

    //Split String by Space
    val strArray = sentence.split(" ".toRegex()).toTypedArray() // Spilt String by Space
    var count = 0

    //iterate String array
    for (s in strArray) {
        if (s != "") {
            count++
        }
    }

    return count
}

fun String?.checkAvailability() : String {
    return if (this.isNullOrEmpty()) {
        "Not Available"
    } else {
        this
    }
}

fun String?.checkAvailability(notAvailbaleWord : String) : String {
    this?.let {
        return it
    }
    return notAvailbaleWord
}

fun String.removeSquareBrackets() : String {
    return this.replace("\\[".toRegex(), "").replace("\\]".toRegex(), "")
}