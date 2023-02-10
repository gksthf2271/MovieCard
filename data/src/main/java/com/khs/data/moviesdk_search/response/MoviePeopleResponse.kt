package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class MoviePeopleResponse(
    @SerializedName("peopleListResult")
    val peopleListResult: PeopleListResult,
)

data class PeopleListResult(
    @SerializedName("totCnt")
    val totCnt: Int,
    @SerializedName("peopleList")
    val peopleList: List<MoviePeople>,
    @SerializedName("source")
    val source: String
)

data class MoviePeople(
    @SerializedName("peopleCd")
    val peopleCd: String,
    @SerializedName("peopleNm")
    val peopleNm: String,
    @SerializedName("peopleNmEn")
    val peopleNmEn: String,
    @SerializedName("repRoleNm")
    val repRoleNm: String,
    @SerializedName("filmoNames")
    val filmoNames: String
)