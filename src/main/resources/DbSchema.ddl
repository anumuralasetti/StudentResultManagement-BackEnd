CREATE DATABASE SRM

USE DATABASE SRM

CREATE TABLE `students` (
  `student_Id` int NOT NULL AUTO_INCREMENT,
  `first_Name` varchar(255) DEFAULT NULL,
  `family_Name` varchar(255) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `is_Active` int DEFAULT NULL,
  PRIMARY KEY (`student_Id`)
) 


CREATE TABLE `courses` (
  `course_Id` int NOT NULL AUTO_INCREMENT,
  `course_Name` varchar(255) DEFAULT NULL,
  `is_Active` int DEFAULT NULL,
  PRIMARY KEY (`course_Id`)
)


CREATE TABLE `results` (
  `result_Id` int NOT NULL AUTO_INCREMENT,
  `course_Id` int DEFAULT NULL,
  `student_Id` int DEFAULT NULL,
  `score` char(1) DEFAULT NULL,
  `is_Active` int DEFAULT NULL,
  PRIMARY KEY (`result_Id`)
) 