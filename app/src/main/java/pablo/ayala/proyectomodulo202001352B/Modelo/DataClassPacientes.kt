package pablo.ayala.proyectomodulo202001352B.Modelo

import java.util.Date

data class pacientes(
    val uuid: String,
    var nombre: String,
    val apellido: String,
    val edad: Int,
    val enfermedad: String,
    val num_habitacion: Int,
    val num_cama: Int,
    val medicamento: String,
    val fecha_ingreso: Date,
    val hora_aplicacion_medicamentos: String
    )