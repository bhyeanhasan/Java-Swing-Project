
package PSTU_CSE;

import java.sql.Connection;
import java.sql.*;

public class connection {
    
    private Driver driver;
    private Connection con=null;
    
    public Connection connect() throws SQLException
    {
        try 
        {
            driver = new org.sqlite.JDBC();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection("jdbc:sqlite:imad.db");
            return con;
            
        } catch (SQLException sQLException) {
            System.out.println("NO Connection");
            return null;
        }
    }
}
