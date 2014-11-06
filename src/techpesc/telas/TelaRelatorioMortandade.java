/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.telas;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import static org.xhtmlrenderer.util.Uu.p;
import sun.java2d.pipe.SpanShapeRenderer;
import techpesc.funcionario.Funcionario;
import techpesc.funcionario.FuncionarioDAO;
import techpesc.funcionario.FuncionarioRN;
import techpesc.funcionario.FuncionarioTableModel;
import techpesc.lote.Lote;
import techpesc.lote.LoteDAO;
import techpesc.util.ConnectionFactory;
import techpesc.util.Util;

/**
 *
 * @author fatima
 */
public class TelaRelatorioMortandade extends javax.swing.JDialog {

    LoteDAO loteDAO = new LoteDAO();

    /**
     * Creates new form Cadastro_de_Funcionário
     */
    public TelaRelatorioMortandade() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/techpesc/imagens/peixe.png")).getImage());
        setModal(true);

        for (int i = 0; i < loteDAO.listar().size(); i++) {
            jcTutorial.addItem(loteDAO.listar().get(i).getNomeLote());
        }
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
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcTutorial = new javax.swing.JComboBox();
        btIniciar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        tfMortesIncial = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMortesFinal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tutoriais");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(23, 49, 106));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/cabeçalho_tutoriais.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Relatório de Mortandade");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mortes de.:");

        jcTutorial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------" }));
        jcTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTutorialActionPerformed(evt);
            }
        });

        btIniciar.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/imprimir.png"))); // NOI18N
        btIniciar.setText("Imprimir");
        btIniciar.setToolTipText("Imprimir");
        btIniciar.setContentAreaFilled(false);
        btIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
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

        try {
            tfMortesIncial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfMortesIncial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMortesIncial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfMortesIncialFocusLost(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecione o Lote Desejado");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Até.:");

        try {
            tfMortesFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfMortesFinal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMortesFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfMortesFinalFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltarMenu)
                        .addGap(61, 61, 61)
                        .addComponent(btIniciar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator18)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfMortesIncial, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMortesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMortesIncial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(tfMortesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btIniciar)
                    .addComponent(btVoltarMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        JasperReport pathjrxml;
        HashMap parametros = new HashMap();
        String sql = "", texto = "";
        if (jcTutorial.getSelectedIndex() != 0) {
            Lote l = loteDAO.pesquisaNome(jcTutorial.getSelectedItem().toString()).get(0);
            sql += "lote.idLote=" + l.getIdLote();            
        }
        if(!tfMortesFinal.getText().equals("  /  /    ")){
            if(!sql.equals("")){
                sql += " and";
            }
            
            String dataInicial = "", dataFinal = "";
            try {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date data = new java.sql.Date(format.parse(tfMortesIncial.getText()).getTime());
                dataInicial = String.valueOf(data);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            try {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date data = new java.sql.Date(format.parse(tfMortesFinal.getText()).getTime());
                dataFinal = String.valueOf(data);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            
            sql+= " mortandade.dataMortandade between '"+dataInicial+" 00:00:00'"+" and '"+dataFinal+" 23:59:59"+"'";
        }
        
        
        if(!sql.equals("")){
            sql += " order by lote.nomeLote";
        }
        parametros.put("texto", sql);

        Connection connection = new ConnectionFactory().getConnection();

        try {
            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório", true);
            viewer.setSize(1000, 600);
            viewer.setLocationRelativeTo(null);
            viewer.setModal(true);
            pathjrxml = JasperCompileManager.compileReport("src/techpesc/relatorio/RelatorioMortandade.jrxml");
            JasperPrint printReport = JasperFillManager.fillReport(pathjrxml, parametros,
                    connection);
            JasperViewer jv = new JasperViewer(printReport, false);
            viewer.getContentPane().add(jv.getContentPane());
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btIniciarActionPerformed

    private void jcTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTutorialActionPerformed

    }//GEN-LAST:event_jcTutorialActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed

        dispose();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void tfMortesIncialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMortesIncialFocusLost

    }//GEN-LAST:event_tfMortesIncialFocusLost

    private void tfMortesFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMortesFinalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMortesFinalFocusLost

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
            java.util.logging.Logger.getLogger(TelaRelatorioMortandade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioMortandade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioMortandade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioMortandade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioMortandade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JComboBox jcTutorial;
    private javax.swing.JFormattedTextField tfMortesFinal;
    private javax.swing.JFormattedTextField tfMortesIncial;
    // End of variables declaration//GEN-END:variables
}
