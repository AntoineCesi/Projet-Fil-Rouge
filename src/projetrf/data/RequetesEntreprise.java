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
    private int idville;
    private String nom;
    private String adresse1;
    private String adresse2;
    
    
    public static void insertEntreprise(int idville,String nom, String adresse1, String adresse2) throws SQLException {

        String query;

        try {
            query = "INSERT INTO ENTREPRISE (ID_VILLE,ENTNOM,ENTADRESSE1,ENTADRESSE2) VALUES (?,?,?,?);";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idville);
            pStatement.setString(2, nom.toUpperCase());
            pStatement.setString(3, adresse1.toLowerCase());
            pStatement.setString(4, adresse2.toLowerCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
     
    public static void updateEntreprise(int identreprise,int idville,String nom, String adresse1, String adresse2) throws SQLException {

        String query;
        
        try {
            query = " UPDATE ENTREPRISE SET ID_VILLE=?,ENTNOM=?,ENTADRESSE1=?,ENTADRESSE2=? where ID_ENTREPRISE=?  ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(5,identreprise);
            pStatement.setInt(1, idville);
            pStatement.setString(2, nom.toUpperCase());
            pStatement.setString(3, adresse1.toLowerCase());
            pStatement.setString(4, adresse2.toLowerCase());
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
               
                entreprise = new Entreprise(resultat.getInt("ID_ENTREPRISE"),resultat.getInt("ID_VILLE"), resultat.getString("ENTNOM"), resultat.getString("ENTADRESSE1"), resultat.getString("ENTADRESSE2"));
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
           
            query = "SELECT * from ENTREPRISE order by ENTNOM";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
               // System.out.println(resultat.getString("PAYS"));
                 Entreprise  ee =  new Entreprise(resultat.getInt("ID_ENTREPRISE"),resultat.getInt("ID_VILLE"), resultat.getString("ENTNOM"), resultat.getString("ENTADRESSE1"), resultat.getString("ENTADRESSE2"));
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
                 Entreprise  ee =  new Entreprise(resultat.getInt("ID_ENTREPRISE"),resultat.getInt("ID_VILLE"), resultat.getString("ENTNOM"), resultat.getString("ENTADRESSE1"), resultat.getString("ENTADRESSE2"));
                entreprise.add(ee);
            }

        } catch (SQLException ex) {
           Logger.getLogger(RequetesEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return entreprise;

        
    }
}
