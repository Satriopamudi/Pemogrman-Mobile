package com.example.myapplication.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.AppDatabase.Companion.getDatabase
import com.example.myapplication.model.Mahasiswa
import com.example.myapplication.model.MahasiswaDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MahasiswaViewModel(application: Application) :
    AndroidViewModel(application) {
    private val mahasiswaDao: MahasiswaDao
    private val allMahasiswa: LiveData<List<Mahasiswa>>
    init {
        val database = getDatabase(application)
        mahasiswaDao = database.mahasiswaDao()
        allMahasiswa = mahasiswaDao.getAllMahasiswa()
    }
    fun getAllMahasiswa(): LiveData<List<Mahasiswa>> {
        return allMahasiswa
    }
    fun insertMahasiswa(mahasiswa: Mahasiswa) {
        viewModelScope.launch(Dispatchers.IO) {
            mahasiswaDao.insertMahasiswa(mahasiswa)
        }
    }
}
