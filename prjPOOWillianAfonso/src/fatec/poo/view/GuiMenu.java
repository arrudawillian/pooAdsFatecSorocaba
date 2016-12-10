package fatec.poo.view;

/**
 *
 * @author arrud
 */
public class GuiMenu extends javax.swing.JFrame {

    public GuiMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAlocarFiscal = new javax.swing.JMenuItem();
        jMenuItemCandidato = new javax.swing.JMenuItem();
        jMenuItemConcurso = new javax.swing.JMenuItem();
        jMenuItemFiscal = new javax.swing.JMenuItem();
        jMenuItemMontarProva = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Concursos");

        jMenuCadastro.setText("Cadastro");

        jMenuItemAlocarFiscal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAlocarFiscal.setText("Alocar Fiscal");
        jMenuItemAlocarFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlocarFiscalActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAlocarFiscal);

        jMenuItemCandidato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCandidato.setText("Candidato");
        jMenuItemCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCandidatoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCandidato);

        jMenuItemConcurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConcurso.setText("Concurso");
        jMenuItemConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConcursoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemConcurso);

        jMenuItemFiscal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFiscal.setText("Fiscal");
        jMenuItemFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFiscalActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFiscal);

        jMenuItemMontarProva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMontarProva.setText("Montar Prova");
        jMenuItemMontarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMontarProvaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMontarProva);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFiscalActionPerformed
        new GuiFiscal().setVisible(true);
    }//GEN-LAST:event_jMenuItemFiscalActionPerformed

    private void jMenuItemCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCandidatoActionPerformed
        new GuiCandidato().setVisible(true);
    }//GEN-LAST:event_jMenuItemCandidatoActionPerformed

    private void jMenuItemMontarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMontarProvaActionPerformed
        new GuiMontarProva().setVisible(true);
    }//GEN-LAST:event_jMenuItemMontarProvaActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConcursoActionPerformed
        new GuiConcurso().setVisible(true);
    }//GEN-LAST:event_jMenuItemConcursoActionPerformed

    private void jMenuItemAlocarFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlocarFiscalActionPerformed
        new GuiAlocarFiscal().setVisible(true);
    }//GEN-LAST:event_jMenuItemAlocarFiscalActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAlocarFiscal;
    private javax.swing.JMenuItem jMenuItemCandidato;
    private javax.swing.JMenuItem jMenuItemConcurso;
    private javax.swing.JMenuItem jMenuItemFiscal;
    private javax.swing.JMenuItem jMenuItemMontarProva;
    private javax.swing.JMenuItem jMenuItemSair;
    // End of variables declaration//GEN-END:variables
}
