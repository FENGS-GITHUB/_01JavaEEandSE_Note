package JDBC;
//import com.mysql.jdbc.Driver;

import java.sql.*;

public class TestDemo {
    public static void main(String[] args) throws SQLException {

        /*
        * Step1:注册驱动,目的是确定使用的是哪个厂商的数据库驱动jar包步骤如下:
        * new com.mysql.jdbc.Driver()
        *   创建一个mysql驱动对象,包含了数据库厂商信息
        * DriverManager.registerDriver(该驱动对象)
        *   注册该驱动,让java知道是哪个厂商的数据库
        * */
        Driver mysqldriver=new com.mysql.jdbc.Driver();
        DriverManager.registerDriver(mysqldriver);

        /*
        * Step2:连接数据库
        * DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234")
        *  已经识别了数据库,DriverManager通过url端口和用户密码建立数据库连接,创建了一个连接对象root
        * */
        Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");

        /*STEP3:获取数据库操作对象 用于执行SQL语句
        * 连接对象通过createStatement()方法获得一个sql执行语句的Statement执行器对象
        * */
        Statement statement = connection1.createStatement();

        /*STEP4:数据库操作对象执行SQL语句
        * 创建一个字符串用于存储sql语句
        * 执行器通过调用execute方法执行sql语句
        * executeQuery执行查询语句,会返回结果集对象
        *
        * */
        //String sql="INSERT INTO stu(id,NAME,age,sex,address,math,english,hire_date) VALUES (11,'Luke',25,'男','杭州',66,78,'1995-09-01');";
        statement.execute("USE DATABASE1");
        ResultSet resultSet = statement.executeQuery("select * from stu");

        /*Step5:处理结果集*/
        TestMethods.getInfo(resultSet);


        /*Step6:释放资源*/
        statement.close();
        connection1.close();

    }
}
