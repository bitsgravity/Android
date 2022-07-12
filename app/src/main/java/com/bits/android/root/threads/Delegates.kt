package com.bits.android.root.threads

import kotlinx.coroutines.*

@DelicateCoroutinesApi
private fun<T> lazyDeferred(block: suspend CoroutineScope.() -> T): Lazy<Deferred<T>>{
    return lazy {
        GlobalScope.async(start = CoroutineStart.LAZY) {
            block.invoke(this)
        }
    }
}