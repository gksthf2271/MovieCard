package com.khs.domain.filmCouncil.usecase

import com.khs.domain.entity.BoxOffices
import com.khs.domain.filmCouncil.gateway.FilmCouncilGateway
import retrofit2.Response
import javax.inject.Inject

class WeeklyBoxOfficeUseCase @Inject constructor(
    private val filmCouncilGateway: FilmCouncilGateway
) {

    suspend operator fun invoke(targetDt: String,
                                weekGb: String? = "",
                                itemPerPage: String? = "",
                                multiMovieYn: String? = "",
                                repNationCd: String? = "",
                                wideAreaCd: String? = ""): Response<BoxOffices> {
        return filmCouncilGateway.getWeeklyBoxOffice(targetDt, weekGb, itemPerPage, multiMovieYn, repNationCd, wideAreaCd)
    }
}