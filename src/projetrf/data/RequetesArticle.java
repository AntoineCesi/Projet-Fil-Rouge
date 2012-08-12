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
import projetrf.model.Article;


public class RequetesArticle {
    
    public int id;
    public int idCouleur;
    public int idtva;
    public String libelle;
    public String reference;
    public float prixht;    
    public int photo;
    
     public static void insertArticle(int idCouleur, int idtva, String libelle, String reference, float prixht, int photo) throws SQLException {

        String query;
        try {
            query = "INSERT INTO ARTICLE (ID_COULEUR,ID_TVA,ARTLIBELLE,ARTREF,ARTPRXHT,ARTPHOTO) VALUES (?,?,?,?,?,?) ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idCouleur);
            pStatement.setInt(2, idtva);
            pStatement.setString(3, libelle);
            pStatement.setString(4, reference);
            pStatement.setFloat(5, prixht);
            pStatement.setInt(6, photo);
            pStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

      public static Article ArticleId(int id)  throws SQLException {
        String query = null;
        Article article = new Article();
        ResultSet resultat;
            
        try {
            query = "SELECT * from ARTICLE where ID_ARTICLE=? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();
          
            while (resultat.next()) {
             //System.out.println(resultat.getString("ARTLIBELLE"));
             article = new Article(resultat.getInt("ID_ARTICLE"), resultat.getInt("ID_COULEUR"), resultat.getInt("ID_TVA"), resultat.getString("ARTLIBELLE"), resultat.getString("ARTREF"), resultat.getFloat("ARTPRXHT"),resultat.getInt("ARTPHOTO"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesPays.class.getName()).log(Level.SEVERE, null, ex);

        }
        return article ;

    }
    
}
