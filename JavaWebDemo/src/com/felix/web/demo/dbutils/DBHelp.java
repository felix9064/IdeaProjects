package com.felix.web.demo.dbutils;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description: 数据库连接类
 * Author: Felix
 * Date: 2017/3/10
 * Time: 9:52
 */
public class DBHelp {

    private static final String USER = "sunfront";
    private static final String PASS = "sunfront";
    private static final String URL = "jdbc:oracle:thin:@198.98.20.6:1521/front";
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

    // 创建一个数据库连接
    private static Connection connection = null;

    // 创建预编译语句对象，一般都是用这个而不用Statement
    private static PreparedStatement prep = null;

    // 创建一个结果集对象
    private static ResultSet result = null;

    private static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);// 获取连接
            // System.out.println("连接数据库成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return conn;
    }

    public static void close() {

        if (result != null) {
            try {
                result.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (prep != null) {
            try {
                prep.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ResultSet executeQuerySql(String sql) {
        connection = getConnection();
        if (connection == null) {
            return null;
        }
        try {
            prep = connection.prepareStatement(sql);
            result = prep.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

}
