package com.macedos.whatsapp.model

import android.graphics.Bitmap

data class StatusContact (
    var image: Bitmap? = null,
    val name: String,
    val description: String
    )
