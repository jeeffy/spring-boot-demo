-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_id` int(11) DEFAULT NULL COMMENT '归属部门id',
  `account` varchar(120) DEFAULT NULL COMMENT '账号',
  `username` varchar(120) DEFAULT NULL COMMENT '姓名',
  `male` int(11) DEFAULT NULL COMMENT '性别 1：男，0：女',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `mail` varchar(60) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '1', 'admin', 'admin', '0', ' ', null);
INSERT INTO `sys_user` VALUES ('104', '3', 'txx', '天融信', null, '17682312295', '22@qq.com');
INSERT INTO `sys_user` VALUES ('105', '8', 'yzlh', '业主六号', null, '17682312295', '123@test.com');
INSERT INTO `sys_user` VALUES ('106', '4', 'pcdwxuhj', '普查单位xuhj', null, '17682312295', '11@11.com');
INSERT INTO `sys_user` VALUES ('107', '9', 'zglh', '主管六号', null, '17682312295', '147@test.com');
INSERT INTO `sys_user` VALUES ('108', '11', 'zgxuhj', '主管xuhj', null, '17682312295', '11@11.com');
INSERT INTO `sys_user` VALUES ('109', '8', 'zxrlh', 'yzlh', null, '17682312295', '123@test.cm');
INSERT INTO `sys_user` VALUES ('110', '10', 'zgxuhj2', '主管xuhj2', null, '17682312295', '13@22.com');
INSERT INTO `sys_user` VALUES ('111', '10', 'yzfzrxuhj', '业主负责人xuhj', null, '17682312295', '11@22.com');
INSERT INTO `sys_user` VALUES ('112', '10', 'yzzxrxuhj', '业主执行人xuhj', null, '17682312295', '22@11.com');
INSERT INTO `sys_user` VALUES ('113', '10', 'smtest', 'smtest', null, '17682312295', 'smtest@123.com');
