package com.example.unscramble.ui

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Word::class], version = 1)
abstract class WordDatabase : RoomDatabase(){
    abstract fun wordDao() : WordDao

    companion object{
        @Volatile
        var INSTANCE : WordDatabase? = null

        fun getInstance(applicationContext: Context) : WordDatabase{
            return INSTANCE ?: Room.databaseBuilder(
                applicationContext,
                WordDatabase::class.java,"word"
            ).build().also {
                INSTANCE = it
            }
        }
    }
}