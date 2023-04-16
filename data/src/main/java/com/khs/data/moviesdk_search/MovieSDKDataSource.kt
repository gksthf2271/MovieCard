package com.khs.data.moviesdk_search

import com.khs.domain.entity.*
import retrofit2.Response
import javax.inject.Inject

class MovieSDKDataSource @Inject constructor(
    private val apiKey: String,
    private val movieSDKService: MovieSDKService
) {
    suspend fun getDailyBoxOffice(targetDt: String): Response<BoxOffices> {
        return movieSDKService.getDailyBoxOffice(apiKey, targetDt).asBoxOffices()
    }

    suspend fun getWeeklyBoxOffice(
        targetDt: String,
        weekGb: String?,
        itemPerPage: String?,
        multiMovieYn: String?,
        repNationCd: String?,
        wideAreaCd: String?
    ): Response<BoxOffices> {
        return movieSDKService.getWeeklyBoxOffice(
            key = apiKey,
            targetDt = targetDt,
            weekGb = weekGb,
            itemPerPage = itemPerPage,
            multiMovieYn = multiMovieYn,
            repNationCd = repNationCd,
            wideAreaCd = wideAreaCd
        ).asBoxOffices()
    }

    suspend fun getCommonCode(comCode: String): Response<MovieCodes> {
        return movieSDKService.getCommonCode(key = apiKey, comCode = comCode).asCodes()
    }

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
    ): Response<Movies> {
        return movieSDKService.searchMovieList(
            key = apiKey,
            curPage = curPage,
            itemPerPage = itemPerpage,
            movieNm = movieNm,
            directorNm = directorNm,
            openStartDt = openStartDt,
            openEndDt = openEndDt,
            prdtStartYear = prdtStartYear,
            prdtEndYear = prdtEndYear,
            repNationCd = repNationCd,
            movieTypeCd = movieTypeCd
        ).asMovies()
    }

    suspend fun searchMovie(movieCd: String): Response<Movie> {
        return movieSDKService.searchMovieInfo(key = apiKey, movieCd = movieCd).asMovie()
    }

    suspend fun searchMovieCompany(
        curPage: String?,
        itemPerPage: String?,
        companyNm: String?,
        ceoNm: String?,
        companyPartCd: String?
    ): Response<MovieCompanyList> {
        return movieSDKService.searchMovieCompany(
            key = apiKey,
            curPage = curPage,
            itemPerPage = itemPerPage,
            companyNm = companyNm,
            ceoNm = ceoNm,
            companyPartCd = companyPartCd
        ).asCompanies()
    }

    suspend fun searchMovieCompanyInfo(companyCd: String): Response<MovieCompanyList> {
        return movieSDKService.searchMovieCompanyInfo(key = apiKey, companyCd = companyCd).asCompany()
    }

    suspend fun searchMoviePeoples(
        curPage: String?,
        itemPerPage: String?,
        peopleNm: String?,
        filmoNames: String?
    ): Response<MoviePeoples> {
        return movieSDKService.searchMoviePeopleList(
            key = apiKey,
            curPage = curPage,
            itemPerPage = itemPerPage,
            peopleNm = peopleNm,
            filmoNames = filmoNames
        ).asPeoples()
    }

    suspend fun searchMoviePeopleInfo(peopleCd: String): Response<MoviePeople> {
        return movieSDKService.searchMoviePeopleInfo(key = apiKey, peopleCd = peopleCd).asPeople()
    }
}