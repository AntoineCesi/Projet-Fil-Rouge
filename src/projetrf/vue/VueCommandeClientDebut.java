/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrf.vue;

import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetrf.data.RequetesCommercial;
import projetrf.data.RequetesEntreprise;
import projetrf.data.RequetesInterlocuteur;
import projetrf.data.RequetesService;
import projetrf.model.Commercial;
import projetrf.model.Entreprise;
import projetrf.model.Interlocuteur;
import projetrf.model.Service;

/**
 *
 * @author Travail
 */
 

public class VueCommandeClientDebut extends javax.swing.JFrame {

    /**
     * Creates new form VueCommandeClientDebut
     */
    
    int id_commercial;
    int id_interlocuteur;
    
    public VueCommandeClientDebut() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCmdDate = new javax.swing.JTextField();
        jComboBoxCommandeClientEntreprise = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButtonCommandeClientEntreprise = new javax.swing.JButton();
        jComboBoxCommandeClientCommercial = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCommandeClientInterlocuteur = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("DATE COMMANDE  (JJ/MM/AA)");

        jLabel2.setText("Entreprise");

        jLabel3.setText("Commercial ");

        jComboBoxCommandeClientEntreprise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCommandeClientEntrepriseItemStateChanged(evt);
            }
        });
        jComboBoxCommandeClientEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCommandeClientEntrepriseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("COMMANDE CLIENT");

        jButtonCommandeClientEntreprise.setText("Valider");
        jButtonCommandeClientEntreprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCommandeClientEntrepriseMousePressed(evt);
            }
        });

        jComboBoxCommandeClientCommercial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCommandeClientCommercialItemStateChanged(evt);
            }
        });

        jLabel4.setText("Interlocuteur");

        jComboBoxCommandeClientInterlocuteur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCommandeClientInterlocuteurItemStateChanged(evt);
            }
        });
        jComboBoxCommandeClientInterlocuteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCommandeClientInterlocuteurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 355, Short.MAX_VALUE)
                        .addComponent(jButtonCommandeClientEntreprise))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCmdDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxCommandeClientCommercial, 0, 131, Short.MAX_VALUE)
                                .addComponent(jComboBoxCommandeClientInterlocuteur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBoxCommandeClientEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap(61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCmdDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCommandeClientCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxCommandeClientInterlocuteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCommandeClientEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addComponent(jButtonCommandeClientEntreprise)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCommandeClientEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCommandeClientEntrepriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCommandeClientEntrepriseActionPerformed

        private void jComboBoxCommandeClientEntrepriseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCommandeClientEntrepriseItemStateChanged

           
    }//GEN-LAST:event_jComboBoxCommandeClientEntrepriseItemStateChanged

    private void jButtonCommandeClientEntrepriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCommandeClientEntrepriseMousePressed
       if (!(jTextFieldCmdDate.getText().trim().isEmpty()) )
        {
            
            Entreprise entreprise = (Entreprise) this.jComboBoxCommandeClientEntreprise.getSelectedItem();
            new VueCommandeClient(this.jTextFieldCmdDate.getText(),entreprise.getIdentreprise(),id_interlocuteur, id_commercial ).setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonCommandeClientEntrepriseMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            DateFormat datejour = new SimpleDateFormat("dd/MM/yyyy");
            String monHeure = datejour.format(new Date());
            jTextFieldCmdDate.setText(monHeure);
            
          
            List<Commercial> pp1 = RequetesCommercial.selectCommercial();
               for (Commercial commercial : pp1) {
                   
                   jComboBoxCommandeClientCommercial.addItem(commercial);
               }
               
           /* List<Interlocuteur>   ii = RequetesInterlocuteur.selectInterlocuteur();
              for ( Interlocuteur interlocuteur :ii ){
                  jComboBoxCommandeClientInterlocuteur.addItem(interlocuteur);
              }
                
              List< Entreprise>   ee = RequetesEntreprise.selectEntreprise();
              for ( Entreprise entreprise  :ee ){
                  jComboBoxCommandeClientEntreprise.addItem(entreprise);
              }*/
             
               
        } catch (SQLException ex) {
            Logger.getLogger(VueCommandeClientDebut.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxCommandeClientInterlocuteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCommandeClientInterlocuteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCommandeClientInterlocuteurActionPerformed

    private void jComboBoxCommandeClientCommercialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCommandeClientCommercialItemStateChanged
        try {
            Commercial c = (Commercial)jComboBoxCommandeClientCommercial.getSelectedItem();
            id_commercial =c.getIdCommercial();
            //System.out.print(c.getNom());
            
             this.jComboBoxCommandeClientInterlocuteur.removeAllItems();
                        
           List<Interlocuteur>   ii = RequetesInterlocuteur.selectInterlocuteurByIdCommercial(c.getIdCommercial());
              for ( Interlocuteur interlocuteur :ii ){
                  jComboBoxCommandeClientInterlocuteur.addItem(interlocuteur);
                 // System.out.println(interlocuteur.getIdinterlocuteur());
              }
                       
        
        } catch (SQLException ex) {
            Logger.getLogger(VueCommandeClientDebut.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBoxCommandeClientCommercialItemStateChanged

    private void jComboBoxCommandeClientInterlocuteurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCommandeClientInterlocuteurItemStateChanged
    
        // si changement ou choix interlocuteur
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            Interlocuteur interlocuteur = (Interlocuteur) jComboBoxCommandeClientInterlocuteur.getSelectedItem();
            id_interlocuteur =interlocuteur.getIdinterlocuteur();
            
            
            //System.out.println(interlocuteur.getNom());
            try {

                Service service = RequetesService.SelectServiceById(interlocuteur.getIdservice());
              // System.out.println(service.toString());

                Entreprise entreprise = RequetesEntreprise.SelectEntrepriseById(service.getIdentreprise());

                //System.out.println(entreprise.toString());
                this.jComboBoxCommandeClientEntreprise.removeAllItems();
                this.jComboBoxCommandeClientEntreprise.addItem(entreprise);


            } catch (SQLException ex) {
                Logger.getLogger(VueCommandeClientDebut.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_jComboBoxCommandeClientInterlocuteurItemStateChanged
   
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
            java.util.logging.Logger.getLogger(VueCommandeClientDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueCommandeClientDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueCommandeClientDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueCommandeClientDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VueCommandeClientDebut().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCommandeClientEntreprise;
    private javax.swing.JComboBox jComboBoxCommandeClientCommercial;
    private javax.swing.JComboBox jComboBoxCommandeClientEntreprise;
    private javax.swing.JComboBox jComboBoxCommandeClientInterlocuteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldCmdDate;
    // End of variables declaration//GEN-END:variables
}
