package com.travelands.pemesanantiket.database

import androidx.room.Database
import com.travelands.pemesanantiket.model.ModelDatabase
import androidx.room.RoomDatabase
import com.travelands.pemesanantiket.database.dao.DatabaseDao

@Database(entities = [ModelDatabase::class], version = 3, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}