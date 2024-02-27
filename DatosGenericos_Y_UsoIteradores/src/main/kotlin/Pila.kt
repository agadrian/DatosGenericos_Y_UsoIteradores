/**
 * Clase que representa una pila genérica.
 * @param T el tipo de elementos que contendrá la pila.
 * @property pila Lista mutable que almacena los elementos de la pila.
 * @property tamanioMax el tamaño máximo de la pila, si es null la pila no tiene límite de tamaño.
 */
class Pila <T>{

    val pila = mutableListOf<T>()
    private val tamanioMax: Int? = null


    /**
     * Devuelve el elemento en la cima de la pila.
     * @return el elemento en la cima de la pila o null si la pila está vacía.
     */
    private fun top(): T?{
        return pila.lastOrNull()
    }

    /**
     * * Inserta un elemento en la cima de la pila.
     * @param elemento el elemento a insertar.
     */
    fun push(elemento: T){
        if (tamanioMax == null || !isFull() ){
            pila.add(elemento)
        }else{
            println("Pila llena")
        }
    }


    /**
     * Elimina y devuelve el elemento en la cima de la pila, o nulo si no hay
     * @return el elemento eliminado o null si la pila está vacía.
     */
    fun pop(): T?{
        return pila.removeLastOrNull()
    }


    /**
     * Verifica si la pila está vacía, mirando si top() es nulo o
     * @return true si la pila está vacía, false en caso contrario.
     */
    private fun isEmpty(): Boolean{
        return (top() == null)
    }


    /**
     * Verifica si la pila está llena.
     * @return true si la pila está llena, false en caso contrario o si no hay límite de tamaño.
     */
    private fun isFull(): Boolean{
        return tamanioMax != null && pila.size == tamanioMax
    }
}