open class Vehiculo(val marca: String,val modelo: String,val capacidadCombustible: Int = 50){

    open fun mostrarInformacion(){
        println("Vehiculo -> Marca = $marca, modelo = $modelo, capacidad = $capacidadCombustible")
    }

    open fun calcularAutonomia(): Int{
        return capacidadCombustible*10
    }
}