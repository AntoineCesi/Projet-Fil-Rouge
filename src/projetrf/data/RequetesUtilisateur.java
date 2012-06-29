/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Travail
 */
public class RequetesUtilisateur {
    
       
    public int idUtilisateur;
    public int idFonction;
    public int idVille;
    public String nom;
    public String prenom;
    public String adresse1;
    public String adresse2;
    
    
     public static int ecrireUtilisateur(int idfonction, int idville,String nom,String prenom,String adresse1,String adresse2)
    {
        int result;
        String query;
       // int cri1 = idutilisateur;
        int cri2 = idfonction;
        int cri3 = idville;
        String cri4 = nom;
        String cri5 = prenom;
        String cri6 = adresse1;
        String cri7 = adresse2;
        
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            
            query = "INSERT INTO UTILISATEUR (ID_FONCTION,ID_VILLE,UTILNOM,UTILPRENOM,UTILADRESSE1,UTILADRESSE2) VALUES ("+cri2+","+cri3+",'"+cri4+"','"+cri5+"','"+cri6+"','"+cri7+"') "; 
            
            statement.executeUpdate(query);
            result = 0;

        } catch (SQLException ex) {
            Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }

        return 0;

        
    }
    
}
