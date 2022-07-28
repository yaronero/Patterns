package com.example.patterns.presentation.gif

import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.patterns.data.ApiRepository
import com.example.patterns.utils.GIF_URL
import kotlinx.coroutines.launch

class GifViewModel(
    private val sharedPreferences: SharedPreferences
) : ViewModel() {

    private val repository = ApiRepository()

    private val _randomGifUrl = MutableLiveData<String>()
    val randomGifUrl: LiveData<String>
        get() = _randomGifUrl

    fun getRandomGif() {
        viewModelScope.launch {
            _randomGifUrl.value = repository.getRandomGif()
        }
    }

    fun saveToSharedPrefs(url: String) {
        sharedPreferences.edit {
            putString(GIF_URL, url)
        }
    }
}