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
    private int idUtilisateur;
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

    public Commercial() {
    }

    public Commercial(int idCommercial, int idUtilisateur, int idVille, String nom, String prenom, String adresse1, String adresse2) {
        this.idCommercial = idCommercial;
        this.idUtilisateur = idUtilisateur;
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

  
    

    
}
