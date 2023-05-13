package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.BoxOffices
import com.khs.domain.entity.CommonApiResult
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeeklyBoxOfficeUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway
) {

    suspend operator fun invoke(targetDt: String,
                                weekGb: String? = "",
                                itemPerPage: String? = "",
                                multiMovieYn: String? = "",
                                repNationCd: String? = "",
                                wideAreaCd: String? = ""): Flow<CommonApiResult<BoxOffices>> {
        return filmCouncilGateway.getWeeklyBoxOffice(targetDt, weekGb, itemPerPage, multiMovieYn, repNationCd, wideAreaCd)
    }
}