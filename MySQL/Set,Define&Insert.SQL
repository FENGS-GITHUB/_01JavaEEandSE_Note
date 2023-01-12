#===============数据库操作=================
-- 创建数据库
CREATE DATABASE IF NOT EXISTS DB1;
CREATE DATABASE IF NOT EXISTS DB2;
-- 删除数据库
DROP DATABASE IF EXISTS DB2;
-- 查看数据库
SHOW DATABASES;
-- 选择数据库
USE DB1;
-- 查看当前数据库
SELECT DATABASE();

#===============表操作=====================
-- 创建表
CREATE TABLE T1 (
	ID INT,
	NAME VARCHAR(20),
	TEL INT,
	PWD VARCHAR(16)
);

-- 查看当前库所有表
SHOW TABLES;
-- 查看表T1的数据类型
DESC T1;
-- 删除表T2
DROP TABLE T2;


#===============列操作=====================
-- 改表内容
ALTER TABLE T1 RENAME TO T2;#改表名字
-- 改列
ALTER TABLE T1 ADD 列名 数据类型;#加列
ALTER TABLE T1 MODIFY 列名 新数据类型;#改列数据类型
ALTER TABLE T1 CHANGE 列名 新列名 新列名数据类型;#修改 新列名及其数据类型
ALTER TABLE T1 DROP 列名;#删除列
#===============行操作=====================
INSERT INTO T1 (ID,TEL,PWD,NAME,AGE,SEX) VALUES 
(01,29390,"12345","mike",20,"male"),
(02,29330,"12345","aric",22,"female"),
(03,21230,"12345","nonk",21,"female"),
(04,29330,"12345","rokk",21,"male"),
(05,29210,"12345","cmmy",22,"male"),
(06,29390,"12345","icll",23,"female"),
(07,29290,"12345","mool",24,"female"),
(08,23390,"12345","mell",25,"male"),
(09,29190,"12345","miww",26,"female"),
(10,29030,"12345","cccd",21,"female");