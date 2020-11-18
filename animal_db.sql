/* 
 * Drop/Create Database
Drop/Create Table
Drop/Create Procedure to add an Animal record
Drop/Create Procedure to get a single Animal record
Call procedure to add 3-5 animals

 */
/**
 * Author:  William Clark
 * Created: Nov 18, 2020
 */
DROP DATABASE IF EXISTS animal_db
CREATE DATABASE animal_db

USING animal_db

DROP TABLE IF EXISTS animal
CREATE TABLE animal(
    animal_id VARCHAR(25) NOT NULL,
    animal_name VARCHAR(100) NOT NULL,
    species VARCHAR(25) NOT NULL,
    age INT NOT NULL,
    fixed_status BIT NOT NULL,
    legs INT NOT NULL,
    weight DECIMAL(6,2) NOT NULL,
    date_added DATE NOT NULL,
    last_feeding_time DATETIME NOT NULL
)

DROP PROCEDURE IF EXISTS sp_create_animal
DELIMITER $$
CREATE PROCEDURE sp_create_animal(
    IN p_animal_id VARCHAR(25) NOT NULL,
    IN p_animal_name VARCHAR(100) NOT NULL,
    IN p_species VARCHAR(25) NOT NULL,
    IN p_age INT NOT NULL,
    IN p_fixed_status BIT NOT NULL,
    IN p_legs INT NOT NULL,
    IN p_weight DECIMAL(6,2) NOT NULL,
    IN p_date_added DATE NOT NULL,
    IN p_last_feeding_time DATETIME NOT NULL
)
BEGIN
    INSERT INTO animal(
        animal_id,
        animal_name,
        species,
        age,
        fixed_status,
        legs,
        weight,
        date_added,
        last_feeding_time   
    )
    VALUES (
        p_animal_id,
        p_animal_name,
        p_species,
        p_age,
        p_fixed_status,
        p_legs,
        p_weight,
        p_date_added,
        p_last_feeding_time 
    )