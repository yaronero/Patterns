package com.example.patterns.presentation.decorator

class FacebookMessenger {

    fun sendMessage(message: String): String {
        return "(Facebook)Message: \"$message\" send\n"
    }

    fun sendImage(imageId: Int): String {
        return "(Facebook)Image wi id $imageId send\n"
    }

    fun makePost(post: String): String {
        return "(Facebook)Post: $post posted\n"
    }
}