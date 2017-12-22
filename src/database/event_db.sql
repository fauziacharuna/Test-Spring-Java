-- phpMyAdmin SQL Dump
-- version 4.7.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 10, 2017 at 05:30 AM
-- Server version: 5.6.35
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `event_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `Event`
--

CREATE TABLE `Event` (
  `ID` int(11) NOT NULL,
  `event_name` varchar(30) NOT NULL,
  `attendance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Event`
--

INSERT INTO `Event` (`ID`, `event_name`, `attendance`) VALUES
(1, 'Sekaten', 10000),
(2, 'ARTJOG', 100),
(3, 'ORCHESTJOG', 500),
(4, 'Sekaten', 10000),
(5, 'ARTJOG', 10000),
(6, 'ORCHESTJOG', 500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Event`
--
ALTER TABLE `Event`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

-- 
-- AUTO_INCREMENT for table `Event`
--
ALTER TABLE `Event`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;