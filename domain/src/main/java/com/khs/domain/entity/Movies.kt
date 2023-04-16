package com.khs.domain.entity

data class Movies (
    val totCnt: Int? = -1,
    val source: String? = "",
    val movies: List<Movie>
)