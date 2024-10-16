//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val camion = Camion("Mercedes Benz")
    val moto = Moto("Honda")
    val autodeportivo = AutoDeportivo ("Ferrari")

    moto.avanzar()
    moto.acelerar()
    moto.frenar()
    println (moto.toString())

    camion.avanzar()
    camion.acelerar()
    camion.frenar()
   println(camion.toString())

    autodeportivo.avanzar()
    autodeportivo.acelerar()
    autodeportivo.frenar()
    println(autodeportivo.toString())
}


