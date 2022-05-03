package com.example.drunkapp.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Drinks")
data class DrinkData(
    @PrimaryKey var idDrink: String,
    @ColumnInfo(name = "Name") var strDrink: String? = null,
    @ColumnInfo(name = "Category") var strCategory: String? = null,
    @ColumnInfo(name = "Alcoholic") var strAlcoholic: String? = null,
    @ColumnInfo(name = "Instruction") var strInstructions: String? = null,
    @ColumnInfo(name = "First Ingredient") var strIngredient1: String? = null,
    @ColumnInfo(name = "Second Ingredient") var strIngredient2: String? = null,
    @ColumnInfo(name = "Third Ingredient") var strIngredient3: String? = null,
    @ColumnInfo(name = "Fourth Ingredient") var strIngredient4: String? = null,
    @ColumnInfo(name = "Fifth Ingredient") var strIngredient5: String? = null,
    @ColumnInfo(name = "Sixth Ingredient") var strIngredient6: String? = null,
    @ColumnInfo(name = "Seventh Ingredient") var strIngredient7: String? = null,
    @ColumnInfo(name = "Eighth Ingredient") var strIngredient8: String? = null,
    @ColumnInfo(name = "Ninth Ingredient") var strIngredient9: String? = null,
    @ColumnInfo(name = "Tenth Ingredient") var strIngredient10: String? = null,
    @ColumnInfo(name = "Eleventh Ingredient") var strIngredient11: String? = null,
    @ColumnInfo(name = "Twelfth Ingredient") var strIngredient12: String? = null,
    @ColumnInfo(name = "Thirteenth Ingredient") var strIngredient13: String? = null,
    @ColumnInfo(name = "Fourteenth Ingredient") var strIngredient14: String? = null,
    @ColumnInfo(name = "Fifteen Ingredient") var strIngredient15: String? = null,
    @ColumnInfo(name = "First Measure") var strMeasure1: String? = null,
    @ColumnInfo(name = "Second Measure") var strMeasure2: String? = null,
    @ColumnInfo(name = "Third Measure") var strMeasure3: String? = null,
    @ColumnInfo(name = "Fourth Measure") var strMeasure4: String? = null,
    @ColumnInfo(name = "Fifth Measure") var strMeasure5: String? = null,
    @ColumnInfo(name = "Sixth Measure") var strMeasure6: String? = null,
    @ColumnInfo(name = "Seventh Measure") var strMeasure7: String? = null,
    @ColumnInfo(name = "Eighth Measure") var strMeasure8: String? = null,
    @ColumnInfo(name = "Ninth Measure") var strMeasure9: String? = null,
    @ColumnInfo(name = "Tenth Measure") var strMeasure10: String? = null,
    @ColumnInfo(name = "Eleventh Measure") var strMeasure11: String? = null,
    @ColumnInfo(name = "Twelfth Measure") var strMeasure12: String? = null,
    @ColumnInfo(name = "Thirteenth Measure") var strMeasure13: String? = null,
    @ColumnInfo(name = "Fourteenth Measure") var strMeasure14: String? = null,
    @ColumnInfo(name = "Fifteenth Measure") var strMeasure15: String? = null,
    @ColumnInfo(name = "Image") var strDrinkThumb: String? = null,
)
