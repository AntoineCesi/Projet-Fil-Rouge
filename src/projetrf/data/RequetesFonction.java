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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.model.Fonction;

public class RequetesFonction {

    public int idfonction;
    public String libelle;

    public static void insertFonction(String libelle) throws SQLException {

        String query = "";


        try {
            query = "INSERT INTO FONCTION (FONCLIBELLE) VALUES (?); ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);

            pStatement.setString(1, libelle.toUpperCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFonction.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void updateFonction(int idfonction, String libelle) throws SQLException {

        String query = "";


        try {
            query = "UPDATE  FONCTION SET FONCLIBELLE=? where ID_FONCTION=? ; ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(2, idfonction);
            pStatement.setString(1, libelle.toUpperCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFonction.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static Fonction SelectFonctionById(int id) throws SQLException {
        String query = "";
        Fonction fonction = new Fonction();
        ResultSet resultat;

        try {
            query = "SELECT * from FONCTION  where ID_FONCTION=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

                fonction = new Fonction(resultat.getInt("ID_FONCTION"), resultat.getString("FONCLIBELLE"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFonction.class.getName()).log(Level.SEVERE, null, ex);

        }
        return fonction;
    }

    public static List<Fonction> selectFonction() throws SQLException {

        String query ="";
        List<Fonction> fonctions = new ArrayList<Fonction>();
        ResultSet resultat;
        try {

            query = "SELECT * from FONCTION ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);
            while (resultat.next()) {
                Fonction fct = new Fonction(resultat.getInt("ID_FONCTION"), resultat.getString("FONCLIBELLE"));
                fonctions.add(fct);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFonction.class.getName()).log(Level.SEVERE, null, ex);

        }

        return fonctions;


    }
}
