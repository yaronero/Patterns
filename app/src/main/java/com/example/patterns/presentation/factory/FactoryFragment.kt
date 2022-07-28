package com.example.patterns.presentation.factory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.patterns.databinding.FragmentFactoryBinding
import com.example.patterns.presentation.factory.anotherVariant.ItemFactory

class FactoryFragment : Fragment() {

    private lateinit var binding: FragmentFactoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        retainInstance = true
        binding = FragmentFactoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val transport = TransportFactory("Audi", 200).create(Car::class.java)

        binding.tvTransportFactory.text = transport.move()
        binding.tvItemFactory.text = ItemFactory().createItemFromId(4).toString()
    }
}