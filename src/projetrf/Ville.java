/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf;

/**ID_VILLE                   
   ID_PAYS       
   VINOM       
   VICP        
 *
 * @author plepelletier
 */
public class Ville {
    
    private int idville;
    private int idpays;
    private String nom;
    private String cp;

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getIdpays() {
        return idpays;
    }

    public void setIdpays(int idpays) {
        this.idpays = idpays;
    }

    public int getIdville() {
        return idville;
    }

    public void setIdville(int idville) {
        this.idville = idville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Ville() {
    }

    public Ville(int idville, int idpays, String nom, String cp) {
        this.idville = idville;
        this.idpays = idpays;
        this.nom = nom;
        this.cp = cp;
    }
    
    
            
}
