/*
		File:	order_record_db.sql
		DATE:	2020-12-07
		AUTHOR:	William Clark
        DESCRIPTION:
			Builds the databse, related tables, views, and stored procedures for the DAO project.
*/
DROP DATABASE IF EXISTS animal_db;
CREATE DATABASE animal_db;
USE animal_db;

/* *******************************************************************************
	CREATE OrderRecord
******************************************************************************* */
DROP TABLE IF EXISTS Animal;
CREATE TABLE Animal(
	AnimalID INT NOT NULL COMMENT 'The primary key of the animal.'
	, Name VARCHAR(20) NOT NULL COMMENT 'The name of the animal.'
	, Species VARCHAR(20) NOT NULL COMMENT 'The species of the animal.'
     , Gender VARCHAR(20) NOT NULL COMMENT 'The gender of the animal.'
     , Age INT NOT NULL COMMENT 'The age of the animal.'
     , Fixed BIT(1) NOT NULL COMMENT 'The fixed status of the animal.'
     , Legs INT NOT NULL COMMENT 'The number of legs of the animal.'
     , Weight DECIMAL(7,2) NOT NULL COMMENT 'The weight of the animal.'
     , DateAdded DATETIME NOT NULL COMMENT 'The date the animal was added.'
     , LastFeedingTime DATETIME NOT NULL COMMENT 'The last feeding time of the animal.'
) COMMENT 'An animal.'
;

/* *******************************************************************************
                            STORED PROCEDURES
******************************************************************************* */

/*
The procedure to create a new record in the OrderRecord table.
*/
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_create_animal$$
CREATE PROCEDURE sp_create_order_record(
     IN p_AnimalID INT
     ,IN p_Name VARCHAR(20)
     ,IN p_Species VARCHAR(20)
     ,IN p_Gender VARCHAR(20)
     ,IN p_Age INT
     ,IN p_Fixed BIT(1)
     ,IN p_Legs INT
     ,IN p_Weight DECIMAL(7,2)
     ,IN p_DateAdded DATETIME
     ,IN p_LastFeedingTime DATETIME
) COMMENT 'Create a new animal record in database'
BEGIN
     INSERT INTO Animal(
          AnimalID
          , Name
          , Species
          , Gender
          , Age
          , Fixed
          , Legs
          , Weight
          , DateAdded
          , LastFeedingTime
          )
     VALUES(
          p_AnimalID
          , p_Name
          , p_Species
          , p_Gender
          , p_Age
          , p_Fixed
          , p_Legs
          , p_Weight
          , p_DateAdded
          , p_LastFeedingTime
     )
     ;
END$$
DELIMITER ;

/*
The procedure to select an animal in the animal table.
*/
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_select_animal_by_ID$$
CREATE PROCEDURE sp_select_animal_by_ID(
     IN p_AnimalID INT
) COMMENT 'Find an animal in database'
BEGIN

     SELECT
           AnimalID
           , Name
           , Species
           , Gender
           , Age
           , Fixed
           , Legs
           , Weight
           , DateAdded
           , LastFeedingTime
     FROM Animal
     WHERE AnimalID = p_AnimalID
     ;
END$$
DELIMITER ;

/*
The procedure to delete an animal in the animal table.
*/
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_delete_animal_by_ID$$
CREATE PROCEDURE sp_delete_animal_by_ID(
     IN p_AnimalID INT
) COMMENT 'Find an animal in database'
BEGIN

     SELECT
           AnimalID
           , Name
           , Species
           , Gender
           , Age
           , Fixed
           , Legs
           , Weight
           , DateAdded
           , LastFeedingTime
     FROM Animal
     WHERE AnimalID = p_AnimalID
     ;
END$$
DELIMITER ;
