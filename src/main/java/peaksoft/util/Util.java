package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    public Connection connection;
       public Util() throws SQLException {
           connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                   "postgres", "2002");
    }
    public Connection getConnection(){
           return connection;
    }
}
