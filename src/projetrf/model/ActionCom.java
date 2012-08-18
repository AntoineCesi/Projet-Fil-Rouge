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
public class ActionCom {
    
    private int idaction;
    private int idactiontype;
    private int idutilisateur;
    private Date dateaction;
    private String actioncommercial;

    public String getActioncommercial() {
        return actioncommercial;
    }

    public void setActioncommercial(String actioncommercial) {
        this.actioncommercial = actioncommercial;
    }

    public Date getDateaction() {
        return dateaction;
    }

    public void setDateaction(Date dateaction) {
        this.dateaction = dateaction;
    }

    public int getIdaction() {
        return idaction;
    }

    public void setIdaction(int idaction) {
        this.idaction = idaction;
    }

    public int getIdactiontype() {
        return idactiontype;
    }

    public void setIdactiontype(int idactiontype) {
        this.idactiontype = idactiontype;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public ActionCom() {
    }

    public ActionCom(int idaction, int idactiontype, int idutilisateur, Date dateaction, String actioncommercial) {
        this.idaction = idaction;
        this.idactiontype = idactiontype;
        this.idutilisateur = idutilisateur;
        this.dateaction = dateaction;
        this.actioncommercial = actioncommercial;
    }

    @Override
    public String toString() {
        return "ActionCom{" + "actioncommercial=" + actioncommercial + '}';
    }
    
    
    
}
