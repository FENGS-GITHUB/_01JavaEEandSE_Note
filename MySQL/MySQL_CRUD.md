# 数据库:

- SHOW DATABASES;
- CREATE DATABASE IF NOT EXISTS 数据库名称; 建立数据库
- DROP DATABASE IF EXISTS 数据库名称; 删除数据库
- USE 数据库名称;
- SELECT DATABASE();

# 表

##### 查看与建立:

- SHOW TABLES; 查看表
- DESC 表名称; 表结构

```
CREATE TABLE 表名 (
	字段名1  数据类型1,
	字段名2  数据类型2
);
```

- DROP TABLE IF EXISTS 表名; 删除表

##### 表修改:ALTER TABLE

- ALTER TABLE 表名 RENAME TO 新的表名;
- ALTER TABLE 表名 ADD 列名 数据类型;
- ALTER TABLE 表名 MODIFY 列名 新数据类型;
- ALTER TABLE 表名 CHANGE 列名 新列名 新数据类型;
- ALTER TABLE 表名 DROP 列名;

# 数据

##### 插入INSERT INTO

- INSERT INTO 表名(列名1,列名2,…) VALUES(值1,值2,…);
- INSERT INTO 表名 VALUES(值1,值2,…);
- INSERT INTO 表名 VALUES(值1,值2,…),(值1,值2,…),(值1,值2,…)…;

##### 修改行UPDATE...SET

- UPDATE 表名 SET 列名1=值1,列名2=值2,… [WHERE 条件] ;

##### 删除行DELETE FROM

- DELETE FROM 表名 [WHERE 条件] ;



# 查询

##### 列选择SELECT

- SELECT 列名 FROM  表 WHERE 条件;
- SELECT DISTINCT 列名 FROM 表;

##### 条件WHERE *

- **比较:**列名 大于等于小于....不等于....  数据
- **范围:**BETWEEN 20 and 30;  IN (18,20 ,22);
- **模糊:**列名 like '_花%'; _单个字符 %任意字数字符
- **有空:** 列名 IS NOT NULL; IS NULL;
- **条件链接:** 与或非 || && !

##### 排序ORDER BY

- SELECT 列FROM 表 WHERE 条件 ORDER BY 列 排序方式,列 排序方式;

* ASC ： 升序排列 **（默认值）**
* DESC ： 降序排列

##### 聚合函数:

- SELECT 聚合函数名(列名) FROM 表;
- 查询结果是一个数值

| 函数名      | 功能                             |
| ----------- | -------------------------------- |
| count(列名) | 统计数量（一般选用不为null的列） |
| max(列名)   | 最大值                           |
| min(列名)   | 最小值                           |
| sum(列名)   | 求和                             |
| avg(列名)   | 平均值                           |

##### 分组查询:

- SELECT 列 FROM 表 WHERE 分组前过滤 GROUP BY 分组组名 HAVING 分组过滤;

流程:

1. 先WHERE过滤剔除不符合要求的行
2. 分组,以分组组名为依据,内容为SELECT所选列
3. HAVING 分组过滤 留下所需查询

##### 分页查询LIMIT

- SELECT 列 FROM 表 LIMIT  起始索引 , 查询条目数;



