package com.bits.android.ui.auth

import com.bits.android.data.local.database.AppDatabase
import com.bits.android.data.local.preference.AppPreference
import com.bits.android.data.network.utils.NetworkCall
import com.bits.android.data.network.api.Api
import javax.inject.Inject

//private val MINIMUM_INTERVAL = 6

class AuthRepository @Inject constructor(private val api: Api, private val appPreference: AppPreference, private val appDatabase: AppDatabase) : NetworkCall() {

}