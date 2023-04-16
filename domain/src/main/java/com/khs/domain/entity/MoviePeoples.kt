package com.khs.domain.entity

data class MoviePeoples(
    val totCnt: Int,
    val peopleList: List<MoviePeople>,
    val source: String
)
