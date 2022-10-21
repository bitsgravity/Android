package com.bits.support.threads

import android.os.Handler
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.delay(delay : Long, callback : () -> Unit) {
    Handler().postDelayed({
        callback()
    }, delay)
}

fun FragmentActivity.delay(callback : () -> Unit) {
    delay(1500){
        callback()
    }
}