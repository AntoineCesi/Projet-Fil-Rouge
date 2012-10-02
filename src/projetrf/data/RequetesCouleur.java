package projetrf.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.model.Couleur;

/**
 *
 * @author ademarly
 */
public class RequetesCouleur {

    public static void insertCouleur(String libelle) throws SQLException {
        String query = "";

        try {
            query = "INSERT INTO COULEUR(COULIBELLE) VALUES(?);";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, libelle.toUpperCase());
            pStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RequetesCouleur.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    
    public static void updateCouleur(int id, String libelle) throws SQLException {
      
        String query;
       
            query = "UPDATE COULEUR set COULIBELLE=? WHERE ID_COULEUR=?";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, libelle.toUpperCase());
            pStatement.setInt(2, id);
            pStatement.executeUpdate();
     
       

    }

    public static List<Couleur> selectCouleur(String libelle) throws SQLException {
        String query;
        List<Couleur> couleurs = new ArrayList<Couleur>();
        Couleur couleur;

        ResultSet resultat;
       
            query = "SELECT * from COULEUR";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);

            resultat = pStatement.executeQuery();
            while (resultat.next()) {
                couleur = new Couleur(resultat.getInt("ID_COULEUR"), resultat.getString("COULIBELLE"));
                couleurs.add(couleur);
            }

        return couleurs;

    }
    
          
    public static Couleur selectCouleurById(int id) throws SQLException {

        String query = null;
        Couleur couleur = new Couleur();
        ResultSet resultat;


        query = "SELECT * from Couleur where ID_COULEUR =? ";

        PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
        pStatement.setInt(1, id);
        resultat = pStatement.executeQuery();

        while (resultat.next()) {
            //System.out.println(resultat.getString("VINOM"));
            couleur = new Couleur(resultat.getInt("ID_Couleur"), resultat.getString("COULIBELLE"));
        }

        return couleur;

    }
}
