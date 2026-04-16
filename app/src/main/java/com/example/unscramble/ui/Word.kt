package com.example.unscramble.ui

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
data class Word(
    @PrimaryKey(autoGenerate = true)
    val index: Int = 0,
    val kata: String? = null
)
