package com.bits.android.root.database.converters

//import androidx.room.TypeConverter
//import com.google.gson.Gson
//import com.google.gson.reflect.TypeToken
//
//class Converters {
//
//    @TypeConverter
//    fun fromData(data : List<TitleModel>): String? {
//        val type = object : TypeToken<List<TitleModel>>() {}.type
//        return Gson().toJson(data, type)
//    }
//
//    @TypeConverter
//    fun toData(dataString: String?): List<TitleModel>? {
//        val type = object : TypeToken<List<TitleModel>>() {}.type
//        return Gson().fromJson<List<TitleModel>>(dataString, type)
//    }
//
//    @TypeConverter
//    fun fromLanguages(data : List<LanguageModel>): String? {
//        val type = object : TypeToken<List<LanguageModel>>() {}.type
//        return Gson().toJson(data, type)
//    }
//
//    @TypeConverter
//    fun toLanguages(dataString: String?): List<LanguageModel>? {
//        val type = object : TypeToken<List<LanguageModel>>() {}.type
//        return Gson().fromJson<List<LanguageModel>>(dataString, type)
//    }
//
//    @TypeConverter
//    fun fromNotRatedUser(data : NotRatedUser?): String? {
//        val type = object : TypeToken<NotRatedUser?>() {}.type
//        return Gson().toJson(data, type)
//    }
//
//    @TypeConverter
//    fun toNotRatedUser(dataString: String?): NotRatedUser?? {
//        val type = object : TypeToken<NotRatedUser?>() {}.type
//        return Gson().fromJson<NotRatedUser?>(dataString, type)
//    }
//
//}