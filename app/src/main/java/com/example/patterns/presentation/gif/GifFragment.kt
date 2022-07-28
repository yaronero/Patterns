package com.example.patterns.presentation.gif

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.patterns.databinding.FragmentRandomGifBinding
import com.example.patterns.presentation.ViewModelFactory
import com.example.patterns.utils.SHARED_PREFS

class GifFragment : Fragment() {

    private lateinit var binding: FragmentRandomGifBinding

    private val viewModel by lazy {
        val sharedPref =
            activity?.getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE)
                ?: throw RuntimeException("Activity is null")

        val viewModelFactory = ViewModelFactory(sharedPref)
        ViewModelProvider(this, viewModelFactory)[GifViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        retainInstance = true
        binding = FragmentRandomGifBinding.inflate(inflater,  container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(savedInstanceState == null){
            viewModel.getRandomGif()
        }

        viewModel.randomGifUrl.observe(viewLifecycleOwner) {
            Glide.with(requireContext())
                .load(it)
                .into(binding.gifView)
        }

        binding.btnRandomGif.setOnClickListener {
            viewModel.getRandomGif()
        }
        binding.btnSaveUrl.setOnClickListener {
            viewModel.saveToSharedPrefs(viewModel.randomGifUrl.value!!)
        }
    }
}