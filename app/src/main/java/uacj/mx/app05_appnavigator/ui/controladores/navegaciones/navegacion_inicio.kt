package uacj.mx.app05_appnavigator.ui.controladores.navegaciones

import android.provider.MediaStore.Video
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uacj.mx.app05_appnavigator.ui.pantallas.PantallaInicio
import uacj.mx.app05_appnavigator.ui.pantallas.PantallaVideo

@Composable
fun NavegacionInicio(modificador:Modifier = Modifier){
    val controlador_de_navegacion = rememberNavController()
    NavHost(navController = controlador_de_navegacion, startDestination = Inicio){
        composable<Inicio> {
            PantallaInicio(modificador, controlador_de_navegacion)
        }

        composable<Videos> {
            PantallaVideo(modificador, controlador_de_navegacion)
        }

        composable<Configuracion> {
            Column(modifier = modificador
                .fillMaxSize()
                .background(Color.Gray)){
                Text("En pantalla de Configuración", )
                Text("Ir a Inicio", modifier = Modifier
                    .padding(15.dp)
                    .clickable { controlador_de_navegacion.navigate(Inicio) })
                Text("Ir a Video", modifier = Modifier
                    .padding(15.dp)
                    .clickable { controlador_de_navegacion.navigate(Videos) })
                Text("Ir a Canal", modifier = Modifier
                    .padding(15.dp)
                    .clickable { controlador_de_navegacion.navigate(Canal) })
            }
        }

        composable<Canal> {
            Column(modifier = modificador
                .fillMaxSize()
                .background(Color.Cyan)){
                Text("En pantalla de Canal", )
                Text("Ir a Inicio", modifier = Modifier
                    .padding(15.dp)
                    .clickable { controlador_de_navegacion.navigate(Inicio) })
                Text("Ir a Video", modifier = Modifier
                    .padding(15.dp)
                    .clickable { controlador_de_navegacion.navigate(Videos) })
                Text("Ir a Configuración", modifier = Modifier
                    .padding(15.dp)
                    .clickable { controlador_de_navegacion.navigate(Configuracion) })
            }
        }
    }
}