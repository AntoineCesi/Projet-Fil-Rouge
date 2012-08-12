/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ademarly
 */
public class ConnectionBDD {
    
    private Statement st;
    Connection conn=null;
    String url="jdbc:mysql://localhost/MARKET";
    String login="root";
    String passwd="silmm97";

    public static ConnectionBDD instance;
    
    private ConnectionBDD() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection) DriverManager.getConnection(url,login,passwd); 
            st= (Statement) conn.createStatement(); 
        }
        catch(ClassNotFoundException cnfe){
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, cnfe);
            JOptionPane.showMessageDialog(null,
                "L'application n'a pas pu trouver le driver jdbc",
                "erreur",
                JOptionPane.WARNING_MESSAGE);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                "L'application n'a pas pu se connecter a la BDD",
                "erreur",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static ConnectionBDD getInstance() {
        if(instance == null){
            instance = new ConnectionBDD();
        }
        return instance;
    }
    
    public Statement getStatement(){
        return st;
    }
    public java.sql.PreparedStatement getPreparedStatement(String sql) throws SQLException{
        return conn.prepareStatement(sql);
    }
}
