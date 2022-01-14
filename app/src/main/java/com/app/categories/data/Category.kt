package com.app.categories.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "category_table")
data class Category(
  @PrimaryKey val uid: Long
): Item(uid, ItemType.CATEGORY)
