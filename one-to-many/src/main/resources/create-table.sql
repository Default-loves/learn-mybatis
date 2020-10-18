
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
INSERT INTO author (`name`) VALUES ("xiaoming");
INSERT INTO author (`name`) VALUES ("xiaohong");


DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(254) NOT NULL DEFAULT '',
  `author_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
INSERT INTO article (`name`, `author_id`) VALUES ("first paper", 1);
INSERT INTO article (`name`, `author_id`) VALUES ("second paper", 1);
INSERT INTO article (`name`, `author_id`) VALUES ("first paper", 2);
