package com.bits.android.ui.home

import com.bits.android.root.logger.log
import com.bits.android.root.network.*
import com.bits.android.root.network.base.BaseRequest
import com.bits.android.root.network.base.BaseResponse
import com.bits.android.root.preference.PreferenceProvider
import com.bits.support.temp.location.Location
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class HomeRepository(private val api: Api, private val preferenceProvider: PreferenceProvider) : NetworkCall() {
    
    fun requestBase(baseRequest: BaseRequest, networkCallListener: NetworkCallListener?, callback : (BaseResponse?) -> Unit){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                networkCallListener?.onNetworkCallStarted(CallInfo(callCode = CallCode.ANY))

//                val baseResponse = apiRequest { api.base(baseRequest.token!!,baseRequest.data!!)}
//                callback(baseResponse)

                networkCallListener?.onNetworkCallSuccess(CallInfo(callCode = CallCode.ANY))
            } catch (e: ApiException) {
                networkCallListener?.onNetworkCallFailure(CallInfo(callCode = CallCode.ANY,exception = e))
            } catch (e: NoInternetException) {
                networkCallListener?.onNetworkCallFailure(CallInfo(callCode = CallCode.ANY,exception = e))
            } catch (e : Exception){
                log("Api | Exception | $e")
            }
        }
    }

    fun setLocation(location: Location){
        preferenceProvider.setLocation(location)
    }

    fun getLocation() : Location {
        return preferenceProvider.getLocation()
    }

    fun clearLocation() {
        preferenceProvider.clearLocation()
    }
}