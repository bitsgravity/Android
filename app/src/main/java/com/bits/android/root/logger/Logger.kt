package com.bits.android.root.logger

import android.util.Log
import com.bits.android.root.logger.LOG.TAG

object LOG {
    const val TAG = "ncm"
}

fun log(message : String){
    Log.d(TAG,"RESPONSE | SUCCESS | $message")
}