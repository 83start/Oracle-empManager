package com.manager.emp.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 83start
 * @create 2020-12-23
 */
public class DBConnection {
    private final String dbDriver = "oracle.jdbc.driver.OracleDriver"; // 驱动类名
    private final String url = "jdbc:oracle:thin:@localhost:1521/orcl"; // 连接数据库的字符串
    public Connection connection; // 数据库连接对象

    public DBConnection() {
        try {
            Class.forName(dbDriver).newInstance(); // 加载驱动
            connection = DriverManager.getConnection(url, "scott", "tiger"); // 连接数据库
            System.out.println("连接数据库成功");
        } catch (Exception e) {
            System.out.println("数据库连接不成功");
            e.printStackTrace();
        }
    }
}
