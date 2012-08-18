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
import projetrf.model.Tva;

public class RequetesTva {

    public int idtva;
    public String libelle;
    public float taux;

    public static void insertTva(String tva, float taux) throws SQLException {

        String query = "";
        try {
            query = "INSERT INTO TVA (TVALIBELLE,TVATX) VALUES (?,?) ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, tva);
            pStatement.setFloat(2, taux);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesTva.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
      public static Tva selectTvaById(int id)  throws SQLException {
        String query = null;
      
        Tva tva = new Tva();
        ResultSet resultat;
            
        try {
            query = "SELECT * from TVA where ID_TVA=? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();
          
            while (resultat.next()) {
                //System.out.println(resultat.getString("PAYS"));
                tva = new Tva(resultat.getInt("ID_TVA"), resultat.getString("TVALIBELLE"),resultat.getFloat("TVATX"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesTva.class.getName()).log(Level.SEVERE, null, ex);

        }
        return tva;

    }
    public static List<Tva> selectTva() throws SQLException {
        String query = null;
        List<Tva> tva = new ArrayList<Tva>();
        ResultSet resultat;
        try {
            query = "SELECT * from TVA ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                // System.out.println(resultat.getString("PAYS"));
                Tva tt = new Tva(resultat.getInt("ID_TVA"), resultat.getString("TVALIBELLE"), resultat.getFloat("TVATX"));
                tva.add(tt);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesTva.class.getName()).log(Level.SEVERE, null, ex);

        }

        return tva;
    }
    
       
    public static void updateTva(int idtva,String libelle, Float taux) throws SQLException {

        String query;
        try {
            query = "UPDATE TVA set TVALIBELLE=?,TVATX=? WHERE ID_TVA=? ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(3, idtva);
            pStatement.setString(1, libelle);
            pStatement.setFloat(2, taux);
            pStatement.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(RequetesTva.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}
