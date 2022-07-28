package com.example.patterns.presentation.decorator

class MessengerDecorator(
    private val facebookMessenger: FacebookMessenger? = null,
    private val telegramMessenger: TelegramMessenger? = null,
    private val snapChatMessenger: SnapChatMessenger? = null
) : Messenger {

    override fun sendMessage(message: String): String {
        val str = StringBuilder()
        facebookMessenger?.let {
            str.append(it.sendMessage(message))
        }
        telegramMessenger?.let {
            str.append(it.sendMessage(message))
        }
        snapChatMessenger?.let {
            str.append(it.sendMessage(message))
        }
        return str.toString()
    }

    override fun sendImage(imageId: Int): String {
        val str = StringBuilder()
        facebookMessenger?.let {
            str.append(it.sendImage(imageId))
        }
        telegramMessenger?.let {
            str.append(it.sendImage(imageId))
        }
        snapChatMessenger?.let {
            str.append(it.sendImage(imageId))
        }
        return str.toString()
    }

    override fun makePost(post: String): String {
        val str = StringBuilder()
        facebookMessenger?.let {
            str.append(it.makePost(post))
        }
        telegramMessenger?.let {
            str.append(it.makePost(post))
        }
        snapChatMessenger?.let {
            str.append(it.makePost(post))
        }
        return str.toString()
    }
}