/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class Fournisseur {
    
    
    private  int idfournisseur;
    private int idville;
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

    public int getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(int idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public int getIdville() {
        return idville;
    }

    public void setIdville(int idville) {
        this.idville = idville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Fournisseur() {
    }

    public Fournisseur(int idfournisseur, int idville, String nom, String adresse1, String adresse2) {
        this.idfournisseur = idfournisseur;
        this.idville = idville;
        this.nom = nom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
    }

  
    
     
    @Override
    public String toString() {
        return getNom();
    }
  

    

   
    
    
    
    
}
