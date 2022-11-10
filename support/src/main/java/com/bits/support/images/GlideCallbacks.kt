package com.bits.support.images

import android.graphics.Bitmap
import android.graphics.drawable.Drawable

interface GlideCallbacks{
    fun onLoadFailed(errorDrawable: Drawable?)
    fun onLoadCleared(placeholder: Drawable?)
    fun onResourceReady(bitmap: Bitmap)
}