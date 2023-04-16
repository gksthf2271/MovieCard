package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.MovieCompanyList
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import retrofit2.Response
import javax.inject.Inject

class SearchMovieCompanyUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway
) {

    suspend fun searchMovieCompany(
        curPage: String? = "",
        itemPerPage: String? = "",
        companyNm: String? = "",
        ceoNm: String? = "",
        companyPartCd: String = "",
    ): Response<MovieCompanyList> {
        return filmCouncilGateway.searchMovieCompany(
            curPage,
            itemPerPage,
            companyNm,
            ceoNm,
            companyPartCd
        )
    }

    suspend fun searchMovieCompanyInfo(companyCd: String): Response<MovieCompanyList> {
        return filmCouncilGateway.searchMovieCompanyInfo(companyCd)
    }
}