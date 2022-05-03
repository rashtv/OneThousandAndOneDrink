package com.example.drunkapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.drunkapp.Model.DrinkData

class DrinkListAdapter(private val context: Context, private val drinkList: List<DrinkData>):
    RecyclerView.Adapter<DrinkListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(itemView, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = drinkList[position]
        val savedCocktailDetailFragment = SavedCocktailDetailFragment()
        holder.textId.text = listItem.idDrink
        holder.textName.text = listItem.strDrink.toString()

        holder.itemView.setOnClickListener { v->
            val activity = v.context as AppCompatActivity
            val bundle = Bundle()
            bundle.putInt("idInDb", position)
            savedCocktailDetailFragment.arguments = bundle
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.main, savedCocktailDetailFragment)
                .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return drinkList.size
    }

    class ViewHolder(itemView: View, context: Context): RecyclerView.ViewHolder(itemView) {
        val textId: TextView = itemView.findViewById(R.id.textview_drink_id)
        val textName: TextView = itemView.findViewById(R.id.textview_drink_name)

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, textName.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}