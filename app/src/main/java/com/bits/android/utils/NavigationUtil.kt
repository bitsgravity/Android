package com.bits.android.utils

import android.app.Activity
import android.content.Intent
import com.bits.support.images.ImageActivity

fun Activity.startPhotoActivity(imageUrl : String){
    val intent = Intent(this, ImageActivity::class.java)
    intent.putExtra("image_url",imageUrl)
    startActivity(intent)
}