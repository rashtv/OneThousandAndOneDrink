package com.example.drunkapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.drunkapp.Dao.DrinkDao
import com.example.drunkapp.Database.DrinkDatabase

class SavedCocktailDetailFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments.let { }
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_saved_cocktail_detail, container, false)

        val drinkName: TextView = v.findViewById(R.id.saved_tv_drink_name)
        val drinkCategory: TextView = v.findViewById(R.id.saved_tv_drink_category)
        val drinkIngredient1: TextView = v.findViewById(R.id.saved_ingredient_1)
        val drinkIngredient2: TextView = v.findViewById(R.id.saved_ingredient_2)
        val drinkIngredient3: TextView = v.findViewById(R.id.saved_ingredient_3)
        val drinkIngredient4: TextView = v.findViewById(R.id.saved_ingredient_4)
        val drinkIngredient5: TextView = v.findViewById(R.id.saved_ingredient_5)
        val drinkIngredient6: TextView = v.findViewById(R.id.saved_ingredient_6)
        val drinkIngredient7: TextView = v.findViewById(R.id.saved_ingredient_7)
        val drinkIngredient8: TextView = v.findViewById(R.id.saved_ingredient_8)
        val drinkIngredient9: TextView = v.findViewById(R.id.saved_ingredient_9)
        val drinkIngredient10: TextView = v.findViewById(R.id.saved_ingredient_10)
        val drinkIngredient11: TextView = v.findViewById(R.id.saved_ingredient_11)
        val drinkIngredient12: TextView = v.findViewById(R.id.saved_ingredient_12)
        val drinkIngredient13: TextView = v.findViewById(R.id.saved_ingredient_13)
        val drinkIngredient14: TextView = v.findViewById(R.id.saved_ingredient_14)
        val drinkIngredient15: TextView = v.findViewById(R.id.saved_ingredient_15)
        val drinkInstruction: TextView = v.findViewById(R.id.saved_drink_instruction)

        val args = arguments
        val id: Int = args?.get("idInDb") as Int

        val db: DrinkDatabase = Room.databaseBuilder(v.context, DrinkDatabase::class.java, "Drink_DB")
            .allowMainThreadQueries()
            .build()
        val drinkDao: DrinkDao = db.drinkDao()

        val theDrink = drinkDao.getAll()[id]

        drinkName.text = theDrink.strDrink
        drinkCategory.text = theDrink.strCategory.toString()

        if (!theDrink.strIngredient1.equals("null"))
            drinkIngredient1.text = theDrink.strIngredient1.toString() +
                    " " + theDrink.strMeasure1.toString()

        if (!theDrink.strIngredient2.equals("null"))
            drinkIngredient2.text = theDrink.strIngredient2.toString() +
                    " " + theDrink.strMeasure2.toString()

        if (!theDrink.strIngredient3.equals("null"))
            drinkIngredient3.text = theDrink.strIngredient3.toString() +
                    " " + theDrink.strMeasure3.toString()

        if (!theDrink.strIngredient4.equals("null"))
            drinkIngredient4.text = theDrink.strIngredient4.toString() +
                    " " + theDrink.strMeasure4.toString()

        if (!theDrink.strIngredient5.equals("null"))
            drinkIngredient5.text = theDrink.strIngredient5.toString() +
                    " " + theDrink.strMeasure5.toString()

        if (!theDrink.strIngredient6.equals("null"))
            drinkIngredient6.text = theDrink.strIngredient6.toString() +
                    " " + theDrink.strMeasure6.toString()

        if (!theDrink.strIngredient7.equals("null"))
            drinkIngredient7.text = theDrink.strIngredient7.toString() +
                    " " + theDrink.strMeasure7.toString()

        if (!theDrink.strIngredient8.equals("null"))
            drinkIngredient8.text = theDrink.strIngredient8.toString() +
                    " " + theDrink.strMeasure8.toString()

        if (!theDrink.strIngredient9.equals("null"))
            drinkIngredient9.text = theDrink.strIngredient9.toString() +
                    " " + theDrink.strMeasure9.toString()

        if (!theDrink.strIngredient10.equals("null"))
            drinkIngredient10.text = theDrink.strIngredient10.toString() +
                    " " + theDrink.strMeasure10.toString()

        if (!theDrink.strIngredient11.equals("null"))
            drinkIngredient11.text = theDrink.strIngredient11.toString() +
                    " " + theDrink.strMeasure11.toString()

        if (!theDrink.strIngredient12.equals("null"))
            drinkIngredient12.text = theDrink.strIngredient12.toString() +
                    " " + theDrink.strMeasure12.toString()

        if (!theDrink.strIngredient13.equals("null"))
            drinkIngredient13.text = theDrink.strIngredient13.toString() +
                    " " + theDrink.strMeasure13.toString()

        if (!theDrink.strIngredient14.equals("null"))
            drinkIngredient14.text = theDrink.strIngredient14.toString() +
                    " " + theDrink.strMeasure14.toString()

        if (!theDrink.strIngredient15.equals("null"))
            drinkIngredient15.text = theDrink.strIngredient15.toString() +
                    " " + theDrink.strMeasure15.toString()

        drinkInstruction.text = theDrink.strInstructions.toString()
        return v
    }

    companion object
}