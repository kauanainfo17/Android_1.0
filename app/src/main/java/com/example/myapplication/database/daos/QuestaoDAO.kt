package com.example.myapplication.database.daos

import androidx.room.Dao
import androidx.room.Query
import com.example.myapplication.models.questao

@Dao
interface QuestaoDAO {
    @Query("SELECT * FROM questoes")
    fun getAll(): List<questao>

    @Query("SELECT * FROM questoes WHERE id IN (:ids)")
    fun getAllByIds(ids: IntArray): List<questao>
}