package com.example.patterns.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance private constructor(){

    companion object {
        private var retrofit: Retrofit? = null
        private var inc = 0;

        fun getInstance(): Retrofit {
            if (retrofit == null){
                synchronized(this) {
                    if(retrofit == null) {
                        retrofit = Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                    }
                }
            }
            return retrofit!!
        }

        private const val BASE_URL = "https://api.giphy.com/"
    }
}