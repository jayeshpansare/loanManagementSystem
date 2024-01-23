package lib;
import java.io.IOException;
import java.sql.*;
import static lib.BaseClass.readProperty;

public class DBConnect {
    public static Statement DBConnect() throws IOException {
        String className = readProperty().getProperty("className");
        String dbURl = readProperty().getProperty("dbURl");
        String dbuserame = readProperty().getProperty("dbuserame");
        String dbpassword = readProperty().getProperty("dbpassword");
        Statement st = null;
        try {
            Class.forName(className);
            Connection connection =
                    DriverManager
                            .getConnection(dbURl, dbuserame, dbpassword);
            st = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error message is "+e.getMessage());
        }
        return st;
    }
}
