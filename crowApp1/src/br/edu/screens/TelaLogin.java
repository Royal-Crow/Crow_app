
package br.edu.screens;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelLogin = new javax.swing.JLabel();
        TextFieldLogin = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        PasswordFieldSenha = new javax.swing.JPasswordField();
        ButtonLimpar = new javax.swing.JButton();
        ButtonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/IconProteção.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        LabelLogin.setText("Login");

        TextFieldLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldLoginKeyPressed(evt);
            }
        });

        LabelSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        LabelSenha.setText("Senha");

        PasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldSenhaKeyPressed(evt);
            }
        });

        ButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/IconeVassoura.png"))); // NOI18N
        ButtonLimpar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ButtonLimparFocusGained(evt);
            }
        });
        ButtonLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLimparMouseEntered(evt);
            }
        });
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        ButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/IconOK.png"))); // NOI18N
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });
        ButtonOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonOKKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(PasswordFieldSenha))
                    .addComponent(ButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(ButtonOK)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonOK))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    protected String Usuario = "Jubileu";
    protected String Senha = "1234";  
    
    private void ButtonLimparFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ButtonLimparFocusGained
        
    }//GEN-LAST:event_ButtonLimparFocusGained

    private void ButtonLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLimparMouseEntered
        
    }//GEN-LAST:event_ButtonLimparMouseEntered

    private void TextFieldLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        PasswordFieldSenha.requestFocus();
        }
    }//GEN-LAST:event_TextFieldLoginKeyPressed

    private void PasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        ButtonOK.requestFocus();
        }    }//GEN-LAST:event_PasswordFieldSenhaKeyPressed

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        String user = TextFieldLogin.getText();
        String senha = String.valueOf(PasswordFieldSenha.getPassword());
        if(user.equals(Usuario) && senha.equals(Senha)){
            JOptionPane.showMessageDialog(null,"Login efetuado com sucesso");
            TelaInicial ti = new TelaInicial();
            this.dispose();
            ti.setVisible(true);
        }
        else{
            TextFieldLogin.setText("");
            PasswordFieldSenha.setText("");
            JOptionPane.showMessageDialog(this, "Email ou Senha incorretos, tente novamente");
        }
    }//GEN-LAST:event_ButtonOKActionPerformed

    private void ButtonOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonOKKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String user = TextFieldLogin.getText();
        String senha = String.valueOf(PasswordFieldSenha.getPassword());
        if(user.equals(Usuario) && senha.equals(Senha)){
            JOptionPane.showMessageDialog(null,"Login efetuado com sucesso");
            TelaInicial ti = new TelaInicial();
            this.dispose();
            ti.setVisible(true);
        }
        else{
            TextFieldLogin.setText("");
            PasswordFieldSenha.setText("");
            JOptionPane.showMessageDialog(this, "Email ou Senha incorretos, tente novamente");
        }
        }
    }//GEN-LAST:event_ButtonOKKeyPressed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        TextFieldLogin.setText("");
        PasswordFieldSenha.setText("");
    }//GEN-LAST:event_ButtonLimparActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonOK;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JPasswordField PasswordFieldSenha;
    private javax.swing.JTextField TextFieldLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
