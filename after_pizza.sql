-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 24-05-2021 a las 18:24:27
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `after_pizzap`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarBoleta` (IN `id_pedido` VARCHAR(15), IN `pago` DOUBLE)  BEGIN

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

    INSERT INTO BOLETA VALUES(codigo, id_pedido, mostrarFecha,pago);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarCarrito` (`idU` VARCHAR(15), `idP` VARCHAR(15), `cant` INT(35))  INSERT INTO CARRITO (id_user,id_producto,cantidad) VALUES(idU, idP, cant)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarCategoria` (`nombre` VARCHAR(160))  BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_categoria),5)+1 FROM CATEGORIA);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('CP',RIGHT(CONCAT('0000',contador),5));

    INSERT INTO Categoria(id_categoria, nombre)
    VALUES(codigo, nombre);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarDetalleB` (IN `idP` VARCHAR(15), IN `idB` VARCHAR(15), IN `cant` INT(30), IN `preU` DOUBLE(6,2), IN `estado` VARCHAR(80))  BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);
    DECLARE pT DOUBLE(6,2);

    SET contador = (SELECT RIGHT(MAX(id_detalle),5)+1 FROM DETALLE_COMPRA);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('DB',RIGHT(CONCAT('00000',contador),5));

    SET pT = cant * preU;

    INSERT INTO DETALLE_COMPRA VALUES(codigo, idP, idB, cant, pT, estado);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarPedido` (`estado` VARCHAR(50), `idU` VARCHAR(15))  BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_pedido),5)+1 FROM PEDIDO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('PE',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO PEDIDO VALUES(codigo, estado, idU);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarProducto` (`idCat` VARCHAR(15), `nom` VARCHAR(160), `descrip` VARCHAR(245), `img` VARCHAR(200), `precio` DOUBLE(4,2))  BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_producto),5)+1 FROM PRODUCTO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('P',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO PRODUCTO VALUES(codigo, idCat, nom, descrip, img, precio);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarTarjeta` (`numeroT` INT(16), `idU` VARCHAR(15))  BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_tarjeta),5)+1 FROM TARJETA_CREDITO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('T',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO TARJETA_CREDITO VALUES(codigo, idU, numeroT);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agregarUsuario` (IN `id_rol` VARCHAR(15), IN `nombre` VARCHAR(90), IN `email` VARCHAR(90), IN `password` VARCHAR(20), IN `domicilio` VARCHAR(200), IN `foto` VARCHAR(120))  BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_user),5)+1 FROM USUARIOS);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('U',RIGHT(CONCAT('00000',contador),5));

    INSERT INTO USUARIOS(id_user, id_rol, nombre, email, password, domicilio,fotoPerfil)
    VALUES(codigo, id_rol, nombre, email, password, domicilio,foto);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarBoleta` (`idB` VARCHAR(15))  DELETE FROM BOLETA WHERE id_boleta = idB$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarCarrito` (`idU` VARCHAR(15))  DELETE FROM CARRITO WHERE id_user = idU$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarCategoria` (IN `id_categ` VARCHAR(15))  DELETE FROM categoria WHERE id_categoria = id_categ$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarDetalleB` (IN `idDB` VARCHAR(15))  DELETE FROM DETALLE_COMPRA WHERE id_detalle = idDB$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarPedido` (`idP` VARCHAR(15))  DELETE FROM PEDIDO WHERE id_pedido = idP$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarProducto` (`idP` VARCHAR(15))  DELETE FROM PRODUCTO WHERE id_producto = idP$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarProductoC` (`idC` INT(15))  DELETE FROM CARRITO WHERE id_carrito = idC$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarUsuario` (`idU` VARCHAR(15))  DELETE FROM USUARIOS WHERE id_user = idU$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `existeUsuario` (`correo` VARCHAR(90))  SELECT id_user FROM USUARIOS AS U WHERE U.email = correo$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarProductosXCategoria` (`id_categoria` VARCHAR(15))  SELECT P.id_producto, P.nombre, P.descripcion, P.imagen, P.precio
FROM producto P WHERE P.id_categoria = id_categoria$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificaCateg` (IN `id` VARCHAR(15), IN `nom` VARCHAR(160))  UPDATE categoria AS c SET c.id_categoria = id, c.nombre = nom
WHERE c.id_categoria = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificarCarrito` (`idC` VARCHAR(15), `cant` INT(35))  UPDATE CARRITO AS C SET C.cantidad = cant WHERE C.id_carrito = idC$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificarDatosU` (IN `idU` VARCHAR(15), IN `nom` VARCHAR(90), IN `correo` VARCHAR(90), IN `pass` VARCHAR(20), IN `domi` VARCHAR(200), IN `idrol` VARCHAR(15), IN `foto` VARCHAR(120))  UPDATE USUARIOS AS U SET U.nombre = nom, U.email = correo, U.password = pass, U.domicilio = domi, U.id_rol=idrol, U.fotoPerfil=foto
WHERE U.id_user = idU$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificarPedido` (`idP` VARCHAR(15), `estado` VARCHAR(50))  UPDATE PEDIDO AS P SET P.estado = estado WHERE P.id_pedido = idP$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificarProducto` (`idP` VARCHAR(15), `nom` VARCHAR(160), `descrip` VARCHAR(245), `img` VARCHAR(200), `pre` DOUBLE(4,2))  UPDATE PRODUCTO AS P SET P.nombre = nom, P.descripcion = descrip, P.imagen = img, P.precio = pre
WHERE P.id_producto = idP$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarBoleta` ()  SELECT * FROM BOLETA$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarCarrito` ()  SELECT * FROM CARRITO$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarDatosCateg` (IN `id` VARCHAR(15))  SELECT * FROM categoria AS c WHERE c.id_categoria = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarDatosU` (`idU` VARCHAR(15))  SELECT * FROM USUARIOS AS U WHERE U.id_user = idU$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarDetalleB` (`idDB` VARCHAR(15))  SELECT * FROM DETALLE_COMPRA WHERE num_detalle = idDB$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarProductos` ()  SELECT P.id_producto, C.nombre, P.nombre, P.descripcion, P.imagen, P.precio, P.id_categoria
FROM producto P INNER JOIN categoria C ON P.id_categoria = C.id_categoria
ORDER BY P.nombre$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarUnProducto` (`idP` VARCHAR(15))  SELECT * FROM producto WHERE id_producto = idP$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `verificacionLogeoU` (IN `correo` VARCHAR(90), IN `password` VARCHAR(20))  SELECT id_user, nombre, id_rol FROM USUARIOS AS U 
WHERE U.email = correo AND U.password = password$$

--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `codigoProducto` () RETURNS VARCHAR(15) CHARSET utf8mb4 BEGIN

    DECLARE contador INT;
    DECLARE codigo VARCHAR(15);

    SET contador = (SELECT RIGHT(MAX(id_producto),5)+1 FROM PRODUCTO);

    SET contador = IFNULL(contador, 1); 

    SET codigo =  CONCAT('P',RIGHT(CONCAT('00000',contador),5));

    RETURN codigo;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `id_boleta` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `id_pedido` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fecha` varchar(22) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `pago` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `boleta`
--

INSERT INTO `boleta` (`id_boleta`, `id_pedido`, `fecha`, `pago`) VALUES
('P00001', 'PE00001', '24-May-2021 12:29 AM', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrito`
--

CREATE TABLE `carrito` (
  `id_carrito` int(15) NOT NULL,
  `id_user` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_producto` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cantidad` int(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(160) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nombre`) VALUES
('CP00001', 'pizzas'),
('CP00002', 'bebidas'),
('CP00003', 'salsas'),
('CP00004', 'postres'),
('CP00005', 'pruevaCategoria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE `detalle_compra` (
  `id_detalle` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `id_producto` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_boleta` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cantidad` int(30) DEFAULT NULL,
  `precioSubTotal` double(6,2) DEFAULT NULL,
  `estado` varchar(80) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `detalle_compra`
--

INSERT INTO `detalle_compra` (`id_detalle`, `id_producto`, `id_boleta`, `cantidad`, `precioSubTotal`, `estado`) VALUES
('DB00001', 'P00003', 'P00001', 2, 66.00, 'PENDIENTE'),
('DB00002', NULL, 'P00001', 4, 80.00, 'PENDIENTE'),
('DB00003', NULL, 'P00001', 2, 25.24, 'PENDIENTE'),
('DB00004', NULL, 'P00001', 3, 3.00, 'COMPRADO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulo`
--

CREATE TABLE `modulo` (
  `id_mod` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `modulo`
--

INSERT INTO `modulo` (`id_mod`, `nombre`) VALUES
('M0001', 'Compra'),
('M0002', 'Roles'),
('M0003', 'Usuarios'),
('M0004', 'Permisos'),
('M0005', 'Producto'),
('M0006', 'Categoria'),
('M0007', 'Pedido'),
('M0008', 'Barra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operacion`
--

CREATE TABLE `operacion` (
  `id_ope` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `id_mod` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `operacion`
--

INSERT INTO `operacion` (`id_ope`, `id_mod`, `nombre`) VALUES
('OP001', 'M0001', 'agregar'),
('OP002', 'M0001', 'eliminar'),
('OP003', 'M0001', 'editar'),
('OP004', 'M0001', 'ver'),
('OP005', 'M0002', 'agregar'),
('OP006', 'M0002', 'eliminar'),
('OP007', 'M0002', 'editar'),
('OP008', 'M0002', 'ver'),
('OP009', 'M0003', 'agregar'),
('OP010', 'M0003', 'eliminar'),
('OP011', 'M0003', 'editar'),
('OP012', 'M0003', 'ver'),
('OP013', 'M0004', 'agregar'),
('OP014', 'M0004', 'eliminar'),
('OP015', 'M0004', 'editar'),
('OP016', 'M0004', 'ver'),
('OP017', 'M0005', 'agregar'),
('OP018', 'M0005', 'eliminar'),
('OP019', 'M0005', 'editar'),
('OP020', 'M0005', 'ver'),
('OP021', 'M0006', 'agregar'),
('OP022', 'M0006', 'eliminar'),
('OP023', 'M0006', 'editar'),
('OP024', 'M0006', 'ver'),
('OP025', 'M0007', 'agregar'),
('OP026', 'M0007', 'eliminar'),
('OP027', 'M0007', 'editar'),
('OP028', 'M0007', 'ver'),
('OP029', 'M0008', 'ver');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_user` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `estado`, `id_user`) VALUES
('PE00001', 'PENDIENTE', 'U00001');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `id_categoria` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nombre` varchar(160) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcion` varchar(245) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `imagen` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `precio` double(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `id_categoria`, `nombre`, `descripcion`, `imagen`, `precio`) VALUES
('P00003', 'CP00001', 'Hawaiana', 'xD', 'P0000371.jpeg', 32.70),
('P00004', 'CP00001', 'Mozzarella', 'Para los amantes del queso una deliciosa pizza con nuestro queso mozzarella gratinado.', 'P00004.jpg', 10.00),
('P00005', 'CP00001', 'Peperoni', 'Sabor incomparable de pepperoni americano y queso mozzarella.', 'P0000537.jpg', 10.00),
('P00006', 'CP00001', 'prueva2', 'asas', 'P0000617.jpeg', 25.00),
('P00007', 'CP00005', 'pruevaPractica', 'pdd', 'P0000719.gif', 20.00),
('P00008', 'CP00002', 'PRUEBABEVIDA', 'BEVIDA', 'P00008.png', 1.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id_rol` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id_rol`, `nombre`) VALUES
('R001', 'Administrador'),
('R002', 'Usuario'),
('R003', 'Empleado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol_ope`
--

CREATE TABLE `rol_ope` (
  `id_rol_op` int(15) NOT NULL,
  `id_rol` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_ope` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `rol_ope`
--

INSERT INTO `rol_ope` (`id_rol_op`, `id_rol`, `id_ope`) VALUES
(1, 'R001', 'OP005'),
(2, 'R001', 'OP006'),
(3, 'R001', 'OP007'),
(4, 'R001', 'OP008'),
(5, 'R001', 'OP009'),
(6, 'R001', 'OP010'),
(7, 'R001', 'OP011'),
(8, 'R001', 'OP012'),
(9, 'R001', 'OP017'),
(10, 'R001', 'OP018'),
(11, 'R001', 'OP019'),
(12, 'R001', 'OP020'),
(13, 'R001', 'OP021'),
(14, 'R001', 'OP022'),
(15, 'R001', 'OP023'),
(16, 'R001', 'OP024'),
(17, 'R001', 'OP026'),
(18, 'R001', 'OP028'),
(19, 'R001', 'OP029'),
(20, 'R002', 'OP001'),
(21, 'R002', 'OP002'),
(22, 'R002', 'OP003'),
(23, 'R002', 'OP009'),
(24, 'R002', 'OP010'),
(25, 'R002', 'OP011'),
(26, 'R002', 'OP020'),
(27, 'R002', 'OP025'),
(28, 'R002', 'OP026'),
(29, 'R002', 'OP027'),
(30, 'R003', 'OP012'),
(31, 'R003', 'OP017'),
(32, 'R003', 'OP018'),
(33, 'R003', 'OP019'),
(34, 'R003', 'OP020'),
(35, 'R003', 'OP024'),
(36, 'R003', 'OP026'),
(37, 'R003', 'OP028'),
(38, 'R001', 'OP005'),
(39, 'R001', 'OP006'),
(40, 'R001', 'OP007'),
(41, 'R001', 'OP008'),
(42, 'R001', 'OP009'),
(43, 'R001', 'OP010'),
(44, 'R001', 'OP011'),
(45, 'R001', 'OP012'),
(46, 'R001', 'OP017'),
(47, 'R001', 'OP018'),
(48, 'R001', 'OP019'),
(49, 'R001', 'OP020'),
(50, 'R001', 'OP021'),
(51, 'R001', 'OP022'),
(52, 'R001', 'OP023'),
(53, 'R001', 'OP024'),
(54, 'R001', 'OP026'),
(55, 'R001', 'OP028'),
(56, 'R001', 'OP029'),
(57, 'R002', 'OP001'),
(58, 'R002', 'OP002'),
(59, 'R002', 'OP003'),
(60, 'R002', 'OP009'),
(61, 'R002', 'OP010'),
(62, 'R002', 'OP011'),
(63, 'R002', 'OP020'),
(64, 'R002', 'OP025'),
(65, 'R002', 'OP026'),
(66, 'R002', 'OP027'),
(67, 'R003', 'OP012'),
(68, 'R003', 'OP017'),
(69, 'R003', 'OP018'),
(70, 'R003', 'OP019'),
(71, 'R003', 'OP020'),
(72, 'R003', 'OP024'),
(73, 'R003', 'OP026'),
(74, 'R003', 'OP028');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta_credito`
--

CREATE TABLE `tarjeta_credito` (
  `id_tarjeta` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `id_user` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `num_tarjeta` int(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_user` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `id_rol` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nombre` varchar(90) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `email` varchar(90) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `domicilio` varchar(150) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `fotoPerfil` varchar(120) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_user`, `id_rol`, `nombre`, `email`, `password`, `domicilio`, `fotoPerfil`) VALUES
('U00001', 'R001', 'Admin', 'Admin@hotmail.com', '123', 'adminDomicilio', 'Administrador/images/FotoPerfil/conocimiento2.jpg'),
('U00002', 'R001', 'victo', 'victor-raul-22@hotmail.com', '123', 'asasas', 'Administrador/images/FotoPerfil/concocimiento3.jpeg'),
('U00003', 'R001', 'victo', 'julio@hotmail.com', '123', 'fssa', 'Administrador/images/FotoPerfil/concocimiento3.jpeg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`id_boleta`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Indices de la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD PRIMARY KEY (`id_carrito`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_boleta` (`id_boleta`);

--
-- Indices de la tabla `modulo`
--
ALTER TABLE `modulo`
  ADD PRIMARY KEY (`id_mod`);

--
-- Indices de la tabla `operacion`
--
ALTER TABLE `operacion`
  ADD PRIMARY KEY (`id_ope`),
  ADD KEY `id_mod` (`id_mod`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_user` (`id_user`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `rol_ope`
--
ALTER TABLE `rol_ope`
  ADD PRIMARY KEY (`id_rol_op`),
  ADD KEY `id_rol` (`id_rol`),
  ADD KEY `id_ope` (`id_ope`);

--
-- Indices de la tabla `tarjeta_credito`
--
ALTER TABLE `tarjeta_credito`
  ADD PRIMARY KEY (`id_tarjeta`),
  ADD KEY `id_user` (`id_user`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `id_rol` (`id_rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carrito`
--
ALTER TABLE `carrito`
  MODIFY `id_carrito` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rol_ope`
--
ALTER TABLE `rol_ope`
  MODIFY `id_rol_op` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD CONSTRAINT `boleta_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD CONSTRAINT `carrito_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `usuarios` (`id_user`),
  ADD CONSTRAINT `carrito_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `detalle_compra_ibfk_2` FOREIGN KEY (`id_boleta`) REFERENCES `boleta` (`id_boleta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_compra_ibfk_3` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Filtros para la tabla `operacion`
--
ALTER TABLE `operacion`
  ADD CONSTRAINT `operacion_ibfk_1` FOREIGN KEY (`id_mod`) REFERENCES `modulo` (`id_mod`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `usuarios` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);

--
-- Filtros para la tabla `rol_ope`
--
ALTER TABLE `rol_ope`
  ADD CONSTRAINT `rol_ope_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`),
  ADD CONSTRAINT `rol_ope_ibfk_2` FOREIGN KEY (`id_ope`) REFERENCES `operacion` (`id_ope`);

--
-- Filtros para la tabla `tarjeta_credito`
--
ALTER TABLE `tarjeta_credito`
  ADD CONSTRAINT `tarjeta_credito_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `usuarios` (`id_user`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
