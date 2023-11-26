package com.example.musicplayercompose.networkcalls

import com.example.musicplayercompose.models.SongListModel
import retrofit2.Response
import retrofit2.http.GET

interface SongListApi {
    @GET("items/songs")
    suspend fun getSongs(): Response<List<SongListModel>>
}