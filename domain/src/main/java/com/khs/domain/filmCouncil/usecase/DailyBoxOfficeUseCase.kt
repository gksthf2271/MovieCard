package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.BoxOffices
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import retrofit2.Response
import javax.inject.Inject

class DailyBoxOfficeUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway) {

    suspend operator fun invoke(targetDt: String): Response<BoxOffices> {
        return filmCouncilGateway.getDailyBoxOffice(targetDt)
    }
}