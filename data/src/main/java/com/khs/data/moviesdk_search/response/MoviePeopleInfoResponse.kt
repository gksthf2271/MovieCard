package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class MoviePeopleInfoResponse (
    @SerializedName("peopleInfoResult")
    val peopleInfoResult: PeopleInfoResult
)

data class PeopleInfoResult(
    @SerializedName("peopleInfo")
    val peopleInfo: PeopleInfo,
    @SerializedName("source")
    val source: String
)

data class PeopleInfo(
    @SerializedName("peopleCd")
    val peopleCd: String,
    @SerializedName("peopleNm")
    val peopleNm: String,
    @SerializedName("peopleNmEn")
    val peopleNmEn: String,
    @SerializedName("sex")
    val sex: String,
    @SerializedName("repRoleNm")
    val repRoleNm: String,

    @SerializedName("homepages")
    val homepages: List<String>,
    @SerializedName("filmos")
    val filmos: List<Filmo>
)
