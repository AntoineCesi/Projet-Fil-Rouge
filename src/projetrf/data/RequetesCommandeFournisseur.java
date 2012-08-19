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
import projetrf.model.CommandeFournisseur;

public class RequetesCommandeFournisseur {
    
    
    public int idcommandefournisseur;
    public int idutilisateur;
    public String referencefournisseur;
    public Date datecommandefournisseur;
    public Float remisefournisseur;
    
    
   public static void insertCommandeFournisseur( int idutilisateur, String referencefournisseur, Date datecommandefournisseur, Float remisefournisseur) throws SQLException {

        String query = "";

        try {
            query = "INSERT INTO COMMANDE_FOURNISSEUR (ID_UTILISATEUR,COMFOUREF,COMFOUDATE,COMFOUREMISE) VALUES (?,?,?,?); ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idutilisateur);
            pStatement.setString(2,  referencefournisseur);
            pStatement.setObject(3, datecommandefournisseur);
            pStatement.setFloat(4, remisefournisseur);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void updateCommandeFounisseur(int idcommandefournisseur,int idutilisateur, String referencefournisseur, Date datecommandefournisseur, Float remisefournisseur ) throws SQLException {

        String query = "";

        try {
            query = " UPDATE COMMANDE_FOURNISSEUR SET ID_UTILISATEUR=?,COMFOUREF=?,COMFOUDATE=?,COMFOUREMISE=?  where ID_CMDFOUR=?  ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(5, idcommandefournisseur);
            pStatement.setInt(1, idutilisateur);
            pStatement.setString(2,  referencefournisseur);
            pStatement.setObject(3, datecommandefournisseur);
            pStatement.setFloat(4, remisefournisseur);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
        
      public static CommandeFournisseur SelectCommandeFournisseurById(int id) throws SQLException {
        String query = "";
        CommandeFournisseur Commande = new CommandeFournisseur();
        ResultSet resultat;

        try {
            query = "SELECT * from COMMANDE_FOURNISSEUR  where ID_CMDFOUR =? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

                Commande = new CommandeFournisseur(resultat.getInt("ID_CMDFOUR"), resultat.getInt("ID_UTILISATEUR"), resultat.getString("COMFOUREF"), resultat.getDate("COMFOUDATE"), resultat.getFloat("COMFOUREMISE"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Commande;
    }

    public static List<CommandeFournisseur> selectCommandeFournisseur() throws SQLException {

        String query = null;
        List<CommandeFournisseur> Commande = new ArrayList<CommandeFournisseur>();
        ResultSet resultat;
        try {

            query = "SELECT * from COMMANDE_FOURNISSEUR ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {

              CommandeFournisseur CommandeFou = new CommandeFournisseur(resultat.getInt("ID_CMDFOUR"), resultat.getInt("ID_UTILISATEUR"), resultat.getString("COMFOUREF"), resultat.getDate("COMFOUDATE"), resultat.getFloat("COMFOUREMISE"));
              Commande.add(CommandeFou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeFournisseur.class.getName()).log(Level.SEVERE, null, ex);

        }

        return Commande;

    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
