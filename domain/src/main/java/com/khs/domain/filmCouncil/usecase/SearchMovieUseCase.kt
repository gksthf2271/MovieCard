package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.Movies
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import retrofit2.Response
import javax.inject.Inject

class SearchMovieUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway
) {

    suspend fun searchMovies(targetDt: String,
                                weekGb: String? = "",
                                itemPerPage: String? = "",
                                multiMovieYn: String? = "",
                                repNationCd: String? = "",
                                wideAreaCd: String? = ""): Response<Movies> {
        return filmCouncilGateway.searchMovieList(targetDt, weekGb, itemPerPage, multiMovieYn, repNationCd, wideAreaCd)
    }
}