package com.app.categories.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Category::class, File::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun fileDao(): FileDao
    abstract fun categoryDao(): CategoryDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            val temInstance = INSTANCE
            if(temInstance != null) return temInstance

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "app_database").build()
                INSTANCE = instance
                return instance
            }
        }
    }
}