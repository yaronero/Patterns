package com.example.patterns.data.api.model

import com.google.gson.annotations.SerializedName

class DataGifs(
    @SerializedName("fixed_height") val smallSizeUrl: DataGifSmallSizeURL
)