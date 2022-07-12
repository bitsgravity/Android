package com.bits.android.root.preference

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.bits.support.location.Location

private const val KEY_LATITUDE = "latitude"
private const val KEY_LONGITUDE = "longitude"
private const val KEY_CITY = "city"
private const val KEY_DISTRICT = "district"
private const val KEY_STATE = "state"

class PreferenceProvider(context: Context) {

    private val appContext = context.applicationContext //Prevent memmory leaks

    private val preference: SharedPreferences
        get() = PreferenceManager.getDefaultSharedPreferences(appContext)

    fun setLocation(location: Location){
        val editor = preference.edit()
        editor.putString(KEY_LATITUDE,location.latitude!!.toString())
        editor.putString(KEY_LONGITUDE,location.longitude!!.toString())
        editor.putString(KEY_CITY,location.city!!.toString())
        editor.putString(KEY_DISTRICT,location.district!!.toString())
        editor.putString(KEY_STATE,location.state!!.toString())
        editor.apply()
    }

    fun getLocation() : Location {
        val location = Location()
        location.latitude = preference.getString(KEY_LATITUDE,null)?.toDouble()
        location.longitude = preference.getString(KEY_LONGITUDE,null)?.toDouble()
        location.city = preference.getString(KEY_CITY,null)
        location.district = preference.getString(KEY_DISTRICT,null)
        location.state = preference.getString(KEY_STATE,null)
        return location
    }

    fun clearLocation(){
        val editor = preference.edit()
        editor.clear()
        editor.apply()
    }
}