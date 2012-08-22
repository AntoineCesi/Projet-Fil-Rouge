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
import projetrf.model.Service;


public class RequetesService {
    
    public int idservice;
    public int identreprise;
    public String libelle;
    
    
     public static void insertService(int identreprise, String libelle) throws SQLException {

        String query = "";

        try {
            query = "INSERT INTO SERVICE (ID_ENTREPRISE,SERLIBELLE) VALUES (?,?); ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, identreprise);
            pStatement.setString(2, libelle.toUpperCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesService.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
       public static void updateService( int idservice,int identreprise, String libelle) throws SQLException {

        String query = "";
        try {
            query = "UPDATE SERVICE SET ID_ENTREPRISE=?,SERLIBELLE=? where ID_SERVICE=? ";
            
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(3, idservice);
            pStatement.setInt(1, identreprise);
            pStatement.setString(2, libelle.toUpperCase());
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesService.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
       
        
      public static Service SelectServiceById(int id) throws SQLException {
        String query = null;
        Service service = new Service();
        ResultSet resultat;

        try {
            query = "SELECT * from SERVICE  where ID_SERVICE=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
               
                service = new Service(resultat.getInt("ID_SERVICE"),resultat.getInt("ID_ENTREPRISE"),resultat.getString("SERLIBELLE"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesService.class.getName()).log(Level.SEVERE, null, ex);

        }
        return service;
    }
      
        public static Service SelectServiceByIdEntreprise(int id) throws SQLException {
        String query = null;
        Service service = new Service();
        ResultSet resultat;

        try {
            query = "SELECT * from SERVICE  where ID_ENTREPRISE=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
               
                service = new Service(resultat.getInt("ID_SERVICE"),resultat.getInt("ID_ENTREPRISE"),resultat.getString("SERLIBELLE"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesService.class.getName()).log(Level.SEVERE, null, ex);

        }
        return service;
    }
      
         public static List<Service> selectService() throws SQLException {

        String query = null;
        List<Service> services = new ArrayList<Service>();
        ResultSet resultat;
        try {

            query = "SELECT * from SERVICE ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                // System.out.println(resultat.getString("PAYS"));
                Service ser = new Service(resultat.getInt("ID_SERVICE"), resultat.getInt("ID_ENTREPRISE"), resultat.getString("SERLIBELLE"));
                services.add(ser);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesService.class.getName()).log(Level.SEVERE, null, ex);

        }

        return services;

    }
         
         
         
}
