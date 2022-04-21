package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
        userDaoJdbc.createUsersTable();

//userDaoJdbc.saveUser("Mavliuda", "Abdirasilova", (byte) 19);
//userDaoJdbc.saveUser("Dinara", "Rahatbek kyzy", (byte) 18);

        System.out.println(userDaoJdbc.existsByFirstName("Mavliuda"));
    }
}
