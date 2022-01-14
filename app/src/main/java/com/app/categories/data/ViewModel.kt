package com.app.categories.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViewModel(application: Application): AndroidViewModel(application) {
    private val fileRepository: FileRepository
    private val categoryRepository: CategoryRepository

    init {
        val appDatabase = AppDatabase.getInstance(application)
        fileRepository = FileRepository(appDatabase.fileDao())
        categoryRepository = CategoryRepository(appDatabase.categoryDao())
    }

    fun addCategories(vararg categories: Category) {
        viewModelScope.launch(Dispatchers.IO) {
            categoryRepository.insertCategories(*categories)
        }
    }
    fun updateCategories(vararg categories: Category) {
        viewModelScope.launch(Dispatchers.IO) {
            categoryRepository.updateCategories(*categories)
        }
    }
    fun deleteCategories(vararg categories: Category) {
        viewModelScope.launch(Dispatchers.IO) {
            categoryRepository.deleteCategories(*categories)
        }
    }
    fun addFiles(vararg files: File) {
        viewModelScope.launch(Dispatchers.IO) {
            fileRepository.insertFiles(*files)
        }
    }
    fun updateFiles(vararg files: File) {
        viewModelScope.launch(Dispatchers.IO) {
            fileRepository.updateFiles(*files)
        }
    }
    fun deleteFiles(vararg files: File) {
        viewModelScope.launch(Dispatchers.IO) {
            fileRepository.deleteFiles(*files)
        }
    }
}