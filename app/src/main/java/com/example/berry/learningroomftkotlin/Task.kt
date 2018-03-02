package com.example.berry.learningroomftkotlin

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by per6 on Mar 02, 2018 at 13:44
 */
@Entity(tableName = "tasks")
data class Task(@ColumnInfo(name = "completed_flag") var completed: Boolean = false,
                @ColumnInfo(name = "task_description") var description: String){
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}