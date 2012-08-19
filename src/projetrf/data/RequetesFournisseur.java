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
import projetrf.model.Fournisseur;

public class RequetesFournisseur {

    public int idfournisseur;
    public int idville;
    public String nom;
    public String adresse1;
    public String adresse2;

    public static void insertFournisseur(int idville, String nom, String adresse1, String adresse2) throws SQLException {

        String query = "";
        try {
            query = "INSERT INTO FOURNISSEUR (ID_VILLE,FOUNOM,FOUADRESSE1,FOUADRESSE2) VALUES (?,?,?,?); ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idville);
            pStatement.setString(2, nom.toUpperCase());
            pStatement.setString(3, adresse1.toLowerCase());
            pStatement.setString(4, adresse2.toLowerCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void updateFournisseur(int idfournisseur, int idville, String nom, String adresse1, String adresse2) throws SQLException {

        String query = "";
        try {
            query = " UPDATE FOURNISSEUR SET ID_VILLE=?,FOUNOM=?,FOUADRESSE1=?,FOUADRESSE2=? where ID_FOURNISSEUR=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(5, idfournisseur);
            pStatement.setInt(1, idville);
            pStatement.setString(2, nom.toUpperCase());
            pStatement.setString(3, adresse1.toLowerCase());
            pStatement.setString(4, adresse2.toLowerCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static Fournisseur SelectFournisseurById(int id) throws SQLException {
        String query = null;
        Fournisseur fournisseur = new Fournisseur();
        ResultSet resultat;

        try {
            query = "SELECT * from FOURNISSEUR  where ID_FOURNISSEUR=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

                fournisseur = new Fournisseur(resultat.getInt("ID_FOURNISSEUR"), resultat.getInt("ID_VILLE"), resultat.getString("FOUNOM"), resultat.getString("FOUADRESSE1"), resultat.getString("FOUADRESSE2"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return fournisseur;
    }

    public static List<Fournisseur> selectFournisseur() throws SQLException {

        String query = null;
        List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>();
        ResultSet resultat;
        try {

            query = "SELECT * from FOURNISSEUR ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {

                Fournisseur ff = new Fournisseur(resultat.getInt("ID_FOURNISSEUR"), resultat.getInt("ID_VILLE"), resultat.getString("FOUNOM"), resultat.getString("FOUADRESSE1"), resultat.getString("FOUADRESSE2"));
                fournisseurs.add(ff);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }

        return fournisseurs;


    }
}
