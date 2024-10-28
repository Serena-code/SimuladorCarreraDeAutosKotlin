import kotlin.random.Random

class PistaPersonalizadaTunipandilla (
    longitud: Int,
    clima: String,

): Pista(longitud, clima){
  override fun aplicarCondiciones(vehiculo: Vehiculo){
      if(clima=="lloviendo"){
          vehiculo.velocidadActual = vehiculo.velocidadActual - (vehiculo.velocidadActual /2)
      }else if (clima == "niebla"){
          vehiculo.velocidadActual = vehiculo.velocidadActual - ((vehiculo.velocidadActual*80)/100)
      }else if (clima == "soleado"){
          vehiculo.combustible = vehiculo.combustible - ((vehiculo.combustible*5)/100)

      }
  }
    override fun cambiarClima(){
        val lista = listOf("lloviendo","niebla","soleado","normal")
        clima = lista.random()
        println("Clima ahora es ${clima}")
    }

    override fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
        val eventos = listOf("pinchazo","fallo mecanico","encontrar combustible")
        val eventosAleatorios = eventos.random()

        if(eventosAleatorios=="pinchazo"){
            vehiculo.velocidadActual = vehiculo.velocidadActual - vehiculo.frenado
        }else if(eventosAleatorios=="fallo mecanico"){
            vehiculo.velocidadActual = 0
        }else if(eventosAleatorios=="encontrar combustible"){
            vehiculo.combustible = vehiculo.combustible + ((vehiculo.combustible*20)/100)
        }
    }
}