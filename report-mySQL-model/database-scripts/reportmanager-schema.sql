SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS fixed_error ;
DROP TABLE IF EXISTS mobile_error ;
DROP TABLE IF EXISTS reportmanager.user ;
DROP TABLE IF EXISTS team ;


-- -----------------------------------------------------
-- Schema reportmanager
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `reportmanager` DEFAULT CHARACTER SET utf8 ;
USE `reportmanager` ;

-- -----------------------------------------------------
-- Table `reportmanager`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`team` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `isDeleted` BIT(1) NOT NULL,
  `createdAt` DATETIME(6) NOT NULL,
  PRIMARY KEY (`id`));

-- -----------------------------------------------------
-- Table `reportmanager`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `Color` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `createdAt` DATETIME(6) NOT NULL,
  `isAdmin` BIT(1) NOT NULL,
  `isDeleted` BIT(1) NOT NULL,
  `teamId` BIGINT(20) NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (teamId) REFERENCES team(id)
    );



-- -----------------------------------------------------
-- Table `reportmanager`.`fixed_error`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`fixed_error` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `errorCode` INT(11) NULL,
  `networkElement` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `requestId` VARCHAR(255) NOT NULL,
  `retries` INT(11) NULL,
  `daysInError` INT(11) NULL,
  `startedAt` DATETIME(6) NOT NULL,
  `lastRetryAt` DATETIME(6) NOT NULL,
  `workOrder` INT(11) NULL,
  `status` VARCHAR(45) NULL,
  `isReported` BIT(1) NOT NULL,
  `isDeleted` BIT(1) NOT NULL,
  `accessId` INT(11)  NOT NULL,
  `userId` BIGINT(20) NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (userId) REFERENCES reportmanager.user(id)
  );



-- -----------------------------------------------------
-- Table `reportmanager`.`mobile_error`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`mobile_error` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `errorCode` INT(11) NULL,
  `networkElement` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `requestId` VARCHAR(255) NOT NULL,
  `retries` INT(11) NULL,
  `daysInError` INT(11) NULL,
  `startedAt` DATETIME(6) NOT NULL,
  `lastRetryAt` DATETIME(6) NOT NULL,
  `workOrder` INT(11) NULL,
  `status` VARCHAR(45) NULL,
  `isReported` BIT(1) NOT NULL,
  `isDeleted` BIT(1) NOT NULL,
  `msisdn` INT(11) NOT NULL,
  `imsi` INT(11) NOT NULL,
  `userId` BIGINT(20) NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (userId) REFERENCES reportmanager.user(id)
  );

