package conn;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class connection {
    private final static String url = "jdbc:postgresql://localhost/multipleChoiceDB";
    private final static String user = "connPac";
    private final static String password = "pacConn";
    public static Connection connect() {
        Connection conn = null;

        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");
        }
        catch (Exception e) {
            System.out.println(e);
        }


        return conn;
    }
}
