package com.example.drunkapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import com.example.drunkapp.Common.Common
import com.example.drunkapp.Dao.DrinkDao
import com.example.drunkapp.Database.DrinkDatabase
import com.example.drunkapp.Model.DrinkData
import com.example.drunkapp.Model.Drinks
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CocktailDetailFragment : Fragment() {
    private lateinit var strDrink: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("err", arguments.toString())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_cocktail_detail, container, false)

        val drinkName: TextView = v.findViewById(R.id.tv_drink_name)
        val drinkCategory: TextView = v.findViewById(R.id.tv_drink_category)
        val drinkIngredient1: TextView = v.findViewById(R.id.ingredient_1)
        val drinkIngredient2: TextView = v.findViewById(R.id.ingredient_2)
        val drinkIngredient3: TextView = v.findViewById(R.id.ingredient_3)
        val drinkIngredient4: TextView = v.findViewById(R.id.ingredient_4)
        val drinkIngredient5: TextView = v.findViewById(R.id.ingredient_5)
        val drinkIngredient6: TextView = v.findViewById(R.id.ingredient_6)
        val drinkIngredient7: TextView = v.findViewById(R.id.ingredient_7)
        val drinkIngredient8: TextView = v.findViewById(R.id.ingredient_8)
        val drinkIngredient9: TextView = v.findViewById(R.id.ingredient_9)
        val drinkIngredient10: TextView = v.findViewById(R.id.ingredient_10)
        val drinkIngredient11: TextView = v.findViewById(R.id.ingredient_11)
        val drinkIngredient12: TextView = v.findViewById(R.id.ingredient_12)
        val drinkIngredient13: TextView = v.findViewById(R.id.ingredient_13)
        val drinkIngredient14: TextView = v.findViewById(R.id.ingredient_14)
        val drinkIngredient15: TextView = v.findViewById(R.id.ingredient_15)
        val drinkInstruction: TextView = v.findViewById(R.id.drink_instruction)
        val saveButton: Button = v.findViewById(R.id.save_button)

        val args = arguments

        val db: DrinkDatabase = Room.databaseBuilder(v.context, DrinkDatabase::class.java, "Drink_DB")
                                    .allowMainThreadQueries()
                                    .build()
        val drinkDao: DrinkDao = db.drinkDao()



        strDrink = args?.getString("strDrink").toString()
        Common.retrofitService.getDrinkByName(strDrink)
            .enqueue(object: Callback<Drinks> {
                override fun onFailure(call: Call<Drinks>, t: Throwable) {
                    Log.e("Error", t.message.toString())
                }

                @SuppressLint("SetTextI18n")
                override fun onResponse(call: Call<Drinks>, response: Response<Drinks>) {
                    if (response.body() != null) {
                        drinkName.text = strDrink
                        drinkCategory.text = response.body()!!.drinks[0].strCategory.toString()

                        if (response.body()!!.drinks[0].strIngredient1 != null)
                            drinkIngredient1.text = response.body()!!.drinks[0].strIngredient1.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure1.toString()

                        if (response.body()!!.drinks[0].strIngredient2 != null)
                            drinkIngredient2.text = response.body()!!.drinks[0].strIngredient2.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure2.toString()

                        if (response.body()!!.drinks[0].strIngredient3 != null)
                            drinkIngredient3.text = response.body()!!.drinks[0].strIngredient3.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure3.toString()

                        if (response.body()!!.drinks[0].strIngredient4 != null)
                            drinkIngredient4.text = response.body()!!.drinks[0].strIngredient4.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure4.toString()

                        if (response.body()!!.drinks[0].strIngredient5 != null)
                            drinkIngredient5.text = response.body()!!.drinks[0].strIngredient5.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure5.toString()

                        if (response.body()!!.drinks[0].strIngredient6 != null)
                            drinkIngredient6.text = response.body()!!.drinks[0].strIngredient6.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure6.toString()

                        if (response.body()!!.drinks[0].strIngredient7 != null)
                            drinkIngredient7.text = response.body()!!.drinks[0].strIngredient7.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure7.toString()

                        if (response.body()!!.drinks[0].strIngredient8 != null)
                            drinkIngredient8.text = response.body()!!.drinks[0].strIngredient8.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure8.toString()

                        if (response.body()!!.drinks[0].strIngredient9 != null)
                            drinkIngredient9.text = response.body()!!.drinks[0].strIngredient9.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure9.toString()

                        if (response.body()!!.drinks[0].strIngredient10 != null)
                            drinkIngredient10.text = response.body()!!.drinks[0].strIngredient10.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure10.toString()

                        if (response.body()!!.drinks[0].strIngredient11 != null)
                            drinkIngredient11.text = response.body()!!.drinks[0].strIngredient11.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure11.toString()

                        if (response.body()!!.drinks[0].strIngredient12 != null)
                            drinkIngredient12.text = response.body()!!.drinks[0].strIngredient12.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure12.toString()

                        if (response.body()!!.drinks[0].strIngredient13 != null)
                            drinkIngredient13.text = response.body()!!.drinks[0].strIngredient13.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure13.toString()

                        if (response.body()!!.drinks[0].strIngredient14 != null)
                            drinkIngredient14.text = response.body()!!.drinks[0].strIngredient14.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure14.toString()

                        if (response.body()!!.drinks[0].strIngredient15 != null)
                            drinkIngredient15.text = response.body()!!.drinks[0].strIngredient15.toString() +
                                    " " + response.body()!!.drinks[0].strMeasure15.toString()

                        drinkInstruction.text = response.body()!!.drinks[0].strInstructions.toString()

                        saveButton.setOnClickListener {
                            val drinkData = DrinkData(response.body()!!.drinks[0].idDrink.toString())
                            drinkData.strDrink = response.body()!!.drinks[0].strDrink.toString()
                            drinkData.strCategory = response.body()!!.drinks[0].strCategory.toString()
                            drinkData.strAlcoholic = response.body()!!.drinks[0].strAlcoholic.toString()
                            drinkData.strInstructions = response.body()!!.drinks[0].strInstructions.toString()
                            drinkData.strIngredient1 = response.body()!!.drinks[0].strIngredient1.toString()
                            drinkData.strIngredient2 = response.body()!!.drinks[0].strIngredient2.toString()
                            drinkData.strIngredient3 = response.body()!!.drinks[0].strIngredient3.toString()
                            drinkData.strIngredient4 = response.body()!!.drinks[0].strIngredient4.toString()
                            drinkData.strIngredient5 = response.body()!!.drinks[0].strIngredient5.toString()
                            drinkData.strIngredient6 = response.body()!!.drinks[0].strIngredient6.toString()
                            drinkData.strIngredient7 = response.body()!!.drinks[0].strIngredient7.toString()
                            drinkData.strIngredient8 = response.body()!!.drinks[0].strIngredient8.toString()
                            drinkData.strIngredient9 = response.body()!!.drinks[0].strIngredient9.toString()
                            drinkData.strIngredient10 = response.body()!!.drinks[0].strIngredient10.toString()
                            drinkData.strIngredient11 = response.body()!!.drinks[0].strIngredient11.toString()
                            drinkData.strIngredient12 = response.body()!!.drinks[0].strIngredient12.toString()
                            drinkData.strIngredient13 = response.body()!!.drinks[0].strIngredient13.toString()
                            drinkData.strIngredient14 = response.body()!!.drinks[0].strIngredient14.toString()
                            drinkData.strIngredient15 = response.body()!!.drinks[0].strIngredient15.toString()
                            drinkData.strMeasure1 = response.body()!!.drinks[0].strMeasure1.toString()
                            drinkData.strMeasure2 = response.body()!!.drinks[0].strMeasure2.toString()
                            drinkData.strMeasure3 = response.body()!!.drinks[0].strMeasure3.toString()
                            drinkData.strMeasure4 = response.body()!!.drinks[0].strMeasure4.toString()
                            drinkData.strMeasure5 = response.body()!!.drinks[0].strMeasure5.toString()
                            drinkData.strMeasure6 = response.body()!!.drinks[0].strMeasure6.toString()
                            drinkData.strMeasure7 = response.body()!!.drinks[0].strMeasure7.toString()
                            drinkData.strMeasure8 = response.body()!!.drinks[0].strMeasure8.toString()
                            drinkData.strMeasure9 = response.body()!!.drinks[0].strMeasure9.toString()
                            drinkData.strMeasure10 = response.body()!!.drinks[0].strMeasure10.toString()
                            drinkData.strMeasure11 = response.body()!!.drinks[0].strMeasure11.toString()
                            drinkData.strMeasure12 = response.body()!!.drinks[0].strMeasure12.toString()
                            drinkData.strMeasure13 = response.body()!!.drinks[0].strMeasure13.toString()
                            drinkData.strMeasure14 = response.body()!!.drinks[0].strMeasure14.toString()
                            drinkData.strMeasure15 = response.body()!!.drinks[0].strMeasure15.toString()
                            drinkData.strDrinkThumb = response.body()!!.drinks[0].strDrinkThumb.toString()
                            drinkDao.insert(drinkData)
//                            Log.e("error", drinkData.toString())
                        }
                    }
                }
            })
        return v
    }

    companion object
}