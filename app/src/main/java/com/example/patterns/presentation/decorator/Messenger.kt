package com.example.patterns.presentation.decorator

interface Messenger {

    fun sendMessage(message: String): String

    fun sendImage(imageId: Int): String

    fun makePost(post: String): String
}