-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-08-2023 a las 17:47:45
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_venta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `apellido` varchar(200) NOT NULL,
  `correo` varchar(150) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `pass` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id`, `nombre`, `apellido`, `correo`, `usuario`, `pass`) VALUES
(1, 'rodrigo', 'cadillo', 'rodriousbig73@gmail.com', 'rodrious', '236'),
(2, 'marcos', 'michigan', 'marcomichigan@gmail.com', 'marco', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `correoEmple` varchar(200) NOT NULL,
  `passEmple` varchar(10) NOT NULL,
  `nombreEmple` varchar(100) NOT NULL,
  `appaEmple` varchar(100) NOT NULL,
  `apmaEmple` varchar(100) NOT NULL,
  `dniEmple` varchar(9) NOT NULL,
  `celuEmple` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `correoEmple`, `passEmple`, `nombreEmple`, `appaEmple`, `apmaEmple`, `dniEmple`, `celuEmple`) VALUES
(1, 'rodrigo@rodrious.com', '123', 'Juanito', 'Alimaña', 'Mantaña', '73841522', '903845145');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportes`
--

CREATE TABLE `reportes` (
  `idRepo` int(10) NOT NULL,
  `idEmple` int(10) NOT NULL,
  `asunto` varchar(150) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `fecha` date NOT NULL,
  `respuesta` varchar(200) NOT NULL,
  `idAdmin` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reportes`
--

INSERT INTO `reportes` (`idRepo`, `idEmple`, `asunto`, `descripcion`, `fecha`, `respuesta`, `idAdmin`) VALUES
(1, 1, 'Falta de productos', 'El producto laptop hp esta acabandose', '2023-08-04', 'sin respuesta', 1),
(2, 1, 'Laptop HP Dañada', 'No enciende y genera mucho ruido', '2023-08-22', 'sin respuesta', 1),
(3, 1, 'Laptop HP Dañada', 'No enciende y genera mucho ruido', '2023-08-22', 'sin respuesta', 2),
(4, 1, 'iPhone 14 Pro Max Bateria', 'La condicion de la bateria se bajo a 20%', '2023-08-22', 'sin respuesta', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnologia`
--

CREATE TABLE `tecnologia` (
  `idproducto` int(11) NOT NULL,
  `nombreproducto` int(11) NOT NULL,
  `proveedorproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL,
  `marca` varchar(200) NOT NULL,
  `categoria` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD PRIMARY KEY (`idRepo`);

--
-- Indices de la tabla `tecnologia`
--
ALTER TABLE `tecnologia`
  ADD PRIMARY KEY (`idproducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `reportes`
--
ALTER TABLE `reportes`
  MODIFY `idRepo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tecnologia`
--
ALTER TABLE `tecnologia`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
