/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import projetrf.data.*;
import projetrf.model.*;
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
        // VueVille vv= new VueVille();
        // vv.setVisible(true);
      // VueMenu vmenu =new VueMenu();
      //vmenu.setVisible(true);
       //VueVilleModifie vv= new VueVilleModifie();
       //  vv.setVisible(true);
        //   RequetesPays pp= new RequetesPays();     
        // Pays py= RequetesPays.paysId(2);     
       
       /*
         List<Pays> pp1 = RequetesPays.listerPays();
         System.out.println(pp1.size()); for (int i = 0; i < pp1.size(); i++)
         { System.out.println("Élément à l'index " + i + " = " +
         pp1.get(i).getIdPays() + " = " + pp1.get(i).getPays()); }
              
        */
       /* Article ww = new Article();
        RequetesArticle zz= new RequetesArticle();
        RequetesArticle.updateArticle(1, 1, 1, "serviette", "123456789", 15.00F, 1);
      */
        /*  List<Article> aa=  RequetesArticle.selectArticleByLibelle("cray");
          System.out.println(aa.size());
          for (Article article : aa) {
           System.out.println( article.getLibelle());
        }*/
          
       
              
      /* List<Entreprise> pp1 = RequetesEntreprise.selectEntreprise();
         System.out.println(pp1.size()); for (int i = 0; i < pp1.size(); i++)
         { System.out.println("Élément à l'index " + i + " = " +
         pp1.get(i).getNom() + " = " + pp1.get(i).getAdresse1()); }*/
      
        /* manipulliationde de date*/
       
     /*  Date  madate=new Date();
    
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        
        try {
            date = df.parse("20-03-2011");
             System.out.println(date);
             
           
        } catch (ParseException e) {
            System.out.println(e);
        }
      */
       
      // VuePays vv= new VuePays();
      // vv.setVisible(true);
      
       // VueVilleModifie vv= new VueVilleModifie();
         //vv.setVisible(true);
       
       //  VueInterlocuteur vv= new VueInterlocuteur();
        // vv.setVisible(true);
        
      
      //  RequetesCommercial.updateCommercial(5,2, 2, "dupontel", "charlis", "", "");
        
    /* List<Commercial> pp1 = RequetesCommercial.selectCommercial();
         System.out.println(pp1.size()); for (int i = 0; i < pp1.size(); i++)
         { System.out.println("Élément à l'index " + i + " = " +
         pp1.get(i).getNom() + " = " + pp1.get(i).getPrenom()); }*/
        
      
        // VueUtilisateur vv= new VueUtilisateur();
       // vv.setVisible(true);
      /* List<Entreprise> pp1 = RequetesEntreprise.selectEntrepriseByName("cal");
         System.out.println(pp1.size()); for (int i = 0; i < pp1.size(); i++)
         { System.out.println("Élément à l'index " + i + " = " +
         pp1.get(i).getNom() + " = " + pp1.get(i).getAdresse1()); }*/
      
         Date  date=new Date();
    
      /*  Article article= RequetesArticle.selectArticleByRef("456");
             System.out.println(article.toString());*/
       
        new VueCommandeClientDebut().setVisible(true);
         
      /*   List<Interlocuteur> pp1 = RequetesInterlocuteur.selectInterlocuteurByIdCommercial(10);
         System.out.println(pp1.size()); for (int i = 0; i < pp1.size(); i++)
         { System.out.println("Élément à l'index " + i + " = " +
         pp1.get(i).getNom() + " = " + pp1.get(i).getPrenom()); }
        */
    }
   
}