package com.bits.android.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bits.android.data.local.database.entities.Person
import com.bits.android.data.network.models.collection.persons.PersonsRequest
import com.bits.android.data.network.utils.NetworkCallListener
import com.bits.android.ui.home.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository) : ViewModel() {

    //------------------------------------------- NETWORK ------------------------------------------//
    var networkCallListener : NetworkCallListener? =null

    //------------------------------------------- SUGGESTIONS -------------------------------------------//
    var personsRequest = PersonsRequest()
    val persons: LiveData<List<Person>> get() = _persons
    private var _persons = MutableLiveData<List<Person>>()
    fun requestPersons(personsRequest: PersonsRequest) {
        repository.requestPersons(personsRequest,networkCallListener) {
            _persons.value = it
        }
    }

    fun updatePerson(person: Person){
        repository.updatePerson(person)
    }

    fun setIsFetchNeeded(isNeeded : Boolean) {
        repository.setIsFetchNeeded(isNeeded)
    }
}