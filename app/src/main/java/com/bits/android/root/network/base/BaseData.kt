package com.bits.android.root.network.base

open class BaseData(var baseResponse: BaseResponse){
    fun isOk(): Boolean {
        return baseResponse.status == 200
    }

    fun isSuccess() : Boolean {
        return baseResponse.errors==false
    }

    fun getMessage() : String{
        return baseResponse.message.toString()
    }
}