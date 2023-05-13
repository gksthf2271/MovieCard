package com.khs.domain.filmCouncil.gateway

import com.khs.domain.entity.*
import kotlinx.coroutines.flow.Flow

interface FilmCouncilGateway {
    suspend fun getDailyBoxOffice(targetDt: String): Flow<CommonApiResult<BoxOffices>>

    suspend fun getWeeklyBoxOffice(
        targetDt: String,
        weekGb: String?,
        itemPerPage: String?,
        multiMovieYn: String?,
        repNationCd: String?,
        wideAreaCd: String?
    ): Flow<CommonApiResult<BoxOffices>>

    suspend fun getCommonCode(comCode: String): Flow<CommonApiResult<MovieCodes>>

    suspend fun searchMovieList(
        curPage: String? = "",
        itemPerpage: String? = "",
        movieNm: String? = "",
        directorNm: String? = "",
        openStartDt: String? = "",
        openEndDt: String? = "",
        prdtStartYear: String? = "",
        prdtEndYear: String? = "",
        repNationCd: String? = "",
        movieTypeCd: String? = ""
    ): Flow<CommonApiResult<Movies>>

    suspend fun searchMovie(movieCd: String): Flow<CommonApiResult<Movie>>

    suspend fun searchMovieCompany(
        curPage: String?,
        itemPerPage: String?,
        companyNm: String?,
        ceoNm: String?,
        companyPartCd: String?
    ): Flow<CommonApiResult<MovieCompanyList>>

    suspend fun searchMovieCompanyInfo(companyCd: String): Flow<CommonApiResult<MovieCompanyList>>

    suspend fun searchMoviePeoples(
        curPage: String?,
        itemPerPage: String?,
        peopleNm: String?,
        filmoNames: String?
    ): Flow<CommonApiResult<MoviePeoples>>

    suspend fun searchMoviePeopleInfo(peopleCd: String): Flow<CommonApiResult<MoviePeople>>
}