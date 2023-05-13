package com.khs.data.moviesdk_search

import com.khs.data.moviesdk_search.response.*
import com.khs.domain.entity.*
import com.khs.domain.entity.Filmo
import com.khs.domain.entity.Part

fun DailyBoxOfficeResponse.asBoxOffices(): BoxOffices = BoxOffices(
    boxofficeType = boxOfficeResult.boxofficeType,
    showRange = boxOfficeResult.showRange,
    boxOffices = boxOfficeResult.dailyBoxOfficeList.map { boxOfficeResponse -> boxOfficeResponse.asBoxOffice() }
)


fun WeeklyBoxOfficeResponse.asBoxOffices(): BoxOffices = BoxOffices(
    boxofficeType = boxOfficeResult.boxofficeType,
    showRange = boxOfficeResult.showRange,
    boxOffices = boxOfficeResult.weeklyBoxOfficeList.map { boxOfficeResponse -> boxOfficeResponse.asBoxOffice() }
)

fun CommonCodeResponse.asCodes(): MovieCodes = MovieCodes(
    movieCodes = codes.map { commonCode -> commonCode.asCode() }
)

fun MovieListResponse.asMovies(): Movies = Movies(
    totCnt = movieListResult.totCnt,
    source = movieListResult.source,
    movies = movieListResult.movieList.map { movie -> movie.asMovie() }
)

fun MovieCompanyResponse.asCompanies(): MovieCompanyList = MovieCompanyList(
    totCnt = companyListResult.totCnt,
    companyList = companyListResult.companyList.map { filmCouncilCompany ->
        filmCouncilCompany.asCompany()
    }
)

fun MovieInfoResponse.asMovie(): Movie = with(movieInfoResult.movieInfo) {
    Movie(
        movieCd = movieCd,
        movieNm = movieNm,
        movieNmEn = movieNmEn,
        movieNmOg = movieNmOg,
        showTm = showTm,
        prdtYear = prdtYear,
        openDt = openDt,
        prdtStatNm = prdtStatNm,
        typeNm = typeNm,
        nations = nations.map { nation ->
            MovieNation(
                nationNm = nation.nationNm
            )
        },
        genres = genres.map { genre ->
            MovieGenre(
                genreNm = genre.genreNm
            )
        },
        directors = directors.map { filmCouncilDirector ->
            MovieDirector(
                peopleNm = filmCouncilDirector.peopleNm,
                peopleNmEn = filmCouncilDirector.peopleNmEn
            )
        },
        actors = actors.map { actor ->
            MovieActor(
                peopleNm = actor.peopleNm,
                peopleNmEn = actor.peopleNmEn,
                cast = actor.cast,
                castEn = actor.castEn
            )
        },
        showTypes = showTypes.map { showType ->
            MovieShowType(
                showTypeGroupNm = showType.showTypeGroupNm,
                showTypeNm = showType.showTypeNm
            )
        },
        companies = companies.map { filmCouncilCompany ->
            filmCouncilCompany.asCompany()
        },
        audits = audits.map { audit ->
            MovieAudit(
                auditNo = audit.auditNo,
                watchGradeNm = audit.watchGradeNm
            )
        },
        staffs = staffs.map { staff ->
            MovieStaff(
                peopleNm = staff.peopleNm,
                peopleNmEn = staff.peopleNmEn,
                staffRoleNm = staff.staffRoleNm
            )
        },
    )
}

fun MovieCompanyInfoResponse.asCompany(): MovieCompanyList = with(companyInfoResult.companyInfo) {
    MovieCompanyList(
        totCnt = size,
        companyList = map { companyInfo ->
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
}

fun MoviePeopleResponse.asPeoples(): MoviePeoples = with(peopleListResult) {
    MoviePeoples(
        totCnt = totCnt,
        source = source,
        peopleList = peopleList.map { filmCouncilMoviePeople ->
            filmCouncilMoviePeople.asPeople()
        }
    )
}

fun MoviePeopleInfoResponse.asPeople(): MoviePeople = with(peopleInfoResult.peopleInfo) {
    MoviePeople(
        peopleCd = peopleCd,
        peopleNm = peopleNm,
        peopleNmEn = peopleNmEn,
        sex = sex,
        repRoleNm = repRoleNm,
        homepages = homepages,
        filmos = filmos.map { filmo ->
            Filmo(
                movieCd = filmo.movieCd,
                movieNm = filmo.movieNm,
                companyPartNm = filmo.companyPartNm,
                moviePartNm = filmo.moviePartNm
            )
        }
    )
}

fun BoxOfficeResponse.asBoxOffice(): BoxOffice = run {
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

fun CommonCode.asCode(): MovieCode = run {
    return MovieCode(
        fullCd = fullCd,
        korNm = korNm,
        engNm = engNm
    )
}

fun FilmCouncilMovie.asMovie(): Movie = run {
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

fun FilmCouncilCompany.asCompany(): MovieCompany = run {
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

fun FilmCouncilMoviePeople.asPeople(): MoviePeople = run {
    return MoviePeople(
        peopleCd = peopleCd,
        peopleNm = peopleNm,
        peopleNmEn = peopleNmEn,
        repRoleNm = repRoleNm,
        filmoNames = filmoNames
    )
}