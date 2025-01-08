fun main() {
    val x = 12
    val y = 12

    val mensaje = if (x == y) {
        println("Condición 1")
        "Son iguales"
    } else {
        println("Rama else")
        "Nada de lo anterior se cumplió"
    }

    println(mensaje)
}