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
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }


        return 0;

        
    }
    
     public static List villecp( String cp)
    {
        int result;
        String query=null;
        String cri1 = cp;        
        List ville = null;
        ResultSet resultat; 
        
       
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();

            query = "SELECT ID_VILLE, ID_PAYS, VINOM where VICP='" + cri1 + "' ";

            resultat = statement.executeQuery(query);
            while (resultat.next()) {
                System.out.println(resultat.getString("VINOM"));              

            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }


        return ville;

        
    }
}
