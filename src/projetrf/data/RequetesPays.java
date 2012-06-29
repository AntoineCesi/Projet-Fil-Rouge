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
import projetrf.model.Pays;

/**
 *
 * @author plepelletier
 */
public class RequetesPays {
    
    private int idPays;
    private String pays ;   
    
    public static int ecrirePays( String pays) throws SQLException
    {
        int result;
        String query;
        String cri1= pays;
        
      
            Statement statement = ConnectionBDD.getInstance().getStatement();
            
            query = "INSERT INTO PAYS (PAYS) VALUES ('"+cri1+"') "; 
            
            statement.executeUpdate(query);
            result = 0;

      

        return 0;

        
    }
    
    public static Pays paysId(int id) {
        String query = null;
        int cri1 = id;
        Pays pays1 = new Pays();
        ResultSet resultat;
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            query = "SELECT * from PAYS where ID_PAYS='" + cri1 + "' ";
            resultat = statement.executeQuery(query);
            while (resultat.next()) {
                //System.out.println(resultat.getString("PAYS"));
                pays1 = new Pays(resultat.getInt("ID_PAYS"), resultat.getString("PAYS"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);

        }
        return pays1;

    }
     
     
    public static List<Pays> listerPays()  throws SQLException {
      
        String query = null;
        List<Pays> pays1 = new ArrayList<Pays>();
        ResultSet resultat;
        try {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            query = "SELECT * from PAYS ";
            resultat = statement.executeQuery(query);

            while (resultat.next()) {
               // System.out.println(resultat.getString("PAYS"));
                Pays pp = new Pays(resultat.getInt("ID_PAYS"), resultat.getString("PAYS"));
                pays1.add(pp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesPays.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return pays1;

        
    }
}
