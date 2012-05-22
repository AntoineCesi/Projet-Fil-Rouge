/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows XP
 */
public class RequetesInterlocuteur {
    
    public int idInter;
    public int idVille;
    public String nom;
    public String prenom;
    public String email;
    
    
    public static int ecrireInterlocuteur(int idville,String nom, String prenom,String email )
    {
        int result;
        String query;
        int cri1 = idville;       
        String cri2 = nom;
        String cri3 = prenom;
        String cri4 = email;
        
        
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            
            query = "INSERT INTO INTERLOCUTEUR (ID_VILLE,INTNOM,INTPRENOM,INTEMAIL) VALUES ("+cri1+", '"+cri2+"','"+cri3+"','"+cri4+"') "; 
            
            statement.executeUpdate(query);
            result = 0;

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }


        return 0;


    }
      public static List interlocuteurId( int id)
    {
        int result;
        String query=null;
        int cri1 = id;        
        List interlocuteur = null;
        ResultSet resultat; 
        
       
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();

            query = "SELECT PAYS from INTERLOCUTEUR where ID_INTERLOCUTEUR='" + cri1 + "' ";
            resultat = statement.executeQuery(query);
            
            while (resultat.next()) {
               System.out.println(resultat.getString("INTNOM")); 
               

            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }


        return interlocuteur;

        
    }
    
}
