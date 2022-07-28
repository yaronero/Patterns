package com.example.patterns.presentation.decorator

class TelegramMessenger {

    fun sendMessage(message: String): String {
        return "(Telegram)Message: \"$message\" send\n"
    }

    fun sendImage(imageId: Int): String {
        return "(Telegram)Image wi id $imageId send\n"
    }

    fun makePost(post: String): String {
        return "(Telegram)Post: $post posted\n"
    }
}