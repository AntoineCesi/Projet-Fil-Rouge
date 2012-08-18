/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.model.Pays;

/**
 *
 * @author plepelletier
 */
public class RequetesPays {
    
    public int idPays;
    public String pays ;   
    
    public static void insertPays(String pays) throws SQLException {

        String query;

        
        try {
            query = "INSERT INTO PAYS (PAYS) VALUES (?);";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, pays);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesPays.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    public static Pays selectPaysById(int id)  throws SQLException {
        String query = null;
      
        Pays pays1 = new Pays();
        ResultSet resultat;
            
        try {
            query = "SELECT * from PAYS where ID_PAYS=? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();
          
            while (resultat.next()) {
                //System.out.println(resultat.getString("PAYS"));
                pays1 = new Pays(resultat.getInt("ID_PAYS"), resultat.getString("PAYS"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesPays.class.getName()).log(Level.SEVERE, null, ex);

        }
        return pays1;

    }
    
    
    public static int updatePays(int id, String pays) throws SQLException {
        int result;
        String query;
        try {
            query = "UPDATE PAYS set PAYS=? WHERE ID_PAYS=?";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, pays);
            pStatement.setInt(2, id);
            pStatement.executeUpdate();
            result = 0;
        } catch (SQLException ex) {
            Logger.getLogger(RequetesPays.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }
        return result;
    }
     
    public static List<Pays> selectPays()  throws SQLException {
      
        String query = null;
        List<Pays> pays1 = new ArrayList<Pays>();
        ResultSet resultat;
        try {
           
            query = "SELECT * from PAYS ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
               // System.out.println(resultat.getString("PAYS"));
                Pays pp = new Pays(resultat.getInt("ID_PAYS"), resultat.getString("PAYS"));
                pays1.add(pp);
            }

        } catch (SQLException ex) {
           Logger.getLogger(RequetesPays.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return pays1;

        
    }
}
