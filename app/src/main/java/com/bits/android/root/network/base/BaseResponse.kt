package com.bits.android.root.network.base

import com.google.gson.annotations.SerializedName

open class BaseResponse(
    @SerializedName("status") var status: Int? = null,
    @SerializedName("message") var message: String? = null,
    @SerializedName("errors") var errors: Boolean? = null
)