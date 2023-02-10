package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class MovieInfoResponse(
    @SerializedName("movieInfoResult")
    val movieInfoResult: MovieInfoResult,
)

data class MovieInfoResult(
    @SerializedName("movieInfo")
    val movieInfo: MovieInfo,
    @SerializedName("source")
    val source: String,
)

data class MovieInfo(
    @SerializedName("movieCd")
    val movieCd: String,
    @SerializedName("movieNm")
    val movieNm: String,
    @SerializedName("movieNmEn")
    val movieNmEn: String,
    @SerializedName("movieNmOg")
    val movieNmOg: String,
    @SerializedName("showTm")
    val showTm: String,
    @SerializedName("prdtYear")
    val prdtYear: String,
    @SerializedName("openDt")
    val openDt: String,
    @SerializedName("prdtStatNm")
    val prdtStatNm: String,
    @SerializedName("typeNm")
    val typeNm: String,

    @SerializedName("nations")
    val nations: List<Nation>,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("directors")
    val directors: List<Director>,
    @SerializedName("actors")
    val actors: List<Actor>,
    @SerializedName("showTypes")
    val showTypes: List<ShowType>,
    @SerializedName("companys")
    val companys: List<Company>,
    @SerializedName("audits")
    val audits: List<Audit>,
    @SerializedName("staffs")
    val staffs: List<Staff>,
)

data class Nation(
    @SerializedName("nationNm")
    val nationNm: String
)

data class Genre(
    @SerializedName("genreNm")
    val genreNm: String,
)

data class Actor(
    @SerializedName("peopleNm")
    val peopleNm: String,
    @SerializedName("peopleNmEn")
    val peopleNmEn: String,
    @SerializedName("cast")
    val cast: String,
    @SerializedName("castEn")
    val castEn: String,
)

data class ShowType(
    @SerializedName("showTypeGroupNm")
    val showTypeGroupNm: String,
    @SerializedName("showTypeNm")
    val showTypeNm: String
)

data class Audit(
    @SerializedName("auditNo")
    val auditNo: String,
    @SerializedName("watchGradeNm")
    val watchGradeNm: String
)

data class Staff(
    @SerializedName("peopleNm")
    val peopleNm: String,
    @SerializedName("peopleNmEn")
    val peopleNmEn: String,
    @SerializedName("staffRoleNm")
    val staffRoleNm: String
)