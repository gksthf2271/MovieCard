package com.khs.data.moviesdk_search

import com.khs.domain.entity.*
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import retrofit2.Response
import javax.inject.Inject

class FilmCouncilRepository @Inject constructor(
    private val movieSDKDataSource: MovieSDKDataSource
) : FilmCouncilGateway {
    override suspend fun getDailyBoxOffice(targetDt: String): Response<BoxOffices> =
        movieSDKDataSource.getDailyBoxOffice(targetDt)

    override suspend fun getWeeklyBoxOffice(
        targetDt: String,
        weekGb: String?,
        itemPerPage: String?,
        multiMovieYn: String?,
        repNationCd: String?,
        wideAreaCd: String?
    ): Response<BoxOffices> = movieSDKDataSource.getWeeklyBoxOffice(
        targetDt,
        weekGb,
        itemPerPage,
        multiMovieYn,
        repNationCd,
        wideAreaCd
    )

    override suspend fun getCommonCode(comCode: String): Response<MovieCodes> =
        movieSDKDataSource.getCommonCode(comCode)

    override suspend fun searchMovieList(
        curPage: String?,
        itemPerpage: String?,
        movieNm: String?,
        directorNm: String?,
        openStartDt: String?,
        openEndDt: String?,
        prdtStartYear: String?,
        prdtEndYear: String?,
        repNationCd: String?,
        movieTypeCd: String?
    ): Response<Movies> = movieSDKDataSource.searchMovieList(
        curPage,
        itemPerpage,
        movieNm,
        directorNm,
        openStartDt,
        openEndDt,
        prdtStartYear,
        prdtEndYear,
        repNationCd,
        movieTypeCd
    )

    override suspend fun searchMovie(movieCd: String): Response<Movie> =
        movieSDKDataSource.searchMovie(movieCd)

    override suspend fun searchMovieCompany(
        curPage: String?,
        itemPerPage: String?,
        companyNm: String?,
        ceoNm: String?,
        companyPartCd: String?
    ): Response<MovieCompanyList> =
        movieSDKDataSource.searchMovieCompany(curPage, itemPerPage, companyNm, ceoNm, companyPartCd)

    override suspend fun searchMovieCompanyInfo(companyCd: String): Response<MovieCompanyList> =
        movieSDKDataSource.searchMovieCompanyInfo(companyCd)

    override suspend fun searchMoviePeoples(
        curPage: String?,
        itemPerPage: String?,
        peopleNm: String?,
        filmoNames: String?
    ): Response<MoviePeoples> =
        movieSDKDataSource.searchMoviePeoples(curPage, itemPerPage, peopleNm, filmoNames)

    override suspend fun searchMoviePeopleInfo(peopleCd: String): Response<MoviePeople> =
        movieSDKDataSource.searchMoviePeopleInfo(peopleCd)
}