package com.khs.moviecard.di

import com.khs.data.moviesdk_search.MovieSDKService
import com.khs.data.naver_search.NaverService
import com.khs.domain.util.Constants.MOVIE_BASE_URL
import com.khs.domain.util.Constants.NAVER_BASE_URL
import com.khs.moviecard.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Singleton
    @Provides
    fun provideAuthInterceptor(): Interceptor {
        return Interceptor { chain: Interceptor.Chain ->
            val initialRequest = chain.request()

            val newUrl = initialRequest.url.newBuilder()
//                .addQueryParameter("X-Naver-Client-Id", BuildConfig.NAVER_API_ID_KEY)
//                .addQueryParameter("X-Naver-Client-Secret", BuildConfig.NAVER_API_SECRET_KEY)
                .build()

            val newRequest = initialRequest.newBuilder()
                .url(newUrl)
                .build()

            chain.proceed(newRequest)
        }
    }

    @Singleton
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        authInterceptor: Interceptor,
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(authInterceptor)
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideNaverService(retrofit: Retrofit): NaverService {
        return retrofit.create(NaverService::class.java)
    }

    @Provides
    @Singleton
    fun provideMovieSDKService(retrofit: Retrofit): MovieSDKService {
        return retrofit.create(MovieSDKService::class.java)
    }
}