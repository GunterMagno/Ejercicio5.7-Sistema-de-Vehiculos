

fun main(){
    val coche = Automovil("a","a",3,"a200")
    coche.mostrarInformacion()
    println(coche.calcularAutonomia())

    val moto = Motocicleta("aceituna","Mitsubishi",40,340)
    moto.mostrarInformacion()
    println(moto.calcularAutonomia())

}
