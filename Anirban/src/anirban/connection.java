
package anirban;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection 
{
    
    private Driver driver;
    private Connection con=null;
    
    public Connection connect() throws SQLException
    {
        try {
            driver = new org.sqlite.JDBC();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection("jdbc:sqlite:blood.db");
            System.out.println("COnnetction");
            return con;
            
        } catch (SQLException sQLException) {
            System.out.println("NOOOO Connection");
            return null;
        }
    }
}
