package projetrf.model;

/**
 *
 * @author ademarly
 */
public class Couleur {
    private int id;
    private String libelle;
    
    public Couleur() {
    } 

    public Couleur(int id, String lib) {
        this.id = id;
        this.libelle = lib;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getid() {
        return id;
    }
}
