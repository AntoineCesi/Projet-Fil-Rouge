/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

import java.util.Date;

public class Stock {
    
    private int idstock;
    private int idarticle;
    private int stock;
    private int stockmin;
    private int stockmaxi;
    private Date datemaj;
    private Float marge;
    private Float ttc;

    public Date getDatemaj() {
        return datemaj;
    }

    public void setDatemaj(Date datemaj) {
        this.datemaj = datemaj;
    }

    public int getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(int idarticle) {
        this.idarticle = idarticle;
    }

    public int getIdstock() {
        return idstock;
    }

    public void setIdstock(int idstock) {
        this.idstock = idstock;
    }

    public Float getMarge() {
        return marge;
    }

    public void setMarge(Float marge) {
        this.marge = marge;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockmaxi() {
        return stockmaxi;
    }

    public void setStockmaxi(int stockmaxi) {
        this.stockmaxi = stockmaxi;
    }

    public int getStockmin() {
        return stockmin;
    }

    public void setStockmin(int stockmin) {
        this.stockmin = stockmin;
    }

    public Float getTtc() {
        return ttc;
    }

    public void setTtc(Float ttc) {
        this.ttc = ttc;
    }

    public Stock() {
    }

    public Stock(int idstock, int idarticle, int stock, int stockmin, int stockmaxi, Date datemaj, Float marge, Float ttc) {
        this.idstock = idstock;
        this.idarticle = idarticle;
        this.stock = stock;
        this.stockmin = stockmin;
        this.stockmaxi = stockmaxi;
        this.datemaj = datemaj;
        this.marge = marge;
        this.ttc = ttc;
    }
    
   
   
    
}
