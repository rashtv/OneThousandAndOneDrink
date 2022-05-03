package com.example.drunkapp.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.drunkapp.Dao.DrinkDao
import com.example.drunkapp.Model.DrinkData

@Database(entities = [DrinkData::class], version = 1)
abstract class DrinkDatabase: RoomDatabase() {
    abstract fun drinkDao(): DrinkDao
}