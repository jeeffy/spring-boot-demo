/*
Navicat MySQL Data Transfer

Source Server         : 192.168.129.161
Source Server Version : 50718
Source Host           : 192.168.129.161:3306
Source Database       : csmp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-19 14:43:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(120) NOT NULL COMMENT '账号',
  `user_pswd` varchar(120) NOT NULL COMMENT '密码',
  `user_dept_id` int(11) NOT NULL COMMENT '归属部门id',
  `user_code` varchar(120) DEFAULT NULL COMMENT '用户编码',
  `user_name` varchar(120) NOT NULL COMMENT '姓名',
  `user_sex` int(11) DEFAULT NULL COMMENT '性别 1：男，0：女',
  `user_phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `user_type` int(11) DEFAULT NULL COMMENT '用户类型',
  `user_mail` varchar(60) DEFAULT NULL COMMENT '邮箱',
  `user_isdel` int(11) NOT NULL COMMENT '是否删除',
  `user_py` varchar(120) DEFAULT NULL COMMENT '拼音缩写',
  `user_wb` varchar(120) DEFAULT NULL COMMENT '五笔缩写',
  `user_remark` varchar(600) DEFAULT NULL COMMENT '备注',
  `user_create_date` datetime NOT NULL COMMENT '创建时间',
  `user_update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `user_create_user` int(11) NOT NULL COMMENT '创建人',
  `user_update_user` int(11) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '96e79218965eb72c92a549dd5a330112', '1', 'admin', 'admin', '0', ' ', null, null, '0', 'ADMIN', 'ADMIN', '系统管理员，默认用户', '2017-06-16 01:54:59', '2017-06-16 01:54:59', '1', '1');
INSERT INTO `sys_user` VALUES ('104', 'txx', '96e79218965eb72c92a549dd5a330112', '3', null, '天融信', null, '17682312295', '21', '22@qq.com', '0', 'TRX', 'GGW', '', '2017-06-16 02:14:42', '2017-06-23 07:14:20', '1', '1');
INSERT INTO `sys_user` VALUES ('105', 'yzlh', '96e79218965eb72c92a549dd5a330112', '8', null, '业主六号', null, '17682312295', '6', '123@test.com', '0', 'YZLH', 'OYUK', '', '2017-06-16 02:15:00', null, '1', '1');
INSERT INTO `sys_user` VALUES ('106', 'pcdwxuhj', '96e79218965eb72c92a549dd5a330112', '4', null, '普查单位xuhj', null, '17682312295', null, '11@11.com', '0', 'PCDWXUHJ', 'USUWXUHJ', '', '2017-06-16 02:15:45', null, '1', '1');
INSERT INTO `sys_user` VALUES ('107', 'zglh', '96e79218965eb72c92a549dd5a330112', '9', null, '主管六号', null, '17682312295', null, '147@test.com', '0', 'ZGLH', 'YTUK', '', '2017-06-16 02:16:00', null, '1', '1');
INSERT INTO `sys_user` VALUES ('108', 'zgxuhj', '96e79218965eb72c92a549dd5a330112', '11', null, '主管xuhj', null, '17682312295', null, '11@11.com', '0', 'ZGXUHJ', 'YTXUHJ', '', '2017-06-16 02:17:46', '2017-06-16 02:25:26', '1', '1');
INSERT INTO `sys_user` VALUES ('109', 'zxrlh', '96e79218965eb72c92a549dd5a330112', '8', null, 'yzlh', null, '17682312295', '7', '123@test.cm', '0', 'YZLH', 'YZLH', null, '2017-06-16 02:18:23', null, '105', '105');
INSERT INTO `sys_user` VALUES ('110', 'zgxuhj2', '96e79218965eb72c92a549dd5a330112', '10', null, '主管xuhj2', null, '17682312295', null, '13@22.com', '0', 'ZGXUHJ2', 'YTXUHJ2', '', '2017-06-16 02:19:38', '2017-06-16 02:24:01', '1', '1');
INSERT INTO `sys_user` VALUES ('111', 'yzfzrxuhj', '96e79218965eb72c92a549dd5a330112', '10', null, '业主负责人xuhj', null, '17682312295', '6', '11@22.com', '0', 'YZFZRXUHJ', 'OYQGWXUHJ', '', '2017-06-16 02:21:17', null, '1', '1');
INSERT INTO `sys_user` VALUES ('112', 'yzzxrxuhj', '96e79218965eb72c92a549dd5a330112', '10', null, '业主执行人xuhj', null, '17682312295', '7', '22@11.com', '0', 'YZZXRXUHJ', 'OYRTWXUHJ', '', '2017-06-16 02:22:27', null, '1', '1');
INSERT INTO `sys_user` VALUES ('113', 'smtest', '5996db56f21a824ce65722522244dc99', '10', null, 'smtest', null, '17682312295', null, 'smtest@123.com', '0', 'SMTEST', 'SMTEST', '', '2017-06-22 08:32:52', null, '1', '1');
