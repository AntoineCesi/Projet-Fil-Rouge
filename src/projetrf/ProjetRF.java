/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import projetrf.data.RequetesInterlocuteur;
import projetrf.data.RequetesPays;
import projetrf.data.RequetesUtilisateur;
import projetrf.data.RequetesVille;
import projetrf.model.Interlocuteur;
import projetrf.model.Pays;
import projetrf.model.Ville;
import projetrf.vue.*;

/**
 *
 * @author ademarly
 */
public class ProjetRF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
     
     /*        
      VueVille vv= new VueVille();
         vv.setVisible(true);*/
        
        
     //   VueMenu vmenu =new VueMenu();
      // vmenu.setVisible(true);
           
       VueVilleModifie vv= new VueVilleModifie();
         vv.setVisible(true);
    
         
        }
}