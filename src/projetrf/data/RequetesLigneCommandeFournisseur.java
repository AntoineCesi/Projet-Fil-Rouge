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



public class RequetesLigneCommandeFournisseur {
    
    public int idlignefournisseur;
    public int idcommandefournisseur;
    public int idarticle;
    public int quantite;
    public Float prixht;
    public Float prixttc;
    public Float remise;
    
        public static void insertLigneCommandeFournisseur( int idcommandefournisseur, int idarticle, int quantite, Float prixht, Float prixttc, Float remise) throws SQLException {

        String query = "";

        try {
           query = "INSERT INTO LIGNE_COMMANDE_FOURNISSEUR (ID_CMDFOUR,ID_ARTICLE,LGCOMFOUQTE,LGCOMFOUPXHT,LGCOMFOUPXTTC,LGCOMFOUREMISE) VALUES (?,?,?,?,?,?); ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
           
            pStatement.setInt(1, idcommandefournisseur);
            pStatement.setInt(2, idarticle);
            pStatement.setInt(3, quantite);
            pStatement.setFloat(4, prixht);
            pStatement.setFloat(5, prixttc);
            pStatement.setFloat(6, remise);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesLigneCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
        
          public static void updateLigneCommandeFournisseur(int idlignefournisseur,int idcommandefournisseur, int idarticle, int quantite, Float prixht, Float prixttc, Float remise) throws SQLException {

        String query = "";

        try {            
            query = " UPDATE  LIGNE_COMMANDE_FOURNISSEUR  SET ID_CMDFOUR=?,ID_ARTICLE=?,LGCOMFOUQTE=?,LGCOMFOUPXHT=?,LGCOMFOUPXTTC=?,LGCOMFOUREMISE=? where ID_LGCOMFOU=? ";
            
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(7,idlignefournisseur);
            pStatement.setInt(1, idcommandefournisseur);
            pStatement.setInt(2, idarticle);
            pStatement.setInt(3, quantite);
            pStatement.setFloat(4, prixht);
            pStatement.setFloat(5, prixttc);
            pStatement.setFloat(6, remise);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesLigneCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    
}
