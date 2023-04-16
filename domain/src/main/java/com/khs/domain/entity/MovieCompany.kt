package com.khs.domain.entity

data class MovieCompany(
    val companyCd: String,
    val companyNm: String? = "",
    val companyNmEn: String? = "",
    val companyPartNm: String? = "",
    val companyPartNames: String? = "",
    val ceoNm: String? = "",
    val filmoNames: String? = "",
    val parts: List<Part>? = emptyList(),
    val filmos: List<Filmo>? = emptyList()
)

data class Part(
    val companyPartNm: String
)

data class Filmo(
    val movieCd: String,
    val movieNm: String,
    val companyPartNm: String,
    val moviePartNm: String
)
