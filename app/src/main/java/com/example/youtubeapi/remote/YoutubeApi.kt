package com.example.youtubeapi.remote

import com.example.youtubeapi.models.Playlist
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeApi {

    @GET("playlists")
    fun getPlaylists(
        @Query("part") part: String,
        @Query("channelId") channelId: String,
        @Query("key") apiKey: String,
        @Query("maxResults") maxResults: Int
):Call<Playlist>

    @GET("playlistItems")
    fun getPlaylistsVideos(
        @Query("part") part: String,
        @Query("playlistId") channelId: String,
        @Query("key") apiKey: String,
        @Query("maxResults") maxResults: Int

    ):Call<Playlist>

}