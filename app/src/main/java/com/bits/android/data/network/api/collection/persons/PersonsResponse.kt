package com.bits.android.data.network.api.collection.persons
import com.bits.android.data.local.database.entities.Person
import com.bits.android.data.network.api.base.BaseResponse
import com.google.gson.annotations.SerializedName

data class PersonsResponse(
    @SerializedName("results") var results: List<Person>? = null,
) : BaseResponse()