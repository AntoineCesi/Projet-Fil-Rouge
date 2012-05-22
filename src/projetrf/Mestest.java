/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf;

import java.util.List;
import projetrf.data.RequetesPays;


/**
 *
 * @author Travail
 */
public class Mestest {
    
    public static void main(String[] args) {
        
     
        // VueCouleur vTest = new VueCouleur();
      // vTest.setVisible(true);
        
  // VueInterlocuteur vInter= new VueInterlocuteur();
   // vInter.setVisible(true);
   
      //  RequetesInterlocuteur zz=new RequetesInterlocuteur();       
       // RequetesInterlocuteur.ecrireInterlocuteur(1,"dupont","marcel","toto@free.fr");  
        
       //  RequetesVille vv= new RequetesVille();          
       //  RequetesVille.ecrireVille(1, "OISSEL","76350");
       // RequetesVille.villecp("76000");
        
        //RequetesPays pp= new RequetesPays();
       // RequetesPays.ecrirePays("ALLEMAGNE");
       
        
      // VuePays vtest= new VuePays();
       // vtest.setVisible(true);
        
        //   RequetesVille vv= new RequetesVille();         
         //  RequetesVille vv1=  RequetesVille.villecp("76000");
         //    List vv1 =RequetesVille.villecp("76350") ;    
     
          //     System.out.println(vv1.toString());              

           RequetesPays pp= new RequetesPays();    
            List pp1=RequetesPays.listerPays();
             System.out.println(pp1.toString());   
        
    }    
}
