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
    private int idutilisateur;
    private String referencecommandeclient;
    private Date datecommandeclient;
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

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
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

    public CommandeClient() {
    }

    public CommandeClient(int idcommandeclient, int identreprise, int idutilisateur, String referencecommandeclient, Date datecommandeclient, Float remisecommandeclient) {
        this.idcommandeclient = idcommandeclient;
        this.identreprise = identreprise;
        this.idutilisateur = idutilisateur;
        this.referencecommandeclient = referencecommandeclient;
        this.datecommandeclient = datecommandeclient;
        this.remisecommandeclient = remisecommandeclient;
    }

    @Override
    public String toString() {
        return "CommandeClient{" + "referencecommandeclient=" + referencecommandeclient + '}';
    }

    
    
}
