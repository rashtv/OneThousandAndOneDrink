package com.example.drunkapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.drunkapp.Dao.DrinkDao
import com.example.drunkapp.Database.DrinkDatabase


class CocktailListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_cocktail_list, container, false)
        val db: DrinkDatabase = Room.databaseBuilder(v.context, DrinkDatabase::class.java, "Drink_DB")
            .allowMainThreadQueries()
            .build()
        val drinkDao: DrinkDao = db.drinkDao()

        val drinks = drinkDao.getAll()
        val drinkListAdapter = DrinkListAdapter(v.context, drinks)
        val layoutManager = LinearLayoutManager(v.context)
        val recyclerView: RecyclerView = v.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = drinkListAdapter

        return v
    }

    companion object
}