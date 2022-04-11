package com.devanshu.todoapp20.data.models

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao():ToDoDao

}