package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.BoxOffices
import com.khs.domain.entity.CommonApiResult
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DailyBoxOfficeUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway) {

    suspend operator fun invoke(targetDt: String): Flow<CommonApiResult<BoxOffices>> {
        return filmCouncilGateway.getDailyBoxOffice(targetDt)
    }
}