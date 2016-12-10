package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoConcurso;
import fatec.poo.control.DaoFiscal;
import fatec.poo.model.Concurso;
import fatec.poo.model.Fiscal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author arrud
 */
public class GuiAlocarFiscal extends javax.swing.JFrame {

    public GuiAlocarFiscal() {
        initComponents();
        modTblFiscal = (DefaultTableModel) tblFiscal.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lvlSigla = new javax.swing.JLabel();
        txtSigla = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblNomeFiscal = new javax.swing.JLabel();
        cbxNomeFiscal = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFiscal = new javax.swing.JTable();
        lblDescricao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alocar Fiscal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lvlSigla.setText("Sigla Concurso");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblNomeFiscal.setText("Nome Fiscal");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setEnabled(false);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tblFiscal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFiscal);

        lblDescricao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlSigla)
                    .addComponent(lblNomeFiscal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxNomeFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdicionar, btnPesquisar, btnRemover, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lvlSigla)
                        .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFiscal)
                    .addComponent(cbxNomeFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDescricao, txtSigla});

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
        daoConcurso = new DaoConcurso(conexao.conectar());

        //Preenchimento do combobox com os nomes dos fiscais disponíveis
        //instancia Array de classe fiscal
        ArrayList<Fiscal> fiscais = new ArrayList<Fiscal>();
        //recebe Array de classes de fiscais
        fiscais = daoFiscal.consultarSemConcurso();
        cbxNomeFiscal.removeAllItems();
        cbxNomeFiscal.addItem("Selecione");
        for (int x = 0; x < fiscais.size(); x++) {
            cbxNomeFiscal.addItem(fiscais.get(x).getNome());
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //Apaga linhas da tblFiscal se houver
        while (modTblFiscal.getRowCount() > 0) {
            modTblFiscal.removeRow(0);
        }

        concurso = null;
        //Pesquisar sigla no BD

        concurso = daoConcurso.consultar(toUpperCase(txtSigla.getText()));

        if (concurso == null) {
            JOptionPane.showMessageDialog(null, "Concurso não cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
            txtSigla.setText("");
            lblDescricao.setText("");
            txtSigla.requestFocus();

            btnAdicionar.setEnabled(false);
            btnRemover.setEnabled(false);
        } else {
            //Exibe a descrição do concurso
            lblDescricao.setText(concurso.getDescricao());

            //instancia Array de classe fiscal
            ArrayList<Fiscal> fiscais = new ArrayList<Fiscal>();
            //recebe Array de classes de fiscais
            fiscais = daoFiscal.consultarConcurso(toUpperCase(concurso.getSigla()));

            for (int i = 0; i < fiscais.size(); i++) {
                //Adiciona ponteiros de objetos fiscais no objeto concurso
                concurso.addPessoa(fiscais.get(i));

                //Criar String com codigo, nome e local do objeto atual da Array de objetos fiscais
                String Linha[] = {
                    fiscais.get(i).getCodigo(),
                    fiscais.get(i).getNome(),
                    fiscais.get(i).getLocal()};

                //Adiciona linha na TblFiscal com os dados da String Linha
                modTblFiscal.addRow(Linha);
            }
            //Liberar botões de adicionar e remover
            btnAdicionar.setEnabled(true);
            btnRemover.setEnabled(true);
            tblFiscal.requestFocus();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        fiscal = null;
        fiscal = daoFiscal.consultarNome(toUpperCase(cbxNomeFiscal.getSelectedItem()));

        if (cbxNomeFiscal.getSelectedItem() == "Selecione") {
            JOptionPane.showMessageDialog(null, "Nenhum fiscal selecionado", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {
            //Adiciona ponteiro do objeto fiscal no objeto concurso
            concurso.addPessoa(fiscal);
            //Gravar sigla do concurso na linha do fiscal
            daoFiscal.addCurso(fiscal);

            //Criar String com codigo, nome e local do objeto atual da Array de objetos fiscais
            String Linha[] = {
                fiscal.getCodigo(),
                fiscal.getNome(),
                fiscal.getLocal()
            };

            //Adiciona linha na TblFiscal com os dados da String Linha
            modTblFiscal.addRow(Linha);

            //Preenchimento do combobox com os nomes dos fiscais disponíveis
            //instancia Array de classe fiscal
            ArrayList<Fiscal> fiscais = new ArrayList<Fiscal>();
            //recebe Array de classes de fiscais
            fiscais = daoFiscal.consultarSemConcurso();
            cbxNomeFiscal.removeAllItems();
            cbxNomeFiscal.addItem("Selecione");
            for (int x = 0; x < fiscais.size(); x++) {
                cbxNomeFiscal.addItem(fiscais.get(x).getNome());
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tblFiscal.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum fiscal selecionado", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {
            //Consultar nome obtido na coluna 1 da linha selecionada da tabela
            fiscal = daoFiscal.consultarNome(toUpperCase(tblFiscal.getValueAt(tblFiscal.getSelectedRow(), 1)));
            //atribuir null para o campo sigla na linha do fiscal
            daoFiscal.removeCurso(fiscal);
            //remover linha selecionada
            modTblFiscal.removeRow(tblFiscal.getSelectedRow());

            //Preenchimento do combobox com os nomes dos fiscais disponíveis
            //instancia Array de classe fiscal
            ArrayList<Fiscal> fiscais = new ArrayList<Fiscal>();
            //recebe Array de classes de fiscais
            fiscais = daoFiscal.consultarSemConcurso();
            cbxNomeFiscal.removeAllItems();
            cbxNomeFiscal.addItem("Selecione");
            for (int x = 0; x < fiscais.size(); x++) {
                cbxNomeFiscal.addItem(fiscais.get(x).getNome());
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(GuiAlocarFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAlocarFiscal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxNomeFiscal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNomeFiscal;
    private javax.swing.JLabel lvlSigla;
    private javax.swing.JTable tblFiscal;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
    private DaoFiscal daoFiscal = null;
    private DaoConcurso daoConcurso = null;
    private Conexao conexao = null;
    private Concurso concurso = null;
    private Fiscal fiscal = null;
    private DefaultTableModel modTblFiscal;

}
