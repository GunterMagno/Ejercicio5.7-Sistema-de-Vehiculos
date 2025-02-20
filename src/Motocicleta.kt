class Motocicleta(marca: String,modelo: String,capacidadCombustible: Int,val cilindrada: Int) :Vehiculo(marca,modelo, capacidadCombustible){

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()-40
    }

    override fun mostrarInformacion() {
        println("Vehiculo(moto) -> Marca = $marca, modelo = $modelo, capacidad = $capacidadCombustible, cilindrada = $cilindrada")
    }
}
