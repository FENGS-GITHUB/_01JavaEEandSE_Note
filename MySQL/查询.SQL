-- 创建数据库及表
CREATE DATABASE IF NOT EXISTS DB1;
USE DB1;

CREATE TABLE T1 (
	ID INT,
	TEL INT,
	PWD VARCHAR(16),
	NAME VARCHAR(20),
	AGE INT,
	SEX VARCHAR(8)
);

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

-- 基本查询语句
#SELECT 代表列的限定
SELECT DISTINCT * FROM T1; #所有列
SELECT DISTINCT ID,NAME,TEL FROM T1; #特定列
SELECT DISTINCT ID 序号,NAME AS 名,TEL AS 电话 FROM T1; #特定列和替代名
#WHERE 代表行的限定
select * from T1 where ID > 8; #ID数大于8的行
select * from T1 where AGE > 7;#AGE大于8的行
#LIKE 模糊行限定
select * from T1 where name like "M%";
select * from T1 where name like "_i%";