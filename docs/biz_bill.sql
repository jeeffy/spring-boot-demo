/*
Navicat MySQL Data Transfer

Source Server         : 192.168.129.161
Source Server Version : 50718
Source Host           : 192.168.129.161:3306
Source Database       : csmp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-24 15:43:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for biz_bill
-- ----------------------------
DROP TABLE IF EXISTS `biz_bill`;
CREATE TABLE `biz_bill` (
  `bill_id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_djhm` varchar(60) DEFAULT NULL COMMENT '单据号码',
  `bill_type` int(11) NOT NULL COMMENT '1、预警单\r\n2、处置单',
  `tl_id` int(11) DEFAULT NULL COMMENT '条例id',
  `cf_id` int(11) DEFAULT NULL COMMENT '处罚id',
  `bill_rectify_date` datetime DEFAULT NULL COMMENT '整改日期',
  `total_count` int(11) DEFAULT NULL,
  `finish_count` int(11) DEFAULT NULL,
  `bill_finish_date` datetime DEFAULT NULL COMMENT '完成时间',
  `bill_isdel` int(11) NOT NULL COMMENT '是否删除',
  `bill_create_date` datetime NOT NULL COMMENT '创建时间',
  `bill_update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `bill_create_user` int(11) NOT NULL COMMENT '创建用户',
  `bill_update_user` int(11) DEFAULT NULL COMMENT '修改用户',
  `website_id` int(11) DEFAULT NULL,
  `bill_status` int(11) DEFAULT NULL COMMENT '\r\n0、待审批\r\n1、通过\r\n2、驳回\r\n',
  `bill_create_tbdw` varchar(255) DEFAULT NULL COMMENT '通报单位',
  PRIMARY KEY (`bill_id`),
  UNIQUE KEY `bill_djhm` (`bill_djhm`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='单据表';

-- ----------------------------
-- Records of biz_bill
-- ----------------------------
INSERT INTO `biz_bill` VALUES ('1', 'T2017061600001', '2', '23', null, '2017-06-16 00:00:00', '1', '1', '2017-06-16 03:17:40', '0', '2017-06-16 03:17:24', null, '107', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('2', 'Y2017061600001', '1', null, null, null, '5', '2', null, '0', '2017-06-16 03:18:57', null, '108', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('3', 'T2017061600002', '2', '23', null, '2017-07-01 11:19:43', '2', '2', '2017-06-21 05:58:41', '0', '2017-06-16 03:19:02', null, '108', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('4', 'T2017061600003', '2', '23', null, '2017-07-01 11:19:49', '3', '1', null, '0', '2017-06-16 03:19:08', null, '108', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('5', 'T2017061600004', '2', '23', null, '2017-07-01 13:49:46', '1', '1', '2017-06-21 05:48:25', '0', '2017-06-16 05:49:03', null, '107', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('6', 'T2017061600005', '2', '23', null, '2017-07-01 13:53:19', '1', '1', '2017-06-21 06:03:30', '0', '2017-06-16 05:52:37', null, '107', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('7', 'T2017062200003', '2', '23', null, '2017-06-22 00:00:00', '1', null, null, '0', '2017-06-22 08:49:55', null, '108', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('8', 'T2017062200004', '2', '23', null, '2017-06-22 00:00:00', '1', null, null, '0', '2017-06-22 08:52:12', null, '108', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('9', 'Y2017062200021', '1', null, null, null, '1', null, null, '0', '2017-06-22 08:53:16', null, '108', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('10', 'Y2017062200024', '1', null, null, null, '1', null, null, '0', '2017-06-22 08:57:54', null, '108', null, '4', '1', '主管单位（区域）');
INSERT INTO `biz_bill` VALUES ('11', 'T2017062700001', '2', '23', null, '2017-06-27 00:00:00', '1', null, null, '0', '2017-06-27 01:12:10', null, '108', null, '4', '1', '主管单位（区域）');
