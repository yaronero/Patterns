package com.example.patterns.data.api.model

import com.google.gson.annotations.SerializedName

data class DataImage(
    @SerializedName("images") val image: DataGifs
)