package projetrf.data;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ademarly
 */
public class RequetesCouleur {
    
    public static void insertCouleur(String libelle) throws SQLException
    {
        String query;
        Statement statement = ConnectionBDD.getInstance().getStatement();
        query = "INSERT INTO COULEUR(COULIBELLE) VALUES(\"" + libelle + "\");";
        statement.executeUpdate(query);
    }
    
    public static int updateCouleur(int id,String libelle) throws SQLException
    {
        int result;
        String query;
        try 
        {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            query = "UPDATE COULEUR set COULIBELLE = " + libelle + " WHERE ID_COULEUR";
            statement.executeUpdate(query);
            result = 0;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(RequetesCouleur.class.getName()).log(Level.SEVERE, null, ex);
            result = -1;
        }
        return result;
       
    }
}
