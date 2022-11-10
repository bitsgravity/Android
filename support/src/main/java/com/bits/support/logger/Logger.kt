package com.bits.support.logger

import android.util.Log
import com.bits.support.logger.LOG.TAG

object LOG {
    const val TAG = "ncm"
}

fun log(message : String){
    Log.d(TAG,message)
}

fun logError(message: String){
    Log.e(TAG,message)
}