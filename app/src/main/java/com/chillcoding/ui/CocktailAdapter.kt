package com.chillcoding.ui

import android.net.Uri
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import splitties.toast.toast

class CocktailAdapter(private val items: List<Drink>) :
    RecyclerView.Adapter<CocktailAdapter.ViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_and_version))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]

        holder.imageThumbnail.setImageURI(Uri.parse(currentItem.strDrinkThumb))
        holder.typeGlass.text = currentItem.strGlass
        holder.ingredients.text =
            "With " + currentItem.strIngredient1 + " and " + currentItem.strIngredient2
        holder.imageThumbnail.setOnClickListener {
            holder.imageThumbnail.context.toast(
                "Ingrédients : " +
                        currentItem.strIngredient1 + " and " + currentItem.strIngredient2
            )
        }
    }

    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageThumbnail: ImageView = view.findViewById(R.id.imageThumbnail)
        val typeGlass: TextView = view.findViewById(R.id.typeGlass)
        val ingredients: TextView = view.findViewById(R.id.ingredients)
    }
}