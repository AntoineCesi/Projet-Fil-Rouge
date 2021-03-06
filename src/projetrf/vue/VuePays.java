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
import javax.swing.JOptionPane;
import projetrf.data.RequetesCouleur;
import projetrf.data.RequetesPays;
import projetrf.model.Pays;

/**
 *
 * @author Travail
 */
public class VuePays extends javax.swing.JFrame {

    /**
     * Creates new form VuePays
     */
    public VuePays() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabelTitre = new javax.swing.JLabel();
        jTextFieldPays = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonPaysValider = new javax.swing.JButton();
        jComboBoxPays = new javax.swing.JComboBox();
        jLabelPaysMessage = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Pays");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelTitre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitre.setText("Gestion  Pays");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Pays :");

        jButtonPaysValider.setText("Valider");
        jButtonPaysValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonPaysValiderMousePressed(evt);
            }
        });
        jButtonPaysValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaysValiderActionPerformed(evt);
            }
        });

        jComboBoxPays.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPaysItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPaysValider))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldPays)
                        .addComponent(jLabelTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxPays, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelPaysMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabelTitre)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabelPaysMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addComponent(jButtonPaysValider)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPaysValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaysValiderActionPerformed
     
    }//GEN-LAST:event_jButtonPaysValiderActionPerformed

    private void jButtonPaysValiderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPaysValiderMousePressed
        
        if (this.jButtonPaysValider.getText().equals("Valider")) {
            try {
                RequetesPays.insertPays(jTextFieldPays.getText().toUpperCase());
            } catch (SQLException ex) {
                if (ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(this, "Ce Pays existe déjà", " Erreur ", JOptionPane.ERROR_MESSAGE);
                }
                Logger.getLogger(VuePays.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

      else  {
            try {
                RequetesPays.updatePays(((Pays) this.jComboBoxPays.getSelectedItem()).getIdPays(), jTextFieldPays.getText().toUpperCase());
            } catch (SQLException ex) {
                if (ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(this, "Ce Pays existe déjà", "Erreur ", JOptionPane.ERROR_MESSAGE);
                }
                Logger.getLogger(VuePays.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButtonPaysValiderMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            
         Pays paysVide = new Pays(-1,"");
        this.jComboBoxPays.addItem(paysVide);
        
        try {
            List<Pays> pp1 = RequetesPays.selectPays();
            for (Pays pays : pp1) {
                
                jComboBoxPays.addItem(pays);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VueVille.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxPaysItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPaysItemStateChanged
        
         if (evt.getStateChange() == ItemEvent.SELECTED){
            String test = ((Pays)this.jComboBoxPays.getSelectedItem()).getPays();            
           
            this.jTextFieldPays.setText(test);
            if (this.jComboBoxPays.getSelectedIndex()!=0){
                this.jLabelPaysMessage.setText("Modifiez le pays : ");
                this.jButtonPaysValider.setText("Modifier");
            }
            else{
                this.jLabelPaysMessage.setText("Entrez un nouveau Pays : ");
                this.jButtonPaysValider.setText("Valider");
            }
        }
    }//GEN-LAST:event_jComboBoxPaysItemStateChanged

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
            java.util.logging.Logger.getLogger(VuePays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VuePays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VuePays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VuePays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VuePays().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPaysValider;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBoxPays;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPaysMessage;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JTextField jTextFieldPays;
    // End of variables declaration//GEN-END:variables
}
