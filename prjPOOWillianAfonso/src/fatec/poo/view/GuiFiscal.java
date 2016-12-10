package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoFiscal;
import fatec.poo.model.Fiscal;
import fatec.poo.model.ValidaCPF;
import javax.swing.JOptionPane;

/**
 *
 * @author arrud
 */
public class GuiFiscal extends javax.swing.JFrame {

    public GuiFiscal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        ftxtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLocal = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Fiscal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCodigo.setText("Código");

        lblCpf.setText("CPF");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereço");

        lblTelefone.setText("Telefone");

        lblEmail.setText("E-mail");

        lblLocal.setText("Local");

        try {
            ftxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpf.setEnabled(false);

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtEmail.setEnabled(false);

        txtLocal.setEnabled(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
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

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblEndereco)
                            .addComponent(lblNome)
                            .addComponent(lblCpf)
                            .addComponent(lblEmail)
                            .addComponent(lblLocal)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtTelefone)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addComponent(ftxtCpf)
                            .addComponent(txtLocal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("willian", "will1003");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoFiscal = new DaoFiscal(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        fiscal = null;
        fiscal = daoFiscal.consultar(txtCodigo.getText());

        if (fiscal == null) {
            txtCodigo.setEnabled(false);
            ftxtCpf.setEnabled(true);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtEmail.setEnabled(true);
            txtLocal.setEnabled(true);
            ftxtCpf.requestFocus();

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else {

            ftxtCpf.setText(fiscal.getCPF());
            txtNome.setText(fiscal.getNome());
            txtEndereco.setText(fiscal.getEndereco());
            txtTelefone.setText(fiscal.getTelefone());
            txtEmail.setText(fiscal.getEmail());
            txtLocal.setText(fiscal.getLocal());

            txtCodigo.setEnabled(false);
            ftxtCpf.setEnabled(true);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtEmail.setEnabled(true);
            txtLocal.setEnabled(true);
            ftxtCpf.requestFocus();

            btnConsultar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        fiscal = new Fiscal(txtCodigo.getText(), ftxtCpf.getText(), txtNome.getText(), txtEndereco.getText());
        fiscal.setTelefone(txtTelefone.getText());
        fiscal.setEmail(txtEmail.getText());
        fiscal.setLocal(txtLocal.getText());
        fiscal.removerCaracteres();

        if (ValidaCPF.isValidSsn(fiscal.getCPF())) {
            daoFiscal.inserir(fiscal);

            txtCodigo.setText("");
            ftxtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
            txtLocal.setText("");

            txtCodigo.setEnabled(true);
            ftxtCpf.setEnabled(false);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtEmail.setEnabled(false);
            txtLocal.setEnabled(false);
            txtCodigo.requestFocus();

            btnIncluir.setEnabled(false);
            btnConsultar.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido", "Aviso", JOptionPane.ERROR_MESSAGE);
            ftxtCpf.setText("");
            ftxtCpf.requestFocus();
        }


    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {//Sim
            fiscal = new Fiscal(txtCodigo.getText(), ftxtCpf.getText(), txtNome.getText(), txtEndereco.getText());
            fiscal.setTelefone(txtTelefone.getText());
            fiscal.setEmail(txtEmail.getText());
            fiscal.setLocal(txtLocal.getText());
            fiscal.removerCaracteres();

            if (ValidaCPF.isValidSsn(fiscal.getCPF())) {

                daoFiscal.alterar(fiscal);

                txtCodigo.setText("");
                ftxtCpf.setText("");
                txtNome.setText("");
                txtEndereco.setText("");
                txtTelefone.setText("");
                txtEmail.setText("");
                txtLocal.setText("");

                txtCodigo.setEnabled(true);
                ftxtCpf.setEnabled(false);
                txtNome.setEnabled(false);
                txtEndereco.setEnabled(false);
                txtTelefone.setEnabled(false);
                txtEmail.setEnabled(false);
                txtLocal.setEnabled(false);
                txtCodigo.requestFocus();

                btnIncluir.setEnabled(false);
                btnConsultar.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "CPF inválido", "Aviso", JOptionPane.ERROR_MESSAGE);
                ftxtCpf.requestFocus();
            }

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoFiscal.excluir(fiscal);

            txtCodigo.setText("");
            ftxtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
            txtLocal.setText("");

            txtCodigo.setEnabled(true);
            ftxtCpf.setEnabled(false);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtEmail.setEnabled(false);
            txtLocal.setEnabled(false);
            txtCodigo.requestFocus();

            btnIncluir.setEnabled(false);
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFiscal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField ftxtCpf;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoFiscal daoFiscal = null;
    private Fiscal fiscal = null;
    private Conexao conexao = null;

}
