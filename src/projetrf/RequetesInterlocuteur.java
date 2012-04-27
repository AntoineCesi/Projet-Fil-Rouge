/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf;

import java.sql.SQLException;
import java.sql.Statement;
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
    
}
