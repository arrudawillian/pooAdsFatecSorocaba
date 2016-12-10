/**
 *
 * @author 0030481523034
 */
public class GuiQuartoHotel1 extends javax.swing.JFrame {
    public GuiQuartoHotel1() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumQuarto = new javax.swing.JLabel();
        lblValDia = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblQtdeDias = new javax.swing.JLabel();
        lblVlHosp = new javax.swing.JLabel();
        lblSituQuarto = new javax.swing.JLabel();
        lblTotalFat = new javax.swing.JLabel();
        txtNumQuarto = new javax.swing.JTextField();
        txtValDia = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtQtdeDias = new javax.swing.JTextField();
        lblSituacao = new javax.swing.JLabel();
        lblFaturamento = new javax.swing.JLabel();
        btnInstanciar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblVlHospedagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gui QUarto Hotel");

        lblNumQuarto.setText("Num. Quarto");

        lblValDia.setText("Valor Diária");

        lblRG.setText("RG");

        lblQtdeDias.setText("Qtde. Dias");

        lblVlHosp.setText("Valor Hospedagem");

        lblSituQuarto.setText("Situação Quarto");

        lblTotalFat.setText("Total Faturado");

        txtRG.setEnabled(false);
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });

        txtQtdeDias.setEnabled(false);

        lblSituacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFaturamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInstanciar.setText("Instanciar");
        btnInstanciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstanciarActionPerformed(evt);
            }
        });

        btnReservar.setText("Reservar");
        btnReservar.setEnabled(false);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblTitulo.setText("HOTEL RECANTO DO SOSSEGO");

        lblVlHospedagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(btnInstanciar)
                .addGap(41, 41, 41)
                .addComponent(btnReservar)
                .addGap(44, 44, 44)
                .addComponent(btnLiberar)
                .addGap(46, 46, 46)
                .addComponent(btnSair)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVlHosp)
                    .addComponent(lblQtdeDias)
                    .addComponent(lblRG)
                    .addComponent(lblValDia)
                    .addComponent(lblNumQuarto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdeDias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVlHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalFat)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(lblSituQuarto)
                                .addComponent(lblSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumQuarto)
                        .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSituQuarto)
                        .addGap(4, 4, 4)
                        .addComponent(lblSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValDia)
                    .addComponent(txtValDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(lblTotalFat)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQtdeDias)
                            .addComponent(txtQtdeDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVlHosp)
                    .addComponent(lblVlHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInstanciar)
                    .addComponent(btnReservar)
                    .addComponent(btnLiberar)
                    .addComponent(btnSair))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        
    }//GEN-LAST:event_txtRGActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        objQuarto.reserva(Integer.parseInt(txtRG.getText()));
        txtRG.setEnabled(false);
        btnReservar.setEnabled(false);
        lblSituacao.setText("Ocupado");
        btnLiberar.setEnabled(true);
        txtQtdeDias.setEnabled(true);
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnInstanciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstanciarActionPerformed
        double val;
        int quarto;
        
        val=(Double.parseDouble(txtValDia.getText()));
        quarto=(Integer.parseInt(txtNumQuarto.getText()));
        objQuarto=new QuartoHotel(quarto,val);
        lblSituacao.setText("Livre");
        btnInstanciar.setEnabled(false);
        txtNumQuarto.setEnabled(false);
        txtValDia.setEnabled(false);
        btnReservar.setEnabled(true);
        txtRG.setEnabled(true);
        lblFaturamento.setText("R$"+ objQuarto.getTotalFaturado());
    }//GEN-LAST:event_btnInstanciarActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        int dias;
        btnLiberar.setEnabled(false);
        txtQtdeDias.setEnabled(false);
        lblVlHospedagem.setText(String.valueOf(objQuarto.liberar(Integer.parseInt(txtQtdeDias.getText()))));
        btnReservar.setEnabled(true);
        txtRG.setEnabled(true);
        lblSituacao.setText("Livre");
        lblFaturamento.setText(String.valueOf(objQuarto.getTotalFaturado()));
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(GuiQuartoHotel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiQuartoHotel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiQuartoHotel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiQuartoHotel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiQuartoHotel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstanciar;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblFaturamento;
    private javax.swing.JLabel lblNumQuarto;
    private javax.swing.JLabel lblQtdeDias;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSituQuarto;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalFat;
    private javax.swing.JLabel lblValDia;
    private javax.swing.JLabel lblVlHosp;
    private javax.swing.JLabel lblVlHospedagem;
    private javax.swing.JTextField txtNumQuarto;
    private javax.swing.JTextField txtQtdeDias;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtValDia;
    // End of variables declaration//GEN-END:variables
    private QuartoHotel objQuarto;
}
