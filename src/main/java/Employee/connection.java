package Employee;
import java.sql.*;
public class connection {
    private static Connection con;
    public static Connection ConnectToDB() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	con=DriverManager.getConnection("jdbc:mysql://sql12670608_crowdwild:de9c384905fe7bae2bae6ab7631271a2c482cab2@53u.h.filess.io:3307/sql12670608_crowdwild","sql12670608_crowdwild","de9c384905fe7bae2bae6ab7631271a2c482cab2");
        	System.out.println(con);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return con;
    }
}