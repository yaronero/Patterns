package com.example.patterns.data.api.model

import com.google.gson.annotations.SerializedName

data class DataResult(
    @SerializedName("data") val result: DataImage
)
