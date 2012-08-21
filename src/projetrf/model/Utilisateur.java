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
    private String identifiant;
    private String password;

    public String getidentifiant() {
        return identifiant;
    }

    public void setidentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
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

    public Utilisateur(int idUtilisateur, int idFonction, int idVille, String nom, String prenom, String identifiant, String password) {
        this.idUtilisateur = idUtilisateur;
        this.idFonction = idFonction;
        this.idVille = idVille;
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.password = password;
    }

    public Utilisateur(int idFonction, int idVille, String nom, String prenom, String identifiant, String password) {
        this.idFonction = idFonction;
        this.idVille = idVille;
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.password = password;
    }

   
   
    
    @Override
    public String toString() {
        return getNom();
    }
  

    

    
}
