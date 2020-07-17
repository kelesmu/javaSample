package JDBC;

import java.sql.*;

public class DataBase1 {




    public static void main(String[] args) throws SQLException {


        Connection conn = DriverManager.getConnection("http://localhost:8888/phpMyAdmin/index.php?lang=en", "root", "root");
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("select * from Student");
        //ResultSet result1 = statement.executeQuery("INSERT INTO Teacher (FirstName,LastName) VALUES ('Lars','Monsen');");
        System.out.println(statement);
    }

}
