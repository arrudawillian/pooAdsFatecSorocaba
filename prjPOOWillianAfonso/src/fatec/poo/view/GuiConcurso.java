package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoConcurso;
import fatec.poo.model.Concurso;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author arrud
 */
public class GuiConcurso extends javax.swing.JFrame {

    public GuiConcurso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        lblSigla = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblDataRealizacao = new javax.swing.JLabel();
        lblTaxaInscricao = new javax.swing.JLabel();
        txtSigla = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtTaxaInscricao = new javax.swing.JTextField();
        txtDataRealizacao = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Concurso");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblSigla.setText("Sigla");

        lblDescricao.setText("Descrição");

        lblDataRealizacao.setText("Data Realização");

        lblTaxaInscricao.setText("Taxa Inscrição");

        txtDescricao.setEnabled(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtTaxaInscricao.setEnabled(false);

        txtDataRealizacao.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTaxaInscricao)
                            .addComponent(lblDataRealizacao)
                            .addComponent(lblDescricao)
                            .addComponent(lblSigla))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTaxaInscricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(txtDataRealizacao, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSigla)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataRealizacao)
                    .addComponent(txtDataRealizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaxaInscricao)
                    .addComponent(txtTaxaInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        concurso = null;
        concurso = daoConcurso.consultar(toUpperCase(txtSigla.getText()));

        if (concurso == null) {
            txtSigla.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtDataRealizacao.setEnabled(true);
            txtTaxaInscricao.setEnabled(true);
            txtDescricao.requestFocus();

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);

        } else {
            txtDescricao.setText(concurso.getDescricao());
            txtDataRealizacao.setText(concurso.getDataRealizacao());
            txtTaxaInscricao.setText(String.valueOf(concurso.getTaxaInscricao()));

            txtSigla.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtDataRealizacao.setEnabled(true);
            txtTaxaInscricao.setEnabled(true);
            txtDescricao.requestFocus();

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        concurso = new Concurso(txtSigla.getText(), txtDescricao.getText(), txtDataRealizacao.getText());
        concurso.setTaxaInscricao(Double.parseDouble(txtTaxaInscricao.getText()));

        daoConcurso.inserir(concurso);

        txtSigla.setText("");
        txtDescricao.setText("");
        txtDataRealizacao.setText("");
        txtTaxaInscricao.setText("");
        txtSigla.requestFocus();
        
        txtSigla.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtDataRealizacao.setEnabled(false);
        txtTaxaInscricao.setEnabled(false);

        btnIncluir.setEnabled(false);
        btnConsultar.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            concurso = new Concurso(txtSigla.getText(), txtDescricao.getText(), txtDataRealizacao.getText());
            concurso.setTaxaInscricao(Double.parseDouble(txtTaxaInscricao.getText()));

            daoConcurso.alterar(concurso);

            txtSigla.setText("");
            txtDescricao.setText("");
            txtDataRealizacao.setText("");
            txtTaxaInscricao.setText("");
            txtSigla.requestFocus();
            
            txtSigla.setEnabled(true);
            txtDescricao.setEnabled(false);
            txtDataRealizacao.setEnabled(false);
            txtTaxaInscricao.setEnabled(false);

            btnIncluir.setEnabled(false);
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoConcurso.excluir(concurso);
            
            txtSigla.setText("");
            txtDescricao.setText("");
            txtDataRealizacao.setText("");
            txtTaxaInscricao.setText("");
            
            txtSigla.setEnabled(true);
            txtDescricao.setEnabled(false);
            txtDataRealizacao.setEnabled(false);
            txtTaxaInscricao.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("willian", "will1003");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoConcurso = new DaoConcurso(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(GuiConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiConcurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblDataRealizacao;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblSigla;
    private javax.swing.JLabel lblTaxaInscricao;
    private javax.swing.JTextField txtDataRealizacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtSigla;
    private javax.swing.JTextField txtTaxaInscricao;
    // End of variables declaration//GEN-END:variables
private DaoConcurso daoConcurso = null;
    private Concurso concurso = null;
    private Conexao conexao = null;

}
