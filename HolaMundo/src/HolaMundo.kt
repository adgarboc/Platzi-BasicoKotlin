val n = 3 //variables locales, para ser accedidas en tiempo de compilacion
//Funciones puras, no usar variables globales var (changeable)
var nn = "n" //mala practica de programacion
const val N = "name" //variables globales
fun main(args: Array<String>) {
    println("Hola Mundo")

    println("==Como tipos primitivos==")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    println("==Como objetos==")
    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    println("N es: $n")

    val name = args[0] //Asignado en tiempo de ejecucion
    //const Asignado en tiempo de ejecucion
    println("val : $name")

    println(N)

    val nombre = "Adán"
    val apellido: String = "García"
    val nombreAppellido = "Adán\nGarcía"
//    \t : Tabula
//    \b : Retrocede el cursor de texto 1 carácter
//    \n : Crea un salto de linea
//    \r : Mueve el cursor de texto al inicio de la linea en la que está
//    \’, ", \ y $ : Te permite usar los caracteres que hay luego del \ dentro de las comillas sin conflictos
    println("Tu nombre es: $nombre $apellido")
    println("Tu nombre es: $nombreAppellido")



    //Raw String
    val parrafo = """
        ** Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        ** Etiam condimentum at ligula a molestie. Donec convallis cursus ex a dapibus. 
        ** Vestibulum at velit vel odio semper efficitur. Sed eu dapibus enim, ac efficitur ex. 
        ** Donec ligula urna, tincidunt vel metus et, cursus egestas magna. 
        ** Praesent eu felis efficitur, ullamcorper lorem et, feugiat orci.
    """.trimIndent()

    println(parrafo.trimMargin("** "))

}