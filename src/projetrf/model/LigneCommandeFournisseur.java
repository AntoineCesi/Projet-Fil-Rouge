/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class LigneCommandeFournisseur {
    
    private int idlignefournisseur;
    private int idcommandefournisseur;
    private int idarticle;
    private int quantite;
    private Float prixht;
    private Float prixttc;
    private Float remise;

    public int getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(int idarticle) {
        this.idarticle = idarticle;
    }

    public int getIdcommandefournisseur() {
        return idcommandefournisseur;
    }

    public void setIdcommandefournisseur(int idcommandefournisseur) {
        this.idcommandefournisseur = idcommandefournisseur;
    }

    public int getIdlignefournisseur() {
        return idlignefournisseur;
    }

    public void setIdlignefournisseur(int idlignefournisseur) {
        this.idlignefournisseur = idlignefournisseur;
    }

    public Float getPrixht() {
        return prixht;
    }

    public void setPrixht(Float prixht) {
        this.prixht = prixht;
    }

    public Float getPrixttc() {
        return prixttc;
    }

    public void setPrixttc(Float prixttc) {
        this.prixttc = prixttc;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Float getRemise() {
        return remise;
    }

    public void setRemise(Float remise) {
        this.remise = remise;
    }

    public LigneCommandeFournisseur() {
    }

    public LigneCommandeFournisseur(int idlignefournisseur, int idcommandefournisseur, int idarticle, int quantite, Float prixht, Float prixttc, Float remise) {
        this.idlignefournisseur = idlignefournisseur;
        this.idcommandefournisseur = idcommandefournisseur;
        this.idarticle = idarticle;
        this.quantite = quantite;
        this.prixht = prixht;
        this.prixttc = prixttc;
        this.remise = remise;
    }

    @Override
    public String toString() {
        return "LigneCommandeFournisseur{" + "idlignefournisseur=" + idlignefournisseur + ", idcommandefournisseur=" + idcommandefournisseur + ", idarticle=" + idarticle + ", quantite=" + quantite + ", prixht=" + prixht + ", prixttc=" + prixttc + ", remise=" + remise + '}';
    }

  
    
    
}
