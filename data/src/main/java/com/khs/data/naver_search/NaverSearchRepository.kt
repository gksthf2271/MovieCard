package com.khs.data.naver_search

import com.khs.data.naver_search.NaverSearchDataSource
import javax.inject.Inject

class NaverSearchRepository @Inject constructor(
    private val naverSearchDataSource: NaverSearchDataSource) {

}