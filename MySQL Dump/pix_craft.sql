-- Auto Backup for MySQL Professional Edition 3.0
--
-- Host: localhost
--
-- MySQL Server Version: 5.1.32-community
--
-- 2016-01-28 09:44:14
--
-- ------------------------------------------------------

SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT;
SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS;
SET @OLD_CHARACTER_SET_CONNECTION=@@CHARACTER_SET_CONNECTION;
SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION;
SET CHARACTER_SET_CLIENT='latin1';
SET CHARACTER_SET_RESULTS='latin1';
SET CHARACTER_SET_CONNECTION='latin1';
SET NAMES 'latin1';
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS;
SET UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS;
SET FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE;
SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
SET @OLD_SQL_NOTES=@@SQL_NOTES;
SET SQL_NOTES=0;
SET CHARACTER_SET_CLIENT='latin1';
SET CHARACTER_SET_RESULTS='latin1';
SET CHARACTER_SET_CONNECTION='latin1';
SET NAMES 'latin1';
CREATE DATABASE IF NOT EXISTS `pix_craft` DEFAULT CHARACTER SET latin1;
USE `pix_craft`;

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (  `Username` varchar(50) DEFAULT NULL,  `Password` varchar(50) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
ALTER TABLE `admin` DISABLE KEYS;
LOCK TABLES `admin` WRITE;
INSERT INTO `admin` VALUES ('admin','admin123');
INSERT INTO `admin` VALUES ('admin1','admin234');
INSERT INTO `admin` VALUES ('varu123','varun123');
INSERT INTO `admin` VALUES ('admin4','admin4');
UNLOCK TABLES;
ALTER TABLE `admin` ENABLE KEYS;
SET CHARACTER_SET_CLIENT='latin1';
SET CHARACTER_SET_RESULTS='latin1';
SET CHARACTER_SET_CONNECTION='latin1';
SET NAMES 'latin1';
CREATE DATABASE IF NOT EXISTS `pix_craft` DEFAULT CHARACTER SET latin1;
USE `pix_craft`;

DROP TABLE IF EXISTS `feedback`;
CREATE TABLE IF NOT EXISTS `feedback` (  `Username` varchar(50) DEFAULT NULL,  `feedback` varchar(3000) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
ALTER TABLE `feedback` DISABLE KEYS;
LOCK TABLES `feedback` WRITE;
INSERT INTO `feedback` VALUES ('karan111098','fhfhfyyyyyyyyuui,kgj');
INSERT INTO `feedback` VALUES ('varuu2345','Iam the best');
INSERT INTO `feedback` VALUES ('tushu112','yo');
INSERT INTO `feedback` VALUES ('pratik','sljfESKHbflaskejfe');
UNLOCK TABLES;
ALTER TABLE `feedback` ENABLE KEYS;
SET CHARACTER_SET_CLIENT='latin1';
SET CHARACTER_SET_RESULTS='latin1';
SET CHARACTER_SET_CONNECTION='latin1';
SET NAMES 'latin1';
CREATE DATABASE IF NOT EXISTS `pix_craft` DEFAULT CHARACTER SET latin1;
USE `pix_craft`;

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (  `Username` varchar(50) DEFAULT NULL,  `Password` varchar(50) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
ALTER TABLE `login` DISABLE KEYS;
LOCK TABLES `login` WRITE;
INSERT INTO `login` VALUES ('karan','karan123');
INSERT INTO `login` VALUES ('sidd','sidd123');
INSERT INTO `login` VALUES ('abc','abcd');
INSERT INTO `login` VALUES ('ashishc','ashishc');
INSERT INTO `login` VALUES ('ashishc','ashishc');
UNLOCK TABLES;
ALTER TABLE `login` ENABLE KEYS;
SET CHARACTER_SET_CLIENT='latin1';
SET CHARACTER_SET_RESULTS='latin1';
SET CHARACTER_SET_CONNECTION='latin1';
SET NAMES 'latin1';
CREATE DATABASE IF NOT EXISTS `pix_craft` DEFAULT CHARACTER SET latin1;
USE `pix_craft`;

DROP TABLE IF EXISTS `workshop`;
CREATE TABLE IF NOT EXISTS `workshop` (  `Date` date DEFAULT NULL,  `City` varchar(40) DEFAULT NULL,  `State` varchar(20) DEFAULT NULL,  `Seats_Left` int(11) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
ALTER TABLE `workshop` DISABLE KEYS;
LOCK TABLES `workshop` WRITE;
INSERT INTO `workshop` VALUES ('2016-04-02','jaipur','Rajasthan',300);
INSERT INTO `workshop` VALUES ('2016-02-02','a','b',87);
INSERT INTO `workshop` VALUES ('2016-04-04','a','b',3);
UNLOCK TABLES;
ALTER TABLE `workshop` ENABLE KEYS;
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
SET SQL_NOTES=@OLD_SQL_NOTES;
SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT;
SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS;
SET CHARACTER_SET_CONNECTION=@OLD_CHARACTER_SET_CONNECTION;
SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION;
