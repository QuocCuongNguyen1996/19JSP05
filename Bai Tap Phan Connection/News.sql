-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Nov 04, 2019 at 03:55 AM
-- Server version: 5.7.26
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `News`
--

-- --------------------------------------------------------

--
-- Table structure for table `Category`
--

CREATE TABLE `Category` (
  `CategoryID` int(11) NOT NULL,
  `NameCategory` varchar(64) DEFAULT 'No name category',
  `DetailID` int(11) NOT NULL,
  `NameDetail` varchar(64) DEFAULT 'No name detail'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Category`
--

INSERT INTO `Category` (`CategoryID`, `NameCategory`, `DetailID`, `NameDetail`) VALUES
(1, 'Test Test Test', 1, 'Phim'),
(2, 'Giai Tri', 2, 'Ca Nhac - MTV'),
(3, 'Giai Tri', 3, 'TV Show'),
(4, 'Giai Tri', 4, 'Tin Tuc Giai Tri'),
(5, 'Am Thuc', 1, 'Mon Ngon Moi Ngay'),
(6, 'Am Thuc', 2, 'Thuc Don Hang Ngay'),
(7, 'Am Thuc', 3, 'Dac San 3 Mien'),
(8, 'Am Thuc', 4, 'Mon Ngon Dan Toc Viet Nam'),
(9, 'Am Thuc', 5, 'Tin Tuc Am thuc'),
(10, 'Giao Duc - Du Hoc', 1, 'Tuyen Sinh Dai Hoc'),
(11, 'Giao Duc - Du Hoc', 2, 'Tin Tuc Giao Duc'),
(12, 'Test', 1, 'Test1');

-- --------------------------------------------------------

--
-- Table structure for table `News`
--

CREATE TABLE `News` (
  `NewsID` int(11) NOT NULL,
  `CategoryID` int(11) NOT NULL,
  `UserID` int(11) NOT NULL,
  `Content` varchar(255) DEFAULT 'No content',
  `Title` varchar(200) DEFAULT 'No title'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `News`
--

INSERT INTO `News` (`NewsID`, `CategoryID`, `UserID`, `Content`, `Title`) VALUES
(1, 1, 1, 'Noi Dung Cua Tin Tuc Giai Tri 1', 'Tin Tuc Giai Tri 1'),
(2, 2, 1, 'Noi Dung Cua Tin Tuc Giai Tri 2', 'Tin Tuc Giai Tri 2'),
(3, 3, 2, 'Noi Dung Cua Tin Tuc Giai Tri 3', 'Tin Tuc Giai Tri 3'),
(4, 4, 3, 'Noi Dung Cua Tin Tuc Giai Tri 4', 'Tin Tuc Giai Tri 4'),
(5, 5, 1, 'Noi Dung Cua Am Thuc 1', 'Am Thuc 1'),
(6, 6, 1, 'Noi Dung Cua Am Thuc 2', 'Am Thuc 2'),
(7, 7, 1, 'Noi Dung Cua Am Thuc 3', 'Am Thuc 3'),
(8, 8, 2, 'Noi Dung Cua Am Thuc 4', 'Am Thuc 4'),
(9, 9, 3, 'Noi Dung Cua Am Thuc 5', 'Am Thuc 5'),
(10, 10, 2, 'Noi Dung Cua Giao Duc - Du Hoc 1', 'Giao Duc - Du Hoc 1'),
(11, 11, 3, 'Noi Dung Cua Giao Duc - Du Hoc 2', 'Giao Duc - Du Hoc 2');

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `UserID` int(11) NOT NULL,
  `Password` int(6) DEFAULT '123456',
  `FullName` varchar(64) DEFAULT 'No name user',
  `CMND` int(9) DEFAULT '13456789'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`UserID`, `Password`, `FullName`, `CMND`) VALUES
(1, 123456, 'Nguyen Quoc Cuong', 201713630),
(2, 456789, 'Ho Van Buom', 201713631),
(3, 789123, 'Van Ba Linh', 201713632);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Category`
--
ALTER TABLE `Category`
  ADD PRIMARY KEY (`CategoryID`),
  ADD UNIQUE KEY `CategoryID` (`CategoryID`,`DetailID`);

--
-- Indexes for table `News`
--
ALTER TABLE `News`
  ADD PRIMARY KEY (`NewsID`),
  ADD KEY `CategoryID` (`CategoryID`),
  ADD KEY `UserID` (`UserID`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Category`
--
ALTER TABLE `Category`
  MODIFY `CategoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `News`
--
ALTER TABLE `News`
  MODIFY `NewsID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `News`
--
ALTER TABLE `News`
  ADD CONSTRAINT `news_ibfk_1` FOREIGN KEY (`CategoryID`) REFERENCES `Category` (`CategoryID`),
  ADD CONSTRAINT `news_ibfk_2` FOREIGN KEY (`UserID`) REFERENCES `Users` (`UserID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
