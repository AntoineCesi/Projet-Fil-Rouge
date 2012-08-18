/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class Entreprise {
    
    private int identreprise;
    private String nom;
    private String adresse1;
    private String adresse2;

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public int getIdentreprise() {
        return identreprise;
    }

    public void setIdentreprise(int identreprise) {
        this.identreprise = identreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Entreprise() {
    }

    public Entreprise(int identreprise, String nom, String adresse1, String adresse2) {
        this.identreprise = identreprise;
        this.nom = nom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
    }

    @Override
    public String toString() {
        return "Entreprise{" + "nom=" + nom + '}';
    }
    
    

}
