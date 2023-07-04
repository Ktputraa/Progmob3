package com.travelands.pemesanantiket.database.dao

import androidx.room.Dao
import androidx.lifecycle.LiveData
import androidx.room.Insert
import com.travelands.pemesanantiket.model.ModelDatabase
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DatabaseDao {
    @Query( value = "SELECT * FROM tbl_travel")
    fun getAllData(): LiveData<List<ModelDatabase>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(vararg modelDatabases: ModelDatabase)

    @Query( value = "DELETE FROM tbl_travel WHERE uid= :uid")
    fun deleteDataById(uid: Int)
}