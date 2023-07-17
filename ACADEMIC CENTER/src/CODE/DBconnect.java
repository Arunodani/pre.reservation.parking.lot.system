
package CODE;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect 
{
    
    public static Connection connect()
    {
        
        Connection conn = null;
        
        try 
        {
            
            Class.forName("com.mysql.jdbc.Driver");//:3306
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "");
        
        } 
        catch (Exception e) 
        {
            
            JOptionPane.showMessageDialog(null, e);
        
        }
        
        return conn;
        
    }
    
}
