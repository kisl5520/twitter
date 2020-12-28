/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50703
Source Host           : 127.0.0.1:3306
Source Database       : login

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2020-12-28 14:08:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `twitter_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `twitter_user_info`;
CREATE TABLE `twitter_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of twitter_user_info
-- ----------------------------
INSERT INTO `twitter_user_info` VALUES ('1', 'ky', '1');
