package com.chillcoding.ui

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Drink(
    @SerializedName("idDrink")
    @Expose
    var idDrink: String,

    @SerializedName("strDrink")
    @Expose
    var strDrink: String,

    @SerializedName("strDrinkAlternate")
    @Expose
    var strDrinkAlternate: Any,

    @SerializedName("strDrinkES")
    @Expose
    var strDrinkES: Any,

    @SerializedName("strDrinkDE")
    @Expose
    var strDrinkDE: Any,

    @SerializedName("strDrinkFR")
    @Expose
    var strDrinkFR: Any,

    @SerializedName("strDrinkZH-HANS")
    @Expose
    var strDrinkZHHANS: Any,

    @SerializedName("strDrinkZH-HANT")
    @Expose
    var strDrinkZHHANT: Any,

    @SerializedName("strTags")
    @Expose
    var strTags: Any,

    @SerializedName("strVideo")
    @Expose
    var strVideo: Any,

    @SerializedName("strCategory")
    @Expose
    var strCategory: String,

    @SerializedName("strIBA")
    @Expose
    var strIBA: Any,

    @SerializedName("strAlcoholic")
    @Expose
    var strAlcoholic: String,

    @SerializedName("strGlass")
    @Expose
    var strGlass: String,

    @SerializedName("strInstructions")
    @Expose
    var strInstructions: String,

    @SerializedName("strInstructionsES")
    @Expose
    var strInstructionsES: Any,

    @SerializedName("strInstructionsDE")
    @Expose
    var strInstructionsDE: String,

    @SerializedName("strInstructionsFR")
    @Expose
    var strInstructionsFR: Any,

    @SerializedName("strInstructionsZH-HANS")
    @Expose
    var strInstructionsZHHANS: Any,

    @SerializedName("strInstructionsZH-HANT")
    @Expose
    var strInstructionsZHHANT: Any,

    @SerializedName("strDrinkThumb")
    @Expose
    var strDrinkThumb: String,

    @SerializedName("strIngredient1")
    @Expose
    var strIngredient1: String,

    @SerializedName("strIngredient2")
    @Expose
    var strIngredient2: String,

    @SerializedName("strIngredient3")
    @Expose
    var strIngredient3: String,

    @SerializedName("strIngredient4")
    @Expose
    var strIngredient4: Any,

    @SerializedName("strIngredient5")
    @Expose
    var strIngredient5: Any,

    @SerializedName("strIngredient6")
    @Expose
    var strIngredient6: Any,

    @SerializedName("strIngredient7")
    @Expose
    var strIngredient7: Any,

    @SerializedName("strIngredient8")
    @Expose
    var strIngredient8: Any,

    @SerializedName("strIngredient9")
    @Expose
    var strIngredient9: Any,

    @SerializedName("strIngredient10")
    @Expose
    var strIngredient10: Any,

    @SerializedName("strIngredient11")
    @Expose
    var strIngredient11: Any,

    @SerializedName("strIngredient12")
    @Expose
    var strIngredient12: Any,

    @SerializedName("strIngredient13")
    @Expose
    var strIngredient13: Any,

    @SerializedName("strIngredient14")
    @Expose
    var strIngredient14: Any,

    @SerializedName("strIngredient15")
    @Expose
    var strIngredient15: Any,

    @SerializedName("strMeasure1")
    @Expose
    var strMeasure1: String,

    @SerializedName("strMeasure2")
    @Expose
    var strMeasure2: String,

    @SerializedName("strMeasure3")
    @Expose
    var strMeasure3: Any,

    @SerializedName("strMeasure4")
    @Expose
    var strMeasure4: Any,

    @SerializedName("strMeasure5")
    @Expose
    var strMeasure5: Any,

    @SerializedName("strMeasure6")
    @Expose
    var strMeasure6: Any,

    @SerializedName("strMeasure7")
    @Expose
    var strMeasure7: Any,

    @SerializedName("strMeasure8")
    @Expose
    var strMeasure8: Any,

    @SerializedName("strMeasure9")
    @Expose
    var strMeasure9: Any,

    @SerializedName("strMeasure10")
    @Expose
    var strMeasure10: Any,

    @SerializedName("strMeasure11")
    @Expose
    var strMeasure11: Any,

    @SerializedName("strMeasure12")
    @Expose
    var strMeasure12: Any,

    @SerializedName("strMeasure13")
    @Expose
    var strMeasure13: Any,

    @SerializedName("strMeasure14")
    @Expose
    var strMeasure14: Any,

    @SerializedName("strMeasure15")
    @Expose
    var strMeasure15: Any,

    @SerializedName("strImageSource")
    @Expose
    var strImageSource: Any,

    @SerializedName("strImageAttribution")
    @Expose
    var strImageAttribution: Any,

    @SerializedName("strCreativeCommonsConfirmed")
    @Expose
    var strCreativeCommonsConfirmed: String,

    @SerializedName("dateModified")
    @Expose
    var dateModified: String
)