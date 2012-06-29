/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author ademarly
 */
public class Article {
    
    private int id;
    private int idCouleur;
    private float prix;
    private String libelle;

    public Article() {
    }

    public Article(int id, int idCouleur, float prix, String lib) {
        this.id = id;
        this.idCouleur = idCouleur;
        this.prix = prix;
        this.libelle = lib;
    }

    public int getId() {
        return id;
    }

    public int getIdCouleur() {
        return idCouleur;
    }

    public void setIdCouleur(int idCouleur) {
        this.idCouleur = idCouleur;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLib(String lib) {
        this.libelle = lib;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    @Override
    public String toString() {
        return getLibelle();
    }
}
