package com.example.reflect;

import java.sql.*;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/permission_manage?useSSL=false&serverTimeZone=GMT%2B8", "root", "root");
        // 通过连接对象创建statement
        Statement statement = connection.createStatement();
        String sql = "select * from sys_user";
        ResultSet rst = statement.executeQuery(sql);
        while (rst.next()) {
            int id = rst.getInt("id");
            String name = rst.getString("name");
            String username = rst.getString("username");
            String password = rst.getString("password");
            String address = rst.getString("address");
            System.out.print(id + "\t" + name + "\t\t" + username + "\t\t" + password + "\t\t" + address + "\n");
        }
        rst.close();
        statement.close();
        connection.close();

    }
}
