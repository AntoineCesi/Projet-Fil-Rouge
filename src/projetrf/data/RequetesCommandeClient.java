/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.model.CommandeClient;

public class RequetesCommandeClient {
    
    

    public static int insertCommandeClient(int identreprise, int idinterlocuteur,  Date datecommandeclient,String referencecommandeclient,Float totalhtcommandeclient,Float totalttccommandeclient, Float remisecommandeclient) throws SQLException {

        String query = "";
        ResultSet resultat;
        int retour=0;
        
        try {
            query = "INSERT INTO COMMANDE_CLIENT(ID_ENTREPRISE,ID_INTERLOCUTEUR,COMDATE,COMREF,COMHT,COMTTC,COMREMISE) VALUES (?,?,?,?,?,?,?)  ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, identreprise);
            pStatement.setInt(2, idinterlocuteur);
            pStatement.setObject(3, datecommandeclient);
            pStatement.setString(4, referencecommandeclient);
            pStatement.setFloat(5, totalhtcommandeclient);
            pStatement.setFloat(6, totalttccommandeclient);
            pStatement.setFloat(7, remisecommandeclient);
            pStatement.executeUpdate();
          
            resultat= pStatement.executeQuery("select LAST_INSERT_ID()");
          
        if (resultat.next()){ 
            retour=resultat.getInt(1); 
        } 


          
        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
        return retour;
        
    }

    public static void updateCommandeClient(int idcommandeclient, int identreprise,int idinterlocuteur,  Date datecommandeclient,String referencecommandeclient,Float totalhtcommandeclient,Float totalttccommandeclient, Float remisecommandeclient) throws SQLException {

        String query = "";

        try {
            query = " UPDATE COMMANDE_CLIENT SET ID_ENTREPRISE=?,ID_INTERLOCUTEUR=?,COMDATE=?,COMREF=?,COMHT=?,COMTTC=?,COMREMISE=?  where ID_COMMANDE=?  ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(6, idcommandeclient);
            pStatement.setInt(1, identreprise);
            pStatement.setInt(2, idinterlocuteur);
            pStatement.setObject(3, datecommandeclient);
            pStatement.setString(4, referencecommandeclient);
            pStatement.setFloat(5, totalhtcommandeclient);
            pStatement.setFloat(6, totalttccommandeclient);
            pStatement.setFloat(7, remisecommandeclient);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static CommandeClient SelectCommandeClientById(int id) throws SQLException {
        String query = "";
        CommandeClient Commande = new CommandeClient();
        ResultSet resultat;
        
        

        try {
            query = "SELECT * from COMMANDE_CLIENT  where ID_COMMANDE =? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {

              //  Commande = new CommandeClient(resultat.getInt("ID_COMMANDE"), resultat.getInt("ID_ENTREPRISE"), resultat.getInt("ID_INTERLOCUTEUR"),resultat.getDate("COMDATE"), resultat.getString("COMREF"),resultat.getFloat("COMHT"),resultat.getFloat("COMTTC"),  resultat.getFloat("COMREMISE"));
            
                 Commande.setIdcommandeclient(resultat.getInt("ID_COMMANDE"));
                 Commande.setIdentreprise(resultat.getInt("ID_ENTREPRISE"));
                 Commande.setIdinterlocuteur(resultat.getInt("ID_INTERLOCUTEUR"));
                 Commande.setDatecommandeclient(resultat.getDate("COMDATE"));
                 Commande.setReferencecommandeclient(resultat.getString("COMREF"));
                 Commande.setTotalhtcommandeclient( resultat.getFloat("COMHT"));
                 Commande.setTotalttccommandeclient( resultat.getFloat("COMTTC"));
                 Commande.setRemisecommandeclient( resultat.getFloat("COMREMISE"));
                
                Commande.setDatecommandeclient(resultat.getDate("COMDATE"));
           
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Commande;
    }

    public static List<CommandeClient> selectCommandeClient() throws SQLException {

        String query = null;
        List<CommandeClient> Commande = new ArrayList<CommandeClient>();
        ResultSet resultat;
        try {

            query = "SELECT * from COMMANDE_CLIENT ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {

               // CommandeClient cmd = new CommandeClient(resultat.getInt("ID_COMMANDE"), resultat.getInt("ID_ENTREPRISE"), resultat.getInt("ID_COMMERCIAL"), resultat.getString("COMREF"), resultat.getDate("COMDATE"), resultat.getFloat("COMREMISE"));
               // Commande.add(cmd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }

        return Commande;

    }
}
