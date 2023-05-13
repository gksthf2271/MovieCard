package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.CommonApiResult
import com.khs.domain.entity.MoviePeople
import com.khs.domain.entity.MoviePeoples
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMoviePeopleUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway
) {

    suspend fun searchMoviePeople(
        curPage: String? = "",
        itemPerPage: String? = "",
        peopleNm: String? = "",
        filmoNames: String? = ""
    ): Flow<CommonApiResult<MoviePeoples>> {
        return filmCouncilGateway.searchMoviePeoples(curPage, itemPerPage, peopleNm, filmoNames)
    }

    suspend fun searchMoviePeopleInfo(peopleCd: String): Flow<CommonApiResult<MoviePeople>> {
        return filmCouncilGateway.searchMoviePeopleInfo(peopleCd)
    }
}