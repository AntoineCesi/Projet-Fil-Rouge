/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

public class Tva {    
    
    private int idtva;    
    private String libelle;   
    private float taux;

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

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public Tva() {
    }

    public Tva(int idtva, String libelle, float taux) {
        this.idtva = idtva;
        this.libelle = libelle;
        this.taux = taux;
    }

      
    
    @Override
    public String toString() {
        return getLibelle();
    }
   
}
