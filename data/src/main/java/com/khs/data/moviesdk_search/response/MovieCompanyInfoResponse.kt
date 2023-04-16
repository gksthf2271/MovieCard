package com.khs.data.moviesdk_search.response

import com.google.gson.annotations.SerializedName

data class MovieCompanyInfoResponse(
    @SerializedName("companyInfoResult")
    val companyInfoResult: CompanyInfoResult
)

data class CompanyInfoResult(
    @SerializedName("companyInfo")
    val companyInfo: List<CompanyInfo>,
    @SerializedName("source")
    val source: List<String>,
)

data class CompanyInfo(
    @SerializedName("companyCd")
    val companyCd: String,
    @SerializedName("companyNm")
    val companyNm: String,
    @SerializedName("companyNmEn")
    val companyNmEn: String,
    @SerializedName("ceoNm")
    val ceoNm: String,
    @SerializedName("parts")
    val parts: List<Part>,
    @SerializedName("filmos")
    val filmos: List<Filmo>,
)

data class Part(
    @SerializedName("companyPartNm")
    val companyPartNm: String
)

data class Filmo(
    @SerializedName("movieCd")
    val movieCd: String,
    @SerializedName("movieNm")
    val movieNm: String,
    @SerializedName("companyPartNm")
    val companyPartNm: String,
    @SerializedName("moviePartNm")
    val moviePartNm: String
)