package com.khs.domain.entity

data class Movie(
    // MovieListResponse 내 Movie 기반
    val movieCd: String,
    val movieNm: String? = "",
    val openDt: String? = "",
    val movieNmEn: String? = "",
    val prdtYear: String? = "",
    val typeNm: String? = "",
    val prdtStatNm: String? = "",
    val nationAlt: String? = "",
    val genreAlt: String? = "",
    val repNationNm: String? = "",
    val repGenreNm: String? = "",
    val movieNmOg: String? = "",
    val showTm: String? = "",
    val directors: List<MovieDirector>? = emptyList(),
    val companies: List<MovieCompany>? = emptyList(),
    val nations: List<MovieNation>? = emptyList(),
    val genres: List<MovieGenre>? = emptyList(),
    val actors: List<MovieActor>? = emptyList(),
    val showTypes: List<MovieShowType>? = emptyList(),
    val audits: List<MovieAudit>? = emptyList(),
    val staffs: List<MovieStaff>? = emptyList()
)

data class MovieDirector(
    val peopleNm: String,
    val peopleNmEn: String
)

data class MovieNation(
    val nationNm: String
)

data class MovieGenre(
    val genreNm: String,
)

data class MovieActor(
    val peopleNm: String,
    val peopleNmEn: String,
    val cast: String,
    val castEn: String,
)

data class MovieShowType(
    val showTypeGroupNm: String,
    val showTypeNm: String
)

data class MovieAudit(
    val auditNo: String,
    val watchGradeNm: String
)

data class MovieStaff(
    val peopleNm: String,
    val peopleNmEn: String,
    val staffRoleNm: String
)