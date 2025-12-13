package com.example.flagquizgame

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.random.Random

class SharedPreferencesManager (context: Context) {

    private val preferences = context.getSharedPreferences("countries",
        Context.MODE_PRIVATE)

    fun initializeCountries () {
        val editor = preferences.edit()

        editor.putString("name_1", "Algeria").apply()
        editor.putString("code_1", "DZ").apply()
        editor.putString("flag_1", "flag_algeria").apply()

        editor.putString("name_2", "China").apply()
        editor.putString("code_2", "CN").apply()
        editor.putString("flag_2", "flag_china").apply()

        editor.putString("name_3", "Spain").apply()
        editor.putString("code_3", "SP").apply()
        editor.putString("flag_3", "flag_spain").apply()

        editor.putString("name_4", "Brazil").apply()
        editor.putString("code_4", "BZ").apply()
        editor.putString("flag_4", "flag_brazil").apply()

        // New countries
        editor.putString("name_5", "France").apply()
        editor.putString("code_5", "FR").apply()
        editor.putString("flag_5", "flag_france").apply()

        editor.putString("name_6", "Germany").apply()
        editor.putString("code_6", "DE").apply()
        editor.putString("flag_6", "flag_germany").apply()

        editor.putString("name_7", "Italy").apply()
        editor.putString("code_7", "IT").apply()
        editor.putString("flag_7", "flag_italy").apply()

        editor.putString("name_8", "United States").apply()
        editor.putString("code_8", "US").apply()
        editor.putString("flag_8", "flag_united_states").apply()

        editor.putString("name_9", "Canada").apply()
        editor.putString("code_9", "CA").apply()
        editor.putString("flag_9", "flag_canada").apply()

        editor.putString("name_10", "Japan").apply()
        editor.putString("code_10", "JP").apply()
        editor.putString("flag_10", "flag_japan").apply()

        editor.putString("name_11", "South Korea").apply()
        editor.putString("code_11", "KR").apply()
        editor.putString("flag_11", "flag_south_korea").apply()

        editor.putString("name_12", "United Kingdom").apply()
        editor.putString("code_12", "GB").apply()
        editor.putString("flag_12", "flag_united_kingdom").apply()

        editor.putString("name_13", "Australia").apply()
        editor.putString("code_13", "AU").apply()
        editor.putString("flag_13", "flag_australia").apply()

        editor.putString("name_14", "Morocco").apply()
        editor.putString("code_14", "MA").apply()
        editor.putString("flag_14", "flag_morocco").apply()

        editor.apply()
    }


    fun getRandomCountry () : Country {
        val id = Random.nextInt(1, 15)
        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        return Country(id, name, code, flag)
    }

    fun getRandomCountry (excluded: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, 15)
        }while (id == excluded)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        return Country(id, name, code, flag)
    }

    fun getRandomCountry (excluded1: Int, excluded2: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, 15)
        }while (id == excluded1 || id == excluded2)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        return Country(id, name, code, flag)
    }

    fun getCountriesList () : MutableList<Country> {
        val countries = mutableListOf<Country>()
        for (id in 1..14) {
            val name = preferences.getString("name_${id}", null)
            val code = preferences.getString("code_${id}", null)
            val flag = preferences.getString("flag_${id}", null)
            countries.add(id, Country(id, name, code, flag))
        }
        return countries
    }


}