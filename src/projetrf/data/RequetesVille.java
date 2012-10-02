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

import projetrf.model.Ville;

/**
 *
 * @author plepelletier
 */
public class RequetesVille {
    
    public int idville;
    public int idpays;
    public String nom;
    public String cp;
    
     public static void insertVille(int idpays, String nom, String cp) throws SQLException {

        String query;
       
            query = "INSERT INTO VILLE (ID_PAYS,VINOM,VICP) VALUES (?,?,?) ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, idpays);
            pStatement.setString(2, nom);
            pStatement.setString(3, cp);
            pStatement.executeUpdate();
        
    }
      
     
        public static void updateVille(int id,int idpays, String nom, String cp)throws SQLException
    {
        int result;
        String query;
        try 
        {
            query = "UPDATE VILLE set ID_PAYS=?,VINOM=?,VICP=? WHERE ID_VILLE=? ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(4, id);
            pStatement.setInt(1, idpays);
            pStatement.setString(2, nom);
            pStatement.setString(3, cp);
            pStatement.executeUpdate();
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }
    
        
    public static Ville selectVilleById(int id) throws SQLException {

        String query = null;
        Ville ville1 = new Ville();
        ResultSet resultat;

        try {
            query = "SELECT * from VILLE where ID_VILLE =? ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
                //System.out.println(resultat.getString("VINOM"));
                ville1 = new Ville(resultat.getInt("ID_VILLE"), resultat.getInt("ID_PAYS"), resultat.getString("VINOM"), resultat.getString("VICP"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCouleur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return ville1;

    }

        
        
        
    public static List<Ville> selectVilleByCpostal(String cp) throws SQLException {

        String query = null;
        List<Ville> ville1 = new ArrayList<Ville>();
        ResultSet resultat;
        try {

            query = "SELECT ID_VILLE, ID_PAYS, VINOM,VICP from VILLE where VICP like ? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, cp);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

                Ville v1 = new Ville(resultat.getInt("ID_VILLE"), resultat.getInt("ID_PAYS"), resultat.getString("VINOM"), resultat.getString("VICP"));
                ville1.add(v1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);

        }

        return ville1;
    }
     
     
        
         
    public static List<Ville> selectVilleByName(String name) throws SQLException {

        String query = null;
        List<Ville> ville1 = new ArrayList<Ville>();
        ResultSet resultat;

        try {
            query = "SELECT  * from VILLE   where VINOM like ? order by VINOM asc";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, name.toUpperCase() + "%");
            System.out.println(pStatement);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
                Ville vv = new Ville(resultat.getInt("ID_VILLE"), resultat.getInt("ID_PAYS"), resultat.getString("VINOM"), resultat.getString("VICP"));
                ville1.add(vv);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);

        }

        return ville1;
    }
      public static List<Ville> rechercheVilleByCp(String name) throws SQLException {

        String query = null;
        List<Ville> ville1 = new ArrayList<Ville>();
        ResultSet resultat;

        try {
            query = "SELECT  * from VILLE   where VICP like ? order by VINOM asc";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, name.toUpperCase() + "%");
            //System.out.println(pStatement);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
                Ville vv = new Ville(resultat.getInt("ID_VILLE"), resultat.getInt("ID_PAYS"), resultat.getString("VINOM"), resultat.getString("VICP"));
                ville1.add(vv);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);

        }

        return ville1;
    }
}
