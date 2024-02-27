import kotlin.time.measureTimedValue

fun <T> reverse(lista: List<T>): List<T>{
    val pila = Pila<T>()

    // Añadir los elementos de la lista pasada como parametro a la lista interna de la clase Pila
    for (elemento in lista.reversed()){
        pila.push(elemento)
    }

    // Crear iterador de la lista interna de la clase Pila
    val iterador: Iterator<T> = pila.pila.iterator()

    // Lista reverted vacía
    val listaReversed = mutableListOf<T>()

    // Añadir a listaReversed desde la lista interna de la clase Pila
    while (iterador.hasNext()){
        listaReversed.add(iterador.next())
    }

    return listaReversed
}



fun main() {

    val numbers = listOf("one", "two", "three", "four")
    val mezcla = listOf(1, 1.1, 1.2f, Persona("Diego", 18, "Cadiz"), "Sarandonga", true)
    val dClass = listOf(Persona("Juan", 30, "Madrid"), Persona("Pedro", 35, "Sevilla"), Persona("María", 25, "Barcelona"))


    println("LISTA INICAL DE NUMEROS: ")

    val numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)


    println()


    println("LISTA DE DATOS MEZCLADOS: ")

    val mezclaRev = reverse(mezcla)
    if (!listOf(1, 1.1, 1.2f, Persona("Diego", 18, "Cadiz"), "Sarandonga", true).equals(mezcla))
        println("Error")
    else
        println("Correcto")
    println(mezclaRev)


    println()


    println("LISTA DE DATACLASS: ")

    val dClassRev = reverse(dClass)
    if (!listOf(Persona("Juan", 30, "Madrid"), Persona("Pedro", 35, "Sevilla"), Persona("María", 25, "Barcelona")).equals(dClass))
        println("Error")
    else
        println("Correcto")
    println(dClassRev)


    // Permite usar cualquier tipo de dato ya que kotlin interpreta las listas como tipo generico si no le especificas el tipo a proposito. En este caso, lo interpreta como Any.


    //Realiza la misma prueba, pero con listas de otros tipos de datos...
    //por ejemplo una lista que combine valores numéricos Int, Float y Double

    //Otra con una lista de cualquier data class que te inventes.

    //Comprueba también si podemos hacerlo con una lista de tipos de datos distintos...
    //por ejemplo con una lista que contenga tipos de datos String, Int, Float, Usuario("Pepe", 30), Boolean...
    //¿Por qué es posible usarla si parece que la lista contiene tipos de datos diferentes?

//    Atención!!!! ten en cuenta:
//
//    La función reverse no pertenece a la pila.
//    La función reverse tiene que ser genérica.
//    La función reverse tienes que implementarla haciendo uso de la estructura Pila.
//    Dentro de la función reverse tiene que hacer uso de la interface Iterator que proporciona Kotlin (Java)
}