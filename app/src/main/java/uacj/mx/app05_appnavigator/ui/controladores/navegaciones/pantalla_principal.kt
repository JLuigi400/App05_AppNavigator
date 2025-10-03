package uacj.mx.app05_appnavigator.ui.controladores.navegaciones

import android.provider.MediaStore.Video
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.contentValuesOf
import androidx.navigation.compose.rememberNavController
import uacj.mx.app05_appnavigator.ui.atomos.OpcionNavegacion

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPrincipal(){
    val controlador_de_navegacion = rememberNavController()
    var pantalla_seleccionada by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(title = {

                Row {
                    Column {
                        Text("Hola Prototipo")
                        Text("Prototipo 02")
                    }
                    Column {
                        Text("Buenas Prototipo")
                        Text("Adios Prototipo")
                    }
                }


            },
                colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Blue,
                titleContentColor = Color.White
            ))
        },
        bottomBar = {
            BottomAppBar (containerColor = Color.LightGray) {
                Row (modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceAround){
                    OpcionNavegacion(
                        texto = "Inicio",
                        seleccionado = pantalla_seleccionada == 0,
                    )
                    Text("Videos",
                        color = Color.Blue,
                        modifier = Modifier.clickable {
                            pantalla_seleccionada = 1
                            controlador_de_navegacion.navigate(Videos)
                        })
                    Text("Configuracion",
                        color = if(pantalla_seleccionada == 2) Color.Blue else Color.Gray,
                        modifier = Modifier.clickable {
                            pantalla_seleccionada = 2
                            controlador_de_navegacion.navigate(Configuracion)
                        })
                    Text("Canal",
                        color = Color.Blue,
                        modifier = Modifier.clickable {
                            pantalla_seleccionada = 3
                            controlador_de_navegacion.navigate(Canal)
                        })
                }
            }
        },
        modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavegacionInicio(modificador = Modifier
            .padding(innerPadding), controlador_de_navegacion)
    }
}

@Composable
@Preview(showBackground = true)
fun PrevistaPantallaPrincipal(){
    PantallaPrincipal()
}