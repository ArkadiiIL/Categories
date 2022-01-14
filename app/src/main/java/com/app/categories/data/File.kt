package com.app.categories.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "file_table")
data class File(
   @PrimaryKey val uid: Long
) : Item(uid, ItemType.FILE)
