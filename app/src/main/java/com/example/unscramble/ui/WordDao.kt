package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {
    @Query("SELECT * FROM words" )
    suspend fun getAllWord(): List<Word>

    @Insert
    suspend fun insert(vararg word: Word)
}