package com.example.berry.learningroomftkotlin

import android.arch.persistence.room.*
import android.arch.persistence.room.OnConflictStrategy.REPLACE

/**
 * Created by per6 on Mar 02, 2018 at 13:49
 */
@Dao
interface TaskDao {
    @Query("select * from tasks")
    fun getAllTasks(): List<Task>

    @Query("select * from tasks where id = :p0")
    fun findTaskById(id: Long): Task

    @Insert(onConflict = REPLACE)
    fun insertTask(task: Task)

    @Update(onConflict = REPLACE)
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)
}