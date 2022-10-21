package com.bits.support.navigation

import android.app.Activity
import android.content.Context
import android.os.Handler
import com.bits.support.navigation.Navigation.PRESS_BACK_AGAIN_TO_EXIT
import com.bits.support.navigation.Navigation.TOAST_DELAY_TIME
import com.bits.support.views.toast

object Navigation {
    const val PRESS_BACK_AGAIN_TO_EXIT = "Press back again to exit !"
    const val TOAST_DELAY_TIME = 1500L
}

private var exit = false
fun Context.exitFromTheApp() {
    if (exit) {
        val activity : Activity = this as Activity
        activity.finish()
    } else {
        this.toast(PRESS_BACK_AGAIN_TO_EXIT)
        exit = true
        Handler().postDelayed(Runnable { exit = false}, TOAST_DELAY_TIME)
    }
}