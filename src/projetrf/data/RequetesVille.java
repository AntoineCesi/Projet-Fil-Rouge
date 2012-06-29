/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;

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
    
    
    public static int ecrireVille( int idpays,String nom,String cp)
    {
        int result;
        String query;
        int cri1 = idpays;
        String cri2 = nom;
        String cri3 = cp;
        
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            
            query = "INSERT INTO VILLE (ID_PAYS,VINOM,VICP) VALUES ("+cri1+", '"+cri2+"','"+cri3+"') "; 
            
            statement.executeUpdate(query);
            result = 0;

        } catch (SQLException ex) {
            Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }


        return 0;

        
    }
    
     public static List<Ville> villecp( String cp) throws SQLException
    {
        
        String query=null;
        String cri1 = cp;        
        List<Ville> ville1 = new ArrayList<Ville>();
        ResultSet resultat; 
        
       
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();

            query = "SELECT ID_VILLE, ID_PAYS, VINOM from VILLE where VICP='" + cri1 + "' ";
            resultat = statement.executeQuery(query);
           
            while (resultat.next()) {
               System.out.println(resultat.getString("VINOM"));   
               Ville vv=new Ville(resultat.getInt("ID_VILLE"),"",resultat.getString("VINOM"));
                ville1.add(vv); 
            }
           
           
        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
           
        }

        return ville1;
    }
     
     
       public static Ville selectVilleId( int id)
    {       
        String query=null;
        int cri1 = id;        
        Ville ville1 = new Ville();
        ResultSet resultat;     
       
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            query = "SELECT * from VILLE where ID_VILLE="+cri1+" ";
            resultat = statement.executeQuery(query);
           
            while (resultat.next()) {
               //System.out.println(resultat.getString("VINOM"));
              ville1 = new Ville(resultat.getInt("ID_VILLE"),resultat.getInt("ID_PAYS"),resultat.getString("VINOM"),resultat.getString("VICP"));
                
            }         
           
        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        return ville1;
        
    }
       
         
     public static List<Ville> selectVilleByName( String name) throws SQLException
    {
        
        String query=null;
        String cri1 = name.toUpperCase();        
        List<Ville> ville1 = new ArrayList<Ville>();
        ResultSet resultat; 
        
       
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();

            query = "SELECT  * from VILLE where VINOM like '" + cri1+"%" + "' ";
            resultat = statement.executeQuery(query);
           
            
            while (resultat.next()) { 
                 System.out.println(resultat.getString("VINOM"));
                  System.out.println(resultat.getInt("ID_PAYS"));
               Ville vv=new Ville(resultat.getInt("ID_VILLE"),resultat.getInt("ID_PAYS"),resultat.getString("VINOM"),resultat.getString("VICP"));
                ville1.add(vv); 
            }
           
            
           
        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
           
        }

        return ville1;
    }
}
