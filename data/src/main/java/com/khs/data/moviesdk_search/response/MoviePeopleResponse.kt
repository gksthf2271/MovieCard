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
    val peopleList: List<FilmCouncilMoviePeople>,
    @SerializedName("source")
    val source: String
)

data class FilmCouncilMoviePeople(
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