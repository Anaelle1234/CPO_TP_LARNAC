/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mapremiereinterfacegraphique;

/**
 *
 * @author Anaëlle
 */
public class fenetre_principale extends javax.swing.JFrame {

    /**
     * Creates new form fenetre_principale
     */
    public fenetre_principale() {
        initComponents();
        jLabel2.setVisible(false);
        deniro.setVisible(false);
        dicaprio.setVisible(false);
        choix.setVisible(false);
        hanks.setVisible(false);
        Marion_Cotillard.setVisible(false);
        jButton1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrerprenom = new javax.swing.JLabel();
        Valider = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        texte_bonjour = new javax.swing.JLabel();
        deniro = new javax.swing.JCheckBox();
        dicaprio = new javax.swing.JCheckBox();
        Marion_Cotillard = new javax.swing.JCheckBox();
        hanks = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        choix = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entrerprenom.setText("Entrer votre prenom");

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        jLabel1.setText("Bonjour ! Bienvenue dans le vote!");

        texte_bonjour.setText("Bonjour!");

        deniro.setText("Robert De Niro");
        deniro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deniroActionPerformed(evt);
            }
        });

        dicaprio.setText("Léonardo Dicaprio");
        dicaprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dicaprioActionPerformed(evt);
            }
        });

        Marion_Cotillard.setText("Marion Cotillard");
        Marion_Cotillard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marion_CotillardActionPerformed(evt);
            }
        });

        hanks.setText("Tom Hanks");
        hanks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanksActionPerformed(evt);
            }
        });

        jLabel2.setText("Votez pour l'acteur de l'année :");

        choix.setText("Vous avez choisi :");

        jButton1.setText("Valider votre choix");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Marion_Cotillard, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dicaprio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrerprenom)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texte_bonjour)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Valider)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deniro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hanks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(choix)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrerprenom)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valider))
                .addGap(18, 18, 18)
                .addComponent(texte_bonjour)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marion_Cotillard)
                    .addComponent(deniro))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dicaprio)
                    .addComponent(hanks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(choix)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
texte_bonjour.setText("hello!");
String NomUser = jTextField1.getText();
texte_bonjour.setText("Welcome "+ NomUser);
        // TODO add your handling code here:
        jButton1.setVisible(true);
        deniro.setVisible(true);
        Marion_Cotillard.setVisible(true);
        hanks.setVisible(true);
        dicaprio.setVisible(true);
        jLabel2.setVisible(true);
        
    }//GEN-LAST:event_ValiderActionPerformed

    private void Marion_CotillardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marion_CotillardActionPerformed
        // TODO add your handling code here:
        Marion_Cotillard.setVisible(true);
        Marion_Cotillard.setSelected(true);
    }//GEN-LAST:event_Marion_CotillardActionPerformed

    private void deniroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deniroActionPerformed
deniro.setVisible(true);
        deniro.setSelected(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_deniroActionPerformed

    private void hanksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanksActionPerformed
hanks.setVisible(true);
        hanks.setSelected(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_hanksActionPerformed

    private void dicaprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dicaprioActionPerformed
dicaprio.setVisible(true);
dicaprio.setSelected(true);
    
        };
        // TODO add your handling code here:
    }//GEN-LAST:event_dicaprioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
choix.setVisible(true);
choix.setText("Vous avez choisi : ..."+ rep);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetre_principale().setVisible(true);
            }
        });
        System.out.println("bonjour");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Marion_Cotillard;
    private javax.swing.JButton Valider;
    private javax.swing.JLabel choix;
    private javax.swing.JCheckBox deniro;
    private javax.swing.JCheckBox dicaprio;
    private javax.swing.JLabel entrerprenom;
    private javax.swing.JCheckBox hanks;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel texte_bonjour;
    // End of variables declaration//GEN-END:variables
}
