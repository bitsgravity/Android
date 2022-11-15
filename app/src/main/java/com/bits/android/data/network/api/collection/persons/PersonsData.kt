package com.bits.android.data.network.api.collection.persons

import com.bits.android.data.local.database.entities.Person
import com.bits.android.data.network.api.base.BaseData

class PersonsData(var matchesResponse: PersonsResponse) : BaseData(matchesResponse){

    fun getMatches() : List<Person>? {
        return matchesResponse.results
    }
}