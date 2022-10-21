package com.bits.support.share

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.core.content.FileProvider
import com.bits.support.images.screenshot
import java.io.File

fun shareScreenshot(view: View, filename: String, message: String){
    val screenshotFile = screenshot(view,filename)
    screenshotFile?.let {
        view.context?.let {
            shareImage(it,screenshotFile,message)
        }
    }
}

fun shareImage(context: Context, shareImage: File, shareText : String) {
    val intent = Intent()
    intent.action = Intent.ACTION_SEND
    intent.type = "image/*"
    val shareImageUri = FileProvider.getUriForFile(
        context,
        context.applicationContext.packageName.toString() + ".provider",
        shareImage
    )
    intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
    intent.putExtra(Intent.EXTRA_STREAM, shareImageUri)
    intent.putExtra(Intent.EXTRA_TEXT, shareText)
    context.startActivity(Intent.createChooser(intent, "Share Image"))
}