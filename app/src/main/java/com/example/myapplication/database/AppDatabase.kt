package com.example.myapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.database.daos.QuestaoDAO
import com.example.myapplication.models.questao

@Database(entities = [questao::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun questaoDao(): QuestaoDAO
}