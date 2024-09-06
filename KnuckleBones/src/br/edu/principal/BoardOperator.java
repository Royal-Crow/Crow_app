package br.edu.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;


public class BoardOperator {
    private final KnuckleBones game;
    
    protected BoardOperator(KnuckleBones game) {
        this.game = game;
    }
    
    private void performRedDiceAnimation(ArrayList<JButton> tiles, ImageIcon normalFace) {
        if (tiles.isEmpty()) return;
        ActionListener task = new ActionListener() {
            boolean isRed = false;
            int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton tile : tiles) {
                    if (!isRed) {
                        tile.setIcon(game.redFace);
                    } else {
                        tile.setIcon(normalFace);
                    }
                }
                isRed = isRed == false;
                count++;
                if (count == 6) {
                    for (JButton tile : tiles) {
                        tile.setIcon(null);
                    }   
                    ((Timer) e.getSource()).stop();
                }  
            }
        };
        Timer timer = new Timer(250, task);
        timer.start();
    }
    
    private void verify(ImageIcon newFace, int clmIndex) {
        ArrayList<JButton> opnTiles = new ArrayList<>();
        for (JButton opnTile : game.isPlayerB() ? game.columnsA.get(clmIndex) : game.columnsB.get(clmIndex)) {
            if (opnTile.getIcon() == null) continue;
            if (opnTile.getIcon().equals(game.player.getIcon())) {
                opnTiles.add(opnTile);
            }
        }
        toScore(clmIndex, newFace);
        if (isFinished()) {
            game.wasFinished = true;
            return;
        }
        toDeduct(clmIndex, opnTiles.size());
//        if (isFinished()) {
//            game.wasFinished = true;
//            return;
//        }
        performRedDiceAnimation(opnTiles, newFace);
    }
    
    private void toScore(int clmIndex, ImageIcon newFace) {
        int newFaceValue = game.faces.indexOf(newFace) + 1;
        int expoent = 0;
        JLabel clmScore = game.isPlayerB() ? game.scoresB.get(clmIndex) : game.scoresA.get(clmIndex);
        int currValue = Integer.parseInt(clmScore.getText());
        for (JButton tile : game.isPlayerB() ? game.columnsB.get(clmIndex) : game.columnsA.get(clmIndex)) {
            if (tile.getIcon() == null) continue;
            if (tile.getIcon().equals(newFace)) {
                expoent += 1;
            } 
        }
        if (newFaceValue == 1) {
            clmScore.setText(String.valueOf(currValue + 1));
            return;
        }
        if (expoent == 1) {
            clmScore.setText(String.valueOf(currValue + (int)Math.pow(newFaceValue, expoent)));
            return;
        }
        if (expoent == 3) {
            clmScore.setText(String.valueOf((int)Math.pow(newFaceValue, expoent)));
            return;
        }
        clmScore.setText(String.valueOf(currValue + (int)Math.pow(newFaceValue, expoent) - (newFaceValue * (expoent - 1))));
    }
    
    private void toDeduct(int clmIndex, int removedTilesQtt) {
        if (removedTilesQtt == 0) return;
        JLabel clmScore;
        int currScoreValue;
        int diceValue = game.diceValueIndex + 1;
        if (game.isPlayerB()) {
            game.qttPlaysA -= removedTilesQtt;
            System.out.println("qttPlaysA - : " + game.qttPlaysA);
            clmScore = game.scoresA.get(clmIndex);
            currScoreValue = Integer.parseInt(clmScore.getText());
            if (currScoreValue == 1) {
                clmScore.setText(String.valueOf(currScoreValue - diceValue * removedTilesQtt));
                return;
            }
            clmScore.setText(String.valueOf((int) (currScoreValue - Math.pow(diceValue, removedTilesQtt))));
        } else {
            game.qttPlaysB -= removedTilesQtt;
            System.out.println("qttPlaysB - : " + game.qttPlaysB);
            clmScore = game.scoresB.get(clmIndex);
            currScoreValue = Integer.parseInt(clmScore.getText());
            if (currScoreValue == 1) {
                clmScore.setText(String.valueOf(currScoreValue - diceValue * removedTilesQtt));
                return;
            }
            clmScore.setText(String.valueOf((int) (currScoreValue - Math.pow(diceValue, removedTilesQtt))));
        }
    }
    
    private boolean isFinished() {
        if (!game.isFilled()) return false;
        int playerBResult = 0;
        int playerAResult = 0;
        for (JLabel scr : game.scoresA) {
            playerAResult += Integer.parseInt(scr.getText());
        }
        for(JLabel scr : game.scoresB) {
            playerBResult += Integer.parseInt(scr.getText());
        }
        game.displayScoreBoard(playerBResult, playerAResult);
        return true;
    }
    
    protected void play(ActionEvent e) {
        int clmIndex = 0;
        ImageIcon newFace = game.faces.get(game.diceValueIndex);
        for (ArrayList<JButton> clm : game.isPlayerB() ? game.columnsB : game.columnsA) {
            for (JButton tile : clm) {
                if (e.getSource().equals(tile)) {
                    if (game.isPlayerB()) {
                        game.qttPlaysB++;
                        System.out.println("qttPlaysB +: " + game.qttPlaysB);
                    } else {
                        game.qttPlaysA++;
                        System.out.println("qttPlaysA +: " + game.qttPlaysA);
                    }
                    tile.setIcon(newFace);
                    verify(newFace, clmIndex);
                    if (game.wasFinished) {
                        return;
                    }
                    game.dice.setBorder(game.lbBorder);
                    game.player = game.player.equals(game.getPlayerA()) ? game.getPlayerB() : game.getPlayerA();
                    game.dice = game.dice.equals(game.getPlayerA()) ? game.getPlayerB() : game.getPlayerA();
                    game.rollDice();
                    break;
                }
            }
            clmIndex++;
        }
    }
 
    
}
