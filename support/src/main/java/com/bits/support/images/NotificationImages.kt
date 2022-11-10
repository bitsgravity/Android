package com.bits.support.images

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

class NotificationImages(
    val backgroundImage: String?
) {

    data class Builder(
        var backgroundImage: String? = null
    ) {
        fun backgroundImage(backgroundImage: String) = apply { this.backgroundImage = backgroundImage }
        fun build() = NotificationImages(backgroundImage)
    }
}

fun Context.loadNotificationImages(imageUrl: String, glideCallbacks: GlideCallbacks) {
    Glide.with(this)
        .asBitmap()
        .load(imageUrl)
        .timeout(30000)
        .into(object : CustomTarget<Bitmap?>() {
            override fun onLoadFailed(errorDrawable: Drawable?) {
                super.onLoadFailed(errorDrawable)
                glideCallbacks.onLoadFailed(errorDrawable)
            }

            override fun onLoadCleared(placeholder: Drawable?) {
                glideCallbacks.onLoadCleared(placeholder)
            }

            override fun onResourceReady(
                bitmap: Bitmap,
                transition: Transition<in Bitmap?>?
            ) {
                glideCallbacks.onResourceReady(bitmap)
            }
        })
}
