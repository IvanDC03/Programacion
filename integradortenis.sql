-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2023 a las 15:40:58
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `integradortenis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `sueldo` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `apuesta`
--

CREATE TABLE `apuesta` (
  `multiplicador` int(20) NOT NULL,
  `apuesta` int(20) NOT NULL,
  `dineroGanado` int(20) NOT NULL,
  `apuestaganada` tinyint(1) NOT NULL,
  `cobro` tinyint(1) NOT NULL,
  `finalizada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistentepartido`
--

CREATE TABLE `asistentepartido` (
  `id` int(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `edad` int(10) NOT NULL,
  `Nacionalidad` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asistentepartido`
--

INSERT INTO `asistentepartido` (`id`, `nombre`, `apellidos`, `edad`, `Nacionalidad`) VALUES
(1, 'Juan', 'Pérez', 25, 'Español'),
(2, 'María', 'Gómez', 30, 'Mexicana'),
(3, 'John', 'Smith', 35, 'Estadounidense'),
(1, 'Carlos', 'González', 28, 'Español'),
(2, 'Luisa', 'Martínez', 32, 'Mexicana'),
(3, 'Emily', 'Johnson', 37, 'Estadounidense'),
(4, 'Mohammed', 'Ahmed', 24, 'Saudí'),
(5, 'Sophie', 'Dupont', 31, 'Francés'),
(6, 'Hiroshi', 'Tanaka', 29, 'Japonés'),
(7, 'Anna', 'Kovalenko', 27, 'Ruso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casadeapuestas`
--

CREATE TABLE `casadeapuestas` (
  `Nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `tarjeta` int(20) NOT NULL,
  `monedero` int(20) NOT NULL,
  `retirarDinero` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadio`
--

CREATE TABLE `estadio` (
  `nombre` varchar(30) NOT NULL,
  `aforo` int(10) NOT NULL,
  `tipoPista` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estadio`
--

INSERT INTO `estadio` (`nombre`, `aforo`, `tipoPista`) VALUES
('All England Lawn Tennis and Cr', 14850, 'Hierba'),
('Arthur Ashe Stadium', 23746, 'Dura'),
('Aviva Centre', 12500, 'Dura'),
('Centre Court', 15000, 'Hierba'),
('Court Philippe-Chatrier', 15000, 'Arcilla'),
('Estadio Manolo Santana', 10500, 'Arcilla'),
('National Tennis Stadium', 15000, 'Dura'),
('Philippe Chatrier', 15000, 'Arcilla'),
('Rod Laver Arena', 15000, 'Dura'),
('Rodney Parade', 7850, 'Hierba'),
('Stadio Olimpico', 102325, 'Dura');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lideres bajo presión`
--

CREATE TABLE `lideres bajo presión` (
  `Nombre` text CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `%Saque` decimal(10,2) NOT NULL,
  `%1Serv` decimal(10,2) NOT NULL,
  `%Puntos` decimal(10,2) NOT NULL,
  `%Gana` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lideres bajo presión`
--

INSERT INTO `lideres bajo presión` (`Nombre`, `%Saque`, `%1Serv`, `%Puntos`, `%Gana`) VALUES
('Novak Djokovic', 251.30, 41.50, 62.80, 72.00),
('Nick Kyrgios', 249.40, 44.00, 75.50, 63.20),
('Borna Coric', 240.30, 36.40, 61.70, 70.80),
('Cameron Norrie', 237.20, 40.70, 61.70, 64.00),
('Brandon Nakashima', 237.10, 35.60, 64.30, 75.70),
('Cristian Garin', 236.00, 39.10, 57.10, 68.40),
('Daniil Medvedev', 235.10, 46.90, 67.90, 61.50),
('Jenson Brooksby', 234.70, 45.10, 61.10, 71.40),
('Karen Khachanov', 234.70, 42.00, 64.30, 51.90),
('Stefanos Tsitsipas', 233.80, 38.40, 66.60, 56.10),
('Carlos Alcaraz', 232.60, 42.00, 64.60, 59.30),
('Jannik Sinner', 231.20, 44.00, 62.60, 66.70),
('Dominic Thiem', 230.60, 40.40, 58.80, 68.20),
('Jason Kubler', 230.10, 44.50, 59.90, 63.20),
('Roberto Carballes Baena', 226.30, 42.70, 63.60, 60.00),
('Botic Van de Zandschulp', 225.10, 39.20, 60.70, 69.60),
('Yoshihito Nishioka', 224.40, 40.80, 59.00, 57.90),
('Marin Cilic', 224.10, 40.50, 62.40, 54.50),
('Felix Auger-Aliassime', 223.30, 37.80, 68.30, 56.10),
('Andrey Rublev', 219.90, 38.80, 63.90, 59.30),
('Hubert Hurkacz', 219.60, 32.70, 64.30, 54.70),
('Holger Rune', 218.90, 42.10, 66.30, 56.30),
('Andy Murray', 218.60, 38.30, 58.50, 57.10),
('Sebastian Korda', 217.50, 42.60, 64.90, 60.00),
('Alexander Zverev', 216.60, 37.70, 58.90, 53.30),
('Nicolas Jarry', 215.90, 34.20, 59.00, 68.20),
('Alex Molcan', 215.90, 40.90, 61.70, 53.30),
('Emil Ruusuvuori', 214.50, 40.00, 59.20, 68.20),
('Dusan Lajovic', 214.40, 38.30, 59.10, 62.50),
('Casper Ruud', 213.40, 36.50, 61.80, 62.50),
('Frances Tiafoe', 213.10, 35.40, 66.60, 66.70),
('Alex de Minaur', 213.00, 42.70, 61.80, 55.60),
('Arthur Rinderknech', 209.90, 33.10, 61.80, 40.00),
('J.J.Wolf', 209.90, 43.70, 64.40, 46.20),
('Taylor Fritz', 207.20, 40.40, 60.80, 52.40);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lideres devolucion`
--

CREATE TABLE `lideres devolucion` (
  `Nombre` text CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `%Saque` decimal(10,2) NOT NULL,
  `%1Serv` decimal(10,2) NOT NULL,
  `%Puntos` decimal(10,2) NOT NULL,
  `%Gana` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lideres devolucion`
--

INSERT INTO `lideres devolucion` (`Nombre`, `%Saque`, `%1Serv`, `%Puntos`, `%Gana`) VALUES
('Daniil Medvedev', 166.70, 33.10, 55.40, 31.50),
('Carlos Alcaraz', 163.80, 35.40, 53.40, 33.00),
('Jannik Sinner', 163.30, 33.50, 54.90, 30.50),
('Novak Djokovic', 161.70, 34.00, 55.50, 30.20),
('Bernabe Zapata Miralles', 160.70, 33.70, 51.20, 29.90),
('Rafael Nadal', 160.20, 34.00, 51.10, 29.70),
('Mikael Ymer', 157.00, 34.70, 51.30, 29.40),
('Alex de Minaur', 155.00, 32.90, 51.80, 27.70),
('Francisco Cerundolo', 153.10, 33.30, 51.70, 27.30),
('Lorenzo Musetti', 153.10, 30.90, 50.90, 25.10),
('Cameron Norrie', 150.70, 31.40, 52.10, 26.50),
('Yoshihito Nishioka', 149.00, 27.70, 54.70, 25.10),
('Jenson Brooksby', 148.80, 31.40, 47.80, 24.50),
('Marin Cilic', 147.70, 31.90, 50.50, 24.80),
('Alejandro Davidovich', 147.70, 31.90, 50.50, 24.80),
('Roberto Carballes Baena', 147.20, 29.00, 51.80, 23.70),
('Jack Draper', 147.00, 28.70, 53.00, 24.80),
('Jaume Munar', 146.90, 33.00, 48.40, 25.20),
('Mackenzie McDonald', 146.30, 30.20, 51.30, 24.10),
('Daniel Evans', 146.10, 30.80, 51.90, 24.10),
('Sebastian Korda', 146.10, 29.80, 50.50, 23.20),
('Marton Fucsovics', 145.80, 30.40, 50.10, 23.10),
('Taylor Fritz', 145.60, 28.40, 52.10, 23.20),
('Botic Van de Zandschulp', 145.30, 30.90, 50.90, 24.10),
('Richard Gasquet', 145.30, 28.30, 50.50, 22.50),
('Diego Schwartzman', 145.20, 32.00, 50.10, 24.10),
('Holger Rune', 145.10, 29.30, 50.80, 23.30),
('Tommy Paul', 144.30, 30.30, 51.90, 24.00),
('Karen Khachanov', 144.00, 29.30, 49.50, 22.30),
('Alexander Zverev', 143.70, 29.80, 51.70, 23.70),
('Emil Ruusuvuori', 143.50, 29.70, 51.80, 22.50),
('Miomir Kecmanovic', 143.50, 28.00, 52.70, 22.30),
('Aslan Karatsev', 143.10, 29.80, 47.80, 20.90),
('Andy Murray', 143.10, 29.10, 52.80, 22.90),
('David Goffin', 142.60, 30.80, 50.20, 23.80);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lideres servicio`
--

CREATE TABLE `lideres servicio` (
  `Nombre` text CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `%Saque` decimal(10,2) NOT NULL,
  `%1Serv` decimal(10,2) NOT NULL,
  `%Puntos` decimal(10,2) NOT NULL,
  `%Gana` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lideres servicio`
--

INSERT INTO `lideres servicio` (`Nombre`, `%Saque`, `%1Serv`, `%Puntos`, `%Gana`) VALUES
('Nick Kyrgios', 311.60, 67.10, 79.70, 59.20),
('Hubert Hurkacz', 298.60, 63.10, 79.80, 53.80),
('Novak Djokovic', 296.20, 66.30, 78.60, 57.20),
('Matteo Berrettini', 292.80, 62.80, 79.70, 51.90),
('Nicolas Jarry', 292.00, 64.00, 78.60, 55.00),
('Stefanos Tsitsipas\r\n', 290.00, 64.40, 77.40, 55.00),
('Felix Auger-Aliassime', 289.40, 63.30, 79.50, 50.70),
('Maxime Cressy', 287.70, 59.20, 80.60, 52.70),
('Taylor Fritz', 286.10, 60.60, 78.30, 53.80),
('Casper Ruud', 283.60, 65.20, 73.80, 56.00),
('Quentin Halys', 282.90, 58.10, 80.00, 49.30),
('Ben Shelton', 282.80, 60.80, 77.00, 53.60),
('Marin Cilic', 282.70, 59.90, 77.90, 51.20),
('Brandon Nakashima', 282.50, 65.90, 75.00, 51.60),
('Pablo Carreno', 282.20, 65.40, 71.60, 57.80),
('Alexei Popyrin', 282.20, 61.80, 76.90, 50.10),
('Daniil Medvedev', 281.10, 64.30, 75.30, 51.40),
('Andrey Rublev', 280.80, 61.60, 76.60, 51.00),
('Tallon Griekspoor', 280.10, 64.10, 75.10, 51.60),
('Lorenzo Sonego', 279.70, 67.80, 73.50, 51.10),
('Karen Khachanov', 279.20, 63.90, 73.70, 53.20),
('Holger Rune', 279.10, 63.30, 73.00, 55.20),
('Carlos Alcaraz', 278.00, 65.90, 71.10, 55.70),
('Bonna Coric', 277.80, 61.30, 75.30, 53.50),
('Frances Tiafoe', 277.50, 58.10, 75.50, 53.10),
('Grigor Dimitrov', 277.30, 62.30, 76.60, 50.40),
('Marc-Andrea Huesler', 277.10, 61.20, 74.70, 52.60),
('Jan-Lennard Struff', 276.90, 57.60, 75.70, 52.80),
('Stan Wawrinka', 276.80, 57.80, 76.00, 52.60),
('Jack Draper', 276.40, 59.70, 75.80, 50.90),
('Arthur Rinderknech', 276.30, 65.60, 72.30, 49.90),
('Benjamin Bonzi', 275.90, 61.80, 73.70, 52.40),
('Alexander Zverev', 275.50, 69.70, 73.80, 45.90),
('Sebastian Korda', 275.40, 62.50, 72.70, 52.10),
('Roberto Bautista', 275.30, 66.00, 70.50, 55.70);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `id` int(10) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `modo` varchar(255) DEFAULT NULL,
  `valido` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`id`, `fecha`, `modo`, `valido`) VALUES
(1, '2023-05-17', 'Modo A', 1),
(2, '2023-05-18', 'Modo B', 0),
(3, '2023-05-19', 'Modo C', 1),
(4, '2023-05-20', 'Modo A', 1),
(5, '2023-05-21', 'Modo B', 0),
(6, '2023-05-22', 'Modo C', 1),
(7, '2023-05-23', 'Modo A', 1),
(8, '2023-05-24', 'Modo B', 0),
(9, '2023-05-25', 'Modo C', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tenistas`
--

CREATE TABLE `tenistas` (
  `Posicion` int(9) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Puntos` varchar(10) NOT NULL,
  `Edad` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tenistas`
--

INSERT INTO `tenistas` (`Posicion`, `Nombre`, `Puntos`, `Edad`) VALUES
(45, 'Adrian Mannarino', '927', 34),
(34, 'Alejandro Davidovich Fokina', '1,115', 23),
(98, 'Alejandro Tabilo', '601', 23),
(18, 'Alex De Minaur', '1,995', 24),
(49, 'Alexander Bublik', '880', 25),
(22, 'Alexander Zverev', '1,630', 26),
(91, 'Andreas Seppi', '628', 38),
(6, 'Andrey Rublev', '4,190', 25),
(42, 'Andy Murray', '965', 36),
(35, 'Ben Shelton', '1,095', 20),
(38, 'Bernabe Zapata Miralles', '1,016', 26),
(95, 'Bjorn Fratangelo', '611', 28),
(16, 'Borna Coric', '2,240', 26),
(30, 'Botic Van De Zandschulp', '1,250', 27),
(47, 'Brandon Nakashima', '902', 21),
(55, 'Cameron Norrie', '809', 26),
(2, 'Carlos Alcaraz', '6,770', 20),
(4, 'Casper Ruud', '5,165', 24),
(65, 'Cristian Garin', '752', 25),
(24, 'Daniel Evans', '1,480', 32),
(3, 'Daniil Medvedev', '5,330', 27),
(96, 'Denis Kudla', '610', 29),
(27, 'Denis Shapovalov', '1,390', 24),
(70, 'Dominik Koepfer', '720', 27),
(46, 'Dusan Lajovic', '924', 32),
(69, 'Egor Gerasimov', '723', 29),
(84, 'Elias Ymer', '661', 25),
(43, 'Emil Ruusuvuori', '957', 24),
(77, 'Federico Coria', '690', 29),
(68, 'Federico Delbonis', '730', 30),
(56, 'Feliciano López', '804', 40),
(10, 'Felix Auger-Aliassime', '3,235', 22),
(12, 'Frances Tiafoe', '2,755', 25),
(31, 'Francisco Cerundolo', '1,200', 24),
(99, 'Gregoire Barrere', '600', 28),
(33, 'Grigor Dimitrov', '1,125', 31),
(59, 'Guido Pella', '790', 31),
(83, 'Henri Laaksonen', '665', 29),
(7, 'Holger Rune', '3,865', 20),
(15, 'Hubert Hurkacz', '2,525', 26),
(73, 'Hugo Dellien', '703', 28),
(28, 'Jan-Lennard Struff', '1,387', 33),
(8, 'Jannik Sinner', '3,525', 21),
(90, 'Jaume Munar', '633', 24),
(39, 'Jiri Lehecka', '992', 21),
(86, 'Jiri Vesely', '652', 28),
(93, 'Joao Sousa', '620', 32),
(51, 'Jordan Thompson', '857', 27),
(97, 'Jozef Kovalik', '605', 29),
(11, 'Karen Khachanov', '3,025', 26),
(53, 'Lloyd Harris', '820', 24),
(19, 'Lorenzo Musetti', '1,960', 21),
(48, 'Lorenzo Sonego', '890', 28),
(87, 'Marcos Giron', '651', 28),
(23, 'Marin Čilić', '1,600', 34),
(58, 'Marton Fucsovics', '798', 29),
(20, 'Matteo Berrettini', '1,832', 27),
(41, 'Maxime Cressy', '985', 26),
(80, 'Mikael Torpegaard', '675', 26),
(66, 'Mikael Ymer', '743', 23),
(37, 'Miomir Kecmanovic', '1,055', 23),
(26, 'Nick Kyrgios', '1,465', 28),
(64, 'Nikoloz Basilashvili', '760', 29),
(1, 'Novak Djokovic', '6,775', 35),
(21, 'Pablo Carreno Busta', '1,785', 31),
(76, 'Pablo Cuevas', '694', 35),
(13, 'Pablo Sastre', '2,680', 27),
(85, 'Pedro Martínez', '660', 24),
(88, 'Peter Gojowczyk', '644', 32),
(54, 'Radu Albot', '812', 32),
(14, 'Rafael Nadal', '2,535', 36),
(52, 'Ricardas Berankis', '839', 31),
(44, 'Richard Gasquet', '931', 36),
(25, 'Roberto Bautista Agut', '1,475', 35),
(63, 'Salvatore Caruso', '768', 29),
(61, 'Sam Querrey', '775', 34),
(40, 'Sebastian Baez', '985', 22),
(29, 'Sebastian Korda', '1,265', 22),
(72, 'Soonwoo Kwon', '710', 24),
(5, 'Stefanos Tsitsipas', '5,015', 24),
(67, 'Steve Johnson', '742', 32),
(36, 'Tallon Griekspoor', '1,091', 26),
(100, 'Taro Daniel', '599', 29),
(9, 'Taylor Fritz', '3,380', 25),
(79, 'Tennys Sandgren', '680', 30),
(75, 'Thiago Monteiro', '696', 26),
(17, 'Tommy Paul', '2,170', 25),
(50, 'Ugo Humbert', '877', 24),
(57, 'Vasek Pospisil', '799', 31),
(94, 'Yannick Hanfmann', '613', 30),
(82, 'Yasutaka Uchiyama', '667', 29),
(32, 'Yoshihito Nishioka', '1,171', 27);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tenistasduo`
--

CREATE TABLE `tenistasduo` (
  `Posicion` int(70) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Puntos` varchar(50) NOT NULL,
  `Edad` int(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tenistasduo`
--

INSERT INTO `tenistasduo` (`Posicion`, `Nombre`, `Puntos`, `Edad`) VALUES
(1, 'Mate Pavic', '10,780', 29),
(2, 'Nikola Mektic', '10,780', 33),
(3, 'Marcel Granollers', '9,040', 36),
(4, 'Horacio Zeballos', '8,970', 36),
(5, 'Juan Sebastian Cabal', '8,840', 35),
(6, 'Robert Farah', '8,840', 34),
(7, 'Rajeev Ram', '7,810', 37),
(8, 'Joe Salisbury', '7,810', 29),
(9, 'Ivan Dodig', '7,570', 37),
(10, 'Filip Polasek', '7,570', 35),
(11, 'Bruno Soares', '6,810', 39),
(12, 'Jamie Murray', '6,810', 35),
(13, 'Jean-Julien Rojer', '6,570', 40),
(14, 'Marcelo Melo', '6,570', 38),
(15, 'Wesley Koolhof', '6,540', 32),
(16, 'Neal Skupski', '6,530', 32),
(17, 'Michael Venus', '6,500', 34),
(18, 'John Peers', '6,470', 33),
(19, 'Horia Tecau', '6,410', 37),
(20, 'Kevin Krawietz', '6,340', 30),
(21, 'Andreas Mies', '6,340', 31),
(22, 'Pierre-Hugues Herbert', '6,210', 30),
(23, 'Nicolas Mahut', '6,210', 40),
(24, 'Robin Haase', '5,940', 34),
(25, 'Jan-Lennard Struff', '5,870', 31),
(26, 'Murray, Andy', '5,870', 34),
(27, 'Raven Klaasen', '5,850', 39),
(28, 'Ben McLachlan', '5,850', 29),
(29, 'Santiago Gonzalez', '5,840', 39),
(30, 'Aisam-Ul-Haq Qureshi', '5,830', 41),
(31, 'Fabrice Martin', '5,830', 35),
(32, 'Franko Skugor', '5,820', 34),
(33, 'Wesley Moodie', '5,800', 43),
(34, 'Ken Skupski', '5,800', 39),
(35, 'Michael Mmoh', '5,790', 24),
(36, 'Oliver Marach', '5,780', 41),
(37, 'Romain Arneodo', '5,780', 34),
(38, 'Hans Podlipnik-Castillo', '5,770', 35),
(39, 'Mikhail Elgin', '5,770', 40),
(40, 'Igor Zelenay', '5,760', 39),
(41, 'Marcelo Demoliner', '5,760', 33),
(42, 'Leander Paes', '5,750', 48),
(43, 'Dominic Inglot', '5,750', 35),
(44, 'Divij Sharan', '5,740', 36),
(45, 'Max Purcell', '5,740', 24),
(46, 'Lloyd Glasspool', '5,730', 28),
(47, 'Neal Skupski', '5,730', 32),
(48, 'Frederik Nielsen', '5,720', 38),
(49, 'Jonathan Erlich', '5,720', 45),
(50, 'Matthew Ebden', '5,710', 34),
(51, 'Andreas Seppi', '5,710', 38),
(52, 'Sander Gille', '5,700', 30),
(53, 'Jan Zieliński', '5,700', 34),
(54, 'Matthew Beniston', '5,690', 28),
(55, 'Alex Lawson', '5,690', 26),
(56, 'Matthew Smith', '5,680', 23),
(57, 'Nicholas Monroe', '5,680', 39),
(58, 'Treat Huey', '5,670', 36),
(59, 'Viktor Durasovic', '5,670', 24),
(60, 'Dudi Sela', '5,660', 37),
(61, 'Jonny O Mara', '5,660', 23),
(62, 'Benjamin Lock', '5,650', 27),
(63, 'Karol Drzewiecki', '5,650', 26),
(64, 'David Vega Hernandez', '5,640', 33),
(65, 'Michael Geerts', '5,640', 22),
(66, 'Vladyslav Orlov', '5,630', 22),
(67, 'Alberto Barroso-Campos', '5,630', 29),
(68, 'Zdenek Kolar', '5,620', 26),
(69, 'Manuel Guinard', '5,620', 24),
(70, 'Nathan Pasha', '5,610', 29),
(71, 'Maxime Hamou', '5,610', 25),
(72, 'Joao Menezes', '5,600', 25),
(73, 'Mackenzie McDonald', '5,600', 26),
(74, 'Sebastian Fanselow', '5,590', 30),
(75, 'Adrian Baranowski', '5,590', 24),
(76, 'Petros Chrysochos', '5,580', 25),
(77, 'Saketh Myneni', '5,580', 34),
(78, 'Oscar Otte', '5,570', 28),
(79, 'Steven Diez', '5,570', 31),
(80, 'Gustavo Heide', '5,560', 21),
(81, 'Rinky Hijikata', '5,560', 21),
(82, 'Daniel Michalski', '5,550', 21),
(83, 'Brandon Nakashima', '5,550', 20),
(84, 'Johan Nikles', '5,540', 22),
(85, 'Marc Polmans', '5,540', 24),
(86, 'Jason Kubler', '5,530', 28),
(87, 'Nino Serdarusic', '5,530', 25),
(88, 'Mousheg Hovhannisyan', '5,520', 23),
(89, 'Miljan Zekic', '5,520', 33),
(90, 'Djordje Djokovic', '5,510', 26),
(91, 'Yanki Erel', '5,510', 23),
(92, 'Daniel Michalski', '5,500', 23),
(93, 'Filip Cristian Jianu', '5,500', 19),
(94, 'Tseng Chun Hsin', '5,490', 21),
(95, 'Blake Ellis', '5,490', 21),
(96, 'Aslan Karatsev', '5,480', 28),
(97, 'Vlad Andrei Dancu', '5,480', 21),
(98, 'Lorenzo Musetti', '5,470', 20),
(99, 'Christopher O Connell', '5,470', 27),
(100, 'Raul Brancaccio', '5,460', 23),
(1, 'Mate Pavic', '10,780', 29),
(2, 'Nikola Mektic', '10,780', 33),
(3, 'Marcel Granollers', '9,040', 36),
(4, 'Horacio Zeballos', '8,970', 36),
(5, 'Juan Sebastian Cabal', '8,840', 35),
(6, 'Robert Farah', '8,840', 34),
(7, 'Rajeev Ram', '7,810', 37),
(8, 'Joe Salisbury', '7,810', 29),
(9, 'Ivan Dodig', '7,570', 37),
(10, 'Filip Polasek', '7,570', 35),
(11, 'Bruno Soares', '6,810', 39),
(12, 'Jamie Murray', '6,810', 35),
(13, 'Jean-Julien Rojer', '6,570', 40),
(14, 'Marcelo Melo', '6,570', 38),
(15, 'Wesley Koolhof', '6,540', 32),
(16, 'Neal Skupski', '6,530', 32),
(17, 'Michael Venus', '6,500', 34),
(18, 'John Peers', '6,470', 33),
(19, 'Horia Tecau', '6,410', 37),
(20, 'Kevin Krawietz', '6,340', 30),
(21, 'Andreas Mies', '6,340', 31),
(22, 'Pierre-Hugues Herbert', '6,210', 30),
(23, 'Nicolas Mahut', '6,210', 40),
(24, 'Robin Haase', '5,940', 34),
(25, 'Jan-Lennard Struff', '5,870', 31),
(26, 'Murray, Andy', '5,870', 34),
(27, 'Raven Klaasen', '5,850', 39),
(28, 'Ben McLachlan', '5,850', 29),
(29, 'Santiago Gonzalez', '5,840', 39),
(30, 'Aisam-Ul-Haq Qureshi', '5,830', 41),
(31, 'Fabrice Martin', '5,830', 35),
(32, 'Franko Skugor', '5,820', 34),
(33, 'Wesley Moodie', '5,800', 43),
(34, 'Ken Skupski', '5,800', 39),
(35, 'Michael Mmoh', '5,790', 24),
(36, 'Oliver Marach', '5,780', 41),
(37, 'Romain Arneodo', '5,780', 34),
(38, 'Hans Podlipnik-Castillo', '5,770', 35),
(39, 'Mikhail Elgin', '5,770', 40),
(40, 'Igor Zelenay', '5,760', 39),
(41, 'Marcelo Demoliner', '5,760', 33),
(42, 'Leander Paes', '5,750', 48),
(43, 'Dominic Inglot', '5,750', 35),
(44, 'Divij Sharan', '5,740', 36),
(45, 'Max Purcell', '5,740', 24),
(46, 'Lloyd Glasspool', '5,730', 28),
(47, 'Neal Skupski', '5,730', 32),
(48, 'Frederik Nielsen', '5,720', 38),
(49, 'Jonathan Erlich', '5,720', 45),
(50, 'Matthew Ebden', '5,710', 34),
(51, 'Andreas Seppi', '5,710', 38),
(52, 'Sander Gille', '5,700', 30),
(53, 'Jan Zieliński', '5,700', 34),
(54, 'Matthew Beniston', '5,690', 28),
(55, 'Alex Lawson', '5,690', 26),
(56, 'Matthew Smith', '5,680', 23),
(57, 'Nicholas Monroe', '5,680', 39),
(58, 'Treat Huey', '5,670', 36),
(59, 'Viktor Durasovic', '5,670', 24),
(60, 'Dudi Sela', '5,660', 37),
(61, 'Jonny O Mara', '5,660', 23),
(62, 'Benjamin Lock', '5,650', 27),
(63, 'Karol Drzewiecki', '5,650', 26),
(64, 'David Vega Hernandez', '5,640', 33),
(65, 'Michael Geerts', '5,640', 22),
(66, 'Vladyslav Orlov', '5,630', 22),
(67, 'Alberto Barroso-Campos', '5,630', 29),
(68, 'Zdenek Kolar', '5,620', 26),
(69, 'Manuel Guinard', '5,620', 24),
(70, 'Nathan Pasha', '5,610', 29),
(71, 'Maxime Hamou', '5,610', 25),
(72, 'Joao Menezes', '5,600', 25),
(73, 'Mackenzie McDonald', '5,600', 26),
(74, 'Sebastian Fanselow', '5,590', 30),
(75, 'Adrian Baranowski', '5,590', 24),
(76, 'Petros Chrysochos', '5,580', 25),
(77, 'Saketh Myneni', '5,580', 34),
(78, 'Oscar Otte', '5,570', 28),
(79, 'Steven Diez', '5,570', 31),
(80, 'Gustavo Heide', '5,560', 21),
(81, 'Rinky Hijikata', '5,560', 21),
(82, 'Daniel Michalski', '5,550', 21),
(83, 'Brandon Nakashima', '5,550', 20),
(84, 'Johan Nikles', '5,540', 22),
(85, 'Marc Polmans', '5,540', 24),
(86, 'Jason Kubler', '5,530', 28),
(87, 'Nino Serdarusic', '5,530', 25),
(88, 'Mousheg Hovhannisyan', '5,520', 23),
(89, 'Miljan Zekic', '5,520', 33),
(90, 'Djordje Djokovic', '5,510', 26),
(91, 'Yanki Erel', '5,510', 23),
(92, 'Daniel Michalski', '5,500', 23),
(93, 'Filip Cristian Jianu', '5,500', 19),
(94, 'Tseng Chun Hsin', '5,490', 21),
(95, 'Blake Ellis', '5,490', 21),
(96, 'Aslan Karatsev', '5,480', 28),
(97, 'Vlad Andrei Dancu', '5,480', 21),
(98, 'Lorenzo Musetti', '5,470', 20),
(99, 'Christopher O Connell', '5,470', 27),
(100, 'Raul Brancaccio', '5,460', 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tenistasfem`
--

CREATE TABLE `tenistasfem` (
  `Posicion` int(10) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Puntos` varchar(50) NOT NULL,
  `Edad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tenistasfem`
--

INSERT INTO `tenistasfem` (`Posicion`, `Nombre`, `Puntos`, `Edad`) VALUES
(35, 'Ajla Tomljanovic', '4185', 28),
(72, 'Aliaksandra Sasnovich', '3605', 27),
(38, 'Alison Riske', '4130', 31),
(50, 'Alison Van Uytvanck', '3793', 27),
(25, 'Anastasia Potapova', '1.601', 22),
(26, 'Anastasija Sevastova', '4600', 31),
(68, 'Anna Blinkova', '3758', 22),
(98, 'Anna-Lena Friedsam', '3206', 27),
(2, 'Aryna Sabalenka', '7.881', 25),
(13, 'Barbora Krejcikova', ' 2.616', 27),
(15, 'Beatriz Haddad Maia', '2.206', 26),
(11, 'Belinda Bencic', '2.750', 26),
(37, 'Bernarda Pera', '4156', 27),
(36, 'Carla Suarez Navarro', '4180', 33),
(4, 'Caroline Garcia', '5.025', 29),
(85, 'Christina McHale', '3375', 29),
(75, 'Clara Tauson', '3533', 19),
(5, 'Coco Gauff', '4.345', 19),
(80, 'Danielle Collins', '3458', 28),
(69, 'Danka Kovinic', '3713', 26),
(9, 'Daria Kasatkina', '3.505', 26),
(29, 'Dayana Yastremska', '4370', 21),
(24, 'Donna Vekic', '1.713', 26),
(22, 'Ekaterina Alexandrova', ' 1.775', 28),
(6, 'Elena Rybakina', '4.195', 23),
(26, 'Elise Mertens', ' 1.474', 27),
(86, 'Fiona Ferro', '3365', 24),
(81, 'Francesca Di Lorenzo', '3421', 24),
(42, 'Heather Watson', '4010', 29),
(1, 'Iga Swiatek', '9.625', 21),
(27, 'Irina-Camelia Begu', '1.443', 32),
(97, 'Jana Cepelova', '3210', 28),
(20, 'Jelena Ostapenko', ' 1.795', 25),
(3, 'Jessica Pegula', '5.300', 29),
(14, 'Karolina Pliskova', '2.245', 31),
(49, 'Katerina Siniakova', '3803', 25),
(83, 'Kateryna Kozlova', '3401', 27),
(67, 'Kirsten Flipkens', '3790', 35),
(82, 'Kristyna Pliskova', '3406', 29),
(99, 'Lara Arruabarrena', '3205', 30),
(39, 'Laura Siegemund', '4076', 33),
(88, 'Lauren Davis', '3300', 28),
(40, 'Leylah Fernandez', '4058', 19),
(16, 'Liudmila Samsonova', '2.172', 24),
(74, 'Ludmilla Samsonova', '3571', 23),
(23, 'Madison Keys', '1.742', 28),
(19, 'Magda Linette', '1.820', 31),
(92, 'Magdalena Frech', '3271', 24),
(8, 'Maria Sakkari', ' 3.516', 27),
(34, 'Marketa Vondrousova', '4201', 22),
(93, 'Marta Kostyuk', '3270', 18),
(90, 'Martina Di Giuseppe', '3288', 31),
(18, 'Martina Trevisan', '1.878', 29),
(91, 'Mayar Sherif', '3286', 25),
(100, 'Mayo Hibi', '3201', 25),
(89, 'Mihaela Buzarnescu', '3296', 33),
(41, 'Nadia Podoroska', '4026', 24),
(87, 'Nina Stojanovic', '3333', 25),
(7, 'Ons Jabeur', '4.116', 28),
(10, 'Petra Kvitova', '3.162', 33),
(28, 'Petra Martic', '1.395', 32),
(21, 'Qinwen Zheng', '1.784', 20),
(48, 'Rebecca Peterson', '3825', 26),
(96, 'Sachia Vickery', '3215', 26),
(76, 'Sara Sorribes Tormo', '3528', 25),
(29, 'Shuai Zhang', '1.385', 34),
(84, 'Sloane Stephens', '3380', 28),
(33, 'Sorana Cirstea', '4255', 31),
(79, 'Tamara Korpatsch', '3490', 26),
(70, 'Tamara Zidansek', '3660', 24),
(94, 'Tereza Martincova', '3256', 26),
(73, 'Varvara Gracheva', '3593', 21),
(12, 'Veronika Kudermetova', ' 2.660', 26),
(17, 'Victoria Azarenka', '2.127', 33),
(78, 'Viktorija Golubic', '3510', 29),
(95, 'Vitalia Diatchenko', '3225', 31),
(46, 'Yaroslava Shvedova', '3922', 34),
(27, 'Yulia Putintseva', '4485', 26),
(47, 'Zarina Diyas', '3868', 28),
(77, 'Zhu Lin', '3520', 28);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `torneo`
--

CREATE TABLE `torneo` (
  `id` int(9) NOT NULL,
  `NombreTorneo` varchar(50) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Competicion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `torneo`
--

INSERT INTO `torneo` (`id`, `NombreTorneo`, `Ciudad`, `Competicion`) VALUES
(4, 'Abierto de Australia', 'Melbourne, Australia', 'Grand Slam'),
(5, 'Indian Wells', 'California Estados Unidos', 'Masters 1000'),
(9, 'Internazionali BNL d\'Italia', 'Roma, Italia', 'Masters 1000'),
(6, 'Masters de Montecarlo', 'Francia', 'Masters 1000'),
(7, 'Mutua Madrid Open	', 'Spain, Madrid', 'Masters 1000'),
(8, 'Rogers Cup', 'Montreal y Toronto, Canadá', 'Masters 1000'),
(1, 'Roland Garros', 'París, Francia', 'Grand Slam'),
(3, 'US Open', 'Nueva York, NY, EE.UU.', 'Grand Slam'),
(10, 'Western & Southern Open', 'Cincinnati, Ohio, Estados Unidos', 'Masters 1000'),
(2, 'Wimbledon', 'Londres, Gran Bretaña', 'Grand Slam');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nombre` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  `monedero` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre`, `contraseña`, `monedero`) VALUES
('Admin', '1234', 1000),
('Alex', '1234', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `casadeapuestas`
--
ALTER TABLE `casadeapuestas`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `estadio`
--
ALTER TABLE `estadio`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `tenistas`
--
ALTER TABLE `tenistas`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `tenistasfem`
--
ALTER TABLE `tenistasfem`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `torneo`
--
ALTER TABLE `torneo`
  ADD PRIMARY KEY (`NombreTorneo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
