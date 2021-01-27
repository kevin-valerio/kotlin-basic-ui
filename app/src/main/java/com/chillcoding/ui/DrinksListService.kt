package com.chillcoding.ui

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface DrinksListService {
    @GET("/api/json/v1/1/search.php?f=c")
    fun listDrinks(): Call<DrinksList>
}