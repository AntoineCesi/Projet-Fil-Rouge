/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.vue;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetrf.data.RequetesFonction;
import projetrf.data.RequetesInterlocuteur;
import projetrf.data.RequetesUtilisateur;
import projetrf.data.RequetesVille;
import projetrf.model.Fonction;
import projetrf.model.Ville;

/**
 *
 * @author plepelletier
 */
public class VueUtilisateur extends javax.swing.JFrame {

    /**
     * Creates new form VueClient
     */
    public VueUtilisateur() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUtilisateurNom = new javax.swing.JLabel();
        jTextFieldUtilisateurNom = new javax.swing.JTextField();
        jLabelUtilisateurPrenom = new javax.swing.JLabel();
        jLabelUtilisateurIdentifiant = new javax.swing.JLabel();
        jTextFieldUtilisateurPrenom = new javax.swing.JTextField();
        jTextFieldUtilisateurIdentifiant = new javax.swing.JTextField();
        jLabelUtilisateurFonction = new javax.swing.JLabel();
        jLabelUtilisateurVille = new javax.swing.JLabel();
        jComboBoxFonction = new javax.swing.JComboBox();
        jComboBoxUtilisateurVille = new javax.swing.JComboBox();
        jButtonUtilisateurValide = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUtilisateurPassword = new javax.swing.JTextField();
        jTextFieldUtilisateurRecherche = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Utilisateur");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setName("Utilisateur");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelUtilisateurNom.setText("Nom");

        jLabelUtilisateurPrenom.setText("Prenom");

        jLabelUtilisateurIdentifiant.setText("Identifiant");

        jLabelUtilisateurFonction.setText("Fonction");

        jLabelUtilisateurVille.setText("Ville");

        jComboBoxFonction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxFonction.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFonctionItemStateChanged(evt);
            }
        });

        jComboBoxUtilisateurVille.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUtilisateurVilleItemStateChanged(evt);
            }
        });

        jButtonUtilisateurValide.setText("Valider");
        jButtonUtilisateurValide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUtilisateurValideMouseClicked(evt);
            }
        });

        jLabel1.setText("Password");

        jTextFieldUtilisateurRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUtilisateurRechercheKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("UTILISATEUR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButtonUtilisateurValide)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUtilisateurVille)
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldUtilisateurRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jComboBoxUtilisateurVille, 0, 220, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUtilisateurIdentifiant)
                            .addComponent(jLabelUtilisateurPrenom)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUtilisateurFonction)
                            .addComponent(jLabelUtilisateurNom))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxFonction, javax.swing.GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE)
                            .addComponent(jTextFieldUtilisateurPassword)
                            .addComponent(jTextFieldUtilisateurIdentifiant, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUtilisateurPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUtilisateurNom)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateurNom)
                    .addComponent(jTextFieldUtilisateurNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateurPrenom)
                    .addComponent(jTextFieldUtilisateurPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateurIdentifiant)
                    .addComponent(jTextFieldUtilisateurIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUtilisateurPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateurFonction)
                    .addComponent(jComboBoxFonction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateurVille)
                    .addComponent(jComboBoxUtilisateurVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUtilisateurRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonUtilisateurValide)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUtilisateurValideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUtilisateurValideMouseClicked
       
     
        String nom = jTextFieldUtilisateurNom.getText();
        String prenom = jTextFieldUtilisateurPrenom.getText();
        String identifiant = jTextFieldUtilisateurIdentifiant.getText();
        String password = jTextFieldUtilisateurPassword.getText();

        int idfonction = ((Fonction) this.jComboBoxFonction.getSelectedItem()).getIdfonction();
        int idville = ((Ville) this.jComboBoxUtilisateurVille.getSelectedItem()).getIdville();
        try {
            RequetesUtilisateur.insertUtilisateur(idfonction, idville, nom, prenom, identifiant, password);
        } catch (SQLException ex) {
            Logger.getLogger(VueUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }

         
    }//GEN-LAST:event_jButtonUtilisateurValideMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //ouverture windows chargement combobox fonction
        
        List<projetrf.model.Fonction> vv1 = null;
        try {
            vv1 = RequetesFonction.selectFonction();
        } catch (SQLException ex) {
            Logger.getLogger(VueUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        jComboBoxFonction.removeAllItems();
        for (Fonction ville : vv1) {
            jComboBoxFonction.addItem(ville);}
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxUtilisateurVilleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUtilisateurVilleItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUtilisateurVilleItemStateChanged

    private void jTextFieldUtilisateurRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUtilisateurRechercheKeyReleased
       
          try {
          
            List<projetrf.model.Ville> vv1 = RequetesVille.rechercheVilleByCp(jTextFieldUtilisateurRecherche.getText());
           
            jComboBoxUtilisateurVille.removeAllItems();
            for (Ville ville : vv1) {               
                jComboBoxUtilisateurVille.addItem(ville);
               
            }
         

        } catch (SQLException ex) {
            Logger.getLogger(VueVille.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldUtilisateurRechercheKeyReleased

    private void jComboBoxFonctionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFonctionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFonctionItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VueUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VueUtilisateur().setVisible(true);
                     
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUtilisateurValide;
    private javax.swing.JComboBox jComboBoxFonction;
    private javax.swing.JComboBox jComboBoxUtilisateurVille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelUtilisateurFonction;
    private javax.swing.JLabel jLabelUtilisateurIdentifiant;
    private javax.swing.JLabel jLabelUtilisateurNom;
    private javax.swing.JLabel jLabelUtilisateurPrenom;
    private javax.swing.JLabel jLabelUtilisateurVille;
    private javax.swing.JTextField jTextFieldUtilisateurIdentifiant;
    private javax.swing.JTextField jTextFieldUtilisateurNom;
    private javax.swing.JTextField jTextFieldUtilisateurPassword;
    private javax.swing.JTextField jTextFieldUtilisateurPrenom;
    private javax.swing.JTextField jTextFieldUtilisateurRecherche;
    // End of variables declaration//GEN-END:variables
}
