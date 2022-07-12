package com.bits.android.ui.home

import androidx.lifecycle.ViewModel
import com.bits.android.root.network.NetworkCallListener

class HomeViewModel(private val repository: HomeRepository) : ViewModel() {
    
    var networkCallListener : NetworkCallListener? =null
}