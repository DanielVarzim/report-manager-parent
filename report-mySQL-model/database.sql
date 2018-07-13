-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema reportmanager
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `reportmanager` DEFAULT CHARACTER SET utf8 ;
USE `reportmanager` ;

-- -----------------------------------------------------
-- Table `reportmanager`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`team` (
  `idTeam` INT(11) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `isDeleted` TINYINT(1) NOT NULL,
  `createdAt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`idTeam`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `reportmanager`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`user` (
  `idUser` INT(11) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `Color` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `password` LONGTEXT NOT NULL,
  `createdAt` DATETIME NULL DEFAULT NULL,
  `isAdmin` TINYINT(1) NOT NULL,
  `isDeleted` TINYINT(1) NOT NULL,
  `team_idTeam` INT(11) NOT NULL,
  PRIMARY KEY (`idUser`),
  INDEX `fk_user_team_idx` (`team_idTeam` ASC),
  CONSTRAINT `fk_user_team`
    FOREIGN KEY (`team_idTeam`)
    REFERENCES `reportmanager`.`team` (`idTeam`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `reportmanager`.`fixed_error`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`fixed_error` (
  `idFixedError` INT(11) NOT NULL,
  `errorCode` INT(11) NULL DEFAULT NULL,
  `networkElement` VARCHAR(45) NULL DEFAULT NULL,
  `description` VARCHAR(255) NULL DEFAULT NULL,
  `requestId` VARCHAR(255) NOT NULL,
  `retries` INT(11) NULL DEFAULT NULL,
  `daysInError` INT(11) NULL DEFAULT NULL,
  `startedAt` DATETIME NULL DEFAULT NULL,
  `lastRetryAt` DATETIME NULL DEFAULT NULL,
  `workOrder` INT(11) NULL DEFAULT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  `isReported` TINYINT(1) NULL DEFAULT NULL,
  `isDeleted` TINYINT(1) NOT NULL,
  `accessId` INT(11) NOT NULL,
  `user_idUser` INT(11) NOT NULL,
  PRIMARY KEY (`idFixedError`, `user_idUser`),
  INDEX `fk_fixed_error_user1_idx` (`user_idUser` ASC),
  CONSTRAINT `fk_fixed_error_user1`
    FOREIGN KEY (`user_idUser`)
    REFERENCES `reportmanager`.`user` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `reportmanager`.`mobile_error`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reportmanager`.`mobile_error` (
  `idFixedError` INT(11) NOT NULL,
  `errorCode` INT(11) NULL DEFAULT NULL,
  `networkElement` VARCHAR(45) NULL DEFAULT NULL,
  `description` VARCHAR(255) NULL DEFAULT NULL,
  `requestId` VARCHAR(255) NOT NULL,
  `retries` INT(11) NULL DEFAULT NULL,
  `daysInError` INT(11) NULL DEFAULT NULL,
  `startedAt` DATETIME NULL DEFAULT NULL,
  `lastRetryAt` DATETIME NULL DEFAULT NULL,
  `workOrder` INT(11) NULL DEFAULT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  `isReported` TINYINT(1) NULL DEFAULT NULL,
  `isDeleted` TINYINT(1) NOT NULL,
  `msisdn` INT(11) NOT NULL,
  `imsi` INT(11) NOT NULL,
  `user_idUser` INT(11) NOT NULL,
  PRIMARY KEY (`idFixedError`, `user_idUser`),
  INDEX `fk_mobile_error_user1_idx` (`user_idUser` ASC),
  CONSTRAINT `fk_mobile_error_user1`
    FOREIGN KEY (`user_idUser`)
    REFERENCES `reportmanager`.`user` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
