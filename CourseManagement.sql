CREATE DATABASE  IF NOT EXISTS `student_data_man` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `student_data_man`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: student_data_man
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `crs_detail`
--

DROP TABLE IF EXISTS `crs_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `crs_detail` (
  `STD_ID` int NOT NULL AUTO_INCREMENT,
  `STD_NAME` varchar(45) DEFAULT NULL,
  `TRAINER_NAME` varchar(45) DEFAULT NULL,
  `COURSE` varchar(45) DEFAULT NULL,
  `JOIN_DATE` date DEFAULT NULL,
  `PAID_AMT` int DEFAULT NULL,
  `BAL_AMT` int DEFAULT NULL,
  `STD_ADDRESS` varchar(50) DEFAULT NULL,
  `STD_NUM` double DEFAULT NULL,
  `STATUS` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`STD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crs_detail`
--

LOCK TABLES `crs_detail` WRITE;
/*!40000 ALTER TABLE `crs_detail` DISABLE KEYS */;
INSERT INTO `crs_detail` VALUES (1,'Gokul','Venkadesh','SQl','2024-10-05',15000,5000,'Porur',9876543321,'On Going'),(2,'Krish','Badri','Java','2024-08-15',20000,0,'Porur',8678954604,'Completed'),(3,'Pokesh','Badri','Java','2024-09-11',20000,0,'Vanagaram',8674454644,'Completed'),(4,'kumar','Venkadesh','SQl','2024-07-25',20000,0,'Madhuravoyal',8657754221,'Completed'),(5,'Dinesh','Badri','Java','2024-10-25',6000,14000,'Porur',6678911604,'On Going'),(6,'Selva','Prince','Reactjs','2024-11-11',11000,9000,'Madhuravoyal',8056057974,'Yet to Start'),(7,'Arun','Rakesh','Java Script','2024-11-10',12500,7500,'Vanagaram',8682990307,'Yet to Start'),(8,'Srikanth','Badri','Java','2024-09-03',20000,0,'Madhuravoyal',6383532388,'Completed'),(9,'Manoj','Rakesh','Java Script','2024-08-24',20000,0,'Porur',9884655851,'Completed'),(10,'Senthil','Rakesh','Java Script','2024-10-10',13500,16500,'Vanagaram',9566270443,'On Going'),(11,'Surendhar','Rakesh','Java Script','2024-07-02',20000,0,'Porur',6383352184,'Completed'),(12,'Deepika','Badri','Java','2024-09-22',10000,10000,'Madhuravoyal',6677348302,'On Going'),(13,'karthinika','Venkadesh','SQl','2024-10-20',14000,6000,'Madhuravoyal',6768950231,'On Going'),(14,'Lakshimi','Venkadesh','SQl','2024-10-28',10000,10000,'Porur',7894030211,'On Going'),(15,'Hari','Venkadesh','SQl','2024-07-16',10000,10000,'Valasaravakkam',9886654331,'On Going'),(16,'Sathish','Badri','Java','2024-08-19',20000,0,'Valasaravakkam',9967382133,'Completed'),(17,'Subash','Prince','Reactjs','2024-10-15',16000,4000,'Valasaravakkam',7879664323,'On Going'),(18,'Mothish','Badri','Java','2024-11-08',15000,5000,'Ramapuram',7418939730,'Yet to Start'),(19,'Arul','Prince','Reactjs','2024-11-06',9000,11000,'Valasaravakkam',7675589022,'Yet to Start'),(20,'Priya','Badri','Java','2024-09-27',15500,4500,'Ramapuram',9337678902,'On Going'),(21,'Moni','Prince','Reactjs','2024-10-08',15000,5000,'Ramapuram',8878954334,'On Going'),(22,'karthinika','Venkadesh','SQl','2024-10-20',20000,0,'Madhuravoyal',6768950231,'Completed'),(23,'Ganesh','Badri','Java','2024-11-08',15000,5000,'Ramapuram',8878954334,'Yet to Start');
/*!40000 ALTER TABLE `crs_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-14 14:44:16
