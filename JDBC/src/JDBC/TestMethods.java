package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMethods {
    static void getInfo(ResultSet resultSet) throws SQLException {
        int col=1;
        while(resultSet.next()){
            System.out.println(
                    "数据为:{"+
                            resultSet.getInt(col)+
                            resultSet.getString(col+1)+","+
                            resultSet.getInt(col+2)+","+
                            resultSet.getString(col+3)+","+
                            resultSet.getString(col+4)+","+
                            resultSet.getDouble(col+5)+","+
                            resultSet.getDouble(col+6)+","+
                            resultSet.getDate(col+7)+","+"}");
        };
    }
}
