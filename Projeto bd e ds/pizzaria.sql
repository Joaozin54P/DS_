-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Dez-2023 às 04:26
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
-- Banco de dados: `pizzaria`
--
create database `pizzaria`;
use `pizzaria`;
-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `Cod_Cliente` int(11) NOT NULL,
  `Nome_Cliente` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Endereco` varchar(80) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `CPF` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Telefone` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`Cod_Cliente`, `Nome_Cliente`, `Endereco`, `CPF`, `Telefone`) VALUES
(1, 'Fabiano costa', 'Rua Bento Goncaves,51', '813.538.103-48', '(11)98688-0411'),
(3, 'Fernando Araújo', 'rua belo mar,11', '813.523.103-48', '(11)98688-0444'),
(4, 'Rodrigo Rodri', 'Rua Joacelio,12', '111.111.111-45', '(12)99999-9999');

-- --------------------------------------------------------

--
-- Estrutura da tabela `entregador`
--

CREATE TABLE `entregador` (
  `Cod_Entregador` int(11) NOT NULL,
  `Nome_Entre` varchar(50) NOT NULL,
  `CPF_Entre` varchar(15) NOT NULL,
  `Telefone_Entre` varchar(20) NOT NULL,
  `Endereco_Entrega` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `entregador`
--

INSERT INTO `entregador` (`Cod_Entregador`, `Nome_Entre`, `CPF_Entre`, `Telefone_Entre`, `Endereco_Entrega`) VALUES
(1, 'Pedro', '232.232.333-44', '(11)77777-7777', 'Rua Fernadez,12'),
(2, 'Lisa Manobal', '232.232.311-44', '(11)45545-7777', 'Rua Fernadez,18'),
(3, 'G Dragon', '232.232.333-88', '(11)79877-4457', 'Rua Rodrigues,12');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Cod_Funcionario` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Data_Nasc` date NOT NULL,
  `Data_Contratacao` date NOT NULL,
  `CPF_Func` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingredientes`
--

CREATE TABLE `ingredientes` (
  `Nome_Ingrediente` varchar(50) NOT NULL,
  `Cod_Ingredientes` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_pedido`
--

CREATE TABLE `itens_pedido` (
  `Cod_Pedido` int(11) NOT NULL,
  `Cod_Pizza` int(11) NOT NULL
) ENGINE=Aria DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `Cod_Pedido` int(11) NOT NULL,
  `Cod_Cliente` int(11) NOT NULL,
  `Cod_Funcionario` int(11) NOT NULL,
  `Cod_Entregador` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pizza`
--

CREATE TABLE `pizza` (
  `Cod_Pizza` int(11) NOT NULL,
  `Sabores` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pizza`
--

INSERT INTO `pizza` (`Cod_Pizza`, `Sabores`) VALUES
(1, 'Calabresa'),
(2, 'Quatro Queijo'),
(3, 'Portuguesa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `receita`
--

CREATE TABLE `receita` (
  `Cod_Pizza` int(11) NOT NULL,
  `Cod_Ingredientes` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblusuario`
--

CREATE TABLE `tblusuario` (
  `usuario` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `senha` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tblusuario`
--

INSERT INTO `tblusuario` (`usuario`, `senha`) VALUES
('Jo4n', 2016),
('Gabxs', 2022),
('Moraexx', 2025);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Cod_Cliente`);

--
-- Índices para tabela `entregador`
--
ALTER TABLE `entregador`
  ADD PRIMARY KEY (`Cod_Entregador`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Cod_Funcionario`);

--
-- Índices para tabela `ingredientes`
--
ALTER TABLE `ingredientes`
  ADD PRIMARY KEY (`Cod_Ingredientes`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`Cod_Pedido`);

--
-- Índices para tabela `pizza`
--
ALTER TABLE `pizza`
  ADD PRIMARY KEY (`Cod_Pizza`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `Cod_Cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `entregador`
--
ALTER TABLE `entregador`
  MODIFY `Cod_Entregador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `Cod_Funcionario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `ingredientes`
--
ALTER TABLE `ingredientes`
  MODIFY `Cod_Ingredientes` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `Cod_Pedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pizza`
--
ALTER TABLE `pizza`
  MODIFY `Cod_Pizza` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
