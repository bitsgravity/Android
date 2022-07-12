package com.bits.android.root.database.daos

//import androidx.lifecycle.LiveData
//import androidx.room.*
//import com.bits.android.base.database.entities.CURRENT_ROOM_ID
//
//@Dao
//interface DashboardDao {
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun saveDashboard(dashboardResponse: DashboardResponse)
//
//    @Transaction
//    @Query("SELECT * FROM DashboardResponse WHERE dashboard_room_id = $CURRENT_ROOM_ID")
//    fun getDashboard() : LiveData<DashboardResponse>
//
//    @Query("DELETE FROM DashboardResponse")
//    fun clear()
//}