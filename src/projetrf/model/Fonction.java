/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class Fonction {
    
    private int idfonction;
    private String libelle;

    public int getIdfonction() {
        return idfonction;
    }

    public void setIdfonction(int idfonction) {
        this.idfonction = idfonction;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Fonction() {
    }

    public Fonction(int idfonction, String libelle) {
        this.idfonction = idfonction;
        this.libelle = libelle;
    }
    
    
     
    @Override
    public String toString() {
        return getLibelle();
    }
    
}
