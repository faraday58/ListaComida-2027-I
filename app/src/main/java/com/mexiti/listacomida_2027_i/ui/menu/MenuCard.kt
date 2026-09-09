package com.mexiti.listacomida_2027_i.ui.menu

import android.R
import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mexiti.listacomida_2027_i.data.DataSource
import com.mexiti.listacomida_2027_i.model.Platillo

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier){
    Card(modifier = modifier) {
        Column() {
            Image(
                painter = painterResource(platillo.drawableResource),
                contentDescription = stringResource(platillo.stringResourceId),
                modifier.
                    fillMaxWidth()
                    .height(190.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(platillo.stringResourceId),
                modifier.padding(22.dp),
                style = MaterialTheme.typography.headlineLarge
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MenuCardPreview(){
    val datasource = DataSource()
    val platillos = datasource.LoadPlatillos()

    MenuCard(platillos.get(1))
}