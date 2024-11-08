import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
            Text("Título")
        }
        Row() {
            Text("Historias")
        }
        Card(){
            Row(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
                message.forEach { message ->
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(resourcePath = message.image),
                            contentDescription = "Foto",
                            modifier = Modifier.size(width = 100.dp, height = 100.dp).clip(CircleShape)
                        )
                        Column(modifier = Modifier.padding(start = 10.dp)) {
                            Text(modifier = Modifier.padding(top = 5.dp), text = message.name)
                        }
                    }
                }
            }
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
