package com.khs.data.moviesdk_search

import com.khs.data.moviesdk_search.response.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieSDKService {
//    key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101
    @GET("boxoffice/searchDailyBoxOfficeList.json")
    suspend fun getDailyBoxOffice(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("targetDt") targetDt: String                 // 조회하고자 하는 날짜를 yyyymmdd 형식으로 입력합니다.
    ): Response<DailyBoxOfficeResponse>

    @GET("boxoffice/searchWeeklyBoxOfficeList.json")
    suspend fun getWeeklyBoxOffice(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("targetDt") targetDt: String,                // 조회하고자하는 날짜(yyyymmdd 형식)
        @Query("weekGb") weekGb: String? = "",              // 주간/주말/주중 선택(주간 : 0, 주말(default) : 1, 주중 : 2)
        @Query("itemPerPage") itemPerPage: String? = "",    // Row 수
        @Query("multiMovieYn") multiMovieYn: String? = "",  // 다양성(Y), 상업(N) 영화 구분. (default : 전체)
        @Query("repNationCd") repNationCd: String? = "",    // 한국(K), 외국(F) 영화. (default : 전체)
        @Query("wideAreaCd") wideAreaCd: String? = ""       // 상영지역별로 조회, 지역코드는 공통코드 조회 서비스에서 “0105000000” 로서 조회된 지역코드입니다. (default : 전체)
    ): Response<WeeklyBoxOfficeResponse>

    @GET("code/searchCodeList.json")
    suspend fun getCommonCode(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("comCode") comCode: String                   // 조회하고자하는 코드
    ): Response<CommonCodeResponse>

    @GET("movie/searchMovieList.json")
    suspend fun searchMovieList(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("curPage") curPage: String? = "",            // 현재 페이지를 지정합니다.(default : “1”)
        @Query("itemPerPage") itemPerPage: String? = "",    // 결과 ROW 의 개수를 지정합니다.(default : “10”)
        @Query("movieNm") movieNm: String? = "",            // 영화명으로 조회합니다. (UTF-8 인코딩)
        @Query("directorNm") directorNm: String? = "",      // 감독명으로 조회합니다. (UTF-8 인코딩)
        @Query("openStartDt") openStartDt: String? = "",    // YYYY형식의 조회시작 개봉연도를 입력합니다.
        @Query("openEndDt") openEndDt: String? = "",        // YYYY형식의 조회종료 개봉연도를 입력합니다.
        @Query("prdtStartYear") prdtStartYear: String? = "",// YYYY형식의 조회시작 제작연도를 입력합니다.
        @Query("prdtEndYear") prdtEndYear: String? = "",    // YYYY형식의 조회종료 제작연도를 입력합니다.
        @Query("repNationCd") repNationCd: String? = "",    // N개의 국적으로 조회할 수 있으며, 국적코드는 공통코드 조회 서비스에서 “2204” 로서 조회된 국적코드입니다. (default : 전체)
        @Query("movieTypeCd") movieTypeCd: String? = "",    // N개의 영화유형코드로 조회할 수 있으며, 영화유형코드는 공통코드 조회 서비스에서 “2201”로서 조회된 영화유형코드입니다. (default: 전체)
    ): Response<MovieListResponse>

    @GET("movie/searchMovieInfo.json")
    suspend fun searchMovieInfo(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("movieCd") movieCd: String                   // 영화 코드
    ): Response<MovieInfoResponse>

    @GET("company/searchCompanyList.json")
    suspend fun searchMovieCompany(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("curPage") curPage: String? = "",            // 현재 페이지를 지정합니다.(default : “1”)
        @Query("itemPerPage") itemPerPage: String? = "",    // 결과 ROW 의 개수를 지정합니다.(default : “10”)
        @Query("companyNm") companyNm: String? = "",        // 영화사명으로 조회합니다.
        @Query("ceoNm") ceoNm: String? = "",                // 대표자명으로 조회합니다.
        @Query("companyPartCd") companyPartCd: String? = "" // N개의 분류코드로 조회할 수 있으며, 분류코드는 공통코드 조회 서비스에서 “2601” 로서 조회된 분류코드입니다.(default: 전체)
    ): Response<MovieCompanyResponse>

    @GET("company/searchCompanyInfo.json")
    suspend fun searchMovieCompanyInfo(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("companyCd") companyCd: String               // 영화 코드
    ): Response<MovieCompanyInfoResponse>

    @GET("people/searchPeopleList.json")
    suspend fun searchMoviePeopleList(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("curPage") curPage: String? = "",            // 현재 페이지를 지정합니다.(default : “1”)
        @Query("itemPerPage") itemPerPage: String? = "",    // 결과 ROW 의 개수를 지정합니다.(default : “10”)
        @Query("peopleNm") peopleNm: String? = "",          // 영화인명으로 조회합니다.
        @Query("filmoNames") filmoNames: String? = ""       // 필모리스트로 조회합니다.
    ): Response<MoviePeopleResponse>

    @GET("people/searchPeopleInfo.json")
    suspend fun searchMoviePeopleInfo(
        @Query("key") key: String,                          // 발급 받은 키
        @Query("peopleCd") peopleCd: String                 // 영화인 코드
    ): Response<MoviePeopleInfoResponse>
}