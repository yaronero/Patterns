package com.example.patterns.presentation

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.patterns.presentation.gif.GifViewModel
import java.lang.RuntimeException

class ViewModelFactory(
    private val sharedPrefs: SharedPreferences
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val viewModel = when(modelClass) {
            GifViewModel::class.java -> GifViewModel(sharedPrefs)
            else -> throw IllegalStateException("Unknown view model")
        }
        return viewModel as T
    }
}