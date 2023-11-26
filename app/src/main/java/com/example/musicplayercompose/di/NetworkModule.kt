package com.example.musicplayercompose.di

import com.example.musicplayercompose.networkcalls.SongListApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://cms.samespace.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Singleton
    @Provides
    fun provideSongsApi(retrofit: Retrofit) : SongListApi {
        return retrofit.create(SongListApi::class.java)
    }

}