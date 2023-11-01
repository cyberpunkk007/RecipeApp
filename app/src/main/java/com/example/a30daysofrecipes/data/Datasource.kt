package com.example.a30daysofrecipes.data

import com.example.a30daysofrecipes.R
import com.example.a30daysofrecipes.model.Dish

class Datasource() {
    fun loadRecipes():List<Dish>{
        return listOf<Dish>(
            Dish(R.string.day_1, R.string.dish_1,R.drawable.affogato_ice_cream,R.string.recipe_1),
            Dish(R.string.day_2, R.string.dish_2,R.drawable.biscotti,R.string.recipe_2),
            Dish(R.string.day_3, R.string.dish_3,R.drawable.bruschetta,R.string.recipe_3),
            Dish(R.string.day_4, R.string.dish_4,R.drawable.tortellini_soup,R.string.recipe_4),
            Dish(R.string.day_5, R.string.dish_5,R.drawable.lasagne,R.string.recipe_5),
            Dish(R.string.day_6, R.string.dish_6,R.drawable.pasta,R.string.recipe_6),
            Dish(R.string.day_7, R.string.dish_7,R.drawable.butter_cookies,R.string.recipe_7),
            Dish(R.string.day_8, R.string.dish_8,R.drawable.hot_chocolate,R.string.recipe_8),
            Dish(R.string.day_9, R.string.dish_9,R.drawable.ravioli,R.string.recipe_9),
            Dish(R.string.day_10, R.string.dish_10,R.drawable.spaghetti,R.string.recipe_10),
            Dish(R.string.day_11, R.string.dish_11,R.drawable.carrot_halwa,R.string.recipe_11),
            Dish(R.string.day_12, R.string.dish_12,R.drawable.tikki,R.string.recipe_12),
            Dish(R.string.day_13, R.string.dish_13,R.drawable.chole_bhature,R.string.recipe_13),
            Dish(R.string.day_14, R.string.dish_14,R.drawable.dal_makhani,R.string.recipe_14),
            Dish(R.string.day_15, R.string.dish_15,R.drawable.dosa,R.string.recipe_15),
            Dish(R.string.day_16, R.string.dish_16,R.drawable.gulab_jamun,R.string.recipe_16),
            Dish(R.string.day_17, R.string.dish_17,R.drawable.kachori,R.string.recipe_17),
            Dish(R.string.day_18, R.string.dish_18,R.drawable.kulfi,R.string.recipe_18),
            Dish(R.string.day_19, R.string.dish_19,R.drawable.naan,R.string.recipe_19),
            Dish(R.string.day_20, R.string.dish_20,R.drawable.pav_bhaji,R.string.recipe_20),
            Dish(R.string.day_21, R.string.dish_21,R.drawable.poha,R.string.recipe_21),
            Dish(R.string.day_22, R.string.dish_22,R.drawable.shahi_paneer,R.string.recipe_22),
            Dish(R.string.day_23, R.string.dish_23,R.drawable.uttapam,R.string.recipe_23),
            Dish(R.string.day_24, R.string.dish_24,R.drawable.biryani,R.string.recipe_24),
            Dish(R.string.day_25, R.string.dish_25,R.drawable.samosa,R.string.recipe_25),
            Dish(R.string.day_26, R.string.dish_26,R.drawable.croissants,R.string.recipe_26),
            Dish(R.string.day_27, R.string.dish_27,R.drawable.french_onion_soup,R.string.recipe_27),
            Dish(R.string.day_28, R.string.dish_28,R.drawable.french_toast,R.string.recipe_28),
            Dish(R.string.day_29, R.string.dish_29,R.drawable.macaroons,R.string.recipe_29),
            Dish(R.string.day_30, R.string.dish_30,R.drawable.pots_de_creme,R.string.recipe_30)

        )
    }
}