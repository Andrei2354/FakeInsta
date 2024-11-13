
data class Historias(val name: String, val image: String)
data class Sugerencias(val name: String, val image: String)
data class Fotos(val image: String)
data class Message(val name: String, val message: String, val image: String, val image2: String)

val historias = listOf<Historias>(
    Historias("Isidoro", "imagenes/download.jpeg"),
    Historias("Laura", "imagenes/download2.jpeg"),
    Historias("Jose", "imagenes/download3.jpeg"),
    Historias("Persona1", "imagenes/download4.jpeg"),
    Historias("Persona2", "imagenes/download5.jpeg"),
    Historias("Persona3", "imagenes/download6.jpeg"),
    Historias("Persona4", "imagenes/download7.jpeg"),
    Historias("Persona5", "imagenes/download8.jpeg"),
    Historias("Persona6", "imagenes/download9.jpeg"),
)
val sugerencias = listOf<Sugerencias>(
    Sugerencias("Isidoro", "imagenes/download.jpeg"),
    Sugerencias("Laura", "imagenes/download2.jpeg"),
)
val fotos = listOf<Fotos>(
    Fotos("imagenes/publi2.jpeg"),
    Fotos("imagenes/publi2.jpeg"),
)
val message = listOf<Message>(
    Message("Isidoro", "Me gustan los perros.", "imagenes/download.jpeg", "imagenes/publi2.jpeg"),
    Message("Laura", "Mira el árbol blanco.", "imagenes/download2.jpeg", "imagenes/aa.jpg"),
)