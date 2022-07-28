package com.example.patterns.presentation.builder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.patterns.data.builders.SmartphoneAdvBuilder
import com.example.patterns.databinding.FragmentBuilderBinding

class BuilderFragment : Fragment() {

    private lateinit var binding: FragmentBuilderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBuilderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val smartphone = SmartphoneAdvBuilder.Builder("Xiaomi", 1234)
            .setMemorySize(64)
            .setCameraAmount(2)
            .build()

        binding.tvBuilder.text = smartphone.toString()
    }
}