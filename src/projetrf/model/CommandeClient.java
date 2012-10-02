/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

import java.util.Date;

/**
 *
 * @author Travail
 */
public class CommandeClient {
 
    private int idcommandeclient;
    private int identreprise;
    private int idinterlocuteur;
    private Date datecommandeclient;
    private String referencecommandeclient;   
    private Float totalhtcommandeclient;
    private Float totalttccommandeclient;
    private Float remisecommandeclient;

    public Date getDatecommandeclient() {
        return datecommandeclient;
    }

    public void setDatecommandeclient(Date datecommandeclient) {
        this.datecommandeclient = datecommandeclient;
    }

    public int getIdcommandeclient() {
        return idcommandeclient;
    }

    public void setIdcommandeclient(int idcommandeclient) {
        this.idcommandeclient = idcommandeclient;
    }

    public int getIdentreprise() {
        return identreprise;
    }

    public void setIdentreprise(int identreprise) {
        this.identreprise = identreprise;
    }

    public int getIdinterlocuteur() {
        return idinterlocuteur;
    }

    public void setIdinterlocuteur(int idinterlocuteur) {
        this.idinterlocuteur = idinterlocuteur;
    }

    public String getReferencecommandeclient() {
        return referencecommandeclient;
    }

    public void setReferencecommandeclient(String referencecommandeclient) {
        this.referencecommandeclient = referencecommandeclient;
    }

    public Float getRemisecommandeclient() {
        return remisecommandeclient;
    }

    public void setRemisecommandeclient(Float remisecommandeclient) {
        this.remisecommandeclient = remisecommandeclient;
    }

    public Float getTotalhtcommandeclient() {
        return totalhtcommandeclient;
    }

    public void setTotalhtcommandeclient(Float totalhtcommandeclient) {
        this.totalhtcommandeclient = totalhtcommandeclient;
    }

    public Float getTotalttccommandeclient() {
        return totalttccommandeclient;
    }

    public void setTotalttccommandeclient(Float totalttccommandeclient) {
        this.totalttccommandeclient = totalttccommandeclient;
    }

    public CommandeClient() {
    }

    public CommandeClient(int idcommandeclient, int identreprise, int idinterlocuteur, Date datecommandeclient, String referencecommandeclient, Float totalhtcommandeclient, Float totalttccommandeclient, Float remisecommandeclient) {
        this.idcommandeclient = idcommandeclient;
        this.identreprise = identreprise;
        this.idinterlocuteur = idinterlocuteur;
        this.datecommandeclient = datecommandeclient;
        this.referencecommandeclient = referencecommandeclient;
        this.totalhtcommandeclient = totalhtcommandeclient;
        this.totalttccommandeclient = totalttccommandeclient;
        this.remisecommandeclient = remisecommandeclient;
    }

    @Override
    public String toString() {
        return "CommandeClient{" + "referencecommandeclient=" + referencecommandeclient + '}';
    }

  
    
    
}
