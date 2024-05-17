-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30-Nov-2023 às 17:06
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `petshop`
--
create database `petshop`;
use `petshop`;
-- --------------------------------------------------------

--
-- Estrutura da tabela `llogin`
--

CREATE TABLE `llogin` (
  `usuario` varchar(10) NOT NULL,
  `senha` varchar(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `llogin`
--

INSERT INTO `llogin` (`usuario`, `senha`) VALUES
('Jo4n', '2016'),
('Edna', '2022');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pet`
--

CREATE TABLE `pet` (
  `num_registro` int(11) NOT NULL,
  `nome_pet` varchar(50) NOT NULL,
  `especie` varchar(25) NOT NULL,
  `raca` varchar(55) NOT NULL,
  `cor` varchar(35) NOT NULL,
  `nascimento` varchar(10) NOT NULL,
  `sexo` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pet`
--

INSERT INTO `pet` (`num_registro`, `nome_pet`, `especie`, `raca`, `cor`, `nascimento`, `sexo`) VALUES
(1, 'Thopis', 'Cão', 'lulu da pomerânia', 'Marrom', '2023/03/07', 'Macho'),
(2, 'Filipa', 'Peixe', 'Tetra neon', 'Amarelo', '2023/11/09', 'Fêmea'),
(3, 'Lorico', 'Pássaro', 'Papagaio', 'Verde', '2023/09/23', 'Macho'),
(4, 'Luna', 'Gato', 'Siamês', 'Cinza', '2023/01/31', 'Fêmea');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pet`
--
ALTER TABLE `pet`
  ADD PRIMARY KEY (`num_registro`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pet`
--
ALTER TABLE `pet`
  MODIFY `num_registro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
