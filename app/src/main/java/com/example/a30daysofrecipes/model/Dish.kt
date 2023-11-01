package com.example.a30daysofrecipes.model

import androidx.annotation.ArrayRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dish(
    @StringRes val stringResourceId1:Int,
    @StringRes val stringResourceId2: Int,
    @DrawableRes val imageResourceId:Int,
    @StringRes val stringResourceId3: Int
)
