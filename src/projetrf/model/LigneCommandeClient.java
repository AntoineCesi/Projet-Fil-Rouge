/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class LigneCommandeClient {
    
    private  int idlignecommandeclient;
    private  int idarticle;
    private  int idcommande;
    private  int quantite;
    private  Float prixht;
    private  Float prixttc;
    private  Float remise;

    public int getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(int idarticle) {
        this.idarticle = idarticle;
    }

    public int getIdcommande() {
        return idcommande;
    }

    public void setIdcommande(int idcommande) {
        this.idcommande = idcommande;
    }

    public int getIdlignecommandeclient() {
        return idlignecommandeclient;
    }

    public void setIdlignecommandeclient(int idlignecommandeclient) {
        this.idlignecommandeclient = idlignecommandeclient;
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

    public LigneCommandeClient() {
    }

    public LigneCommandeClient(int idlignecommandeclient, int idarticle, int idcommande, int quantite, Float prixht, Float prixttc, Float remise) {
        this.idlignecommandeclient = idlignecommandeclient;
        this.idarticle = idarticle;
        this.idcommande = idcommande;
        this.quantite = quantite;
        this.prixht = prixht;
        this.prixttc = prixttc;
        this.remise = remise;
    }
    
   
}
