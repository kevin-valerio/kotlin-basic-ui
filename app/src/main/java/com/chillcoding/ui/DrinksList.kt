package com.chillcoding.ui


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DrinksList {
    @SerializedName("drinks")
    @Expose
    var drinks: List<Drink> = emptyList()
}