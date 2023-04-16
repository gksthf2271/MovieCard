package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class MovieCompanyResponse (
    @SerializedName("companyListResult")
    val companyListResult: MovieCompanyResult
)

data class MovieCompanyResult (
    @SerializedName("totCnt")
    val totCnt: Int,
    @SerializedName("companyList")
    val companyList: List<FilmCouncilCompany>,
)