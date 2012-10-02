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
    private int idtva;
    private String libelle;
    private String reference;
    private float prixht;    
    private String photo;
    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public int getNombreMin() {
        return nombreMin;
    }
    private int nombreMin;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCouleur() {
        return idCouleur;
    }

    public void setIdCouleur(int idCouleur) {
        this.idCouleur = idCouleur;
    }

    public int getIdtva() {
        return idtva;
    }

    public void setIdtva(int idtva) {
        this.idtva = idtva;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getPrixht() {
        return prixht;
    }

    public void setPrixht(float prixht) {
        this.prixht = prixht;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Article() {
    }

    public Article(int id, int idCouleur, int idtva, String libelle, String reference, float prixht, String photo) {
        this.id = id;
        this.idCouleur = idCouleur;
        this.idtva = idtva;
        this.libelle = libelle;
        this.reference = reference;
        this.prixht = prixht;
        this.photo = photo;
    }
    
    @Override
    public String toString() {
        return getLibelle();
    }
}
