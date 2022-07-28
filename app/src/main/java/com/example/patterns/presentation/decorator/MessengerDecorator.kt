package com.example.patterns.presentation.decorator

class MessengerDecorator(
    private val facebookMessenger: FacebookMessenger,
    private val telegramMessenger: TelegramMessenger,
    private val snapChatMessenger: SnapChatMessenger
) : Messenger {

    override fun sendMessage(message: String): String {
        val str = StringBuilder()
        str.append(facebookMessenger.sendMessage(message))
        str.append(telegramMessenger.sendMessage(message))
        str.append(snapChatMessenger.sendMessage(message))
        return str.toString()
    }

    override fun sendImage(imageId: Int): String {
        val str = StringBuilder()
        str.append(facebookMessenger.sendImage(imageId))
        str.append(telegramMessenger.sendImage(imageId))
        str.append(snapChatMessenger.sendImage(imageId))
        return str.toString()
    }

    override fun makePost(post: String): String {
        val str = StringBuilder()
        str.append(facebookMessenger.makePost(post))
        str.append(telegramMessenger.makePost(post))
        str.append(snapChatMessenger.makePost(post))
        return str.toString()
    }
}