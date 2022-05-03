package com.example.drunkapp.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.drunkapp.Model.DrinkData

@Dao
interface DrinkDao {
    @Query("SELECT * FROM Drinks")
    fun getAll(): List<DrinkData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(drink: DrinkData)
}