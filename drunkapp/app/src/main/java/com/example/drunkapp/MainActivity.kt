package com.example.drunkapp


import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.drunkapp.Common.Common
import com.example.drunkapp.Model.Drinks
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException


class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var searchButton: Button
    private lateinit var showButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cocktailListFragment: Fragment = CocktailListFragment()
        val cocktailDetailFragment: Fragment = CocktailDetailFragment()

        editText = findViewById(R.id.search_input)
        searchButton = findViewById(R.id.search_button)
        showButton = findViewById(R.id.show_button)

        searchButton.setOnClickListener { v->
            val activity = v.context as AppCompatActivity
            Common.retrofitService.getDrinkByName(editText.text.toString())
                .enqueue(object: Callback<Drinks> {
                    override fun onFailure(call: Call<Drinks>, t: Throwable) {
                        if (t is IOException) {
                            Log.e("Error", t.message.toString())
                            Toast.makeText(v.context, "Check Internet Connection", Toast.LENGTH_LONG).show()
                        }
                    }

                    override fun onResponse(call: Call<Drinks>, response: Response<Drinks>) {
                        if (response.body() != null) {
                            if (response.body()!!.drinks != null) {
                                val bundle = Bundle()
                                Log.e("err", response.body()!!.drinks[0].strDrink.toString())
                                bundle.putString(
                                    "strDrink",
                                    response.body()!!.drinks[0].strDrink.toString()
                                )
                                cocktailDetailFragment.arguments = bundle
                                activity.supportFragmentManager.beginTransaction()
                                    .replace(R.id.main, cocktailDetailFragment)
                                    .addToBackStack(null).commit()
                            } else {
                                Toast.makeText(v.context, "ERROR 404 NOT FOUND", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                })
        }

        showButton.setOnClickListener { v->
            val activity = v.context as AppCompatActivity
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.main, cocktailListFragment)
                .addToBackStack(null).commit()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("search_request", editText.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        editText.setText(savedInstanceState.getString("search_request").toString())
    }
}