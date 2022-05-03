package com.example.drunkapp.Common

import com.example.drunkapp.Interface.RetrofitService
import com.example.drunkapp.Retrofit.RetrofitClient

object Common {
    private const val BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1/"
    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}