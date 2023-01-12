# MySQL

## 概述:

- 数据库:DB,DataBase,有组织存储数据的仓库

- 数据库管理系统:DBMS,DataBase Management System,操作数据库的软件
- MySql:一个主流的数据库管理系统.
- SQL:Structured Query Language,简称 SQL,结构化查询语言,操作数据库管理系统的语言.

- 关系型数据库:数据存储为二维表结构,所谓关系型就是数据库的不同表之间存在联系.

- 数据库在硬盘体现为文件夹,文件夹里存储的是数据表,和数据.

- 文件:*.frm表文件 *.MYD数据文件

## 数据库结构:

**树结构**

- DBMS下可以操作多个数据库
- 每个数据库有多个数据表
- 数据表里存储数据

## SQL语法:

### 注释:

```mysql
#单行注释
/*
多行注释
*/
-- 注释
```

### DDL数据定义

**数据库:**

```mysql
SHOW DATABASES;#查询数据库,展示数据库
CREATE DATABASE DB1;#创建数据库 
CREATE DATABASE IF NOT EXISTS DB1;
DROP DATABASE DB1;#删除数据库
DROP DATABASE IF EXISTS DB1;
SELECT DATABASE();#查看当前使用数据库
USE DB1;#使用数据库
```

**表:**

```mysql
#CRUD增查改删 CREATE RETRIEVE UPDATE DELETE
SHOW TABLES;#查看当前数据库的表
DESC T1;#查看表结构

-- CREATE
/*创建表
结构 字段名 数据类型
不同字段键值对逗号隔开
*/
CREATE TABLE T1(
	
	NAME VARCHAR(20),
	TEL INT,
	PWD VARCHAR(16)
);

-- DELETE
DROP TABLE T1;#删除表
DROP TABLE IF EXISTS T1;

-- 改表名
ALTER TABLE T1 RENAME TO T2;#改表名

ALTER TABLE T1 ADD 列名 数据类型;#加列
ALTER TABLE T1 MODIFY 列名 新数据类型;#改列数据类型
ALTER TABLE T1 CHANGE 列名 新列名 新列名数据类型;#修改 新列名及其数据类型
ALTER TABLE T1 DROP 列名;#删除列
```

### DML数据修改

```mysql
-- 添加
INSERT INTO T1(列名1,列名3,...)VALUES(值1,值3,...);#对TI 指定列进行添加数据 未添加的存null
INSERT INTO T1 VALUES(值1,值2,...);#所有列添加数据

-- 批量添加
INSERT INTO T1(列名1,列名3,...)VALUES(值1,值3,...),(值1,值3,...)...;
INSERT INTO T1 VALUES(值1,值2,...),(值1,值2,...)...;

-- 修改
UPDATE TI SET 列1=值1,列2=值2,...WHERE 条件;#条件结构 列名=数值
/*
!!!
UPDATE如果没有加WHERE 会修改表中所有行
!!!
*/

-- 删除
DELETE FROM TI WHERE 条件;
/*
删除不加WHERE会清空表内所有行
*/
```



### DQL查询语言

```mysql
SELECT 字段列表 #就是限制查询那些列
FROM 表名
WHERE 条件
GROUP BY 分组字段
HAVING 分组后条件
ORDER BY 排序字段
LIMIT 分页限定
```

```mysql
-- 查询多个字段 SELECT
SELECT * FROM T1;#所有字段
SELECT NAME,AGE FROM T1;#查询NAME和AGE两列数据


```

### 数据库操作:

#### 基础:

- SHOW DATABASES;  查看数据库
- USE 数据库名称; 使用数据库
- SELECT DATABASE();查看当前数据库

#### 数据库创建删除:

- CREATE DATABASE 数据库名称;
- CREATE DATABASE IF NOT EXISTS 数据库名称; 创建数据库
- DROP DATABASE 数据库名称;
- DROP DATABASE IF EXISTS 数据库名称; 删除数据库

### 表操作:

#### 基本:

- SHOW TABLES;   #查看表

- DESC 表名称;   #查看表结构

- ```mysql
  CREATE TABLE 表名 (
  	字段名1  数据类型1,
  	字段名2  数据类型2,
  	…
  	字段名n  数据类型n
  );
  ```

#### 表更改:ALTER TABLE 表名 

- ALTER TABLE 表名 RENAME TO 新的表名;   #改表名

##### 改列:

- ALTER TABLE 表名 ADD 列名 数据类型;  #加列
- ALTER TABLE 表名 MODIFY 列名 新数据类型;  #列换数据类型
- ALTER TABLE 表名 CHANGE 列名 新列名 新数据类型;   #换列名
- ALTER TABLE 表名 DROP 列名;   #删除列

### 数据操作:

#### 行插入:INSERT INTO 表名

- INSERT INTO 表名 (列名1,列名2,…) VALUES(值1,值2,…); #列对应值插入行
- INSERT INTO 表名 VALUES(值1,值2,…);   #无空列插入行
- INSERT INTO 表名(列名1,列名2,…) VALUES(值1,值2,…),(值1,值2,…),(值1,值2,…)…;   #列对应插入多个行
- INSERT INTO 表名 VALUES(值1,值2,…),(值1,值2,…),(值1,值2,…)…;  #无空列插入行

#### 行修改:UPDATE&DELETE

- UPDATE 表名 SET 列名1=值1,列名2=值2,…  WHERE 条件  ; #按条件进行修改列值对
- DELETE FROM 表名  WHERE 条件   ;#按条件进行删除

### 查询,筛选表:

```mysql
-- 限制展示哪一列
SELECT
    字段列表
-- 去重
DISTINCT
-- 限制哪个表
FROM 
    表名列表 
-- 限制列对应的值的条件
WHERE 
    条件列表
-- 按照条件分组
GROUP BY
    分组字段
HAVING
    分组后条件
-- 排序
ORDER BY
    排序字段
LIMIT
    分页限定
```

# 约束:





