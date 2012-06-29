/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.model.Interlocuteur;
import projetrf.model.Pays;

/**
 *
 * @author Windows XP
 */
public class RequetesInterlocuteur {
    
    public int idInter;
    public int idUtilisateur;
    public int idVille;
    public int idService;
    public String nom;
    public String prenom;
    public String email;
    
    
    public static int ecrireInterlocuteur(int idutilisateur,int idville,int idservice,String nom, String prenom,String email )
    {
        int result;
        String query;
        int cri1 = idutilisateur;       
        int cri2 = idville;
        int cri3 = idservice;
        String cri4 = nom;
        String cri5 = prenom;
        String cri6 = email;       
        
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            
            query = "INSERT INTO INTERLOCUTEUR (ID_UTILISATEUR,ID_VILLE,ID_SERVICE,INTNOM,INTPRENOM,INTEMAIL) VALUES ("+cri1+","+cri2+","+cri3+",'"+cri4+"','"+cri5+"','"+cri6+"') "; 
            
            statement.executeUpdate(query);
            result = 0;

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }
        return 0;

    }
    
    
      public static Interlocuteur  selectId( int id)
    {
        String query=null;
        int cri1 = 2;        
        Interlocuteur  interlocuteur1 =new Interlocuteur();
        ResultSet resultat;      
       
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();

            query = "SELECT * from INTERLOCUTEUR where ID_INTERLOCUTEUR='" + cri1 + "' ";
            resultat = statement.executeQuery(query);
            
            while (resultat.next()) {
               System.out.println(resultat.getString("INTNOM")); 
               interlocuteur1 =new Interlocuteur(resultat.getInt("ID_INTERLOCUTEUR"),resultat.getInt("ID_VILLE"),resultat.getInt("ID_SERVICE"),resultat.getString("INTNOM"),resultat.getString("INTPRENOM"),resultat.getString("INTEMAIL"));
               
              /* interlocuteur1.setIdInterlocuteur(resultat.getInt("ID_INTERLOCUTEUR"));
               interlocuteur1.setIdVille(resultat.getInt("ID_VILLE"));
               interlocuteur1.setNom(resultat.getString("INTNOM"));
               interlocuteur1.setPrenom(resultat.getString("INTPRENOM"));
               interlocuteur1.setEmail(resultat.getString("INTEMAIL"));   */          

            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        return interlocuteur1;        
    }
    
        public static List<Interlocuteur> listerInterlocuteur( )
    {
       String query=null;          
        List<Interlocuteur> interlocuteur1 =new ArrayList<Interlocuteur>();
        ResultSet resultat; 
        
       
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            query = "SELECT * from INTERLOCUTEUR  ";
            resultat = statement.executeQuery(query);
           
            while (resultat.next()) {
               System.out.println(resultat.getString("INTNOM"));                
               Interlocuteur ii = new Interlocuteur(resultat.getInt("ID_INTERLOCUTEUR"),resultat.getInt("ID_VILLE"),resultat.getInt("ID_SERVICE"),resultat.getString("INTNOM"),resultat.getString("INTPRENOM"),resultat.getString("INTEMAIL"));
               interlocuteur1.add(ii);                               
               
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(RequetesPays.class.getName()).log(Level.SEVERE, null, ex);
           
        }


        return interlocuteur1;

        
    }
}
