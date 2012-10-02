/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;


/**
 * ID_PAYS PAYS
 *
 * @author plepelletier
 */
public class Commercial {

    
    private int idCommercial;
   
    private int idVille;
    private String nom;
    private String prenom;
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

    public int getIdCommercial() {
        return idCommercial;
    }

    public void setIdCommercial(int idCommercial) {
        this.idCommercial = idCommercial;
    }
   

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Commercial() {
    }

    public Commercial(int idCommercial, int idVille, String nom, String prenom, String adresse1, String adresse2) {
        this.idCommercial = idCommercial;
        this.idVille = idVille;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
    }

   

   
   
    @Override
    public String toString() {
        return this.getNom();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Commercial other = (Commercial) obj;
        if (this.idCommercial != other.idCommercial) {
            return false;
        }
        if (this.idVille != other.idVille) {
            return false;
        }
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.prenom == null) ? (other.prenom != null) : !this.prenom.equals(other.prenom)) {
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
