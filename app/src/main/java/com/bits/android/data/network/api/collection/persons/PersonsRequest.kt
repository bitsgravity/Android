package com.bits.android.data.network.api.collection.persons

import com.bits.android.data.network.CallCode
import com.bits.android.data.network.api.base.BaseRequest

data class PersonsRequest(
    var callCode: CallCode = CallCode.SUGGESTIONS
) : BaseRequest()