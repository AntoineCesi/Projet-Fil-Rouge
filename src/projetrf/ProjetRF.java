/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import projetrf.data.RequetesInterlocuteur;
import projetrf.data.RequetesPays;
import projetrf.data.RequetesVille;
import projetrf.model.Pays;
import projetrf.model.Ville;
import projetrf.vue.VueCouleur;
import projetrf.vue.VueInterlocuteur;
import projetrf.vue.VuePays;
import projetrf.vue.VueVille;

/**
 *
 * @author ademarly
 */
public class ProjetRF {

    /**
     * @param args the command line arguments
     */
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

           
       VueVille v2= new VueVille();
        v2.setVisible(true);
        
           RequetesPays pp= new RequetesPays();    
            List<Pays> pp1=RequetesPays.listerPays();                      
             System.out.println(pp1.size());             
			   
                for(int i = 0; i < pp1.size(); i++)
                System.out.println("Élément à l'index " + i + " = " + pp1.get(i).getIdPays()+ " = " +pp1.get(i).getPays());
                

         /*   JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JComboBox jComboBox1 = new JComboBox();
             for(int i = 0; i < pp1.size(); i++)
            jComboBox1.addItem(pp1.get(i).getPays());
            
            Object cmboitem = jComboBox1.getSelectedItem();
            System.out.println(cmboitem);

            frame.add(jComboBox1);

            frame.setSize(300, 200);
            frame.setVisible(true);*/
    
        }
}