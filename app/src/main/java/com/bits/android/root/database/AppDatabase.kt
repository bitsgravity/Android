package com.bits.android.root.database

//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import androidx.room.TypeConverters
//import com.bits.android.base.database.converters.Converters
//import com.bits.android.base.database.daos.DashboardDao
//
//@Database(entities = [::class], version = 4)
//@TypeConverters(Converters::class)
//abstract class AppDatabase : RoomDatabase() {
//
//    abstract fun getDashboardDao(): DashboardDao
//
//    companion object {
//
//        @Volatile
//        private var instance: AppDatabase? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
//            instance ?: buildDatabase(context).also {
//                instance = it
//            }
//        }
//
//        private fun buildDatabase(context: Context) =
//            Room.databaseBuilder(
//                context.applicationContext,
//                AppDatabase::class.java,
//                "AppDatabase.db"
//            )
//                    .fallbackToDestructiveMigration()
//                    .build()
//    }
//}
