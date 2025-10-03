package uacj.mx.app05_appnavigator.ui.atomos

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OpcionNavegacion(modificador: Modifier = Modifier,
                     texto: String,
                     seleccionado: Boolean? = null,
                     color_activo: Color = Color.Green,
                     color_inactivo: Color = Color.Gray,
                     al_pulsar: () -> Unit = {}){
    val color = if(seleccionado?: false) color_activo else color_inactivo
    Text(texto, color = color, modifier = modificador.clickable { al_pulsar() })
}

@Preview(showBackground = true)
@Composable
fun PrevistaOpcionNavegacion(){
    OpcionNavegacion(texto = "Hola Mundo")
}