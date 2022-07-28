package com.example.patterns.presentation.decorator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.patterns.databinding.FragmentDecoratorBinding

class DecoratorFragment : Fragment() {

    private lateinit var binding: FragmentDecoratorBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        retainInstance = true
        binding = FragmentDecoratorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val decorator = MessengerDecorator(
            facebookMessenger = FacebookMessenger(),
            telegramMessenger = TelegramMessenger(),
            snapChatMessenger = SnapChatMessenger()
        )

        binding.tvSomething.text = decorator.sendMessage("Hello")
    }
}