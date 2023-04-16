package com.khs.domain.entity

data class BoxOffices (
    val boxofficeType: String? = "",
    val showRange: String? = "",
    val boxOffices : List<BoxOffice>
)