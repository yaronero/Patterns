package com.example.patterns.presentation.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.patterns.databinding.FragmentAdapterBinding

class AdapterFragment : Fragment() {

    private lateinit var binding: FragmentAdapterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        retainInstance = true
        binding = FragmentAdapterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCheckFits.setOnClickListener {
            val squareWidth = binding.etSquareWidth.text.toString().toDouble()
            val adapterSquare = SquareToRoundAdapter(SquarePeg(squareWidth))
            val holeRadius = binding.etHoleRadius.text.toString().toDouble()
            val squareFitsHole = RoundHole(holeRadius).fits(adapterSquare)

            if(squareFitsHole){
                binding.tvFits.text = "Square fits hole"
            } else {
                binding.tvFits.text = "Square doesn't fit hole"
            }
        }
    }
}