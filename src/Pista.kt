import kotlin.random.Random

// Clase Pista
abstract class Pista(val longitud: Int, var clima: String) {
    abstract fun aplicarCondiciones(vehiculo: Vehiculo)
    abstract fun cambiarClima()
    abstract fun aplicarEventoAleatorio(vehiculo: Vehiculo)
}