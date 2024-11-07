


data class Message(val name: String, val surname: String, val message: String, val image: String)

val body = "Texto1"
val body1 = "Texto2"
val body2 = "Texto3"
// Intentar añadir lista imagenes

val message = listOf<Message>(
    Message("Sofia","Pérez", body, "download.jpeg"),
    Message("Jose", "Pérez",body1, "download.jpeg"),
    Message("Alvaro","Pérez", body2, "download.jpeg")
)
