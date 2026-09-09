package com.mexiti.listacomida_2027_i.data

import com.mexiti.listacomida_2027_i.R
import com.mexiti.listacomida_2027_i.model.Platillo

class DataSource() {
    fun LoadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.postre , R.drawable.postre ),
            Platillo(R.string.pozole , R.drawable.pozole ),
            Platillo(R.string.pizza , R.drawable.pizza ),
            Platillo(R.string.tacos , R.drawable.tacos ),
            Platillo(R.string.hamburger , R.drawable.hamburguer ),
            Platillo(R.string.desayuno , R.drawable.desayuno ),

        )
    }
}