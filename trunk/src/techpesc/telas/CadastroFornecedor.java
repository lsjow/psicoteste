/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.telas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import techpesc.fornecedor.Fornecedor;
import techpesc.fornecedor.FornecedorDAO;
import techpesc.fornecedor.FornecedorRN;
import techpesc.fornecedor.FornecedorTableModel;
import techpesc.funcionario.Funcionario;
import techpesc.util.Util;

/**
 *
 * @author fatima
 */
public class CadastroFornecedor extends javax.swing.JDialog {

    Fornecedor fornecedor;
    FornecedorDAO fornecedorDAO = new FornecedorDAO();
    FornecedorRN fornecedorRN = new FornecedorRN();

    /**
     * Creates new form Cadastro_de_Funcionário
     */
    public CadastroFornecedor() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/techpesc/imagens/peixe.png")).getImage());
        limparCampos();
        setModal(true);
        tfNomeCompleto.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir3 = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        tfCNPJ = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        tfNomeCompleto = new javax.swing.JTextField();
        tfContato = new javax.swing.JFormattedTextField();
        jcProduto = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(23, 49, 106));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/cabeçalho1.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Fornecedor");

        jPanel2.setBackground(new java.awt.Color(23, 49, 106));

        btPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/pesquisa.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setToolTipText("");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btVoltarMenu.setForeground(new java.awt.Color(255, 255, 255));
        btVoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/voltar.png"))); // NOI18N
        btVoltarMenu.setText("Voltar");
        btVoltarMenu.setToolTipText("");
        btVoltarMenu.setContentAreaFilled(false);
        btVoltarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltarMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltarMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btExcluir3.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/excluir2.png"))); // NOI18N
        btExcluir3.setText("Excluir");
        btExcluir3.setToolTipText("");
        btExcluir3.setContentAreaFilled(false);
        btExcluir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir3.setPreferredSize(new java.awt.Dimension(57, 35));
        btExcluir3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir3ActionPerformed(evt);
            }
        });

        btSalvar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar1.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/novo.png"))); // NOI18N
        btSalvar1.setText("Novo");
        btSalvar1.setToolTipText("");
        btSalvar1.setContentAreaFilled(false);
        btSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btVoltarMenu)
                .addGap(174, 174, 174)
                .addComponent(btSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btVoltarMenu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );

        try {
            tfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCNPJ.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCNPJFocusLost(evt);
            }
        });
        tfCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCNPJActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Produto.:");

        jLabel42.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Contato .:");

        jLabel43.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("CNPJ .:");

        jLabel44.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Nome da Empresa .:");

        tfNomeCompleto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCompletoActionPerformed(evt);
            }
        });

        try {
            tfContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfContato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfContatoFocusLost(evt);
            }
        });

        jcProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Alevino", "Ração", "Alevino/Ração", "Malha", "Medicamentos", "Outros" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel49))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jcProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Fornecedor> lista;
        FornecedorDAO dao = new FornecedorDAO();
        lista = (dao.listar());
        FornecedorTableModel itm = new FornecedorTableModel(lista);
        Object o = TelaConsulta.exibeTela(itm, "Fornecedor");
        if (o != null) {
            fornecedor = fornecedorRN.pesquisarCodigo(Short.valueOf(String.valueOf(o)));
            tfNomeCompleto.setText(fornecedor.getNomeFornecedor());
            tfCNPJ.setText((fornecedor.getCnpjFornecedor()));
            tfContato.setText((fornecedor.getContatoFornecedor()));
            jcProduto.setSelectedItem(fornecedor.getProdutoFornecedor());
            btExcluir3.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed


    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (fornecedor == null) {
            fornecedor = new Fornecedor();
        }
        if (Util.chkVazio(tfContato.getText(), tfNomeCompleto.getText(), jcProduto.getSelectedItem().toString()) == true) {
            if (fornecedor.getIdFornecedor() == 0) {
                fornecedor.setNomeFornecedor(tfNomeCompleto.getText());
                fornecedor.setContatoFornecedor((tfContato.getText().replaceAll("\\D", "")));
                fornecedor.setCnpjFornecedor((tfCNPJ.getText().replaceAll("\\D", "")));
                fornecedor.setProdutoFornecedor(jcProduto.getSelectedItem().toString());
                fornecedorDAO.salvar(fornecedor);
                JOptionPane.showMessageDialog(rootPane, "Fornecedor Cadastrado com Sucesso!");
                limparCampos();
            } else {
                fornecedor.setNomeFornecedor(tfNomeCompleto.getText());
                fornecedor.setContatoFornecedor((tfContato.getText().replaceAll("\\D", "")));
                fornecedor.setCnpjFornecedor((tfCNPJ.getText().replaceAll("\\D", "")));
                fornecedor.setProdutoFornecedor(jcProduto.getSelectedItem().toString());
                if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente editar o fornecedor " + fornecedor.getNomeFornecedor()
                        + "?", "TechPesc", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                    fornecedorDAO.salvar(fornecedor);
                    JOptionPane.showMessageDialog(rootPane, "Pronto,  " + fornecedor.getNomeFornecedor()
                            + ", foi editado com sucesso!", "Fornecedor", JOptionPane.INFORMATION_MESSAGE);
                }
                limparCampos();
            }
        }

    }//GEN-LAST:event_btSalvarActionPerformed
    public void limparCampos() {
        tfCNPJ.setText("");
        tfContato.setText("");
        tfNomeCompleto.setText("");
        jcProduto.setSelectedItem("----");
        tfContato.setText("");
        btExcluir3.setEnabled(false);
        fornecedor = null;
    }

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed

        dispose();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void tfNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeCompletoActionPerformed

    private void tfCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCNPJActionPerformed

    private void btExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir3ActionPerformed
        if (fornecedor != null) {
            if (fornecedor.getIdFornecedor() != 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o Fornecedor " + fornecedor.getNomeFornecedor()
                        + "?", "TechPesc", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                    if (fornecedorRN.remove(fornecedor)) {
                        JOptionPane.showMessageDialog(rootPane, "Pronto,  " + fornecedor.getNomeFornecedor()
                                + ", foi excluído com sucesso!", "Fornecedor", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o Funcionario "
                                + fornecedor.getNomeFornecedor(),
                                "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        limparCampos();

    }//GEN-LAST:event_btExcluir3ActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
        limparCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvar1ActionPerformed

    private void tfCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCNPJFocusLost
        if (!Util.validaCNPJ(tfCNPJ.getText().toString().replaceAll("\\D*", ""))) {
            JOptionPane.showMessageDialog(rootPane, "Este CNPJ não é válido, redigite!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            tfCNPJ.setText("");
        }
    }//GEN-LAST:event_tfCNPJFocusLost

    private void tfContatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfContatoFocusLost

    }//GEN-LAST:event_tfContatoFocusLost

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
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir3;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox jcProduto;
    private javax.swing.JFormattedTextField tfCNPJ;
    private javax.swing.JFormattedTextField tfContato;
    private javax.swing.JTextField tfNomeCompleto;
    // End of variables declaration//GEN-END:variables
}
