-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2024 at 08:58 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `user`
--

-- --------------------------------------------------------

--
-- Table structure for table `usertable`
--

CREATE TABLE `usertable` (
  `fullName` varchar(30) DEFAULT NULL,
  `mobNumber` bigint(20) DEFAULT NULL,
  `emailAddress` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usertable`
--

INSERT INTO `usertable` (`fullName`, `mobNumber`, `emailAddress`) VALUES
('John Smith', 1234567890, 'john.smith@example.com'),
('Emily Johnson', 2345678901, 'emily.johnson@example.com'),
('Michael Williams', 3456789012, 'michael.williams@example.com'),
('Jennifer Brown', 4567890123, 'jennifer.brown@example.com'),
('William Jones', 5678901234, 'william.jones@example.com'),
('Jessica Davis', 6789012345, 'jessica.davis@example.com'),
('Christopher Miller', 7890123456, 'christopher.miller@example.com'),
('Amanda Wilson', 8901234567, 'amanda.wilson@example.com'),
('James Taylor', 9012345678, 'james.taylor@example.com'),
('Sarah Martinez', 123456789, 'sarah.martinez@example.com'),
('Akash Gupta', 9876543210, 'akash.gupta@example.com'),
('Priya Sharma', 8765432109, 'priya.sharma@example.com'),
('Rahul Patel', 7654321098, 'rahul.patel@example.com'),
('Anjali Singh', 6543210987, 'anjali.singh@example.com'),
('Vikram Kumar', 5432109876, 'vikram.kumar@example.com'),
('Nisha Mehra', 4321098765, 'nisha.mehra@example.com'),
('Manoj Verma', 3210987654, 'manoj.verma@example.com'),
('Sunita Devi', 2109876543, 'sunita.devi@example.com'),
('Rajesh Singh', 1098765432, 'rajesh.singh@example.com'),
('Pooja Mishra', 9876543211, 'pooja.mishra@example.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
