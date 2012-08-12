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
        String query;
        
        // ancienne methode
       /* Statement statement = ConnectionBDD.getInstance().getStatement(); 
        query = "INSERT INTO COULEUR(COULIBELLE) VALUES(\"" + libelle + "\");";
        statement.executeUpdate(query);*/
       
        query = "INSERT INTO COULEUR(COULIBELLE) VALUES(?);";
        PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
        pStatement.setString(1, libelle);
        pStatement.executeUpdate();
        
        
    }

    
    
    public static int updateCouleur(int id, String libelle) throws SQLException {
        int result;
        String query;
        try {
            query = "UPDATE COULEUR set COULIBELLE=? WHERE ID_COULEUR=?";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, libelle);
            pStatement.setInt(2, id);
            pStatement.executeUpdate();
            result = 0;
        } catch (SQLException ex) {
            Logger.getLogger(RequetesCouleur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }
        return result;

    }

    public static List<Couleur> selectCouleur(String libelle) throws SQLException {
        String query;
      
        
        List<Couleur> couleurs = new ArrayList<Couleur>();
        Couleur couleur;

        ResultSet resultat;
        try {
             query = "SELECT * from COULEUR";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
           
           resultat= pStatement.executeQuery();
           while (resultat.next()) { 
            couleur = new Couleur(resultat.getInt("ID_COULEUR"), resultat.getString("COULIBELLE"));
            couleurs.add(couleur);
        }
                       
        } catch (SQLException ex) {
            Logger.getLogger(RequetesCouleur.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
        return couleurs;
        
    }
}
