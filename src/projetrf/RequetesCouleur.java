package projetrf;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ademarly
 */
public class RequetesCouleur {
    
    public static int insertCouleur(String libelle)
    {
        int result;
        String query;
        try 
        {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            query = "INSERT INTO COULEUR(COULIBELLE) VALUES(\"" + libelle + "\");";
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
    
    public static int updateCouleur(int id,String lib)
    {
        int result;
        String query;
        try 
        {
            Statement statement = ConnectionBDD.getInstance().getStatement();
            query = "";
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
