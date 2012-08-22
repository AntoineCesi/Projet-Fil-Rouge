/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.vue;

import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import projetrf.data.*;
import projetrf.model.*;

/**
 *
 * @author plepelletier
 */
public class VueInterlocuteur extends javax.swing.JFrame {

    /**
     * Creates new form VueInterlocuteur
     */
    public VueInterlocuteur() {
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

        jLabelClient = new javax.swing.JLabel();
        jLabelClientNom = new javax.swing.JLabel();
        jButtonClientAjouter = new javax.swing.JButton();
        jLabelClientPrenom = new javax.swing.JLabel();
        jLabelClientEmail = new javax.swing.JLabel();
        jLabelClientCP = new javax.swing.JLabel();
        jTextFieldClientPrenom = new javax.swing.JTextField();
        jTextFieldClientEmail = new javax.swing.JTextField();
        jTextFieldClientCP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxInterlocuteurVille = new javax.swing.JComboBox();
        jLabelClientNom1 = new javax.swing.JLabel();
        jTextFieldClientNom = new javax.swing.JTextField();
        jLabelInterlocuteurcommrcial = new javax.swing.JLabel();
        jLabelClientEmail1 = new javax.swing.JLabel();
        jTextFieldVilleRecherche = new javax.swing.JTextField();
        jComboBoxInterlocuteurCommercial = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxInterlocuteurService = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelClient.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClient.setText("Interlocuteur");

        jLabelClientNom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelClientNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClientNom.setText("Création Interlocuteur");

        jButtonClientAjouter.setText("Ajouter");
        jButtonClientAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClientAjouterMouseClicked(evt);
            }
        });
        jButtonClientAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientAjouterActionPerformed(evt);
            }
        });

        jLabelClientPrenom.setText("Prénom");

        jLabelClientEmail.setText("Email : ");

        jLabelClientCP.setText(" Code Postal");

        jLabel1.setText("Ville : ");

        jLabelClientNom1.setText("Nom");

        jLabelInterlocuteurcommrcial.setText("Commercial");

        jLabelClientEmail1.setText("Ville");

        jTextFieldVilleRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldVilleRechercheKeyPressed(evt);
            }
        });

        jLabel2.setText("Service");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxInterlocuteurCommercial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClientAjouter)
                            .addComponent(jComboBoxInterlocuteurService, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelClientEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jTextFieldVilleRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelClientNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelClientPrenom)
                                            .addComponent(jLabelClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldClientPrenom, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldClientNom, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelClientNom, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelInterlocuteurcommrcial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelClientCP)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldClientCP, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxInterlocuteurVille, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelClient)
                .addGap(38, 38, 38)
                .addComponent(jLabelClientNom)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientNom1)
                    .addComponent(jTextFieldClientNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientPrenom)
                    .addComponent(jTextFieldClientPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientEmail)
                    .addComponent(jTextFieldClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientEmail1)
                    .addComponent(jTextFieldVilleRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientCP)
                    .addComponent(jTextFieldClientCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxInterlocuteurVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInterlocuteurcommrcial, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxInterlocuteurCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButtonClientAjouter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxInterlocuteurService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClientAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientAjouterActionPerformed

    }//GEN-LAST:event_jButtonClientAjouterActionPerformed

    private void jButtonClientAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClientAjouterMouseClicked
       
        
        String nom= jTextFieldClientNom.getText();
        String prenom= jTextFieldClientPrenom.getText();
        String email= jTextFieldClientEmail.getText();
        Ville ville= (Ville) jComboBoxInterlocuteurVille.getSelectedItem();
         Commercial commercial= (Commercial) jComboBoxInterlocuteurCommercial.getSelectedItem();
           Service service= (Service) jComboBoxInterlocuteurService.getSelectedItem();
         
        int id_ville=ville.getIdville();
        int id_commercial =commercial.getIdCommercial();
        int id_service =service.getIdservice();
        try {
            RequetesInterlocuteur.insertInterlocuteur(id_commercial, id_ville, id_service, nom, prenom, email);
         
            
        } catch (SQLException ex) {
            Logger.getLogger(VueInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Mise à jour interlocuteur "," Erreur ", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jButtonClientAjouterMouseClicked

    private void jTextFieldVilleRechercheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVilleRechercheKeyPressed
        
        try {
            List<projetrf.model.Ville> vv1 = RequetesVille.selectVilleByName(jTextFieldVilleRecherche.getText());

            jComboBoxInterlocuteurVille.removeAllItems();
            for (Ville ville : vv1) {
                jComboBoxInterlocuteurVille.addItem(ville);
            }
          
             List<projetrf.model.Commercial> comm = RequetesCommercial.selectCommercial();   
            
            jComboBoxInterlocuteurCommercial.removeAllItems();
            for (Commercial commercial : comm) {               
                jComboBoxInterlocuteurCommercial.addItem(commercial);
               
            }
              List<projetrf.model.Service> service = RequetesService.selectService();   
            
            jComboBoxInterlocuteurService.removeAllItems();
            for (Service commercial : service) {               
                jComboBoxInterlocuteurService.addItem(commercial);
               
            }
           
            
            Ville ville = ((Ville) this.jComboBoxInterlocuteurVille.getSelectedItem());
            jTextFieldClientCP.setText(ville.getCp());
            
            } catch (SQLException ex) {
            Logger.getLogger(VueInterlocuteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldVilleRechercheKeyPressed

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
            java.util.logging.Logger.getLogger(VueInterlocuteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueInterlocuteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueInterlocuteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueInterlocuteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VueInterlocuteur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientAjouter;
    private javax.swing.JComboBox jComboBoxInterlocuteurCommercial;
    private javax.swing.JComboBox jComboBoxInterlocuteurService;
    private javax.swing.JComboBox jComboBoxInterlocuteurVille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClient;
    private javax.swing.JLabel jLabelClientCP;
    private javax.swing.JLabel jLabelClientEmail;
    private javax.swing.JLabel jLabelClientEmail1;
    private javax.swing.JLabel jLabelClientNom;
    private javax.swing.JLabel jLabelClientNom1;
    private javax.swing.JLabel jLabelClientPrenom;
    private javax.swing.JLabel jLabelInterlocuteurcommrcial;
    private javax.swing.JTextField jTextFieldClientCP;
    private javax.swing.JTextField jTextFieldClientEmail;
    private javax.swing.JTextField jTextFieldClientNom;
    private javax.swing.JTextField jTextFieldClientPrenom;
    private javax.swing.JTextField jTextFieldVilleRecherche;
    // End of variables declaration//GEN-END:variables
}
