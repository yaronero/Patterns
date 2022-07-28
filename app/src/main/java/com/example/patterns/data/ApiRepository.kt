package com.example.patterns.data

import com.example.patterns.data.api.ApiService
import com.example.patterns.data.api.RetrofitInstance

class ApiRepository {

    suspend fun getRandomGif(): String {
        val apiHelper = RetrofitInstance.getInstance().create(ApiService::class.java)

        val response = apiHelper.getRandomGif()
        return response.body()?.result?.image?.smallSizeUrl?.url ?: ""
    }
}