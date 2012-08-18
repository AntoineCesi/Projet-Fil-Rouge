/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

import java.util.Date;

/**
 *
 * @author Travail
 */
public class CommandeFournisseur {
    
    private int idcommandefournisseur;
    private int idutilisateur;
    private String referencefournisseur;
    private Date datecommandefournisseur;
    private Float remisefournisseur;

    public Date getDatecommandefournisseur() {
        return datecommandefournisseur;
    }

    public void setDatecommandefournisseur(Date datecommandefournisseur) {
        this.datecommandefournisseur = datecommandefournisseur;
    }

    public int getIdcommandefournisseur() {
        return idcommandefournisseur;
    }

    public void setIdcommandefournisseur(int idcommandefournisseur) {
        this.idcommandefournisseur = idcommandefournisseur;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getReferencefournisseur() {
        return referencefournisseur;
    }

    public void setReferencefournisseur(String referencefournisseur) {
        this.referencefournisseur = referencefournisseur;
    }

    public Float getRemisefournisseur() {
        return remisefournisseur;
    }

    public void setRemisefournisseur(Float remisefournisseur) {
        this.remisefournisseur = remisefournisseur;
    }

    public CommandeFournisseur() {
    }

    public CommandeFournisseur(int idcommandefournisseur, int idutilisateur, String referencefournisseur, Date datecommandefournisseur, Float remisefournisseur) {
        this.idcommandefournisseur = idcommandefournisseur;
        this.idutilisateur = idutilisateur;
        this.referencefournisseur = referencefournisseur;
        this.datecommandefournisseur = datecommandefournisseur;
        this.remisefournisseur = remisefournisseur;
    }

    @Override
    public String toString() {
        return "CommandeFournisseur{" + "referencefournisseur=" + referencefournisseur + '}';
    }
    
    
    
    
}
