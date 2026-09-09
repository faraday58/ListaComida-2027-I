package com.mexiti.listacomida_2027_i

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mexiti.listacomida_2027_i.data.DataSource
import com.mexiti.listacomida_2027_i.ui.menu.MenuCardList
import com.mexiti.listacomida_2027_i.ui.theme.ListaComida2027ITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaComida2027ITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    MenuApp(Modifier.padding(innerPadding))

                }
            }
        }
    }
}
@Composable
fun MenuApp(modifier: Modifier){
    MenuCardList(
        platilloList = DataSource().LoadPlatillos(),modifier
    )

}