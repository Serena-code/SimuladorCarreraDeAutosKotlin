open class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {

    override fun acelerar() {
        if (combustible>0) {
            if (velocidadActual <= velocidadMaxima) {
                velocidadActual += aceleracion
                combustible -= 1
                }
        }else{
            println("No posee más combustible")
        }
    }

    override fun frenar() {
        if (velocidadActual>frenado){
            velocidadActual-= frenado
        }
        println("Nueva velocidad: ${velocidadActual}")
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual
        println("Distancia recorrida: ${distanciaRecorrida} km")
    }

    override fun toString(): String {
        return super .toString() + "${nombre}:${velocidadMaxima}:${aceleracion}:${frenado}."
    }
}