package com.bngs0.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bngs0.kotlinmaps.model.Place

@Database(entities = [Place::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}