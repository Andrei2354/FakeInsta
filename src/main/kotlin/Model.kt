


//data class Message(val name: String, val surname: String, val message: String, val image: String)
//
//val body = "Texto1"
//val body1 = "Texto2"
//val body2 = "Texto3"
//// Intentar añadir lista imagenes
//
//val message = listOf<Message>(
//    Message("Sofia","Pérez", body, "download.jpeg"),
//    Message("Jose", "Pérez",body1, "download.jpeg"),
//    Message("Alvaro","Pérez", body2, "download.jpeg")
//)

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings


data class Message(val name: String, val message: String, val image: String)

val body = "Texto1"
val body1 = "Texto2"
val body2 = "Texto3"

val message = listOf<Message>(
    Message("Sofia", body, "download.jpeg"),
    Message("Random 1", body1, "download.jpeg"),
    Message("Random 2", body2, "download.jpeg")
)

val items = listOf(
    "Home" to Icons.Default.Home,
    "Search" to Icons.Default.Search,
    "Settings" to Icons.Default.Settings
)