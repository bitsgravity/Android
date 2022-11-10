package com.bits.android.ui.auth

import androidx.lifecycle.ViewModel
import com.bits.android.data.network.utils.NetworkCallListener
import com.bits.android.ui.auth.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel() {

    //------------------------------------------- NETWORK ------------------------------------------//
    var networkCallListener : NetworkCallListener? =null

}