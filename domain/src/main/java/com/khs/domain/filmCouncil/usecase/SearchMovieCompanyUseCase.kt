package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.CommonApiResult
import com.khs.domain.entity.MovieCompanyList
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import kotlinx.coroutines.flow.Flow
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
    ): Flow<CommonApiResult<MovieCompanyList>> {
        return filmCouncilGateway.searchMovieCompany(
            curPage,
            itemPerPage,
            companyNm,
            ceoNm,
            companyPartCd
        )
    }

    suspend fun searchMovieCompanyInfo(companyCd: String): Flow<CommonApiResult<MovieCompanyList>> {
        return filmCouncilGateway.searchMovieCompanyInfo(companyCd)
    }
}