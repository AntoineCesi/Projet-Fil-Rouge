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
   private int  idVille;
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

    public Interlocuteur() {
    }

    public Interlocuteur(int idInterlocuteur, int idVille, int idService, String nom, String prenom, String email) {
        this.idInterlocuteur = idInterlocuteur;
        this.idVille = idVille;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
   
    
  
}
