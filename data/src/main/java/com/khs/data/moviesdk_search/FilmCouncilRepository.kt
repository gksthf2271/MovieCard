package com.khs.data.moviesdk_search

import com.khs.domain.entity.*
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FilmCouncilRepository @Inject constructor(
    private val movieSDKDataSource: MovieSDKDataSource
) : FilmCouncilGateway {
    override suspend fun getDailyBoxOffice(targetDt: String): Flow<CommonApiResult<BoxOffices>> =
        movieSDKDataSource.getDailyBoxOffice(targetDt)

    override suspend fun getWeeklyBoxOffice(
        targetDt: String,
        weekGb: String?,
        itemPerPage: String?,
        multiMovieYn: String?,
        repNationCd: String?,
        wideAreaCd: String?
    ): Flow<CommonApiResult<BoxOffices>> = movieSDKDataSource.getWeeklyBoxOffice(
        targetDt,
        weekGb,
        itemPerPage,
        multiMovieYn,
        repNationCd,
        wideAreaCd
    )

    override suspend fun getCommonCode(comCode: String): Flow<CommonApiResult<MovieCodes>> =
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
    ): Flow<CommonApiResult<Movies>> = movieSDKDataSource.searchMovieList(
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

    override suspend fun searchMovie(movieCd: String): Flow<CommonApiResult<Movie>> =
        movieSDKDataSource.searchMovie(movieCd)

    override suspend fun searchMovieCompany(
        curPage: String?,
        itemPerPage: String?,
        companyNm: String?,
        ceoNm: String?,
        companyPartCd: String?
    ): Flow<CommonApiResult<MovieCompanyList>> =
        movieSDKDataSource.searchMovieCompany(curPage, itemPerPage, companyNm, ceoNm, companyPartCd)

    override suspend fun searchMovieCompanyInfo(companyCd: String): Flow<CommonApiResult<MovieCompanyList>> =
        movieSDKDataSource.searchMovieCompanyInfo(companyCd)

    override suspend fun searchMoviePeoples(
        curPage: String?,
        itemPerPage: String?,
        peopleNm: String?,
        filmoNames: String?
    ): Flow<CommonApiResult<MoviePeoples>> =
        movieSDKDataSource.searchMoviePeoples(curPage, itemPerPage, peopleNm, filmoNames)

    override suspend fun searchMoviePeopleInfo(peopleCd: String): Flow<CommonApiResult<MoviePeople>> =
        movieSDKDataSource.searchMoviePeopleInfo(peopleCd)
}