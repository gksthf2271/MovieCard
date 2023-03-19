package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName


data class DailyBoxOfficeResponse(
    @SerializedName("boxOfficeResult")
    val boxOfficeResult: BoxOfficeResult,
)

data class BoxOfficeResult(
    @SerializedName("boxofficeType")
    val boxofficeType: String,
    @SerializedName("showRange")
    val showRange: String,
    @SerializedName("dailyBoxOfficeList")
    val dailyBoxOfficeList: List<BoxOfficeResponse>
)