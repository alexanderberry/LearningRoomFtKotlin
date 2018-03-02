package com.example.berry.learningroomftkotlin

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by per6 on Mar 02, 2018 at 13:53
 */
@Module
class AppModule(private val context: Context){
    @Provides fun providesAppContext() = context

    @Provides fun providesAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "my-todo-db").allowMainThreadQueries().build()

    @Provides fun providesToDao(database: AppDatabase) = database.taskDao()
}