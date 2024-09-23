package br.edu.games.knuckleb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;


public class BoardOperator {
    private final Board game;
    
    protected BoardOperator(Board game) {
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
                        tile.setIcon(game.getRedface());
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
        for (JButton opnTile : game.isPlayerB() ? game.getColumnsA().get(clmIndex) : game.getColumnsB().get(clmIndex)) {
            if (opnTile.getIcon() == null) continue;
            if (opnTile.getIcon().equals(game.getPlayer().getIcon())) {
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
        int newFaceValue = game.getFaces().indexOf(newFace) + 1;
        int expoent = 0;
        JLabel clmScore = game.isPlayerB() ? game.getScoresB().get(clmIndex) : game.getScoresA().get(clmIndex);
        int currValue = Integer.parseInt(clmScore.getText());
        for (JButton tile : game.isPlayerB() ? game.getColumnsB().get(clmIndex) : game.getColumnsA().get(clmIndex)) {
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
        int diceValue = game.getDiceValueIndex() + 1;
        if (game.isPlayerB()) {
            game.qttPlaysA -= removedTilesQtt;
            clmScore = game.getScoresA().get(clmIndex);
            currScoreValue = Integer.parseInt(clmScore.getText());
            if (currScoreValue == 1) {
                clmScore.setText(String.valueOf(currScoreValue - diceValue * removedTilesQtt));
                return;
            }
            clmScore.setText(String.valueOf((int) (currScoreValue - Math.pow(diceValue, removedTilesQtt))));
        } else {
            game.qttPlaysB -= removedTilesQtt;
            clmScore = game.getScoresB().get(clmIndex);
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
        for (JLabel scr : game.getScoresA()) {
            playerAResult += Integer.parseInt(scr.getText());
        }
        for(JLabel scr : game.getScoresB()) {
            playerBResult += Integer.parseInt(scr.getText());
        }
        game.displayScoreBoard(playerBResult, playerAResult);
        return true;
    }
    
    protected void play(ActionEvent e) {
        int clmIndex = 0;
        ImageIcon newFace = game.getFaces().get(game.getDiceValueIndex());
        for (ArrayList<JButton> clm : game.isPlayerB() ? game.getColumnsB() : game.getColumnsA()) {
            for (JButton tile : clm) {
                if (e.getSource().equals(tile)) {
                    if (game.isPlayerB()) {
                        game.qttPlaysB++;
                    } else {
                        game.qttPlaysA++;
                    }
                    tile.setIcon(newFace);
                    verify(newFace, clmIndex);
                    if (game.wasFinished) {
                        return;
                    }
                    game.getDice().setBorder(game.lbBorder);
                    game.setPlayer(game.player.equals(game.getPlayerA()) ? game.getPlayerB() : game.getPlayerA());
                    game.setDice(game.dice.equals(game.getPlayerA()) ? game.getPlayerB() : game.getPlayerA());
                    game.rollDice();
                    break;
                }
            }
            clmIndex++;
        }
    }
 
    
}
