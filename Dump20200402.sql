CREATE DATABASE  IF NOT EXISTS `lamborghini` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `lamborghini`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: lamborghini
-- ------------------------------------------------------
-- Server version	5.7.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cars`
--

DROP TABLE IF EXISTS `cars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cars` (
  `S_No` int(11) DEFAULT NULL,
  `Name_Of_Car` varchar(35) DEFAULT NULL,
  `Top_Speed` varchar(20) DEFAULT NULL,
  `0_100kph` varchar(12) DEFAULT NULL,
  `Power` varchar(30) DEFAULT NULL,
  `bhp_weight` varchar(32) DEFAULT NULL,
  `Displacement` varchar(25) DEFAULT NULL,
  `Weight` varchar(25) DEFAULT NULL,
  `Price` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cars`
--

LOCK TABLES `cars` WRITE;
/*!40000 ALTER TABLE `cars` DISABLE KEYS */;
INSERT INTO `cars` VALUES (1,'Murcielago LP750 Edo','365 kph/ 227 mph','3.1 seconds','750 bhp / 551 kW','462 bhp per tonne','6.5 litre / 6496 cc','1625 kg / 3582 lbs','900 000 $'),(2,'Veneno Roadster','355 kph / 220 mph','2.9 seconds','750 bhp / 551 kW','503 bhp per tonne','6.5 litre / 6498 cc','1490 kg / 3285 lbs','5 000 000 $'),(3,'Centenario Coupe','350 kph / 217 mph','2.8 seconds','770 bhp / 566 kW','507 bhp per tonne','6.5 litre / 6498 cc','1520 kg / 3351 lbs','1 900 000 $'),(4,'Gallardo Dallas','376 kph / 233 mph','2.8 seconds','1220 bhp / 897 kW','797 bhp per tonne','5.2 litre / 5204 cc','1530 kg / 3373 lbs','680 000 $'),(5,'Huracan Mansory Torofeo','340 kph / 211 mph','2.7 seconds','1250 bhp / 919 kW','912 bhp per tonne','5.2 litre / 5204 cc','1370 kg / 3020 lbs','600 000 $'),(6,'Aventador LP700-4 Roadster ','350 kph / 217 mph','2.9 seconds','792 bhp / 582 kW','494 bhp per tonne','6.5 litre / 6498 cc','1605 kg / 3538 lbs','860 000 $'),(7,'Sesto Elemento','350 kph / 217 mph','2.5 seconds','570 bhp / 419 kW','571 bhp per tonne','5.2 litre / 5204 cc','999 kg / 2202 lbs','2 950 000 $'),(8,'Reventon Roadster','350 kph / 217 mph','3.4 seconds','670 bhp / 493 kW','396 bhp per tonne','6.5 litre / 6496 cc','1690 kg / 3726 lbs','1 600 000 $'),(9,'5-95 Zagato','325 kph / 202 mph','3.4 seconds','570 bhp / 419 kW','425 bhp per tonne','5.2 litre / 5204 cc','1340 kg / 2954 lbs','3 000 000 $'),(10,'Asterion LPI910-4','320 kph / 199 mph','3.0 seconds','910 bhp / 669 kW','650 bhp per tonne','5.2 litre / 5204 cc','1400 kg / 3086 lbs','3 000 000 $');
/*!40000 ALTER TABLE `cars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `Cust_Id` varchar(20) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Phone_No` mediumtext,
  `Date_of_Purchase` date DEFAULT NULL,
  `Car_Name` varchar(65) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `State` varchar(30) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `E_mail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Cust_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('sadhmad12345','saksham','D15','6260176458','2020-03-29','Centenario Coupe','Dhar','Madhya Pradesh','M','sakshamr278@gmail.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `login` (
  `User_ID` varchar(8) NOT NULL,
  `Password` varchar(10) DEFAULT NULL,
  `User_Name` varchar(30) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `D_O_B` date DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `Contact` mediumtext,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('saksham','1234','saksham','M','2001-01-01','dhar','1234'),('Thakur','1234','Pushpendra Thakur','M','1999-11-08','Dhar, Madhya Pradesh','9575443296'),('vijay','123456','vijay','M','1963-01-01','dhar','123456'),('vijayr','123456','vijay','M','1965-01-01','dhar mp','123456');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'lamborghini'
--

--
-- Dumping routines for database 'lamborghini'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-02 19:21:36
