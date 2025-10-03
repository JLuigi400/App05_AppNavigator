package uacj.mx.app05_appnavigator.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import uacj.mx.app05_appnavigator.ui.controladores.navegaciones.Configuracion
import uacj.mx.app05_appnavigator.ui.controladores.navegaciones.Inicio
import uacj.mx.app05_appnavigator.ui.controladores.navegaciones.Videos

@Composable
fun PantallaCanal(modificador: Modifier = Modifier, controlador_de_navegacion: NavHostController){
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