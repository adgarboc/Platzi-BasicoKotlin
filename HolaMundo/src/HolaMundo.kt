val n = 3 //variables locales, para ser accedidas en tiempo de compilacion
//Funciones puras, no usar variables globales var (changeable)
var n = "n" //mala practica de programacion
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

}