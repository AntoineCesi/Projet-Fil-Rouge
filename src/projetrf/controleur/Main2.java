/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.controleur;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.data.RequetesCommandeClient;

/**
 *
 * @author Travail
 */
public abstract class Main2 {
    
    
     int retour;
     
     public  int ecrireCommandeClient(int identreprise,int idinterlocuteur,Date dfact,String ref,Float totalht,Float totalttc, Float totalremise )
     {
        RequetesCommandeClient cc =new RequetesCommandeClient();
        try {
         retour =  RequetesCommandeClient.insertCommandeClient(identreprise, idinterlocuteur, dfact, ref, totalht, totalttc, totalremise);
        } catch (SQLException ex) {
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
         return retour;
     }
     
   
}

