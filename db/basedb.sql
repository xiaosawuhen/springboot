SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Company;
DROP TABLE IF EXISTS User;




/* Create Tables */

CREATE TABLE Company
(
	-- 公司的唯一标识
	id bigint NOT NULL COMMENT '公司的唯一标识',
	-- 公司名称
	name varchar(20) COMMENT '公司名称',
	-- 公司地址
	address varchar(50) COMMENT '公司地址',
	-- 公司电话
	phone varchar(15) COMMENT '公司电话',
	-- 公司座机号码
	tele varchar(15) COMMENT '公司座机号码',
	-- 公司邮件
	email varchar(50) COMMENT '公司邮件',
	-- 公司介绍
	description varchar(500) COMMENT '公司介绍',
	PRIMARY KEY (id)
);


CREATE TABLE User
(
	-- 用户ID
	id bigint NOT NULL COMMENT '用户ID',
	-- 用户名称
	name varchar(50) COMMENT '用户名称',
	-- 用户密码
	password varchar(20) COMMENT '用户密码',
	-- 用户年龄
	age smallint COMMENT '用户年龄',
	PRIMARY KEY (id)
);



