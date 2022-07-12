package com.bits.android.root.database.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_ROOM_ID = 0

@Entity
data class DashboardResponseEntity(
    var status: Int?,
    var limit: Int?,
    var data: List<TitleModelEntity>,
    var languages: List<LanguageModelEntity>,
    @Embedded
    var notRatedUser: NotRatedUserEntity?
){
    @PrimaryKey(autoGenerate = false)
    var dashboard_room_id: Int = CURRENT_ROOM_ID
}

@Entity
data class TitleModelEntity(
        var id: Int,
        var name: String,
        var count: Int,
        var color: String,
        var value: String,
//        @Relation(
//                parentColumn = "title_room_id",
//                entityColumn = "job_room_id"
//        )
        var contents: List<JobModelEntity>
){
    @PrimaryKey(autoGenerate = false)
    var title_room_id: Int = CURRENT_ROOM_ID
}

@Entity
data class JobModelEntity(
        val cost_status: String,
        val genres: String,
        val id: Int,
        val job_code: String,
        val language: String,
        val modified_date: String,
        val title: String
){
    @PrimaryKey(autoGenerate = false)
    var job_room_id: Int = CURRENT_ROOM_ID
}

@Entity
data class LanguageModelEntity(
        val genre: String ?=null,
        val genre_id: String ?=null,
        val language: String ?=null,
        val language_id: String ?=null,
        val parent_genre: String ?=null,
        val parent_id: Int ?=null,
        val status: String ?=null
){
    @PrimaryKey(autoGenerate = false)
    var language_room_id: Int = CURRENT_ROOM_ID
}

@Entity
data class NotRatedUserEntity(
        @SerializedName("id")
        var id: Int? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("user_name")
        var userName: String? = null
){
    @PrimaryKey(autoGenerate = false)
    var not_rated_user_room_id: Int = CURRENT_ROOM_ID
}