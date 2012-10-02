/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.controleur;

import java.awt.Component;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import projetrf.data.RequetesPays;
import projetrf.data.RequetesVille;

/**
 *
 * @author Travail
 */
public abstract class Main1  {
    
    int retour;

    public int creationpays(int idpays, String nom, String cp) {

        retour = 0;
        try {
            RequetesVille.insertVille(idpays, nom, cp);

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                //error nom de ville deja dans le fichier
                retour = 1062;
            } else {
                Logger.getLogger(RequetesVille.class.getName()).log(Level.SEVERE, null, ex);
                retour = 2000;
            }
        }
        return retour;
    }
  
    
}
