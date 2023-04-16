package com.khs.domain.entity

data class MoviePeople(
    val peopleCd: String,
    val peopleNm: String? = "",
    val peopleNmEn: String? = "",
    val repRoleNm: String? = "",
    val filmoNames: String? = "",
    val sex: String? = "",
    val homepages: List<String>? = emptyList(),
    val filmos: List<Filmo>? = emptyList()
)
