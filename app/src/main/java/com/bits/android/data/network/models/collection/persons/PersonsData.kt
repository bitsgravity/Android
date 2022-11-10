package com.bits.android.data.network.models.collection.persons

import com.bits.android.data.local.database.entities.Person
import com.bits.android.data.network.models.base.BaseData

class PersonsData(var matchesResponse: PersonsResponse) : BaseData(matchesResponse){

    fun getMatches() : List<Person>? {
        return matchesResponse.results
    }
}