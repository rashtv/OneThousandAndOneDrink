package com.example.drunkapp.Interface

import com.example.drunkapp.Model.Drink
import com.example.drunkapp.Model.Drinks
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {
    @GET("")
    fun getDrinks(): Call<List<Drink>>

    @GET("search.php?")
    fun getDrinkByName(@Query("s") strDrink: String): Call<Drinks>
}