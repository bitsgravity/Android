package com.bits.support.youtube

import java.util.regex.Matcher
import java.util.regex.Pattern

fun String.extractYoutubeVideoId(): String? {
    var vId: String? = null
    val pattern: Pattern = Pattern.compile(
        "^https?://.*(?:youtu.be/|v/|u/\\w/|embed/|watch?v=)([^#&?]*).*$",
        Pattern.CASE_INSENSITIVE
    )
    val matcher: Matcher = pattern.matcher(this)
    if (matcher.matches()) {
        vId = matcher.group(1)
    }
    return vId
}