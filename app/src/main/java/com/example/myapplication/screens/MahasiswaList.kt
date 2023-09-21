package com.example.myapplication.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.Mahasiswa

@Composable
fun MahasiswaList(mahasiswaData: List<Mahasiswa>) {
    LazyColumn {
        items(mahasiswaData) { mahasiswa ->
            Text(
                text = "Nama : ${mahasiswa.name}, Umur :
                ${mahasiswa.age}, Kampus : ${mahasiswa.department}, Semester:
            $run { mahasiswa.semester }",
            modifier = Modifier.padding(16.dp)
            )
        }
    }
}
