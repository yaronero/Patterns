package com.example.patterns.presentation.decorator

class SnapChatMessenger {

    fun sendMessage(message: String): String {
        return "(SnapChat)Message: \"$message\" send\n"
    }

    fun sendImage(imageId: Int): String {
        return "(SnapChat)Image wi id $imageId send\n"
    }

    fun makePost(post: String): String {
        return "(SnapChat)Post: $post posted\n"
    }
}