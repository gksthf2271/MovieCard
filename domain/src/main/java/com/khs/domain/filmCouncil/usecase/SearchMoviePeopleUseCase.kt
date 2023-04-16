package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.MoviePeople
import com.khs.domain.entity.MoviePeoples
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import retrofit2.Response
import javax.inject.Inject

class SearchMoviePeopleUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway
) {

    suspend fun searchMoviePeople(
        curPage: String? = "",
        itemPerPage: String? = "",
        peopleNm: String? = "",
        filmoNames: String? = ""
    ): Response<MoviePeoples> {
        return filmCouncilGateway.searchMoviePeoples(curPage, itemPerPage, peopleNm, filmoNames)
    }

    suspend fun searchMoviePeopleInfo(peopleCd: String): Response<MoviePeople> {
        return filmCouncilGateway.searchMoviePeopleInfo(peopleCd)
    }
}