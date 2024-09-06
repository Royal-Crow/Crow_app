package br.edu.principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.Border;
import static br.edu.principal.BoardOperator.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class KnuckleBones extends javax.swing.JFrame implements ActionListener{
    protected JLabel dice;
    protected ImageIcon redFace;
    private boolean wasStarted = false;
    protected boolean wasFinished = false;
    protected boolean isRolling;
    protected JLabel player;
    protected int diceValueIndex = 0;
    protected int qttPlaysB = 0;
    protected int qttPlaysA = 0;
    protected BoardOperator op = new BoardOperator(this);
    
    protected ArrayList<ArrayList<JButton>> columnsA = new ArrayList<>();
    protected ArrayList<ArrayList<JButton>> columnsB = new ArrayList<>();
    protected ArrayList<JLabel> scoresA = new ArrayList<>();
    protected ArrayList<JLabel> scoresB = new ArrayList<>();
    protected int sumOfA;
    protected int sumOfB;
    private ArrayList<String> dicesPaths = new ArrayList<>(List.of(
    "images/dado1.png", "images/dado2.png", "images/dado3.png", "images/dado4.png",
    "images/dado5.png", "images/dado6.png"));
    
    protected ArrayList<ImageIcon> faces = new ArrayList<>();
    protected Border compoundBorder = BorderFactory.createCompoundBorder(
    BorderFactory.createLineBorder(Color.RED, 3), BorderFactory.createLoweredBevelBorder());
    protected Border lbBorder = BorderFactory.createLoweredBevelBorder();
    
    public KnuckleBones() throws IOException {
        initComponents();
        dice = PlayerB;
        player = PlayerB;
        redFace = new ImageIcon(ImageIO.read(new File("images/dadoV.png")));
        columnsA.add(new ArrayList<>(List.of(bttA1, bttA4, bttA7)));
        columnsA.add(new ArrayList<>(List.of(bttA2, bttA5, bttA8)));
        columnsA.add(new ArrayList<>(List.of(bttA3, bttA6, bttA9)));
        columnsB.add(new ArrayList<>(List.of(bttB1, bttB4, bttB7)));
        columnsB.add(new ArrayList<>(List.of(bttB2, bttB5, bttB8)));
        columnsB.add(new ArrayList<>(List.of(bttB3, bttB6, bttB9)));
        scoresA.add(scoreA1);
        scoresA.add(scoreA2);
        scoresA.add(scoreA3);
        scoresB.add(scoreB1);
        scoresB.add(scoreB2);
        scoresB.add(scoreB3);
       for (ArrayList<JButton> column : columnsA) {
           for (JButton btt : column) {
               btt.addActionListener(this);
           }
       }
       for (ArrayList<JButton> column : columnsB) {
           for (JButton btt : column) {
               btt.addActionListener(this);
           }
       }
       for (String pathDice : dicesPaths) {
            BufferedImage img = ImageIO.read(new File(pathDice));
            ImageIcon face = new ImageIcon(img);
            faces.add(face);
       }
       this.getContentPane().setBackground(Color.GRAY);
       bttNewgame.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttA1 = new javax.swing.JButton();
        bttA4 = new javax.swing.JButton();
        bttA7 = new javax.swing.JButton();
        bttA2 = new javax.swing.JButton();
        bttA5 = new javax.swing.JButton();
        bttA8 = new javax.swing.JButton();
        bttA6 = new javax.swing.JButton();
        bttA3 = new javax.swing.JButton();
        bttA9 = new javax.swing.JButton();
        bttB1 = new javax.swing.JButton();
        bttB4 = new javax.swing.JButton();
        bttB7 = new javax.swing.JButton();
        bttB2 = new javax.swing.JButton();
        bttB5 = new javax.swing.JButton();
        bttB8 = new javax.swing.JButton();
        bttB6 = new javax.swing.JButton();
        bttB3 = new javax.swing.JButton();
        bttB9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttNewgame = new javax.swing.JButton();
        bttExit = new javax.swing.JButton();
        bttStart = new javax.swing.JButton();
        PlayerA = new javax.swing.JLabel();
        PlayerB = new javax.swing.JLabel();
        scoreA3 = new javax.swing.JLabel();
        scoreA1 = new javax.swing.JLabel();
        scoreA2 = new javax.swing.JLabel();
        scoreB1 = new javax.swing.JLabel();
        scoreB2 = new javax.swing.JLabel();
        scoreB3 = new javax.swing.JLabel();
        finalScoreB = new javax.swing.JLabel();
        finalScoreA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KnuckleBones");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        bttA1.setFocusable(false);

        bttA4.setFocusable(false);

        bttA7.setFocusable(false);

        bttA2.setFocusable(false);

        bttA5.setFocusable(false);

        bttA8.setFocusable(false);

        bttA6.setFocusable(false);

        bttA3.setFocusable(false);

        bttA9.setFocusable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\TRABALHOS_POO\\teste\\KnuckleBones\\images\\corvo.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\TRABALHOS_POO\\teste\\KnuckleBones\\images\\r2d2.png")); // NOI18N

        bttNewgame.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttNewgame.setText("NEW GAME");
        bttNewgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttNewgameClicked(evt);
            }
        });

        bttExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttExit.setText("EXIT");
        bttExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttExitClicked(evt);
            }
        });
        bttExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExitActionPerformed(evt);
            }
        });

        bttStart.setBackground(new java.awt.Color(204, 0, 0));
        bttStart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttStart.setForeground(new java.awt.Color(255, 255, 255));
        bttStart.setText("Start");
        bttStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttStartMouseClicked(evt);
            }
        });

        PlayerA.setIcon(new javax.swing.ImageIcon("C:\\TRABALHOS_POO\\teste\\KnuckleBones\\images\\dado1.png")); // NOI18N
        PlayerA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        PlayerB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PlayerB.setForeground(new java.awt.Color(204, 0, 0));
        PlayerB.setIcon(new javax.swing.ImageIcon("C:\\TRABALHOS_POO\\teste\\TesteK\\images\\dado1.png")); // NOI18N
        PlayerB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        scoreA3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        scoreA3.setText("0");

        scoreA1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        scoreA1.setText("0");

        scoreA2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        scoreA2.setText("0");

        scoreB1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        scoreB1.setText("0");

        scoreB2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        scoreB2.setText("0");

        scoreB3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        scoreB3.setText("0");

        finalScoreB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        finalScoreB.setForeground(new java.awt.Color(255, 255, 255));
        finalScoreB.setText("0");
        finalScoreB.setEnabled(false);

        finalScoreA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        finalScoreA.setForeground(new java.awt.Color(255, 255, 255));
        finalScoreA.setText("0");
        finalScoreA.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(finalScoreB)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bttB4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttB7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bttB8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bttB9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bttB1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bttB2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bttB5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bttB6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttB3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bttA5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttA1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bttA2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttA6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttA3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bttA4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bttA7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bttA8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bttStart)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(scoreA1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(scoreB1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(scoreB2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(scoreA2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bttA9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(scoreA3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scoreB3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttExit)
                            .addComponent(bttNewgame))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PlayerA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(finalScoreA)
                                .addGap(53, 53, 53))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttA1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttA2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttA3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttA4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttA5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttA6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttA7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttA8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttA9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scoreA2)
                            .addComponent(scoreA3)
                            .addComponent(scoreA1))
                        .addGap(33, 33, 33)
                        .addComponent(bttStart)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(scoreB1)
                                .addComponent(finalScoreB))
                            .addComponent(scoreB2)
                            .addComponent(scoreB3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bttB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttB2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PlayerB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttB6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bttB4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bttB5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bttB7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttB8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttB9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayerA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(finalScoreA)
                        .addGap(207, 207, 207)
                        .addComponent(bttNewgame, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    protected boolean isPlayerB() {
        return player.equals(PlayerB);
    }
    
    public JLabel getDice() {
        return dice;
    }

    public int getDiceValueIndex() {
        return diceValueIndex;
    }

    public ArrayList<ArrayList<JButton>> getColumnsA() {
        return columnsA;
    }

    public ArrayList<ArrayList<JButton>> getColumnsB() {
        return columnsB;
    }

    public JLabel getPlayerA() {
        return PlayerA;
    }

    public JLabel getPlayerB() {
        return PlayerB;
    }
    
    
    protected boolean isFilled() {
        return qttPlaysB == 9 || qttPlaysA == 9;
    }
    
    protected void displayScoreBoard(int scoreB, int scoreA) {
        if (scoreB > scoreA) {
            JOptionPane.showMessageDialog(null, "CROW WINS!!", "Result", JOptionPane.INFORMATION_MESSAGE);
            finalScoreB.setForeground(new Color(0x07FA13));
            finalScoreA.setForeground(new Color(0xFA8407));
        } else if (scoreA > scoreB) {
            JOptionPane.showMessageDialog(null, "R2D2 WINS!!", "Result", JOptionPane.INFORMATION_MESSAGE);
            finalScoreA.setForeground(new Color(0x07FA13));
            finalScoreB.setForeground(new Color(0xFA8407));
        } else {
            JOptionPane.showMessageDialog(null, "DRAW!!", "Result", JOptionPane.INFORMATION_MESSAGE);
            finalScoreB.setForeground(Color.YELLOW);
            finalScoreA.setForeground(Color.YELLOW);
        }
        finalScoreB.setEnabled(true);
        finalScoreA.setEnabled(true);
        finalScoreB.setText(String.valueOf(scoreB));
        finalScoreA.setText(String.valueOf(scoreA));
        bttNewgame.setVisible(true);
    }
 
    protected void rollDice() {
        isRolling = true;
        Random random = new Random();
        int randomIndex = random.nextInt(faces.size());
        diceValueIndex = randomIndex;
        dice.setBorder(compoundBorder);
        ActionListener taskPerformer = new ActionListener() {
            int index = 0;
            int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == 19) {
                    dice.setIcon(faces.get(randomIndex));
                    ((Timer) e.getSource()).stop();
                    isRolling = false;
                } else if (index < faces.size()) {
                    dice.setIcon(faces.get(index));
                    index++;
                } else {
                    index = 0;
                }
                count++;
            }
            
        };
        Timer timer = new Timer(200, taskPerformer);
        timer.start();
    }
    
    private void bttStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttStartMouseClicked
        bttStart.setVisible(false);
        wasStarted = true;
        rollDice();
    }//GEN-LAST:event_bttStartMouseClicked

    private void bttNewgameClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttNewgameClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bttNewgameClicked

    private void bttExitClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttExitClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bttExitClicked

    private void bttExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttExitActionPerformed

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!wasStarted || isRolling || wasFinished) return;
        if (((JButton)e.getSource()).getIcon() != null) return;
        op.play(e);
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
            java.util.logging.Logger.getLogger(KnuckleBones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KnuckleBones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KnuckleBones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnuckleBones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KnuckleBones().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(KnuckleBones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlayerA;
    private javax.swing.JLabel PlayerB;
    private javax.swing.JButton bttA1;
    private javax.swing.JButton bttA2;
    private javax.swing.JButton bttA3;
    private javax.swing.JButton bttA4;
    private javax.swing.JButton bttA5;
    private javax.swing.JButton bttA6;
    private javax.swing.JButton bttA7;
    private javax.swing.JButton bttA8;
    private javax.swing.JButton bttA9;
    private javax.swing.JButton bttB1;
    private javax.swing.JButton bttB2;
    private javax.swing.JButton bttB3;
    private javax.swing.JButton bttB4;
    private javax.swing.JButton bttB5;
    private javax.swing.JButton bttB6;
    private javax.swing.JButton bttB7;
    private javax.swing.JButton bttB8;
    private javax.swing.JButton bttB9;
    private javax.swing.JButton bttExit;
    private javax.swing.JButton bttNewgame;
    private javax.swing.JButton bttStart;
    private javax.swing.JLabel finalScoreA;
    private javax.swing.JLabel finalScoreB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel scoreA1;
    private javax.swing.JLabel scoreA2;
    private javax.swing.JLabel scoreA3;
    private javax.swing.JLabel scoreB1;
    private javax.swing.JLabel scoreB2;
    private javax.swing.JLabel scoreB3;
    // End of variables declaration//GEN-END:variables

}
