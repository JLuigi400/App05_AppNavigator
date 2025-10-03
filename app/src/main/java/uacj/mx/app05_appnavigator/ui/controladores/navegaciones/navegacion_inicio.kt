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
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uacj.mx.app05_appnavigator.ui.pantallas.PantallaCanal
import uacj.mx.app05_appnavigator.ui.pantallas.PantallaConfiguracion
import uacj.mx.app05_appnavigator.ui.pantallas.PantallaInicio
import uacj.mx.app05_appnavigator.ui.pantallas.PantallaVideo

@Composable
fun NavegacionInicio(modificador:Modifier = Modifier, controlador_de_navegacion: NavHostController){
    //val controlador_de_navegacion = rememberNavController()
    NavHost(navController = controlador_de_navegacion, startDestination = Inicio){
        composable<Inicio> {
            PantallaInicio(modificador, controlador_de_navegacion)
        }

        composable<Videos> {
            PantallaVideo(modificador, controlador_de_navegacion)
        }

        composable<Configuracion> {
            PantallaConfiguracion(modificador, controlador_de_navegacion)
        }

        composable<Canal> {
            PantallaCanal(modificador, controlador_de_navegacion)
        }
    }
}