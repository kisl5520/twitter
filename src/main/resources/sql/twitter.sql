/*
Navicat MySQL Data Transfer

Source Server         : localhost1
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : twitter

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-01-06 21:51:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_xtyhxx`
-- ----------------------------
DROP TABLE IF EXISTS `t_xtyhxx`;
CREATE TABLE `t_xtyhxx` (
  `GID` varchar(32) NOT NULL COMMENT '主键 主键',
  `YHDM` int(11) DEFAULT NULL COMMENT '用户代码 用户代码',
  `YHMC` varchar(32) DEFAULT NULL COMMENT '用户名称 用户名称',
  `XSMC` varchar(32) DEFAULT NULL COMMENT '显示名称 显示名称',
  `YHMM` varchar(32) DEFAULT NULL COMMENT '用户密码 用户密码',
  `JAVAMM` varchar(32) DEFAULT NULL COMMENT '密码密文 密码密文',
  `CZLX` int(11) DEFAULT NULL COMMENT '用户操作类型 用户操作类型:0-普通用户、1-管理用户、2-审批用户、3-审计用户',
  `STOPED` int(11) DEFAULT NULL COMMENT '停用标志 停用标志。0或null：未被停用；1：已停用。',
  PRIMARY KEY (`GID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_xtyhxx
-- ----------------------------
INSERT INTO `t_xtyhxx` VALUES ('1', '1', 'admin', 'admin', 'admin', null, '1', null);
INSERT INTO `t_xtyhxx` VALUES ('2', '2', 'ky', 'keyan', '1', null, '0', null);
