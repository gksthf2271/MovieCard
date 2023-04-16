package com.khs.domain.filmCouncil.gateway

import com.khs.domain.entity.*
import retrofit2.Response

interface FilmCouncilGateway {
    suspend fun getDailyBoxOffice(targetDt: String): Response<BoxOffices>

    suspend fun getWeeklyBoxOffice(
        targetDt: String,
        weekGb: String?,
        itemPerPage: String?,
        multiMovieYn: String?,
        repNationCd: String?,
        wideAreaCd: String?
    ): Response<BoxOffices>

    suspend fun getCommonCode(comCode: String): Response<MovieCodes>

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
    ): Response<Movies>

    suspend fun searchMovie(movieCd: String): Response<Movie>

    suspend fun searchMovieCompany(
        curPage: String?,
        itemPerPage: String?,
        companyNm: String?,
        ceoNm: String?,
        companyPartCd: String?
    ): Response<MovieCompanyList>

    suspend fun searchMovieCompanyInfo(companyCd: String): Response<MovieCompanyList>

    suspend fun searchMoviePeoples(
        curPage: String?,
        itemPerPage: String?,
        peopleNm: String?,
        filmoNames: String?
    ): Response<MoviePeoples>

    suspend fun searchMoviePeopleInfo(peopleCd: String): Response<MoviePeople>
}