-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2017 at 08:14 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `go`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE IF NOT EXISTS `tb_admin` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `user` text NOT NULL,
  `pass` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`id`, `user`, `pass`) VALUES
(1, 'nico', 'nico'),
(2, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_rental`
--

CREATE TABLE IF NOT EXISTS `tb_rental` (
  `user` text NOT NULL,
  `nstruk` int(100) NOT NULL,
  `npol` int(100) NOT NULL,
  `tglp` text NOT NULL,
  `tglk` text NOT NULL,
  `motor` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_rental`
--

INSERT INTO `tb_rental` (`user`, `nstruk`, `npol`, `tglp`, `tglk`, `motor`) VALUES
('asd', 123, 123, 'adsa', 'asd', 'Vario');

-- --------------------------------------------------------

--
-- Table structure for table `tb_server`
--

CREATE TABLE IF NOT EXISTS `tb_server` (
  `user` text NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_server`
--

INSERT INTO `tb_server` (`user`, `alamat`) VALUES
('asd', 'asd'),
('asda', 'asda'),
('asd', 'asd'),
('nico', 'nico'),
('ARDIAN', 'BLITR');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
