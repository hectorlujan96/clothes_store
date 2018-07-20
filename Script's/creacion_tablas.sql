-- create schema tienda_ropa;
set search_path to tienda_ropa;

create table cliente
(
	id_c serial primary key,
	nombre varchar (30),
	primer_ap varchar (20),
	segundo_ap varchar (20),
	fecha_n date,
	sexo varchar (10),
	domicilio varchar (100),
	n_telefono varchar (20),
	RFC varchar (30)
);

create table empleado
(
	id_e serial primary key,
	nombre varchar (30),
	primer_ap varchar (20),
	segundo_ap varchar (20),
	fecha_n date,
	sexo varchar (10),
	domicilio varchar (100),
	n_telefono varchar (20),
	usuario varchar (20),
	contraseña varchar (40)
);

create table proveedor
(
	id_p serial primary key,
	razon_social varchar (50),
	n_telefono varchar (20),
	direccion varchar (100),
	correo_e varchar (50)
);

create table prenda
(
	id serial primary key,
	marca varchar (30),
	talla varchar (20),
	precio_c numeric (8,3),
	precio_v numeric (8,3),
	existencia int,
	observaciones varchar (200)
);

create table compra
(
	folio_c serial primary key,
	fecha_compra date
);

create table venta
(
	folio_v serial primary key,
	fecha_v date
);

create table devolucion
(
	id_dev serial primary key,
	fecha_devolucion date,
	observaciones varchar (400)
);

create table detalle_compra
(
	id_prenda integer references prenda(id),
	id_compra integer references compra(folio_c),
	id_dc serial,
	cantidad int,
	precio numeric (8,3)
);

create table detalle_venta
(
	folio_v serial references venta(folio_v),
	id_prenda serial references prenda(id),
	id serial,
	cantidad integer,
	precio numeric (8,3)
);
--insert into empleado(nombre, primer_ap, segundo_ap, fecha_n, sexo, domicilio, n_telefono) values ()
--drop table empleado;

