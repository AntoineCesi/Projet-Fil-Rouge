/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.model.ActionCom;

public class RequetesActionCom {
   

    public int idaction;
    public int idactiontype;
    public int idutilisateur;
    public Date dateaction;
    public String actioncommercial;
    
    
      public static void insertActionCom( int idactiontype,int idutilisateur, Date dateaction, String actioncommercial ) throws SQLException {

          String query="";     
         

        try {
            query = "INSERT INTO ACTION_COM (ID_ACTION_TYPE,ID_INTERLOCUTEUR,ACTDATE,ACTCOMM) VALUES (?,?,?,?); " ;

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1,idactiontype);
            pStatement.setInt(2, idutilisateur);
            pStatement.setObject(3, dateaction);
            pStatement.setString(4, actioncommercial.toLowerCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionCom.class.getName()).log(Level.SEVERE, null, ex);

        }
      }
        
        public static void updateActionCom(int idaction, int idactiontype, int idutilisateur, Date dateaction, String actioncommercial) throws SQLException {

        String query = "";

        try {
            query = " UPDATE ACTION_COM SET ID_ACTION_TYPE=?,ID_INTERLOCUTEUR=?,ACTDATE=?,ACTCOMM=? where ID_ACTION=?  ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(5, idaction);
            pStatement.setInt(1, idactiontype);
            pStatement.setInt(2, idutilisateur);
            pStatement.setObject(3, dateaction);
            pStatement.setString(4, actioncommercial.toLowerCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionCom.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
      
   
      public static ActionCom SelectActionComById(int id) throws SQLException {
        String query = null;
        ActionCom Action = new ActionCom();
        ResultSet resultat;

        try {
            query = "SELECT * from ACTION_COM  where ID_ACTION=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
               
                Action = new ActionCom(resultat.getInt("ID_ACTION"), resultat.getInt("ID_ACTION_TYPE"), resultat.getInt("ID_INTERLOCUTEUR"), resultat.getDate("ACTDATE"),resultat.getString("ACTCOMM"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionCom.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Action;
    }
        
    
     public static List<ActionCom> selectActionCom() throws SQLException {

        String query = null;
        List<ActionCom> Action = new ArrayList<ActionCom>();
        ResultSet resultat;
        try {

            query = "SELECT * from ACTION_COM ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                // System.out.println(resultat.getString("PAYS"));
                ActionCom ac = new ActionCom(resultat.getInt("ID_ACTION"), resultat.getInt("ID_ACTION_TYPE"), resultat.getInt("ID_INTERLOCUTEUR"), resultat.getDate("ACTDATE"), resultat.getString("ACTCOMM"));
                Action.add(ac);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionCom.class.getName()).log(Level.SEVERE, null, ex);

        }

        return Action;

        
    }
    
    
    
    
    
}
