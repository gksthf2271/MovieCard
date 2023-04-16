package com.khs.data.moviesdk_search

import com.khs.data.moviesdk_search.response.*
import com.khs.domain.entity.*
import com.khs.domain.entity.Filmo
import com.khs.domain.entity.Movie
import com.khs.domain.entity.MoviePeople
import com.khs.domain.entity.Part
import retrofit2.Response

fun Response<DailyBoxOfficeResponse>.asBoxOffices(): Response<BoxOffices> = Response.success(body()?.let {
    BoxOffices(
        boxofficeType = it.boxOfficeResult.boxofficeType,
        showRange = it.boxOfficeResult.showRange,
        boxOffices = it.boxOfficeResult.dailyBoxOfficeList.map { boxOfficeResponse -> boxOfficeResponse.asBoxOffice() }
    )
})

fun Response<WeeklyBoxOfficeResponse>.asBoxOffices(): Response<BoxOffices> = Response.success(body()?.let {
    BoxOffices(
        boxofficeType = it.boxOfficeResult.boxofficeType,
        showRange = it.boxOfficeResult.showRange,
        boxOffices = it.boxOfficeResult.weeklyBoxOfficeList.map { boxOfficeResponse -> boxOfficeResponse.asBoxOffice() }
    )
})

fun Response<CommonCodeResponse>.asCodes(): Response<MovieCodes> = Response.success(body()?.let {
    MovieCodes(
        movieCodes = it.codes.map { commonCode ->  commonCode.asCode()}
    )
})

fun Response<MovieListResponse>.asMovies(): Response<Movies> = Response.success(body()?.let {
    Movies(
        totCnt = it.movieListResult.totCnt,
        source = it.movieListResult.source,
        movies = it.movieListResult.movieList.map { movie -> movie.asMovie() }
    )
})

fun Response<MovieCompanyResponse>.asCompanies(): Response<MovieCompanyList> = Response.success(body()?.let {
    MovieCompanyList(
        totCnt = it.companyListResult.totCnt,
        companyList = it.companyListResult.companyList.map { filmCouncilCompany ->
            filmCouncilCompany.asCompany()
        }
    )
})

fun Response<MovieInfoResponse>.asMovie(): Response<Movie> = Response.success(body()?.movieInfoResult?.movieInfo?.let {
    Movie(
        movieCd = it.movieCd,
        movieNm = it.movieNm,
        movieNmEn = it.movieNmEn,
        movieNmOg = it.movieNmOg,
        showTm = it.showTm,
        prdtYear = it.prdtYear,
        openDt = it.openDt,
        prdtStatNm = it.prdtStatNm,
        typeNm = it.typeNm,
        nations = it.nations.map { nation ->
            MovieNation(
                nationNm = nation.nationNm
            )
        },
        genres = it.genres.map { genre ->
            MovieGenre(
                genreNm = genre.genreNm
            )
        },
        directors = it.directors.map { filmCouncilDirector ->
            MovieDirector(
                peopleNm = filmCouncilDirector.peopleNm,
                peopleNmEn = filmCouncilDirector.peopleNmEn
            )
        },
        actors = it.actors.map { actor ->
            MovieActor(
                peopleNm = actor.peopleNm,
                peopleNmEn = actor.peopleNmEn,
                cast = actor.cast,
                castEn = actor.castEn
            )
        },
        showTypes = it.showTypes.map { showType ->
            MovieShowType(
                showTypeGroupNm = showType.showTypeGroupNm,
                showTypeNm = showType.showTypeNm
            )
        },
        companies = it.companies.map { filmCouncilCompany ->
            filmCouncilCompany.asCompany()
        },
        audits = it.audits.map { audit ->
            MovieAudit(
                auditNo = audit.auditNo,
                watchGradeNm = audit.watchGradeNm
            )
        },
        staffs = it.staffs.map { staff ->
            MovieStaff(
                peopleNm = staff.peopleNm,
                peopleNmEn = staff.peopleNmEn,
                staffRoleNm = staff.staffRoleNm
            )
        },
    )
})

fun Response<MovieCompanyInfoResponse>.asCompany(): Response<MovieCompanyList> = Response.success(body()?.companyInfoResult?.companyInfo?.let{
    MovieCompanyList(
        totCnt = it.size,
        companyList = it.map { companyInfo ->
            MovieCompany(
                companyCd = companyInfo.companyCd,
                companyNm = companyInfo.companyNm,
                companyNmEn = companyInfo.companyNmEn,
                ceoNm = companyInfo.ceoNm,
                parts = companyInfo.parts.map { part ->
                    Part(companyPartNm = part.companyPartNm)
                },
                filmos = companyInfo.filmos.map { filmo ->
                    Filmo(
                        movieCd = filmo.movieCd,
                        movieNm = filmo.movieNm,
                        companyPartNm = filmo.companyPartNm,
                        moviePartNm = filmo.moviePartNm
                    )
                }
            )
        }
    )
})

fun Response<MoviePeopleResponse>.asPeoples(): Response<MoviePeoples> = Response.success(body()?.peopleListResult?.let {
        MoviePeoples(
            totCnt = it.totCnt,
            source = it.source,
            peopleList = it.peopleList.map { filmCouncilMoviePeople ->
                filmCouncilMoviePeople.asPeople()
            }
        )
    })

fun Response<MoviePeopleInfoResponse>.asPeople(): Response<MoviePeople> = Response.success(body()?.peopleInfoResult?.peopleInfo?.let {
        MoviePeople(
            peopleCd = it.peopleCd,
            peopleNm = it.peopleNm,
            peopleNmEn = it.peopleNmEn,
            sex = it.sex,
            repRoleNm = it.repRoleNm,
            homepages = it.homepages,
            filmos = it.filmos.map { filmo ->
                Filmo(
                    movieCd = filmo.movieCd,
                    movieNm = filmo.movieNm,
                    companyPartNm= filmo.companyPartNm,
                    moviePartNm = filmo.moviePartNm
                )
            }
        )
    })

fun BoxOfficeResponse.asBoxOffice() : BoxOffice = run {
    return BoxOffice(
        id = "",
        rnum = rnum,
        rank = rank,
        rankInten = rankInten,
        rankOldAndNew = rankOldAndNew,
        movieCd = movieCd,
        movieNm = movieNm,
        openDt = openDt,
        salesAmt = salesAmt,
        salesShare = salesShare,
        salesInten = salesInten,
        salesChange = salesChange,
        salesAcc = salesAcc,
        audiCnt = audiCnt,
        audiInten = audiInten,
        audiChange = audiChange,
        audiAcc = audiAcc,
        scrnCnt = scrnCnt,
        showCnt = showCnt
    )
}

fun CommonCode.asCode() : MovieCode = run {
    return MovieCode(
        fullCd = fullCd,
        korNm = korNm,
        engNm = engNm
    )
}

fun FilmCouncilMovie.asMovie() : Movie = run {
    return Movie(
        movieCd = movieCd,
        movieNm = movieNm,
        openDt = openDt,
        movieNmEn = movieNmEn,
        prdtYear = prdtYear,
        typeNm = typeNm,
        prdtStatNm = prdtStatNm,
        nationAlt = nationAlt,
        genreAlt = genreAlt,
        repNationNm = repNationNm,
        repGenreNm = repGenreNm,
        directors = directors.map { filmCouncilDirector ->
            MovieDirector(
                peopleNm = filmCouncilDirector.peopleNm,
                peopleNmEn = filmCouncilDirector.peopleNmEn
            )
        },
        companies = companies.map { filmCouncilCompany ->
            filmCouncilCompany.asCompany()
        }
    )
}

fun FilmCouncilCompany.asCompany() : MovieCompany = run {
    return MovieCompany(
        companyCd = companyCd,
        companyNm = companyNm,
        companyNmEn = companyNmEn,
        companyPartNm = companyPartNm,
        companyPartNames = companyPartNames,
        ceoNm = ceoNm,
        filmoNames = filmoNames
    )
}

fun  FilmCouncilMoviePeople.asPeople() : MoviePeople = run {
    return MoviePeople(
        peopleCd = peopleCd,
        peopleNm = peopleNm,
        peopleNmEn = peopleNmEn,
        repRoleNm = repRoleNm,
        filmoNames = filmoNames
    )
}