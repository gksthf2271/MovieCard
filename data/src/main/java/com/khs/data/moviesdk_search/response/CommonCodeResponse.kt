package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class CommonCodeResponse(
    @SerializedName("codes")
    val codes: List<CommonCode>
)

data class CommonCode(
    @SerializedName("fullCd")
    val fullCd: String,
    @SerializedName("korNm")
    val korNm: String,
    @SerializedName("engNm")
    val engNm: String
)