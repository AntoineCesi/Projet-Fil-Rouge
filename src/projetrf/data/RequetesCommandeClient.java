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
import projetrf.model.CommandeClient;

public class RequetesCommandeClient {

    public int idcommandeclient;
    public int identreprise;
    public int idutilisateur;
    public String referencecommandeclient;
    public Date datecommandeclient;
    public Float remisecommandeclient;

    public static void insertCommandeClient(int identreprise, int idutilisateur, String referencecommandeclient, Date datecommandeclient, Float remisecommandeclient) throws SQLException {

        String query = "";

        try {
            query = "INSERT INTO COMMANDE_CLIENT(ID_ENTREPRISE,ID_UTILISATEUR,COMREF,COMDATE,COMREMISE) VALUES (?,?,?,?,?); ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, identreprise);
            pStatement.setInt(2, idutilisateur);
            pStatement.setString(3, referencecommandeclient);
            pStatement.setObject(4, datecommandeclient);
            pStatement.setFloat(5, remisecommandeclient);
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void updateCommandeClient(int idcommandeclient, int identreprise, int idutilisateur, String referencecommandeclient, Date datecommandeclient, Float remisecommandeclient) throws SQLException {

        String query = "";

        try {
            query = " UPDATE COMMANDE_CLIENT SET ID_ENTREPRISE=?,ID_UTILISATEUR=?,COMREF=?,COMDATE=?,COMREMISE=?  where ID_COMMANDE=?  ";

            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(6, idcommandeclient);
            pStatement.setInt(1, identreprise);
            pStatement.setInt(2, idutilisateur);
            pStatement.setString(3, referencecommandeclient);
            pStatement.setObject(4, datecommandeclient);
            pStatement.setFloat(5, remisecommandeclient);
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

                Commande = new CommandeClient(resultat.getInt("ID_COMMANDE"), resultat.getInt("ID_ENTREPRISE"), resultat.getInt("ID_UTILISATEUR"), resultat.getString("COMREF"), resultat.getDate("COMDATE"), resultat.getFloat("COMREMISE"));
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

                CommandeClient cmd = new CommandeClient(resultat.getInt("ID_COMMANDE"), resultat.getInt("ID_ENTREPRISE"), resultat.getInt("ID_UTILISATEUR"), resultat.getString("COMREF"), resultat.getDate("COMDATE"), resultat.getFloat("COMREMISE"));
                Commande.add(cmd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesCommandeClient.class.getName()).log(Level.SEVERE, null, ex);

        }

        return Commande;

    }
}
