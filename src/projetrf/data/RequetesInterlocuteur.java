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
import projetrf.model.Interlocuteur;
import projetrf.model.Pays;

/**
 *
 * @author Windows XP
 */
public class RequetesInterlocuteur {

   

    public static void insertInterlocuteur(int idcommercial, int idville, int idservice, String nom, String prenom, String email) throws SQLException {
        String query;

        try {

            query = "INSERT INTO INTERLOCUTEUR (ID_COMMERCIAL,ID_VILLE,ID_SERVICE,INTNOM,INTPRENOM,INTEMAIL) VALUES (?,?,?,?,?,?) ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idcommercial);
            pStatement.setInt(2, idville);
            pStatement.setInt(3, idservice);
            pStatement.setString(4, nom.toUpperCase());
            pStatement.setString(5, prenom.toLowerCase());
            pStatement.setString(6, email.toUpperCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public static Interlocuteur selectById(int id) throws SQLException {
        String query = null;

        Interlocuteur interlocuteur1 = new Interlocuteur();
        ResultSet resultat;

        try {

            query = "SELECT * from INTERLOCUTEUR where ID_INTERLOCUTEUR=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
               // System.out.println(resultat.getString("INTNOM"));
                interlocuteur1 = new Interlocuteur(resultat.getInt("ID_INTERLOCUTEUR"),resultat.getInt("ID_COMMERCIAL"), resultat.getInt("ID_VILLE"), resultat.getInt("ID_SERVICE"), resultat.getString("INTNOM"), resultat.getString("INTPRENOM"), resultat.getString("INTEMAIL"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return interlocuteur1;
    }
    
    public static List<Interlocuteur> selectInterlocuteurByName(String name) throws SQLException {
        String query = null;
        List<Interlocuteur> interlocuteur1 = new ArrayList<Interlocuteur>();
        ResultSet resultat;
        try {
            query = "SELECT * from INTERLOCUTEUR where INTNOM like ? order by INTNOM asc ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, name.toUpperCase() + "%");
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
                //System.out.println(resultat.getString("INTNOM"));
                Interlocuteur ii = new Interlocuteur(resultat.getInt("ID_INTERLOCUTEUR"),resultat.getInt("ID_COMMERCIAL"), resultat.getInt("ID_VILLE"), resultat.getInt("ID_SERVICE"), resultat.getString("INTNOM"), resultat.getString("INTPRENOM"), resultat.getString("INTEMAIL"));
                interlocuteur1.add(ii);

            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);

        }

        return interlocuteur1;
    }

    public static List<Interlocuteur> selectInterlocuteur() throws SQLException  {
        String query = null;
        List<Interlocuteur> interlocuteur1 = new ArrayList<Interlocuteur>();
        ResultSet resultat;
        try {
            query = "SELECT * from INTERLOCUTEUR  ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                System.out.println(resultat.getString("INTNOM"));
                Interlocuteur ii = new Interlocuteur(resultat.getInt("ID_INTERLOCUTEUR"),resultat.getInt("ID_COMMERCIAL") ,resultat.getInt("ID_VILLE"), resultat.getInt("ID_SERVICE"), resultat.getString("INTNOM"), resultat.getString("INTPRENOM"), resultat.getString("INTEMAIL"));
                interlocuteur1.add(ii);

            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);

        }

        return interlocuteur1;


    }
    
      public static void updateInterlocuteur(int id,int idcommercial, int idville, int idservice, String nom, String prenom, String email) throws SQLException {
       
        String query;
        try {
            query = "UPDATE INTERLOCUTEUR set ID_COMMERCIAL=?,ID_VILLE=?,ID_SERVICE=?,INTNOM=?,INTPRENOM=?,INTEMAIL=?  WHERE ID_INTERLOCUTEUR=?";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(7, id);
            pStatement.setInt(1, idcommercial);
            pStatement.setInt(2, idville);
            pStatement.setInt(3, idservice);
            pStatement.setString(4, nom.toUpperCase());
            pStatement.setString(5, prenom.toLowerCase());
            pStatement.setString(6, email.toUpperCase());

            pStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
           
        }
       
    }
}
