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
import projetrf.model.Utilisateur;

/**
 *
 * @author Travail
 */
public class RequetesUtilisateur {

    public int idUtilisateur;
    public int idFonction;
    public int idVille;
    public String nom;
    public String prenom;
    public String identifiant;
    public String password;

    public static void insertUtilisateur(int idfonction, int idville, String nom, String prenom, String identifiant, String password) throws SQLException {

        String query;

        try {

            query = "INSERT INTO UTILISATEUR (ID_FONCTION,ID_VILLE,UTILNOM,UTILPRENOM,IDENTIFIANT,PASSWORD) VALUES (?,?,?,?,?,?) ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idfonction);
            pStatement.setInt(2, idville);
            pStatement.setString(3, nom);
            pStatement.setString(4, prenom);
            pStatement.setString(5, identifiant);
            pStatement.setString(6, password);

            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesUtilisateur.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static Utilisateur selectUtilisateurById(int id) throws SQLException {
        String query = null;

        Utilisateur Util = new Utilisateur();
        ResultSet resultat;

        try {
            query = "SELECT * from UTILISATEUR where ID_UTILISATEUR=? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
                //System.out.println(resultat.getString("PAYS"));
                Util = new Utilisateur(resultat.getInt("ID_UTILISATEUR"), resultat.getInt("ID_FONCTION"), resultat.getInt("ID_VILLE"), resultat.getString("UTILNOM"), resultat.getString("UTILPRENOM"), resultat.getString("IDENTIFIANT"), resultat.getString("PASSWORD"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesUtilisateur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Util;

    }
//int idFonction, int idVille, String nom, String prenom, String identifiant, String password
    public static int updateUtilisateur(int id, int idfonction, int idville, String nom, String prenom, String identifiant, String password) throws SQLException {
        int result;
        String query;
        try {
            query = "UPDATE UTILISATEUR set ID_FONCTION=?,ID_VILLE=?,UTILNOM=?,UTILPRENOM=?,IDENTIFIANT=?,PASSWORD=? where ID_UTILISATEUR=? ";

            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);

            pStatement.setInt(7, id);
            pStatement.setInt(1, idfonction);
            pStatement.setInt(2, idville);
            pStatement.setString(3, nom);
            pStatement.setString(4, prenom);
            pStatement.setString(5, identifiant);
            pStatement.setString(6, password);
            pStatement.executeUpdate();
            
            result = 0;

        } catch (SQLException ex) {
            Logger.getLogger(RequetesUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }
        return result;
    }
   
    public static List<Utilisateur> selectUtilisateur() throws SQLException {

        String query = null;
        List<Utilisateur> util = new ArrayList<Utilisateur>();
        ResultSet resultat;
        try {

            query = "SELECT * from UTILISATEUR ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                // System.out.println(resultat.getString("PAYS"));
                Utilisateur uu = new Utilisateur(resultat.getInt("ID_UTILISATEUR"), resultat.getInt("ID_FONCTION"), resultat.getInt("ID_VILLE"), resultat.getString("UTILNOM"), resultat.getString("UTILPRENOM"), resultat.getString("IDENTIFIANT"), resultat.getString("PASSWORD"));
                util.add(uu);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesUtilisateur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return util;
    }
    
    public static Utilisateur selectById(int id) throws SQLException {
        String query = null;

        Utilisateur util = new Utilisateur();
        ResultSet resultat;

        try {
            query = "SELECT * from UTILISATEUR where ID_UTILISATEUR=? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

                util = new Utilisateur(resultat.getInt("ID_UTILISATEUR"), resultat.getInt("ID_FONCTION"), resultat.getInt("ID_VILLE"), resultat.getString("UTILNOM"), resultat.getString("UTILPRENOM"), resultat.getString("IDENTIFIANT"), resultat.getString("PASSWORD"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesUtilisateur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return util;

    }
}
