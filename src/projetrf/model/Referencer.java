/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class Referencer {
    
    private  int idfournisseur;
    private int id_article;

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public int getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(int idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public Referencer() {
    }

    public Referencer(int idfournisseur, int id_article) {
        this.idfournisseur = idfournisseur;
        this.id_article = id_article;
    }
    
    
   
}
