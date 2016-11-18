# Host: localhost  (Version: 5.6.16)
# Date: 2014-03-16 18:29:21
# Generator: MySQL-Front 5.3  (Build 4.108)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "admin"
#

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "admin"
#

INSERT INTO `admin` VALUES (3,'Nafiz-Al-Naharul Islam','montreal','male','1987-05-01','nafiz351@gmail.com','5144735006'),(4,'Tonmoy Saha','montreal','male','1987-05-01','tonmoy_sh102@yahoo.com','4389858565'),(5,'admin','montreal','male','1987-05-01','admin@gmail.com','438-985-8565');

#
# Structure for table "app_schedule"
#

DROP TABLE IF EXISTS `app_schedule`;
CREATE TABLE `app_schedule` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `doc_id` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `app_type` varchar(255) DEFAULT NULL,
  `room_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

#
# Data for table "app_schedule"
#

INSERT INTO `app_schedule` VALUES (1,3,'2014-03-04','08:00:00','08:20:00','drop_in_visit','1'),(2,7,'2014-03-04','08:00:00','08:20:00','drop_in_visit','2'),(3,7,'2014-03-04','09:00:00','10:00:00','annual_checkup','1'),(4,7,'2014-03-04','08:00:00','08:20:00','drop_in_visit','3'),(5,7,'2014-03-04','10:00:00','11:00:00','annual_checkup','1'),(6,10,'2014-03-04','14:00:00','14:30:00','drop_in_visit','1'),(7,10,'2014-03-04','15:00:00','16:00:00','annual_checkup','1'),(8,3,'2014-03-04','14:00:00','14:20:00','drop_in_visit','1');

#
# Structure for table "clinic_appointment"
#

DROP TABLE IF EXISTS `clinic_appointment`;
CREATE TABLE `clinic_appointment` (
  `clinic_appointment_id` int(11) NOT NULL AUTO_INCREMENT,
  `appointment_type` varchar(255) DEFAULT NULL,
  `appointment_time_slot` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`clinic_appointment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "clinic_appointment"
#

INSERT INTO `clinic_appointment` VALUES (1,'annual checkup','20'),(2,'drop-in visit','60');

#
# Structure for table "clinic_room"
#

DROP TABLE IF EXISTS `clinic_room`;
CREATE TABLE `clinic_room` (
  `clinic_room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(255) DEFAULT NULL,
  `room_phone_ext` varchar(255) DEFAULT NULL,
  `room_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`clinic_room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "clinic_room"
#

INSERT INTO `clinic_room` VALUES (1,'101','0101','Specialist ');

#
# Structure for table "doctor"
#

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `doctor_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `registration` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`doctor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

#
# Data for table "doctor"
#

INSERT INTO `doctor` VALUES (2,'doctor1','montreal','male','1986-05-01','doctor1@gmail.com','2','4389850001'),(3,'doctor2','montreal','male','1986-05-01','doc2@gmail.com','2','4389850002'),(4,'doctor3','montreal','male','1987-05-01','doctor3@gmail.com','4','4389850003'),(5,'doctor4','montreal',NULL,'1986-05-01','doctor4@gmail.com','5','4389850005');

#
# Structure for table "nurse"
#

DROP TABLE IF EXISTS `nurse`;
CREATE TABLE `nurse` (
  `nurse_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `registration` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nurse_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "nurse"
#

INSERT INTO `nurse` VALUES (2,'nurse1','montreal',NULL,'1986-05-01','nurse1@gmail.com','n1','4389850001'),(3,'nurse2','montreal','male','1986-05-01','nurse2@gmail.com','n2','4389850002'),(4,'nurse3','montreal','male','1987-05-01','nurse3@gmail.com','n3','4389850003'),(5,'nurse4','montreal','female','1986-05-01','nurse1@gmail.com','n4','4389850005');

#
# Structure for table "patient"
#

DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `patient_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `health_card_no` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Data for table "patient"
#

INSERT INTO `patient` VALUES (3,'a','as','male','1987-05-01','a','a','412');

#
# Structure for table "patient_appointment"
#

DROP TABLE IF EXISTS `patient_appointment`;
CREATE TABLE `patient_appointment` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_id` varchar(255) DEFAULT NULL,
  `doc_id` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Data for table "patient_appointment"
#

INSERT INTO `patient_appointment` VALUES (1,'4','3','2014-03-04','08:00:00','08:20:00',1);

#
# Structure for table "patient_appointment_cart"
#

DROP TABLE IF EXISTS `patient_appointment_cart`;
CREATE TABLE `patient_appointment_cart` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_id` varchar(255) DEFAULT NULL,
  `doc_id` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  `expire_date` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "patient_appointment_cart"
#

INSERT INTO `patient_appointment_cart` VALUES (2,'4','10','2014-03-04','14:00:00','14:30:00',1,'2014-03-05');

#
# Structure for table "patients"
#

DROP TABLE IF EXISTS `patients`;
CREATE TABLE `patients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `date_of_birth` datetime DEFAULT NULL,
  `health_card_no` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Data for table "patients"
#

INSERT INTO `patients` VALUES (1,'Belal',NULL,'123456',NULL,'2014-03-10 01:15:59'),(3,'Shovon',NULL,'1236987',NULL,'2014-03-10 01:42:56');

#
# Structure for table "rooms"
#

DROP TABLE IF EXISTS `rooms`;
CREATE TABLE `rooms` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

#
# Data for table "rooms"
#

INSERT INTO `rooms` VALUES (1,'1'),(2,'2'),(3,'3'),(4,'4'),(5,'5');

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (3,'Tonmoy','Saha',NULL,NULL),(5,'Rajib','Sufean',NULL,NULL),(6,'Sohel','Rana',NULL,NULL),(7,'Tonmoy','Saha',NULL,NULL),(8,'Tonmoy','Saha','male','delhi'),(9,'Tonmoy','Saha','male','delhi');

#
# Structure for table "users"
#

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `bday` date DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `ref_number` varchar(100) DEFAULT NULL,
  `phone_number` varchar(50) DEFAULT NULL,
  `types` varchar(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

#
# Data for table "users"
#

INSERT INTO `users` VALUES (1,'admin','Montreal','admin@gmail.com','1986-05-01','M','1','001','Admin','admin'),(2,'nurse1','Montreal','nurse1@gmail.com','1989-05-01','M','2','002','Nurse','nurse1'),(3,'doctor1','Montreal','doc1@gmail.com','1990-05-01','F','3','003','Doctor','doctor1'),(4,'patient1','Montreal','patient1@gmail.com','1991-05-01','M','4','004','Patient','patient1'),(5,'nurse2','Montreal','nurse2@gmail.com','1995-04-02','M','5','005','Nurse','nurse2'),(6,'nurse3','Montreal','nurse3@gmail.com','1986-05-01','M','6','006','Nurse','nurse3'),(7,'doctor2','Montreal','doc2@gmail.com','1993-05-01','M','7','007','Doctor','doctor2'),(8,'patient2','Montreal','patient2@gmail.com','1992-06-01','M','8','008','Patient','patient2'),(9,'patient3','Montreal','patient3@gmail.com','1994-05-01','F','9','009','Patient','patient3'),(10,'doctor3','Montreal','doc3@gmail.com','1980-02-02','F','10','010','Doctor','doctor3');
