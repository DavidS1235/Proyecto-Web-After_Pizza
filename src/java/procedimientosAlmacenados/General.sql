---Comando para crear una Base de datos
CREATE DATABASE AFTER_PIZZA;


---=====================================================================---
---============================= USUARIO ===============================---
---=====================================================================---

use AFTER_PIZZA;

---Comando para crear la tabla "Usuarios"
CREATE TABLE USUARIOS(
id_user VARCHAR(15),
id_rol VARCHAR(15),
nombre VARCHAR(90) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
email VARCHAR(90) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
password VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
domicilio VARCHAR(150) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
PRIMARY KEY (id_user),
FOREIGN KEY (id_rol) REFERENCES ROLES(id_rol)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


use AFTER_PIZZA;
---Creación de un procedimiento almacenado para la creación de nuevos Usuarios
DELIMITER $$
CREATE PROCEDURE agregarUsuario(
id_rol VARCHAR(15),
nombre VARCHAR(90),
email VARCHAR(90),
password VARCHAR(20),
domicilio VARCHAR(200)
)
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_user),5)+1 FROM USUARIOS);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('U',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO USUARIOS(id_user, id_rol, nombre, email, password, domicilio)
    VALUES(codigo, id_rol, nombre, email, password, domicilio);

END $$
DELIMITER;


---Comando para el consultar si existe el usuario
CREATE PROCEDURE existeUsuario(correo VARCHAR(90))
SELECT id_user FROM USUARIOS AS U WHERE U.email = correo;

---Comando para verificación de logueo
CREATE PROCEDURE verificacionLogeoU(correo VARCHAR(90),password VARCHAR(20))
SELECT id_user, nombre, id_rol FROM USUARIOS AS U 
WHERE U.email = correo AND U.password = password;


---Comando para mostrarDatosU
CREATE PROCEDURE mostrarDatosU(idU VARCHAR(15))
SELECT * FROM USUARIOS AS U WHERE U.id_user = idU;


---Comando para modificar producto
CREATE PROCEDURE modificarDatosU(idU VARCHAR(15), nom VARCHAR(90),
correo VARCHAR(90), pass VARCHAR(20), domi VARCHAR(200))
UPDATE USUARIOS AS U SET U.nombre = nom, U.email = correo, U.password = pass, U.domicilio = domi
WHERE U.id_user = idU;


---Comando para eliminar usuario
CREATE PROCEDURE eliminarUsuario(idU VARCHAR(15))
DELETE FROM USUARIOS WHERE id_user = idU;










---=====================================================================---
---======================== TARJETA_CREDITO ============================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "TARJETA_CREDITO"
CREATE TABLE TARJETA_CREDITO(
id_tarjeta VARCHAR(15),
id_user VARCHAR(15),
num_tarjeta INT(16),
PRIMARY KEY (id_tarjeta),
FOREIGN KEY (id_user) REFERENCES USUARIOS(id_user)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

use AFTER_PIZZA;

---Comando para añadir tarjeta
DELIMITER $$
CREATE PROCEDURE agregarTarjeta(numeroT INT(16), idU VARCHAR(15))
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_tarjeta),5)+1 FROM TARJETA_CREDITO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('T',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO TARJETA_CREDITO VALUES(codigo, idU, numeroT);

END $$
DELIMITER;





---=====================================================================---
---=============================== ROLES ===============================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "Roles"
CREATE TABLE ROLES(
id_rol VARCHAR(15),
nombre VARCHAR(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
PRIMARY KEY (id_rol)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

use AFTER_PIZZA;

---Comando para añadir roles
INSERT INTO ROLES VALUES('R001','Administrador');

INSERT INTO ROLES VALUES('R002','Usuario');

INSERT INTO ROLES VALUES('R003','Empleado');





---=====================================================================---
---============================= ROL-OPE ===============================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "ROL-OPE"
CREATE TABLE ROL_OPE(
id_rol_op INT(15) NOT NULL AUTO_INCREMENT,
id_rol VARCHAR(15),
id_ope VARCHAR(15),
PRIMARY KEY (id_rol_op),
FOREIGN KEY (id_rol) REFERENCES ROLES(id_rol),
FOREIGN KEY (id_ope) REFERENCES OPERACION(id_ope)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


use AFTER_PIZZA;
---Comando para añadir roles-operaciones
---Administrador
---INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP004'); COMPRAS
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP005');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP006');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP007');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP008');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP009');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP010');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP011');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP012');
---INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP013'); PERMISOS
---INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP014');
---INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP015');
---INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP016');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP017');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP018');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP019');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP020');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP021');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP022');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP023');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP024');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP026');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP028');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R001','OP029');

---Usuario
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP001');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP002');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP003');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP009');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP010');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP011');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP020');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP025');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP026');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R002','OP027');

---Empleado
---INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP004'); COMPRA
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP012');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP017');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP018');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP019');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP020');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP024');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP026');
INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP028');
---INSERT INTO ROL_OPE (id_rol, id_ope) VALUES('R003','OP029'); BARRA








---=====================================================================---
---=========================== OPERACION ===============================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "OPERACION"
CREATE TABLE OPERACION(
id_ope VARCHAR(15),
id_mod VARCHAR(15),
nombre VARCHAR(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
PRIMARY KEY (id_ope),
FOREIGN KEY (id_mod) REFERENCES MODULO(id_mod)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


use AFTER_PIZZA;
---Comando para añadir operaciones  
INSERT INTO OPERACION VALUES('OP001','M0001','agregar');

INSERT INTO OPERACION VALUES('OP002','M0001','eliminar');

INSERT INTO OPERACION VALUES('OP003','M0001','editar');

INSERT INTO OPERACION VALUES('OP004','M0001','ver');

INSERT INTO OPERACION VALUES('OP005','M0002','agregar');

INSERT INTO OPERACION VALUES('OP006','M0002','eliminar');

INSERT INTO OPERACION VALUES('OP007','M0002','editar');

INSERT INTO OPERACION VALUES('OP008','M0002','ver');

INSERT INTO OPERACION VALUES('OP009','M0003','agregar');

INSERT INTO OPERACION VALUES('OP010','M0003','eliminar');

INSERT INTO OPERACION VALUES('OP011','M0003','editar');

INSERT INTO OPERACION VALUES('OP012','M0003','ver');

INSERT INTO OPERACION VALUES('OP013','M0004','agregar');

INSERT INTO OPERACION VALUES('OP014','M0004','eliminar');

INSERT INTO OPERACION VALUES('OP015','M0004','editar');

INSERT INTO OPERACION VALUES('OP016','M0004','ver');

INSERT INTO OPERACION VALUES('OP017','M0005','agregar');

INSERT INTO OPERACION VALUES('OP018','M0005','eliminar');

INSERT INTO OPERACION VALUES('OP019','M0005','editar');

INSERT INTO OPERACION VALUES('OP020','M0005','ver');

INSERT INTO OPERACION VALUES('OP021','M0006','agregar');

INSERT INTO OPERACION VALUES('OP022','M0006','eliminar');

INSERT INTO OPERACION VALUES('OP023','M0006','editar');

INSERT INTO OPERACION VALUES('OP024','M0006','ver');

INSERT INTO OPERACION VALUES('OP025','M0007','agregar');

INSERT INTO OPERACION VALUES('OP026','M0007','eliminar');

INSERT INTO OPERACION VALUES('OP027','M0007','editar');

INSERT INTO OPERACION VALUES('OP028','M0007','ver');

INSERT INTO OPERACION VALUES('OP029','M0008','ver');


---=====================================================================---
---============================== MODULO ===============================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "MODULO"
CREATE TABLE MODULO(
id_mod VARCHAR(15),
nombre VARCHAR(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
PRIMARY KEY (id_mod)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


use AFTER_PIZZA;
---Comando para añadir modulos

INSERT INTO MODULO VALUES('M0001','Compra');

INSERT INTO MODULO VALUES('M0002','Roles');

INSERT INTO MODULO VALUES('M0003','Usuarios');

INSERT INTO MODULO VALUES('M0004','Permisos');

INSERT INTO MODULO VALUES('M0005','Producto');

INSERT INTO MODULO VALUES('M0006','Categoria');

INSERT INTO MODULO VALUES('M0007','Pedido');

INSERT INTO MODULO VALUES('M0008','Barra');





---=====================================================================---
---============================= CARRITO ===============================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "CARRITO"
CREATE TABLE CARRITO(
id_carrito INT(15) NOT NULL AUTO_INCREMENT,
id_user VARCHAR(15),
id_producto VARCHAR(15),
cantidad INT(35),
PRIMARY KEY (id_carrito),
FOREIGN KEY (id_user) REFERENCES USUARIOS(id_user),
FOREIGN KEY (id_producto) REFERENCES PRODUCTO(id_producto)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



use AFTER_PIZZA;
---Comando para añadir carrito
CREATE PROCEDURE agregarCarrito(idU VARCHAR(15), idP VARCHAR(15), cant INT(35))
INSERT INTO CARRITO (id_user,id_producto,cantidad) VALUES(idU, idP, cant);



---Comando para mostrar contenido del carrito
CREATE PROCEDURE mostrarCarrito()
SELECT * FROM CARRITO;



---Comando para modificar la cantidad de un producto en el Carrito
CREATE PROCEDURE modificarCarrito(idC VARCHAR(15), cant INT(35))
UPDATE CARRITO AS C SET C.cantidad = cant WHERE C.id_carrito = idC;



---Comando para eliminar un producto del Carrito
CREATE PROCEDURE eliminarProductoC(idC INT(15))
DELETE FROM CARRITO WHERE id_carrito = idC;



---Comando para eliminar todo el Carrito
CREATE PROCEDURE eliminarCarrito(idU VARCHAR(15))
DELETE FROM CARRITO WHERE id_user = idU;








---=====================================================================---
---============================ PRODUCTO ===============================---
---=====================================================================---

use AFTER_PIZZA;
---Tabla: "PRODUCTO"
CREATE TABLE PRODUCTO(
id_producto VARCHAR(15),
id_categoria VARCHAR(15),
nombre VARCHAR(160) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
descripcion VARCHAR(245) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
imagen VARCHAR(200),
precio DOUBLE (4,2),
PRIMARY KEY (id_producto),
FOREIGN KEY (id_categoria) REFERENCES CATEGORIA(id_categoria)
);



use AFTER_PIZZA;
---Comando para añadir producto
DELIMITER $$
CREATE PROCEDURE agregarProducto
(
idCat VARCHAR(15), 
nom VARCHAR(160), 
descrip VARCHAR(245), 
img VARCHAR(200),
precio DOUBLE(4,2)
)
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_producto),5)+1 FROM PRODUCTO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('P',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO PRODUCTO VALUES(codigo, idCat, nom, descrip, img, precio);

END $$
DELIMITER;

use AFTER_PIZZA;
---Obtener codigo del producto
DELIMITER $$
CREATE FUNCTION codigoProducto()
RETURNS VARCHAR(15) ---DEFINIMOS EL TIPO DE VARIABLE QUE RETORNARA LA FUNCION
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_producto),5)+1 FROM PRODUCTO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('P',RIGHT(CONCAT('00000',contador),5));

    RETURN codigo;
END $$
DELIMITER;

use AFTER_PIZZA;
SELECT codigoProducto();



use AFTER_PIZZA;
---Comando para mostrar productos
CREATE PROCEDURE mostrarProductos()
SELECT P.id_producto, C.nombre, P.nombre, P.descripcion, P.imagen, P.precio, P.id_categoria
FROM producto P INNER JOIN categoria C ON P.id_categoria = C.id_categoria
ORDER BY P.nombre;


use AFTER_PIZZA;
---Comando para mostrar productos por categoria
CREATE PROCEDURE listarProductosXCategoria(id_categoria VARCHAR(15))
SELECT P.id_producto, P.nombre, P.descripcion, P.imagen, P.precio
FROM producto P WHERE P.id_categoria = id_categoria;


use AFTER_PIZZA;
---Comando mostrar un producto
CREATE PROCEDURE mostrarUnProducto(idP VARCHAR(15))
SELECT * FROM producto WHERE id_producto = idP;



use AFTER_PIZZA;
---Comando para modificar producto
CREATE PROCEDURE modificarProducto(idP VARCHAR(15), nom VARCHAR(160), 
descrip VARCHAR(245), img VARCHAR(200), pre DOUBLE(4,2))
UPDATE PRODUCTO AS P SET P.nombre = nom, P.descripcion = descrip, P.imagen = img, P.precio = pre
WHERE P.id_producto = idP;



use AFTER_PIZZA;
---Comando para eliminar producto
CREATE PROCEDURE eliminarProducto(idP VARCHAR(15))
DELETE FROM PRODUCTO WHERE id_producto = idP;








---=====================================================================---
---=========================== CATEGORIA ===============================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "CATEGORIA"
CREATE TABLE CATEGORIA(
id_categoria VARCHAR(15),
nombre VARCHAR(160) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
PRIMARY KEY (id_categoria)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

use AFTER_PIZZA;
---Comando para añadir categorias
INSERT INTO CATEGORIA VALUES('CP0001','pizzas');

INSERT INTO CATEGORIA VALUES('CP0002','postres');

INSERT INTO CATEGORIA VALUES('CP0003','bebidas');

INSERT INTO CATEGORIA VALUES('CP0004','salsas');

use AFTER_PIZZA;
---Creación de un procedimiento almacenado para la creación de nueva categoria
DELIMITER $$
CREATE PROCEDURE agregarCategoria(

nombre VARCHAR(160)

)
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_categoria),5)+1 FROM CATEGORIA);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('CP',RIGHT(CONCAT('0000',contador),5));

    INSERT INTO Categoria(id_categoria, nombre)
    VALUES(codigo, nombre);

END $$
DELIMITER;





---=====================================================================---
---============================= PEDIDO ================================---
---=====================================================================---

use AFTER_PIZZA;


---Tabla: "PEDIDO"
CREATE TABLE PEDIDO(
id_pedido VARCHAR(15),
estado VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
id_user VARCHAR(15),
PRIMARY KEY (id_pedido),
FOREIGN KEY (id_user) REFERENCES USUARIOS(id_user)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



use AFTER_PIZZA;
---Añadir pedido
DELIMITER $$
CREATE PROCEDURE agregarPedido
(
estado VARCHAR(50),
idU VARCHAR(15)
)
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_pedido),5)+1 FROM PEDIDO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('PE',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO PEDIDO VALUES(codigo, estado, idU);

END $$
DELIMITER;


---Comando para modificar pedido
CREATE PROCEDURE modificarPedido(idP VARCHAR(15), estado VARCHAR(50))
UPDATE PEDIDO AS P SET P.estado = estado WHERE P.id_pedido = idP;


---Comando para eliminar pedido
CREATE PROCEDURE eliminarPedido(idP VARCHAR(15))
DELETE FROM PEDIDO WHERE id_pedido = idP;





---=====================================================================---
---============================= BOLETA ================================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "BOLETA"
CREATE TABLE BOLETA(
id_boleta VARCHAR(15),
id_pedido VARCHAR(15),
fecha VARCHAR(22) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
PRIMARY KEY (id_boleta),
FOREIGN KEY (id_pedido) REFERENCES PEDIDO(id_pedido)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


use AFTER_PIZZA;

---Comando para añadir boleta
DELIMITER $$
CREATE PROCEDURE agregarBoleta
(
id_pedido VARCHAR(15)
)
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);
    DECLARE pT DOUBLE(6,2);
    DECLARE fecha DATETIME;  
    DECLARE mostrarFecha VARCHAR(100);

    SET contador = (SELECT RIGHT(MAX(id_boleta),5)+1 FROM BOLETA);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('P',RIGHT(CONCAT('00000',contador),5));

    SET fecha = (SELECT CURRENT_TIMESTAMP());

    SET mostrarFecha = DATE_FORMAT(fecha, '%d-%M-%Y %h:%i %p'); 

    INSERT INTO BOLETA VALUES(codigo, id_pedido, mostrarFecha);

END $$
DELIMITER;



---Comando para mostrar Boleta
CREATE PROCEDURE mostrarBoleta()
SELECT * FROM BOLETA;



---Comando para eliminar Boleta
CREATE PROCEDURE eliminarBoleta(idB VARCHAR(15))
DELETE FROM BOLETA WHERE id_boleta = idB;








---=====================================================================---
---========================== DETALLE-COMPRA ===========================---
---=====================================================================---

use AFTER_PIZZA;

---Tabla: "DETALLE_COMPRA"
CREATE TABLE DETALLE_COMPRA(
id_detalle VARCHAR(15),
id_producto VARCHAR(15),
id_boleta VARCHAR(15),
cantidad INT(30),
precioSubTotal DOUBLE(6,2),
estado VARCHAR(80) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
PRIMARY KEY (id_detalle),
FOREIGN KEY (id_producto) REFERENCES PRODUCTO(id_producto),
FOREIGN KEY (id_boleta) REFERENCES BOLETA(id_boleta)
)DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



use AFTER_PIZZA;
---Añadir detalle pedido
DELIMITER $$
CREATE PROCEDURE agregarDetalleB
(
idP VARCHAR(15),
idB VARCHAR(15),
cant INT(30),
preU DOUBLE(6,2),
estado VARCHAR(80)
)
BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);
    DECLARE pT DOUBLE(6,2);

    SET contador = (SELECT RIGHT(MAX(num_detalle),5)+1 FROM DETALLE_COMPRA);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('DB',RIGHT(CONCAT('00000',contador),5));

    SET pT = cant * preU;

    INSERT INTO DETALLE_COMPRA VALUES(codigo, idP, idB, cant, pT, estado);

END $$
DELIMITER;



---Comando para mostrar detalle de la boleta
CREATE PROCEDURE mostrarDetalleB(idDB VARCHAR(15))
SELECT * FROM DETALLE_COMPRA WHERE num_detalle = idDB;



---Comando para eliminar detalle de la boleta
CREATE PROCEDURE eliminarDetalleB(idDB VARCHAR(15))
DELETE FROM DETALLE_COMPRA WHERE num_detalle = idDB;



