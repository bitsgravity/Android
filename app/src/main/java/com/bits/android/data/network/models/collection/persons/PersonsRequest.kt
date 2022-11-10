package com.bits.android.data.network.models.collection.persons

import com.bits.android.data.network.utils.CallCode
import com.bits.android.data.network.models.base.BaseRequest

data class PersonsRequest(
    var callCode: CallCode = CallCode.SUGGESTIONS
) : BaseRequest()