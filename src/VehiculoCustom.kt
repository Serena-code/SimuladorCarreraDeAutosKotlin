open class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {

    override fun acelerar() {
        if (combustible>0) {
            while (velocidadActual <= velocidadMaxima) {
                if (combustible > 0) {
                    velocidadActual += aceleracion
                    combustible -= 1
                } else {
                    break
                }

            }
        }else{
            println("No posee más combustible")
        }
    }

    override fun frenar() {
        while(velocidadActual>frenado){

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