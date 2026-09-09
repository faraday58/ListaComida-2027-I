package com.mexiti.listacomida_2027_i.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
       @StringRes val stringResourceId: Int,
       @DrawableRes val drawableResource: Int
)
