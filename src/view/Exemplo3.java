/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class Exemplo3 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo3
     */
    public Exemplo3() {
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

        jBttnMensagem = new javax.swing.JButton();
        jBttnTeimoso = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Exemplo 3");

        jBttnMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/4373217_java_logo_logos_icon (1).png"))); // NOI18N
        jBttnMensagem.setText("Mensagem");
        jBttnMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnMensagemActionPerformed(evt);
            }
        });

        jBttnTeimoso.setText("Teimoso");
        jBttnTeimoso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBttnTeimosoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBttnTeimosoMouseExited(evt);
            }
        });
        jBttnTeimoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnTeimosoActionPerformed(evt);
            }
        });

        jMenu1.setMnemonic('a');
        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('s');
        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(jBttnMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jBttnTeimoso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBttnMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jBttnTeimoso)
                .addGap(61, 61, 61))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBttnMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnMensagemActionPerformed
        JOptionPane.showMessageDialog(null, "Você clicou no botão mensagem.");
    }//GEN-LAST:event_jBttnMensagemActionPerformed

    private void jBttnTeimosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnTeimosoActionPerformed
        JOptionPane.showMessageDialog(null, "Você clicou no botão teimoso.");
    }//GEN-LAST:event_jBttnTeimosoActionPerformed

    private void jBttnTeimosoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBttnTeimosoMouseEntered
        jBttnTeimoso.setBounds(50, 120, 100, 25);
    }//GEN-LAST:event_jBttnTeimosoMouseEntered

    private void jBttnTeimosoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBttnTeimosoMouseExited
        jBttnTeimoso.setBounds(50, 70, 100, 25);
    }//GEN-LAST:event_jBttnTeimosoMouseExited

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
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnMensagem;
    private javax.swing.JButton jBttnTeimoso;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
