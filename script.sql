create database libraryDB;

INSERT INTO `librarydb`.`users` (`username`, `password`, `usertype`) VALUES ('admin', 'pass', 'admin');

CREATE TABLE `librarydb`.`bookgenres` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `librarydb`.`bookgenres` (`name`) VALUES ('Thriller');
INSERT INTO `librarydb`.`bookgenres` (`name`) VALUES ('History');
INSERT INTO `librarydb`.`bookgenres` (`name`) VALUES ('Action');
INSERT INTO `librarydb`.`bookgenres` (`name`) VALUES ('Classsics');
INSERT INTO `librarydb`.`bookgenres` (`name`) VALUES ('Detective');
INSERT INTO `librarydb`.`bookgenres` (`name`) VALUES ('Fantasy');
INSERT INTO `librarydb`.`bookgenres` (`name`) VALUES ('Horror');
  
CREATE TABLE `librarydb`.`authors` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `surname` VARCHAR(100) NULL,
  `expertise` VARCHAR(200) NULL,
  `about` TEXT NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `librarydb`.`authors` (`name`, `surname`, `expertise`) VALUES ('Jan', 'Kowalski', 'Thrillers');
INSERT INTO `librarydb`.`authors` (`name`, `surname`, `expertise`) VALUES ('Szymon', 'Nowak', 'History');
INSERT INTO `librarydb`.`authors` (`name`, `surname`, `expertise`) VALUES ('Piotr', 'Zychowicz', 'History');

  
  CREATE TABLE `librarydb`.`students` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NULL,
  `surname` VARCHAR(100) NULL,
  `phonenumber` VARCHAR(20) NULL,
  `email` TEXT(200) NULL,
  `picture` LONGBLOB NULL,
  `gender` VARCHAR(25) NULL,
  PRIMARY KEY (`id`));
  
  

CREATE TABLE `librarydb`.`books` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `isbn` VARCHAR(25) NULL,
  `name` VARCHAR(250) NULL,
  `authorid` INT NULL,
  `genreid` INT NULL,
  `quantity` INT NULL,
  `publisher` VARCHAR(250) NULL,
  `price` DOUBLE NULL,
  `datereceived` DATE NULL,
  `description` TEXT NULL,
  `coverimage` LONGBLOB NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `isbn_UNIQUE` (`isbn` ASC) VISIBLE);
  

CREATE TABLE `librarydb`.`issuebooks` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `bookid` INT NOT NULL,
  `studentid` INT NULL,
  `status` VARCHAR(50) NULL,
  `issuedate` DATE NULL,
  `returndate` DATE NULL,
  `note` TEXT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `librarydb`.`userstable` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(60) NULL,
  `surname` VARCHAR(60) NULL,
  `username` VARCHAR(60) NULL,
  `password` VARCHAR(50) NULL,
  `usertype` VARCHAR(20) NULL,
  PRIMARY KEY (`id`));
  
  ALTER TABLE `librarydb`.`books` ADD CONSTRAINT fkauthorid FOREIGN KEY (authorid) REFERENCES `librarydb`.`authors`(id) on UPDATE CASCADE on DELETE CASCADE;
  ALTER TABLE `librarydb`.`books` ADD CONSTRAINT fkgenreid FOREIGN KEY (genreid) REFERENCES `librarydb`.`bookgenres`(id) on UPDATE CASCADE on DELETE CASCADE;
  ALTER TABLE `librarydb`.`issuebooks` ADD CONSTRAINT fkbookid FOREIGN KEY (bookid) REFERENCES `librarydb`.`books`(id) on UPDATE CASCADE on DELETE CASCADE;
  ALTER TABLE `librarydb`.`issuebooks` ADD CONSTRAINT fkstudentid FOREIGN KEY (studentid) REFERENCES `librarydb`.`students`(id) on UPDATE CASCADE on DELETE CASCADE;