create table paciente (
uuid varchar2(50) primary key,
nombre varchar2(30) not null,
apellido varchar2(30) not null,
edad number not null,
enfermedad varchar2(50) not null,
num_habitacion number not null,
num_cama number not null,
medicamentos varchar2(100) not null,
fecha_ingreso date not null,
hora_aplicacion_medicamentos varchar2(75) not null
);