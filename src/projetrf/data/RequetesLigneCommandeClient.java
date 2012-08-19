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
import projetrf.model.LigneCommandeClient;


public class RequetesLigneCommandeClient {
 
    
    
     public  int idlignecommandeclient;
    public  int idarticle;
    public  int idcommande;
    public  int quantite;
    public  Float prixht;
    public  Float prixttc;
    public  Float remise;
    
      public static void insertLigneCommandeClient(int idarticle,int idcommande,int quantite, Float prixht,Float prixttc,Float remise ) throws SQLException {

          String query="";        

        try {
            query = "INSERT INTO LIGNE_COMMANDE_CLIENT (ID_ARTICLE,ID_COMMANDE,LIGQTE,LIGPXHT,LIGPXTTC,LIGREMISE) VALUES (?,?,?,?,?,?); " ;

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1,idarticle);
            pStatement.setInt(2, idcommande);
            pStatement.setInt(3, quantite);
            pStatement.setFloat(4,prixht);
            pStatement.setFloat(5,prixttc);
            pStatement.setFloat(6,remise);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesLigneCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
      }
    
    
       public static void updateLigneCommandeClient(int idlignecommandeclient, int idarticle,int idcommande,int quantite, Float prixht,Float prixttc,Float remise ) throws SQLException {

          String query="";        

        try {
            query = " UPDATE  LIGNE_COMMANDE_CLIENT SET ID_ARTICLE=?,ID_COMMANDE=?,LIGQTE=?,LIGPXHT=?,LIGPXTTC=?,LIGREMISE=? where ID_LIGNE=? ; " ;

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(7,idlignecommandeclient);
            pStatement.setInt(1,idarticle);
            pStatement.setInt(2, idcommande);
            pStatement.setInt(3, quantite);
            pStatement.setFloat(4,prixht);
            pStatement.setFloat(5,prixttc);
            pStatement.setFloat(6,remise);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesLigneCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
      }
    
    public static LigneCommandeClient SelectLigneCommandeClientById(int id) throws SQLException {
        String query = null;
        LigneCommandeClient commande = new LigneCommandeClient();
        ResultSet resultat;

        try {
            query = "SELECT * from LIGNE_COMMANDE_CLIENT  where ID_LIGNE=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

                commande = new LigneCommandeClient(resultat.getInt("ID_LIGNE"), resultat.getInt("ID_ARTICLE"), resultat.getInt("ID_COMMANDE"), resultat.getInt("LIGQTE"), resultat.getFloat("LIGPXHT"), resultat.getFloat("LIGPXTTC"), resultat.getFloat("LIGREMISE"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesLigneCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
        return commande;
    }
    
    
    
     public static List<LigneCommandeClient> selectLigneCommandeClient() throws SQLException {

        String query = null;
        List<LigneCommandeClient> commandes = new ArrayList<LigneCommandeClient>();
        ResultSet resultat;
        try {

            query = "SELECT * from LIGNE_COMMANDE_CLIENT  ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                // System.out.println(resultat.getString("PAYS"));
                LigneCommandeClient  commande = new LigneCommandeClient(resultat.getInt("ID_LIGNE"), resultat.getInt("ID_ARTICLE"), resultat.getInt("ID_COMMANDE"), resultat.getInt("LIGQTE"), resultat.getFloat("LIGPXHT"), resultat.getFloat("LIGPXTTC"), resultat.getFloat("LIGREMISE"));
                commandes.add(commande);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesLigneCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }

        return commandes;

        
    }
}
