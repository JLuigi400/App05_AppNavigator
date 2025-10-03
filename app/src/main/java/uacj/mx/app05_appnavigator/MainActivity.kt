package uacj.mx.app05_appnavigator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import uacj.mx.app05_appnavigator.ui.controladores.navegaciones.NavegacionInicio
import uacj.mx.app05_appnavigator.ui.controladores.navegaciones.PantallaPrincipal
import uacj.mx.app05_appnavigator.ui.theme.App05_AppNavigatorTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App05_AppNavigatorTheme {
                PantallaPrincipal()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App05_AppNavigatorTheme {
        PantallaPrincipal()
    }
}