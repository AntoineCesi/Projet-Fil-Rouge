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
public class Utilisateur {

    
    private int idUtilisateur;
    private int idFonction;
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

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
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

    public Utilisateur() {
    }

    public Utilisateur(int idUtilisateur, int idFonction, int idVille, String nom, String prenom, String adresse1, String adresse2) {
        this.idUtilisateur = idUtilisateur;
        this.idFonction = idFonction;
        this.idVille = idVille;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
    }

    public Utilisateur(int idFonction, int idVille, String nom, String prenom, String adresse1, String adresse2) {
        this.idFonction = idFonction;
        this.idVille = idVille;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
    }

   
   
    
    @Override
    public String toString() {
        return getNom();
    }
  

    

    
}
