package com.macedos.whatsapp.model

import android.graphics.Bitmap

data class Contact(
    var image: Bitmap? = null,
    val name: String,
    val lastMessage: String,
    val hourMessage: String
)