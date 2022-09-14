package com.bits.support

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
import android.os.Environment
import android.os.Handler
import android.text.format.DateFormat
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.FileProvider
import androidx.fragment.app.FragmentActivity
import com.bits.support.views.hide
import com.bits.support.views.show
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern

fun disableNightMode() {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
}

fun View.clearData(){
    clearData(this.context,this)
}

fun clearData(context: Context, view : View) {
    try {
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val child = view.getChildAt(i)
                clearData(context,view)
            }
        } else if (view is TextView) {
            view.text = ""
        } else if (view is ImageView){
            view.setImageResource(0)
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun now(dateFormat: String) : String{
    val sdf = SimpleDateFormat(dateFormat)
    val currentDate = sdf.format(Date())
    return currentDate
}

fun FragmentActivity.fullScreen(isFullScreen: Boolean){
    if (isFullScreen){
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }
}

fun nightMode(isNightMode: Boolean) {
    if (isNightMode){
    } else {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}

fun shareScreenshot(view: View,filename: String, message: String){
    val screenshotFile = takeScreenshot(view,filename)
    screenshotFile?.let {
        view.context?.let {
            shareImage(it,screenshotFile,message)
        }
    }
}

private fun shareImage(context: Context, shareImage: File, shareText : String) {
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

fun takeScreenshot(view: View, filename: String): File? {
    val date = Date()

    // Here we are initialising the format of our image name
    val format: CharSequence = DateFormat.format("yyyy-MM-dd_hh:mm:ss", date)
    try {
        // Initialising the directory of storage
        val dirpath: String = Environment.getExternalStorageDirectory().toString() + "/Filmibeat/$filename/"
        val file = File(dirpath)
        if (!file.exists()) {
            val mkdir: Boolean = file.mkdir()
        }

        // File name
//        val path = "${dirpath}/Filmibeat/${filename}_${now("yyyyMMdd_hhmmss")}.jpeg"

        val path = "$dirpath/${filename}_${now("yyyyMMdd_hhmmss")}.jpeg"

        view.isDrawingCacheEnabled = true
        val bitmap: Bitmap = Bitmap.createBitmap(view.drawingCache)
        view.isDrawingCacheEnabled = false
        val imageFile = File(path)
        val outputStream = FileOutputStream(imageFile)
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, outputStream)
        outputStream.flush()
        outputStream.close()
        return imageFile
    } catch (io: FileNotFoundException) {
        io.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return null
}

// slide the view from below itself to the current position
fun slideUp(view: View) {
    view.visibility = View.VISIBLE
    val animate = TranslateAnimation(
        0f,  // fromXDelta
        0f,  // toXDelta
        view.height.toFloat(),  // fromYDelta
        0f
    ) // toYDelta
    animate.duration = 500
    animate.fillAfter = true
    view.startAnimation(animate)
}


// slide the view from its current position to below itself
fun slideDown(view: View) {
    val animate = TranslateAnimation(
        0f,  // fromXDelta
        0f,  // toXDelta
        0f,  // fromYDelta
        view.height.toFloat()
    ) // toYDelta
    animate.duration = 500
    animate.fillAfter = true
    view.startAnimation(animate)
}

fun String.extractYoutubeVideoId(): String? {
    var vId: String? = null
    val pattern: Pattern = Pattern.compile(
        "^https?://.*(?:youtu.be/|v/|u/\\w/|embed/|watch?v=)([^#&?]*).*$",
        Pattern.CASE_INSENSITIVE
    )
    val matcher: Matcher = pattern.matcher(this)
    if (matcher.matches()) {
        vId = matcher.group(1)
    }
    return vId
}

fun String.removeStartingSlash() : String {
    return removePrefix("/")
}

fun CharSequence.countWords() : Int {
    val sentence = this.toString().trim()
//    sentence.split("\\s+").first().length

    //Split String by Space
    val strArray = sentence.split(" ".toRegex()).toTypedArray() // Spilt String by Space
    var count = 0

    //iterate String array
    for (s in strArray) {
        if (s != "") {
            count++
        }
    }

    return count
}

fun String?.checkAvailability() : String {
    return if (this.isNullOrEmpty()) {
        "Not Available"
    } else {
        this
    }
}

fun String?.checkAvailability(notAvailbaleWord : String) : String {
    this?.let {
        return it
    }
    return notAvailbaleWord
}

fun String.removeSquareBrackets() : String {
    return this.replace("\\[".toRegex(), "").replace("\\]".toRegex(), "")
}

fun FragmentActivity.setLightStatusBar(statusBarColor: Int,navigationBarColor: Int){
    setLightStatusBar(this,statusBarColor,navigationBarColor)
}
fun setLightStatusBar(activity: Activity, statusBarColor: Int,navigationBarColor: Int) {
    setLightStatusBar(activity)
    activity.window.statusBarColor = statusBarColor
    activity.window.navigationBarColor = navigationBarColor
}

fun FragmentActivity.setLightStatusBar(){
    setLightStatusBar(this)
}
fun setLightStatusBar(activity: Activity) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        var flags = activity.window.decorView.systemUiVisibility // get current flag
        flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // add LIGHT_STATUS_BAR to flag
        activity.window.decorView.systemUiVisibility = flags

        //                window.setFlags(
//                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        //                window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }
}

fun FragmentActivity.removeLightStatusBar(statusBarColor: Int, navigationBarColor: Int) {
    removeLightStatusBar(this,statusBarColor,navigationBarColor)
}
fun removeLightStatusBar(activity: Activity, statusBarColor: Int, navigationBarColor: Int){
    removeLightStatusBar(activity)
    activity.window.statusBarColor = statusBarColor
    activity.window.navigationBarColor = navigationBarColor
}

fun FragmentActivity.removeLightStatusBar(){
    removeLightStatusBar(this)
}
fun removeLightStatusBar(activity: Activity) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        var flags = activity.window.decorView.systemUiVisibility // get current flag
        flags =
            flags xor View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // use XOR here for remove LIGHT_STATUS_BAR from flags
        activity.window.decorView.systemUiVisibility = flags
    }
}

fun show(views: List<View>) {
    views.forEach {
        it.show()
    }
}

fun hide(views: List<View>) {
    views.forEach {
        it.hide()
    }
}

fun FragmentActivity.delay(delay : Long, callback : () -> Unit) {
    Handler().postDelayed({
        callback()
    }, delay)
}

fun FragmentActivity.delay(callback : () -> Unit) {
    Handler().postDelayed({
        callback()
    }, 1500)
}

fun View.toggleVisibility(){
    if (visibility == View.VISIBLE){
        hide()
    } else {
        show()
    }
}