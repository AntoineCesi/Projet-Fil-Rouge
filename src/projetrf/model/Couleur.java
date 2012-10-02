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
    @Override
    public String toString() {
        return getLibelle();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Couleur other = (Couleur) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.libelle == null) ? (other.libelle != null) : !this.libelle.equals(other.libelle)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
}
