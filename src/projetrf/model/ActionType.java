/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;

/**
 *
 * @author Travail
 */
public class ActionType {

    private int idactiontype;
    private String typelibelle;

    public int getIdactiontype() {
        return idactiontype;
    }

    public void setIdactiontype(int idactiontype) {
        this.idactiontype = idactiontype;
    }

    public String getTypelibelle() {
        return typelibelle;
    }

    public void setTypelibelle(String typelibelle) {
        this.typelibelle = typelibelle;
    }

    public ActionType() {
    }

    public ActionType(int idactiontype, String typelibelle) {
        this.idactiontype = idactiontype;
        this.typelibelle = typelibelle;
    }

  

    @Override
    public String toString() {
        return "ActionType{" + "typelibelle=" + typelibelle + '}';
    }
}
