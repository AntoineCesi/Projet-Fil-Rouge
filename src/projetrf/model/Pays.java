/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.model;


/**
 * ID_PAYS PAYS
 *
 * @author plepelletier
 */
public class Pays {

    
    private int idPays;
    private String pays ;

    public int getIdPays() {
        return idPays;
    }

    public void setIdPays(int idPays) {
        this.idPays = idPays;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Pays() {
    }

    public Pays(int idPays, String pays) {
        this.idPays = idPays;
        this.pays = pays;
    }

    
    @Override
    public String toString() {
        return getPays();
    }
  

    

    
}
