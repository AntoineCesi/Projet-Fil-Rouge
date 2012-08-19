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
import projetrf.model.ActionType;


public class RequetesActionType {
   
    public int idactiontype;
    public int typelibelle;

        public static void insertActionCom(String typelibelle) throws SQLException {

        String query = "";

        try {
            query = "INSERT INTO ACTION_TYPE (TYP_LIB) VALUES (?); ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setString(1, typelibelle.toUpperCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionType.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    public static void updateActionType(int idactiontype, String typelibelle) throws SQLException {

        String query = "";
        try {
            query = " UPDATE ACTION_TYPE SET TYP_LIB=? where ID_ACTION_TYPE=?  ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(2, idactiontype);
            pStatement.setString(1, typelibelle.toUpperCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionType.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    
        public static ActionType SelectActionComById(int id) throws SQLException {
        String query ="";
        ActionType Action = new ActionType();
        ResultSet resultat;

        try {
            query = "SELECT * from ACTION_TYPE  where ID_ACTION_TYPE=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();
            while (resultat.next()) {
               
                 Action = new ActionType(resultat.getInt("ID_ACTION_TYPE"),resultat.getString("TYP_LIB"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionType.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Action;
    }
    
        
       public static List<ActionType> selectActionType() throws SQLException {

        String query = null;
        List<ActionType> Action = new ArrayList<ActionType>();
        ResultSet resultat;
        try {

            query = "SELECT * from ACTION_TYPE ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                
                ActionType ac = new ActionType(resultat.getInt("ID_ACTION_TYPE"), resultat.getString("TYP_LIB"));
                Action.add(ac);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesActionType.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Action;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
