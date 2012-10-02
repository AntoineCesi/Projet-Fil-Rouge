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
import projetrf.model.Commercial;

/**
 *
 * @author Travail
 */
public class RequetesCommercial {

  
  
    public static void insertCommercial(int idservice,  String nom, String prenom, String adresse1, String adresse2 ) throws SQLException {

        String query;

        try {

            query = "INSERT INTO COMMERCIAL (ID_VILLE,COMMNOM,COMMPRENOM,COMMADRESSE1,COMMADRESSE2) VALUES (?,?,?,?,?) ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idservice);
            pStatement.setString(2, nom);
            pStatement.setString(3, prenom);
            pStatement.setString(4, adresse1);
            pStatement.setString(5, adresse2);

            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommercial.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static Commercial selectCommercialById(int id) throws SQLException {
        String query = null;

        Commercial Util = new Commercial();
        ResultSet resultat;

        try {
            query = "SELECT * from COMMERCIAL where ID_COMMERCIAL=? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
                //System.out.println(resultat.getString("PAYS"));
                Util = new Commercial(resultat.getInt("ID_COMMERCIAL"),  resultat.getInt("ID_VILLE"), resultat.getString("COMMNOM"), resultat.getString("COMMPRENOM"), resultat.getString("COMMADRESSE1"), resultat.getString("COMMADRESSE2"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommercial.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Util;

    }
//int idFonction, int idVille, String nom, String prenom, String adresse1, String adresse2
    public static void updateCommercial(int id, int idservice, int idville, String nom, String prenom, String adresse1, String adresse2) throws SQLException {
        int result;
        String query;
        try {
            query = "UPDATE COMMERCIAL set ID_VILLE=?,COMMNOM=?,COMMPRENOM=?,COMMADRESSE1=?,COMMADRESSE2=? where ID_COMMERCIAL=? ";

            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);

            pStatement.setInt(6, id);
            pStatement.setInt(1, idville);
            pStatement.setString(2, nom);
            pStatement.setString(3, prenom);
            pStatement.setString(4, adresse1);
            pStatement.setString(5, adresse2);
            pStatement.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommercial.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }
   
    public static List<Commercial> selectCommercial() throws SQLException {

        String query = null;
        List<Commercial> util = new ArrayList<Commercial>();
        ResultSet resultat;
        try {

            query = "SELECT * from COMMERCIAL ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                // System.out.println(resultat.getString("PAYS"));
                Commercial uu = new Commercial(resultat.getInt("ID_COMMERCIAL"), resultat.getInt("ID_VILLE"), resultat.getString("COMMNOM"), resultat.getString("COMMPRENOM"), resultat.getString("COMMADRESSE1"), resultat.getString("COMMADRESSE2"));
                util.add(uu);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommercial.class.getName()).log(Level.SEVERE, null, ex);

        }
        return util;
    }
    
    public static Commercial selectById(int id) throws SQLException {
        String query = null;

        Commercial util = new Commercial();
        ResultSet resultat;

        try {
            query = "SELECT * from COMMERCIAL where ID_COMMERCIAL=? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

                util = new Commercial(resultat.getInt("ID_COMMERCIAL"),  resultat.getInt("ID_VILLE"), resultat.getString("COMMNOM"), resultat.getString("COMMPRENOM"), resultat.getString("COMMADRESSE1"), resultat.getString("COMMADRESSE2"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommercial.class.getName()).log(Level.SEVERE, null, ex);

        }
        return util;

    }
   
}
