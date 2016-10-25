
package projectmaniz;

import java.sql.*;
import javax.swing.*;

public class Dbconnections {
    
    public static Connection cn;
    public static void FillConnection() {
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn=DriverManager.getConnection("jdbc:odbc:Datasource","sa","apptech");

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);         
        }
        
    }
}
