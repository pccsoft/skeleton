create table user ( name varchar(20), age integer);

CREATE TABLE  `customer` (
  `CUSTOMER_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(45) NOT NULL,
  `ADDRESS` VARCHAR(255) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;