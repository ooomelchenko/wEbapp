package gameRoom.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCFactoryMySQL {

    private final static String URL = "jdbc:mysql://localhost:3306/edue_db";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "a44n73";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}