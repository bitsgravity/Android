package com.bits.android.root.network

import com.bits.android.root.network.Network.BASE_URL
import com.bits.android.root.network.base.BaseResponse
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.util.concurrent.TimeUnit

interface Api {

    //-------------------------------------- PRICE ------------------------------------//
    @GET("/example/path")
    suspend fun base(
        @Query("token") token: String,
        @Query("data") data: String
    ) : Response<BaseResponse>

    companion object{
        operator fun invoke(
            networkInterceptor: NetworkInterceptor
        ) : Api {

            val okkHttpclient = OkHttpClient.Builder()
                    .readTimeout(10000, TimeUnit.SECONDS)
                    .connectTimeout(10000, TimeUnit.SECONDS)
                    .writeTimeout(10000, TimeUnit.SECONDS)
                    .addInterceptor(networkInterceptor)
                    .build()

            return Retrofit.Builder()
                .client(okkHttpclient)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api::class.java)
        }
    }
}