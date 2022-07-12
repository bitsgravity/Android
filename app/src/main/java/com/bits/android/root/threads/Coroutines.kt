package com.bits.android.root.threads

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

object Coroutines {

    fun<T: Any> ioThenMain(work: suspend (() -> T?), callback: ((T?)->Unit)) =
        CoroutineScope(Dispatchers.Main).launch {
            val data = CoroutineScope(Dispatchers.IO).async  rt@{
                return@rt work()
            }.await()
            callback(data)
        }

    fun main(work: suspend (() -> Unit)) =
        CoroutineScope(Dispatchers.Main).launch {
            try {
                work()
            } catch (e:Exception){
                println(e.printStackTrace())
            }
        }

    fun io(work: suspend (() -> Unit)) =
        CoroutineScope(Dispatchers.IO).launch {
            work()
        }
}