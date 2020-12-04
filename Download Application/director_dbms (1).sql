-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2020 at 12:41 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `director_dbms`
--

-- --------------------------------------------------------

--
-- Table structure for table `ca_dbms`
--

CREATE TABLE `ca_dbms` (
  `id` varchar(20) NOT NULL DEFAULT '0000',
  `full_name` varchar(50) DEFAULT NULL,
  `institution_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone_number` varchar(50) DEFAULT NULL,
  `zone` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `tshirt` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ca_dbms`
--

INSERT INTO `ca_dbms` (`id`, `full_name`, `institution_name`, `email`, `phone_number`, `zone`, `gender`, `tshirt`) VALUES
('20201', 'Mahfuzur', 'DIU', 'm@mail.com', '017949494', 'Chittagong', 'Male', 'XXL'),
('20202', 'Mahfuz', 'DU', 'm@mail.com', '01794207673', 'Dhaka', 'Male', 'XL'),
('20203', 'Abid', 'BUET', 'abid@mail.com', '01711111111', 'Khulna', 'Male', 'L'),
('20204', 'Mahade Hasan', 'KUET', 'mahade@mail.com', '0188888888', 'Mymensingh', 'Male', 'XL'),
('20205', 'Abdullah Ibna', 'Ruet', 'abdullah@mail.com', '02173735', 'Rajshahi', 'Male', 'XXL'),
('20206', 'Mr Rahman', 'DIU', 'rahman@mail.com', '017949494', 'Sylhet', 'Male', 'XL'),
('20207', 'Md harun', 'BUBT', 'harun@mail.com', '01777777', 'Rangpur', 'Male', 'XXL'),
('20208', 'Ms Majid', 'Dhaka University', 'majid@mail.com', '0136353767', 'Barisal', 'Female', 'XL');

-- --------------------------------------------------------

--
-- Table structure for table `director_dbms`
--

CREATE TABLE `director_dbms` (
  `Id` int(6) NOT NULL,
  `full_name` varchar(50) DEFAULT NULL,
  `institution_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone_number` varchar(50) DEFAULT NULL,
  `passcode` varchar(16) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `tshirt` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `director_dbms`
--

INSERT INTO `director_dbms` (`Id`, `full_name`, `institution_name`, `email`, `phone_number`, `passcode`, `gender`, `tshirt`) VALUES
(101, 'Mahfuzur Rahman', 'DIU', 'mafu@mail.com', '01794207676', '1234', 'Male', 'XL'),
(102, 'Abdullah', 'DIU', 'abdullah@mail.com', '0177723763', 'ab12', 'Male', 'XXL'),
(103, 'Jackma', 'BUET', 'jack@mail.com', '908317863', 'jack1', 'Others', 'XL'),
(104, 'Ms Y', 'DIU', 'msy@mail.com', '018888888', '21', 'Female', 'L'),
(105, 'Ms Y', 'DIU', 'y@mail.com', '017121212', '105', 'Female', 'S');

-- --------------------------------------------------------

--
-- Table structure for table `event_dbms`
--

CREATE TABLE `event_dbms` (
  `serial` varchar(12) NOT NULL,
  `date` date DEFAULT NULL,
  `title` varchar(150) DEFAULT NULL,
  `event_link` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `event_dbms`
--

INSERT INTO `event_dbms` (`serial`, `date`, `title`, `event_link`) VALUES
('01', '2020-11-15', 'Creative Photography', 'www.facebook.com/events/'),
('02', '2020-11-30', 'Art in Creativity', 'www.facebook.com/events/ain');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ca_dbms`
--
ALTER TABLE `ca_dbms`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `director_dbms`
--
ALTER TABLE `director_dbms`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `event_dbms`
--
ALTER TABLE `event_dbms`
  ADD PRIMARY KEY (`serial`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
