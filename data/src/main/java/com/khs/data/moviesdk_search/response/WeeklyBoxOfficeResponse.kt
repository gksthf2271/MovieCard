package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class WeeklyBoxOfficeResponse (
        @SerializedName("boxOfficeResult")
        val boxOfficeResult: WeeklyBoxOfficeResult,
)

data class WeeklyBoxOfficeResult(
        @SerializedName("boxofficeType")
        val boxofficeType: String,
        @SerializedName("showRange")
        val showRange: String,
        @SerializedName("yearWeekTime")
        val yearWeekTime: String,
        @SerializedName("weeklyBoxOfficeList")
        val weeklyBoxOfficeList: List<BoxOfficeResponse>
)
