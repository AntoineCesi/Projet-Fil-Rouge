/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf;

import java.sql.SQLException;
import java.util.List;
import projetrf.data.RequetesInterlocuteur;
import projetrf.data.RequetesPays;
import projetrf.data.RequetesStock;
import projetrf.model.Interlocuteur;
import projetrf.model.Pays;
import projetrf.model.Stock;
import projetrf.vue.VueVille;


/**
 *
 * @author Travail
 */
public class Mestest {
    
    public static void main(String[] args) throws SQLException {
        
             
        //RequetesPays pp= new RequetesPays();  pays ok
       // RequetesPays.ecrirePays("ALLEMAGNE");
      // VuePays vtest= new VuePays();
       // vtest.setVisible(true);
         //Pays ll= RequetesPays.paysId(2);
     
        // VueCouleur vTest = new VueCouleur();
      // vTest.setVisible(true);
        
  // VueInterlocuteur vInter= new VueInterlocuteur();
   // vInter.setVisible(true);
   
      //  RequetesInterlocuteur zz=new RequetesInterlocuteur();       
       // RequetesInterlocuteur.ecrireInterlocuteur(1,"dupont","marcel","toto@free.fr");  
        
       //  RequetesVille vv= new RequetesVille();          
       //  RequetesVille.ecrireVille(1, "OISSEL","76350");
       // RequetesVille.villecp("76000");
       
       
    
        
        //   RequetesVille vv= new RequetesVille();         
         //  RequetesVille vv1=  RequetesVille.villecp("76000");
         //    List vv1 =RequetesVille.villecp("76350") ;    
     
          //     System.out.println(vv1.toString());              

           
        /*          
        VueVille v2 = new VueVille();
        v2.setVisible(true);

        List<Pays> pp1 = RequetesPays.listerPays();
        System.out.println(pp1.size());
        for (int i = 0; i < pp1.size(); i++) {
            System.out.println("Élément à l'index " + i + " = " + pp1.get(i).getIdPays() + " = " + pp1.get(i).getPays());
        }

        for (Pays pays : pp1) {
            pays.getIdPays();
        }
        */
       // Interlocuteur pp1 = RequetesInterlocuteur.selectId(2);
       // System.out.println(pp1.toString());
       // List <Interlocuteur> pp1= RequetesInterlocuteur.listerInterlocuteur();   
         // RequetesUtilisateur.ecrireUtilisateur(1,1,"DUPONT","Marcel", "10 rue du pont","");        
        
      //  RequetesInterlocuteur.ecrireInterlocuteur(1, 1, 1, "dupuis", "louis", "dupouisl@free.fr");
      
        /*List<Pays> pp1 = RequetesPays.listerPays();
        System.out.println(pp1.size());
        for (Pays pays : pp1) {
            pays.getIdPays();
        }
                   

          JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JComboBox jComboBox1 = new JComboBox();
             for(int i = 0; i < pp1.size(); i++)
            jComboBox1.addItem(pp1.get(i).getPays());
            
            Object cmboitem = jComboBox1.getSelectedItem();
            System.out.println(cmboitem);

            frame.add(jComboBox1);

            frame.setSize(300, 200);
            frame.setVisible(true);*/
        
        
          /* manipulliationde de date*/
        /*
        Date  madate=new Date();
    
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        
        try {
            date = df.parse("25-12-2010");
             System.out.println(date);
             
             RequetesActionCom.insertActionCom(1, 1, date, "test");
        } catch (ParseException e) {
            System.out.println(e);
        }
      */
           
         
     List< Stock> pp1 = RequetesStock.selectStock();
         System.out.println(pp1.size()); for (int i = 0; i < pp1.size(); i++)
         { System.out.println("Élément à l'index " + i + " = " +
         pp1.get(i).getIdstock() + " = " +"-"+pp1.get(i).getDatemaj()); }
         
         
         
    }    
}
