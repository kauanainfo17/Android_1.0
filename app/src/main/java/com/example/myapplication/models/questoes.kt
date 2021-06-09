package com.example.myapplication.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questoes")
data class questao(
    var questao: String,
    var res1: String,
    var res2: String,
    var res3: String,
    var res4: String

    ) {
        @PrimaryKey(autoGenerate = true)
        var id: Long? = null
}