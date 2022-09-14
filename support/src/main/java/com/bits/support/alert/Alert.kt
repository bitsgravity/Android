package com.bits.support.alert

//import android.app.AlertDialog
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.core.view.isVisible
//import androidx.fragment.app.FragmentActivity
//import com.bits.support.R
//import com.bits.support.sync.toggleVisibility
//import com.bits.support.views.hide
//import com.bits.support.views.show
//import java.io.IOException
//
//fun FragmentActivity.noInternetAlert(callback: (Alert) -> Unit){
//    noInternetAlert(this){
//        when(it){
//            Alert.TRY_AGAIN -> {
//                callback(Alert.TRY_AGAIN)
//            }
//            Alert.QUIT -> {
//                callback(Alert.QUIT)
//            }
//        }
//    }
//}
//
//fun noInternetAlert(context: Context, callback : (Alert) -> Unit) {
//    val dialogBuilder = AlertDialog.Builder(context).create()
//    val inflater: LayoutInflater = LayoutInflater.from(context)
//
//    val dialogView: View = inflater.inflate(R.layout.dialog_alert_no_internet, null)
//    dialogView.setBackgroundColor(context.resources.getColor(android.R.color.transparent))
//
//    val positive: Button = dialogView.findViewById(R.id.id_positive) as Button
//    val negative: Button = dialogView.findViewById(R.id.id_negative) as Button
//
//    positive.setOnClickListener {
//        dialogBuilder.dismiss()
//        callback(Alert.TRY_AGAIN)
//    }
//
//    negative.setOnClickListener {
//        dialogBuilder.dismiss()
//        callback(Alert.QUIT)
//    }
//
//    dialogBuilder.setView(dialogView)
//    dialogBuilder.setCancelable(false)
//    dialogBuilder.show()
//}
//
//fun FragmentActivity.somethingWentWrongAlert(exception: Exception,callback: (Alert) -> Unit){
//    somethingWentWrongAlert(this,exception){
//        when(it){
//            Alert.TRY_AGAIN -> {
//                callback(Alert.TRY_AGAIN)
//            }
//            Alert.QUIT -> {
//                callback(Alert.QUIT)
//            }
//        }
//    }
//}
//
//fun somethingWentWrongAlert(context: Context, exception: Exception, callback : (Alert) -> Unit) {
//    val dialogBuilder = AlertDialog.Builder(context).create()
//    val inflater: LayoutInflater = LayoutInflater.from(context)
//
//    val dialogView: View = inflater.inflate(R.layout.dialog_something_went_wrong_alert, null)
//    dialogView.setBackgroundColor(context.resources.getColor(android.R.color.transparent))
//
//    val positive: Button = dialogView.findViewById(R.id.id_positive) as Button
//    val negative: Button = dialogView.findViewById(R.id.id_negative) as Button
//
//    val image : ImageView = dialogView.findViewById(R.id.id_logo_image) as ImageView
//    val reason : TextView = dialogView.findViewById(R.id.id_reason) as TextView
//
//    reason.text = exception.toString()
//
//    image.setOnClickListener {
//        reason.toggleVisibility()
//    }
//    positive.setOnClickListener {
//        dialogBuilder.dismiss()
//        callback(Alert.TRY_AGAIN)
//    }
//
//    negative.setOnClickListener {
//        dialogBuilder.dismiss()
//        callback(Alert.QUIT)
//    }
//
//    dialogBuilder.setView(dialogView)
//    dialogBuilder.setCancelable(false)
//    dialogBuilder.show()
//}
//
//enum class Alert {
//    TRY_AGAIN,
//    QUIT
//}