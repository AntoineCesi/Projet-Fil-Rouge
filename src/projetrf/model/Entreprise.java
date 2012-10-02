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

    public int getIdville() {
        return idville;
    }

    public void setIdville(int idville) {
        this.idville = idville;
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

    public Entreprise(int identreprise, int idville, String nom, String adresse1, String adresse2) {
        this.identreprise = identreprise;
        this.idville = idville;
        this.nom = nom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
    }

  

    @Override
    public String toString() {
        return this.nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entreprise other = (Entreprise) obj;
        if (this.identreprise != other.identreprise) {
            return false;
        }
        if (this.idville != other.idville) {
            return false;
        }
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.adresse1 == null) ? (other.adresse1 != null) : !this.adresse1.equals(other.adresse1)) {
            return false;
        }
        if ((this.adresse2 == null) ? (other.adresse2 != null) : !this.adresse2.equals(other.adresse2)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    

}
