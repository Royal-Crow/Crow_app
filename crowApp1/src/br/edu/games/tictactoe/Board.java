package br.edu.games.tictactoe;

import br.edu.screens.TelaInicial;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Board extends javax.swing.JFrame implements ActionListener{
    protected String currentPlayer = "X";
    protected Result result = Result.UNDEFINED;
    private int qttOfMoves = 0;
    private boolean onGame = true;
    protected int xCount = 0;
    protected int oCount = 0;
    
    final private ArrayList<JButton> line1;
    final private ArrayList<JButton> line2;
    final private ArrayList<JButton> line3;
    final private ArrayList<ArrayList<JButton>> matrice;
    
    public Board() {
        initComponents();
        line1 = new ArrayList<>(Arrays.asList(button1, button2, button3));
        line2 = new ArrayList<>(Arrays.asList(button4, button5, button6));
        line3 = new ArrayList<>(Arrays.asList(button7, button8, button9));
        matrice = new ArrayList<>(Arrays.asList(line1, line2, line3));
        
        for (ArrayList<JButton> line : matrice) {
            for (JButton btt : line) {
                btt.addActionListener(this);
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ttt");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(9, 24, 107));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("X'S TURN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(326, 326, 326))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(titleLabel)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        button1.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button3.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button4.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button2.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button6.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button7.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button8.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button5.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        button9.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        buttonExit.setBackground(new java.awt.Color(153, 0, 0));
        buttonExit.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        buttonExit.setText("EXIT");
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttExitClicked(evt);
            }
        });

        buttonClear.setBackground(new java.awt.Color(0, 153, 204));
        buttonClear.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        buttonClear.setText("CLEAR");
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttClearClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("X:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("O:");

        xScore.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        xScore.setForeground(new java.awt.Color(30, 50, 165));
        xScore.setText("0");

        oScore.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        oScore.setForeground(new java.awt.Color(30, 50, 165));
        oScore.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xScore)
                    .addComponent(oScore))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oScore))
                .addGap(53, 53, 53))
        );

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jButton1.setText("NEW GAME");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttNewgameClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGap(24, 24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void editGameScore() {
        xScore.setText(String.format("%d", xCount));
        oScore.setText(String.format("%d", oCount));
    }
    
    private void clearMatrice() {
        for (ArrayList<JButton> line : matrice) {
            for (JButton tile : line) {
                tile.setBackground(Color.LIGHT_GRAY);
                tile.setText("");
                tile.setForeground(Color.BLACK);
            }
        }
    }
    
    private boolean isPlayerX() {
        return currentPlayer.equals("X");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (onGame) {
            JButton tile = null;
            boolean checker = true;
            for (ArrayList<JButton> line : matrice) {
                if (checker) {
                    for (JButton button : line) {
                        if (e.getSource().equals(button)) {
                            tile = button;
                            checker = false;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            if (tile.getText().isEmpty()) {
                tile.setText(isPlayerX() ? "X" : "O");
                currentPlayer = isPlayerX() ? "O" : "X";
                titleLabel.setText(String.format("%s'S TURN", currentPlayer));
                qttOfMoves += 1;
                if (qttOfMoves >= 5) {
                    ResultChecker.verify(this);
                    if (!result.equals(Result.UNDEFINED)){
                        editGameScore();
                        onGame = false;
                        return;
                    }
                }
                if (qttOfMoves == 9) {
                    result = Result.DRAW;
                    paintDrawBackground();
                    onGame = false;
                    titleLabel.setText("DRAW");
                }
            }
        } 
    }
    
    private void paintDrawBackground() {
        for (ArrayList<JButton> line : matrice) {
            for (JButton tile : line) {
                tile.setBackground(new Color(0xF89494));
            }
        }
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void restartGame() {
        xCount = 0;
        oCount = 0;
        bttClearClicked();
        editGameScore();
    }
    
    private void bttNewgameClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttNewgameClicked
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure? The scoreboard data will be lost",
                "Confirm box", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            restartGame();
        }
    }//GEN-LAST:event_bttNewgameClicked

    private void bttClearClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttClearClicked
        bttClearClicked();
    }//GEN-LAST:event_bttClearClicked

    private void bttClearClicked() {
        clearMatrice();
        titleLabel.setText("X'S TURN");
        currentPlayer = "X";
        result = Result.UNDEFINED;
        qttOfMoves = 0;
        onGame = true;
    }
    
    private void bttExitClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttExitClicked
        this.dispose();
        TelaInicial tl = new TelaInicial();
        tl.setVisible(true);
    }//GEN-LAST:event_bttExitClicked

    
    protected ArrayList<ArrayList<JButton>> getMatrice() {
        return matrice;
    }
    
    protected void setTitleLabelText(String txt) {
        titleLabel.setText(txt);
    }
   
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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel oScore;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables

}
