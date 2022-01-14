package com.app.categories.data

class CategoryRepository(private val categoryDao: CategoryDao) {
    suspend fun insertCategories(vararg categories: Category) =
        categoryDao.insertCategories(*categories)
    suspend fun updateCategories(vararg categories: Category) =
        categoryDao.updateCategories(*categories)
    suspend fun deleteCategories(vararg categories: Category) =
        categoryDao.deleteCategories(*categories)

    fun getCategoriesById(vararg uid: Long) =
        categoryDao.getCategoriesById(*uid)
}