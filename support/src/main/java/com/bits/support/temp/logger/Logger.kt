package com.bits.support.temp.logger

import android.util.Log
import com.bits.support.temp.logger.LOG.TAG

object LOG {
    const val TAG = "ncm"
}

fun log(message : String){
    Log.d(TAG,message)
}