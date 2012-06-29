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
    
   private int idInterlocuteur;
   private int idUtilisateur;
   private int idVille;
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

    public int getIdInterlocuteur() {
        return idInterlocuteur;
    }

    public void setIdInterlocuteur(int idInterlocuteur) {
        this.idInterlocuteur = idInterlocuteur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
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

    public Interlocuteur(int idInterlocuteur, int idUtilisateur, int idVille, int idservice, String nom, String prenom, String email) {
        this.idInterlocuteur = idInterlocuteur;
        this.idUtilisateur = idUtilisateur;
        this.idVille = idVille;
        this.idservice = idservice;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Interlocuteur(int idUtilisateur, int idVille, int idservice, String nom, String prenom, String email) {
        this.idUtilisateur = idUtilisateur;
        this.idVille = idVille;
        this.idservice = idservice;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

      
    @Override
    public String toString() {
        return getNom();
    }
  
}
