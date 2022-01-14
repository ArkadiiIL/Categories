package com.app.categories.data

import androidx.lifecycle.LiveData

class FileRepository(private val fileDao: FileDao) {
    suspend fun insertFiles(vararg files: File) = fileDao.insertFiles(*files)
    suspend fun updateFiles(vararg files: File) = fileDao.insertFiles(*files)
    suspend fun deleteFiles(vararg files: File) = fileDao.deleteFiles(*files)

    fun getFilesById(vararg uid: Long): LiveData<List<File>> = fileDao.getFilesById(*uid)
}