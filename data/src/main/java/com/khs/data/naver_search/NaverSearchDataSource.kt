package com.khs.data.naver_search

import javax.inject.Inject

class NaverSearchDataSource @Inject constructor(
    private val naverService: NaverService
) {
}