package com.app.categories.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategories(vararg categories: Category)

    @Update
    fun updateCategories(vararg categories: Category)

    @Delete
    fun deleteCategories(vararg categories: Category)

    @Query("SELECT * FROM category_table WHERE uid = :uid")
    fun getCategoriesById(vararg uid: Long): LiveData<List<Category>>
}