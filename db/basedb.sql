SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS CompanyInfo;
DROP TABLE IF EXISTS ProjectInfo;
DROP TABLE IF EXISTS Project;
DROP TABLE IF EXISTS Company;
DROP TABLE IF EXISTS CustomerInfo;
DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS UserEstimate;
DROP TABLE IF EXISTS EmployeeEstimateLevel;
DROP TABLE IF EXISTS UserLevel;
DROP TABLE IF EXISTS EmployeeLevel;
DROP TABLE IF EXISTS User;




/* Create Tables */

CREATE TABLE Company
(
	-- 公司的唯一标识
	cid bigint NOT NULL AUTO_INCREMENT COMMENT '公司的唯一标识',
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
	PRIMARY KEY (cid)
);


CREATE TABLE CompanyInfo
(
	ciid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	-- 用户ID
	uid bigint NOT NULL COMMENT '用户ID',
	PRIMARY KEY (ciid)
);


CREATE TABLE Customer
(
	-- 客户唯一id
	id bigint NOT NULL AUTO_INCREMENT COMMENT '客户唯一id',
	-- 客户名称
	name varchar(20) COMMENT '客户名称',
	-- 客户密码
	password varchar(10) DEFAULT '123465' COMMENT '客户密码',
	-- 客户年龄
	age int COMMENT '客户年龄',
	-- 客户手机号
	phone varchar(20) COMMENT '客户手机号',
	-- 客户邮箱
	email varchar(50) COMMENT '客户邮箱',
	PRIMARY KEY (id)
);


CREATE TABLE CustomerInfo
(
	-- 流水号
	id bigint NOT NULL AUTO_INCREMENT COMMENT '流水号',
	-- 客户的唯一标识
	cid bigint NOT NULL COMMENT '客户的唯一标识',
	PRIMARY KEY (id),
	UNIQUE (cid)
);


CREATE TABLE EmployeeEstimateLevel
(
	eelid bigint NOT NULL AUTO_INCREMENT,
	-- 评价分数
	grade bigint COMMENT '评价分数',
	-- 评价类型
	type varchar(10) COMMENT '评价类型',
	PRIMARY KEY (eelid)
);


CREATE TABLE EmployeeLevel
(
	-- 流水号
	elid bigint NOT NULL AUTO_INCREMENT COMMENT '流水号',
	-- 级别标识
	level int COMMENT '级别标识',
	-- 级别名称
	name varchar(25) COMMENT '级别名称',
	PRIMARY KEY (elid),
	UNIQUE (level)
);


CREATE TABLE Project
(
	pid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	-- 项目名称
	name varchar(30) COMMENT '项目名称',
	-- 项目描述
	description varchar(500) COMMENT '项目描述',
	PRIMARY KEY (pid)
);


CREATE TABLE ProjectInfo
(
	piid bigint NOT NULL AUTO_INCREMENT,
	pid bigint NOT NULL,
	-- 用户ID
	uid bigint NOT NULL COMMENT '用户ID',
	PRIMARY KEY (piid)
);


CREATE TABLE User
(
	-- 用户ID
	uid bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
	-- 用户名称
	name varchar(50) COMMENT '用户名称',
	-- 用户密码
	password varchar(20) COMMENT '用户密码',
	-- 用户年龄
	age smallint COMMENT '用户年龄',
	-- 用户手机号
	phone varchar(20) COMMENT '用户手机号',
	-- 用户邮箱
	email varchar(50) COMMENT '用户邮箱',
	PRIMARY KEY (uid)
);


CREATE TABLE UserEstimate
(
	-- 流水号
	id bigint NOT NULL AUTO_INCREMENT COMMENT '流水号',
	-- 用户ID
	uid bigint NOT NULL COMMENT '用户ID',
	eelid bigint NOT NULL,
	PRIMARY KEY (id)
);


CREATE TABLE UserLevel
(
	-- 流水号
	ulid bigint NOT NULL AUTO_INCREMENT COMMENT '流水号',
	-- 用户ID
	uid bigint NOT NULL COMMENT '用户ID',
	-- 流水号
	elid bigint NOT NULL COMMENT '流水号',
	PRIMARY KEY (ulid)
);



