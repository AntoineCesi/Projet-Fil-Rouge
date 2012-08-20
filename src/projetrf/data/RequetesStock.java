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
import projetrf.model.Stock;


public class RequetesStock {
    
     
    public int idstock;
    public int idarticle;
    public int stock;
    public int stockmin;
    public int stockmaxi;
    public Date datemaj;
    public Float marge;
    public Float ttc;
    
    
    
    
      
      public static void insertStock(  int idarticle, int stock,int stockmin,int stockmaxi,Date datemaj,Float marge, Float ttc ) throws SQLException {

          String query="";          

        try {
            query = "INSERT INTO STOCK (ID_ARTICLE,STSTOCK,STMINI,STMAXI,STDATEMAJ,STMARGE,STTTC ) VALUES (?,?,?,?,?,?,?);";   
 
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);            
            pStatement.setInt(1,idarticle);
            pStatement.setInt(2, stock);
            pStatement.setInt(3,stockmin);
            pStatement.setInt(4, stockmaxi);
            pStatement.setObject(5, datemaj);
            pStatement.setFloat(6,marge );
            pStatement.setFloat(7,ttc );
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesStock.class.getName()).log(Level.SEVERE, null, ex);

        }
      }
    
    
       
      public static void updateStock( int idstock,int idarticle, int stock,int stockmin,int stockmaxi,Date datemaj,Float marge, Float ttc ) throws SQLException {

          String query="";          

        try {
            
            query = " UPDATE STOCK  SET ID_ARTICLE=?,STSTOCK=?,STMINI=?,STMAXI=?,STDATEMAJ=?,STMARGE=?,STTTC=? where ID_STOCK=?  ";            
 
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(8,idstock);
            pStatement.setInt(1,idarticle);
            pStatement.setInt(2, stock);
            pStatement.setInt(3,stockmin);
            pStatement.setInt(4, stockmaxi);
            pStatement.setObject(5, datemaj);
            pStatement.setFloat(6,marge );
            pStatement.setFloat(7,ttc );
            pStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RequetesStock.class.getName()).log(Level.SEVERE, null, ex);

        }
      }
    
    
     
      public static Stock SelectStockById(int id) throws SQLException {
        String query = "";
        Stock stock = new Stock();
        ResultSet resultat;

        try {
            query = "SELECT * from STOCK  where ID_STOCK=? ";
            PreparedStatement pStatement = ConnectionBDD.getInstance().getPreparedStatement(query);
            pStatement.setInt(1, id);
            resultat = pStatement.executeQuery();

            while (resultat.next()) {
               
              stock = new Stock(resultat.getInt("ID_STOCK"),resultat.getInt("ID_ARTICLE"), resultat.getInt("STSTOCK"), resultat.getInt("STMINI"),resultat.getInt("STMAXI"), resultat.getDate("STDATEMAJ"),resultat.getFloat("STMARGE"),resultat.getFloat("STTTC"));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(RequetesStock.class.getName()).log(Level.SEVERE, null, ex);

        }
        return stock;
    }
    
       public static List<Stock> selectStock() throws SQLException {

        String query = null;
        List<Stock> stocks = new ArrayList<Stock>();
        ResultSet resultat;
        try {

            query = "SELECT * from STOCK ";
            PreparedStatement pStatement = (PreparedStatement) ConnectionBDD.getInstance().getPreparedStatement(query);
            resultat = pStatement.executeQuery(query);

            while (resultat.next()) {
                // System.out.println(resultat.getString("PAYS"));
            Stock   stock = new Stock(resultat.getInt("ID_STOCK"),resultat.getInt("ID_ARTICLE"), resultat.getInt("STSTOCK"), resultat.getInt("STMINI"),resultat.getInt("STMAXI"), resultat.getDate("STDATEMAJ"),resultat.getFloat("STMARGE"),resultat.getFloat("STTTC"));
                stocks.add(stock);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequetesStock.class.getName()).log(Level.SEVERE, null, ex);

        }

        return stocks;

        
    }
    
    
    
    
    
}
