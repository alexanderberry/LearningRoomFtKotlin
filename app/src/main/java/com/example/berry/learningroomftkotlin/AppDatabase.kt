package com.example.berry.learningroomftkotlin

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by per6 on Mar 02, 2018 at 13:52
 */
@Database(entities = arrayOf(Task::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}