/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author plepelletier
 */
public class Interlocuteur {
    
   private int idinterlocuteur;
   private int idcommercial;
   private int idville;
   private int idservice;
   private String nom;
   private String prenom;
   private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdcommercial() {
        return idcommercial;
    }

    public void setIdcommercial(int idcommercial) {
        this.idcommercial = idcommercial;
    }

    public int getIdinterlocuteur() {
        return idinterlocuteur;
    }

    public void setIdinterlocuteur(int idinterlocuteur) {
        this.idinterlocuteur = idinterlocuteur;
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Interlocuteur() {
    }

    public Interlocuteur(int idinterlocuteur, int idcommercial, int idville, int idservice, String nom, String prenom, String email) {
        this.idinterlocuteur = idinterlocuteur;
        this.idcommercial = idcommercial;
        this.idville = idville;
        this.idservice = idservice;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

      
    @Override
    public String toString() {
        return getNom();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Interlocuteur other = (Interlocuteur) obj;
        if (this.idinterlocuteur != other.idinterlocuteur) {
            return false;
        }
        if (this.idcommercial != other.idcommercial) {
            return false;
        }
        if (this.idville != other.idville) {
            return false;
        }
        if (this.idservice != other.idservice) {
            return false;
        }
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.prenom == null) ? (other.prenom != null) : !this.prenom.equals(other.prenom)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
  
    
    
}
