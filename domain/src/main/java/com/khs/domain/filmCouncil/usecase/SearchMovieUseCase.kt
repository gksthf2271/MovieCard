package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.CommonApiResult
import com.khs.domain.entity.Movie
import com.khs.domain.entity.Movies
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMovieUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway
) {

    suspend fun searchMovies(targetDt: String,
                                weekGb: String? = "",
                                itemPerPage: String? = "",
                                multiMovieYn: String? = "",
                                repNationCd: String? = "",
                                wideAreaCd: String? = ""): Flow<CommonApiResult<Movies>> {
        return filmCouncilGateway.searchMovieList(targetDt, weekGb, itemPerPage, multiMovieYn, repNationCd, wideAreaCd)
    }

    suspend fun searchMovie(movieCd: String): Flow<CommonApiResult<Movie>> {
        return filmCouncilGateway.searchMovie(movieCd = movieCd)
    }
}