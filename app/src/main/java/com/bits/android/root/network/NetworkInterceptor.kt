package com.bits.android.root.network

import android.content.Context
import okhttp3.Interceptor
import okhttp3.Response

class NetworkInterceptor(
    context: Context
) : Interceptor {

    private val applicationContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable(applicationContext))
            throw NoInternetException("Make sure you have an active data connection !")

        var request = chain.request()
        request = request.newBuilder()
                .addHeader("Content-Type", "application/json")
                .build()

        return chain.proceed(request)
    }
}