package com.example.patterns.data.api

import com.example.patterns.data.api.model.DataResult
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("v1/gifs/random?api_key=$API_KEY&tag=&rating=g")
    suspend fun getRandomGif(): Response<DataResult>

    companion object{
        private const val API_KEY = "nXEaLef6vZx7CHAiZTTy2gWkqOPe4rUO"
    }
}