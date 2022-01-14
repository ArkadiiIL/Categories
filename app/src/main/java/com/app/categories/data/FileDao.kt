package com.app.categories.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FileDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFiles(vararg files: File)

    @Update
    fun updateFiles(vararg files: File)

    @Delete
    fun deleteFiles(vararg files: File)

    @Query("SELECT * FROM file_table WHERE uid = :uid")
    fun getFilesById(vararg uid: Long): LiveData<List<File>>
}