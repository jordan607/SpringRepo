Step-1(Create Database)
===============
create Database EXAM_DATA;

Step-2(Use Database)
===============
use EXAM_DATA;

Step-3 (Create Table)
======================
CREATE TABLE `EXAM_RESULT` 
(
  `id`         		bigint(20) NOT NULL      AUTO_INCREMENT,
  `dob`   			timestamp  NOT NULL      DEFAULT CURRENT_TIMESTAMP,
  `Semester`    	int(11)                  DEFAULT NULL,
  `percentage`      float             		 DEFAULT NULL,

  PRIMARY KEY (`id`)
);

Step-4 (Create Procedure to Insert )
========================================
DELIMITER $$
CREATE PROCEDURE generate_EXAM_RESULT()
BEGIN
  DECLARE i INT DEFAULT 0;
  WHILE i < 500000 DO
    INSERT INTO `EXAM_RESULT` (`dob`,`percentage`,`Semester`) VALUES (
      FROM_UNIXTIME(UNIX_TIMESTAMP('2000-01-01 01:00:00')+FLOOR(RAND()*31536000)),
      ROUND(RAND()*100,2),
      1
    );
    SET i = i + 1;
  END WHILE;
END$$
DELIMITER ;

Step-5 (Call Procedure to Insert 50K Data )=> Takes Least 30-45 Min to Insert the records 
==========================================================================================
CALL generate_EXAM_RESULT();

Step-6 (Check the Records )
==================================
select * from EXAM_RESULT;

Step-7 /Optional (Remove Procedure if you dont need it any more )
======================================================================
DROP PROCEDURE generate_EXAM_RESULT;