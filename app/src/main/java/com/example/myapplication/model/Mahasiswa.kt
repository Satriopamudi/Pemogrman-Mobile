package com.example.myapplication.model
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mahasiswaData")
data class Mahasiswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val age: Int,
    val department: String,
    val semester: Int
)
