import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun App() {
    Column(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
        Row() {
            Text("Andrei")
        }
        Row() {
            Text("Historias")
        }
        Row {
            Column(modifier = Modifier.padding(10.dp)) {
                Text("Publicaciones", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                Column(modifier = Modifier.padding(10.dp)) {
                    Text("Foto", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                    Text("Autor", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                    Text("Descripcion", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                }

            }
            Column(modifier = Modifier.padding(10.dp)) {
                Text("Sugerencia", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                Row {
                    Text("Foto", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                    Text("Nombre Apellido", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                }

            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "FakeInsta",
        state = rememberWindowState(width = 1425.dp, height = 800.dp)
    ) {
        App()
    }
}
