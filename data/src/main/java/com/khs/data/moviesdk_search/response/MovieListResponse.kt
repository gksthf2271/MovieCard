package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    @SerializedName("movieListResult")
    val boxOfficeResult: MovieListResult
)

data class MovieListResult(
    @SerializedName("totCnt")
    val totCnt: Int,
    @SerializedName("source")
    val source: String,
    @SerializedName("movieList")
    val movieList: List<Movie>
)

data class Movie(
    @SerializedName("movieCd")
    val movieCd: String,
    @SerializedName("movieNm")
    val movieNm: String,
    @SerializedName("movieNmEn")
    val movieNmEn: String,
    @SerializedName("prdtYear")
    val prdtYear: String,
    @SerializedName("openDt")
    val openDt: String,
    @SerializedName("typeNm")
    val typeNm: String,
    @SerializedName("prdtStatNm")
    val prdtStatNm: String,
    @SerializedName("nationAlt")
    val nationAlt: String,
    @SerializedName("genreAlt")
    val genreAlt: String,
    @SerializedName("repNationNm")
    val repNationNm: String,
    @SerializedName("repGenreNm")
    val repGenreNm: String,
    @SerializedName("directors")
    val directors: List<Director>,
    @SerializedName("companys")
    val companys: List<Company>,
)

data class Director(
    @SerializedName("peopleNm")
    val peopleNm: String,
    @SerializedName("peopleNmEn")
    val peopleNmEn: String
)

data class Company(
    @SerializedName("companyCd")
    val companyCd: String,
    @SerializedName("companyNm")
    val companyNm: String,
    @SerializedName("companyNmEn")
    val companyNmEn: String,
    @SerializedName("companyPartNm")
    val companyPartNm: String,
    @SerializedName("companyPartNames")
    val companyPartNames: String,
    @SerializedName("ceoNm")
    val ceoNm: String,
    @SerializedName("filmoNames")
    val filmoNames: String,
)