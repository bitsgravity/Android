package com.bits.android.root.network.base

import com.google.gson.annotations.SerializedName

open class BaseRequest(
    @SerializedName("token") var token: String? = null,
    @SerializedName("path") var path: String? = null
)