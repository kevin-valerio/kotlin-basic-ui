package com.chillcoding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val cocktailRecycler = findViewById<RecyclerView>(R.id.andVersionRecyclerView)
        cocktailRecycler.layoutManager = LinearLayoutManager(this)
        seedItems(cocktailRecycler)
        cocktailRecycler.setHasFixedSize(true)

    }

    private fun seedItems(cocktailRecycler: RecyclerView){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.thecocktaildb.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val service = retrofit.create(DrinksListService::class.java)
        val courseRequest = service.listDrinks()
        val items = ArrayList<Drink>()

        courseRequest.enqueue(object : Callback<DrinksList> {
            override fun onResponse(call: Call<DrinksList>, response: Response<DrinksList>) {
                val allCocktails = response.body()
                if (allCocktails != null) {
                    for (cocktail in allCocktails.drinks)
                        items += cocktail
                    cocktailRecycler.adapter = CocktailAdapter(items)
                }
            }

            override fun onFailure(call: Call<DrinksList>, t: Throwable) {
                t.message?.let { error(it) }
                t.printStackTrace()
            }
        })
    }
}