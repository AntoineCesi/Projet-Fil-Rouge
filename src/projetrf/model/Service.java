/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class Service {
    
    private int idservice;
    private int identreprise;
    private String libelle;

    public int getIdentreprise() {
        return identreprise;
    }

    public void setIdentreprise(int identreprise) {
        this.identreprise = identreprise;
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Service() {
    }

    public Service(int idservice, int identreprise, String libelle) {
        this.idservice = idservice;
        this.identreprise = identreprise;
        this.libelle = libelle;
    }
     
    @Override
    public String toString() {
        return getLibelle();
    }
    
}
