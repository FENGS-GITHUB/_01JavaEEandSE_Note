# JDBC

## 建立与数据库的连接:

### DriverManager:驱动对象

- DriverManager.getConnection(url, username, password);//静态方法实现数据库连接,返回值为一个Connection对象

  - url:jdbc:mysql://ip地址(域名):端口号/数据库名称 目标数据库

  * user ：用户名

  * poassword ：密码

### Connection:连接对象

概述:连接对象,封装了目标数据库的操作者和目标数据库的地址.

#### **对象方法:**

**创建sql语句执行器:**

- Statement createStatement(); //根据该链接对象获取一个Statement对象,该对象用于执行数据库各类语句.
- PreparedStatement  prepareStatement();//根据该链接对象获取一个PreparedStatement对象,该对象能够防止SQL注入

**事务管理:**

- setAutoCommit(boolean i);//开启事务,参数为事务管理的自动提交开关
- void commit();//提交事务
- void rollback();//回滚事务

###  Statement:SQL执行器

#### 对象方法:

- int executeUpdate(String SQL);//执行SQL语句,并返回受影响行数
- ResultSet  executeQuery(String SQL);//执行查询语句,并返回查询结果ResultSet对象.

### ResultSet:查询结果(表)

ResultSet对象是数据库查询后返回的结果数据级,可以看作是一个表.

#### 对象方法:

- boolean next();//光标指向下一行,并返回改行是否有数据(),第一行是表头,所以执行一次next方法光标指向第一行
- int/ String... getInt("列名")/getString("列序号")....;//获取光标所指行对应列名或者列号的数据

### PreparedStatement:防注入SQL执行器

该SQL执行器将单引号全部替换转义,防止输入字符串与SQL语句拼接导致语义改变

#### 使用方式及步骤:

1. 通过Connection对象调用 prepareStatement()方法,参数为将所需值为?的SQL语句,生成一个SQL语句待补全的PreparedStatement对象;
2. PreparedStatement对象通过setString(?的序号,补全字符串)来对待补全SQL补全操作.
3. PreparedStatement对象执行executeQuery()方法,实现查询.

关闭连接释放资源:

```java
rs.close();
pstmt.close();
conn.close();
//以上三个对象为结果集对象,执行器对象,连接对象,使用完毕后通过调用close()方法关闭释放资源
```

## 连接池

构建一个连接池,实现Connection对象的复用.

德鲁伊连接池复用:

配置文件:

```properties
driverClassName=com.mysql.jdbc.Driver
url=jdbc:mysql:///db1?useSSL=false&useServerPrepStmts=true
username=root
password=1234
# 初始化连接数量
initialSize=5
# 最大连接数
maxActive=10
# 最大等待时间
maxWait=3000
```
