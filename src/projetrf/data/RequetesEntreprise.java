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
import projetrf.model.Entreprise;


public class RequetesEntreprise {
    
    private int identreprise;
    private String nom;
    private String adresse1;
    private String adresse2;
    
    
    public static void insertEntreprise(String nom, String adresse1, String adresse2) throws SQLException {

        String query;

        try {
            query = "INSERT INTO ENTREPRISE (ENTNOM,ENTADRESSE1,ENTADRESSE2) VALUES (?,?,?);";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, nom.toUpperCase());
            pStatement.setString(2, adresse1.toLowerCase());
            pStatement.setString(3, adresse2.toLowerCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
     
    public static void updateEntreprise(int identreprise,String nom, String adresse1, String adresse2) throws SQLException {

        String query;
        
        try {
            query = " UPDATE ENTREPRISE SET ENTNOM=?,ENTADRESSE1=?,ENTADRESSE2=? where ID_ENTREPRISE=?  ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(4,identreprise);
            pStatement.setString(1, nom.toUpperCase());
            pStatement.setString(2, adresse1.toLowerCase());
            pStatement.setString(3, adresse2.toLowerCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    
    public static Entreprise SelectEntrepriseById(int id) throws SQLException {
        String query = null;
        Entreprise entreprise = new Entreprise();
        ResultSet resultat;

        try {
            query = "SELECT * from ENTREPRISE  where ID_ENTREPRISE=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
               
                entreprise = new Entreprise(resultat.getInt("ID_ENTREPRISE"), resultat.getString("ENTNOM"), resultat.getString("ENTADRESSE1"), resultat.getString("ENTADRESSE2"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
        return entreprise;
    }
    
     
    
       public static List<Entreprise> selectEntreprise()  throws SQLException {
      
        String query = null;
        List<Entreprise> entreprise = new ArrayList<Entreprise>();
        ResultSet resultat;
        try {
           
            query = "SELECT * from ENTREPRISE ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
               // System.out.println(resultat.getString("PAYS"));
                 Entreprise  ee = new Entreprise(resultat.getInt("ID_ENTREPRISE"), resultat.getString("ENTNOM"), resultat.getString("ENTADRESSE1"), resultat.getString("ENTADRESSE2"));
                entreprise.add(ee);
            }

        } catch (SQLException ex) {
           Logger.getLogger(RequetesEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return entreprise;

        
    }
       
         public static List<Entreprise> selectEntrepriseByName(String name)  throws SQLException {
      
        String query = null;
        List<Entreprise> entreprise = new ArrayList<Entreprise>();
        ResultSet resultat;
        try {
           
            query = "SELECT * from ENTREPRISE where ENTNOM like ? order by ENTNOM ";
           
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, name.toUpperCase() + "%");
            resultat = pStatement.executeQuery();
            while (resultat.next()) {
               // System.out.println(resultat.getString("PAYS"));
                 Entreprise  ee = new Entreprise(resultat.getInt("ID_ENTREPRISE"), resultat.getString("ENTNOM"), resultat.getString("ENTADRESSE1"), resultat.getString("ENTADRESSE2"));
                entreprise.add(ee);
            }

        } catch (SQLException ex) {
           Logger.getLogger(RequetesEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return entreprise;

        
    }
}
