CREATE DATABASE IF NOT EXISTS test CHARSET utf8 COLLATE utf8_bin;
USE test;

DROP TABLE IF EXISTS sys_user;

CREATE TABLE sys_user (
  id int(10) NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL COMMENT '用户名',
  password varchar(100) NOT NULL COMMENT '密码',
  type varchar(20) NOT NULL COMMENT '用户类型',
  phone varchar(20) NULL COMMENT '电话号码',
  mail varchar(100) NULL COMMENT '邮箱',
  roles varchar(100) NULL COMMENT '角色列表',
  avatar varchar(200) COLLATE utf8_bin DEFAULT '' COMMENT '头像',
  name varchar(20) COLLATE utf8_bin DEFAULT '' COMMENT '姓名',
  remark varchar(200) COLLATE utf8_bin DEFAULT '' COMMENT '备注',
  create_time datetime DEFAULT CURRENT_TIMESTAMP,
  update_time datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE (username)
) ENGINE=INNODB AUTO_INCREMENT=10000 COMMENT='系统用户表';