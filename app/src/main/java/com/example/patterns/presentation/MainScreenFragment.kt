package com.example.patterns.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.patterns.R
import com.example.patterns.databinding.FragmentMainScreenBinding
import com.example.patterns.presentation.adapter.AdapterFragment
import com.example.patterns.presentation.builder.BuilderFragment
import com.example.patterns.presentation.decorator.DecoratorFragment
import com.example.patterns.presentation.factory.FactoryFragment
import com.example.patterns.presentation.gif.GifFragment

class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        retainInstance = true
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRandomGif.setOnClickListener {
            launchFragment(GifFragment())
        }
        binding.btnBuilder.setOnClickListener {
            launchFragment(BuilderFragment())
        }
        binding.btnAdapter.setOnClickListener {
            launchFragment(AdapterFragment())
        }
        binding.btnDecorator.setOnClickListener {
            launchFragment(DecoratorFragment())
        }
        binding.btnFactory.setOnClickListener {
            launchFragment(FactoryFragment())
        }
    }

    private fun launchFragment(fragment: Fragment) {
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }
}