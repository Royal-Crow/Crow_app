package br.edu.principal;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

final class ResultChecker {
    ResultChecker() {}

    static void verify(Tictactoe ttt) {
        if (!victoryByLine(ttt)) {
            if (!victoryByColumn(ttt)) {
                if (!victoryByPrincipalD(ttt)) {
                    victoryBySecondaryD(ttt);
                }
            }
        }
    }

    static boolean match(ArrayList<String> moves, Tictactoe ttt) {
        if (Collections.frequency(moves, "X") == 3) {
            ttt.winner = Result.PX;
            ttt.xCount += 1;
            return true;
        } else if (Collections.frequency(moves, "O") == 3) {
            ttt.winner = Result.PO;
            ttt.oCount += 1;
            return true;
        }
        return false;
    }

    static boolean victoryByLine(Tictactoe ttt) {
        for (ArrayList<JButton> line : ttt.getBoard()) {
            ArrayList<String> moves = new ArrayList<>(3);
            for (JButton tile : line) {
                String move = tile.getText();
                if (!move.isEmpty()){
                    moves.add(move);
                }
            }
            if (match(moves, ttt)) {
                for (JButton tile : line) {
                    tile.setBackground(new Color(0xF6E794));
                    tile.setForeground(new Color(0x1F0164));
                }
                return true;
            }
        }
        return false;
    }

    static boolean victoryByColumn(Tictactoe ttt) {
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            ArrayList<String> columnElms = new ArrayList<>();
            for (ArrayList<JButton> line : ttt.getBoard()) {
                JButton tile = line.get(columnIndex);
                String move = tile.getText();
                if (!move.isEmpty()) {
                    columnElms.add(move);
                }
            }
            if (match(columnElms, ttt)) {
                for (ArrayList<JButton> line : ttt.getBoard()) {
                    line.get(columnIndex).setBackground(new Color(0xF6E794));
                    line.get(columnIndex).setForeground(new Color(0x1F0164));
                }
                return true;
            }
        }
        return false;
    }


    static boolean victoryByPrincipalD(Tictactoe ttt) {
        ArrayList<String> moves = new ArrayList<>();
        int tileIndex = 0;
        for (ArrayList<JButton> line : ttt.getBoard()) {
            moves.add(line.get(tileIndex).getText());
            tileIndex+=1;
        }
        if (match(moves, ttt)) {
            tileIndex = 0;
            for (ArrayList<JButton> line : ttt.getBoard()) {
                line.get(tileIndex).setBackground(new Color(0xF6E794));
                line.get(tileIndex).setForeground(new Color(0x1F0164));
                tileIndex+=1;
            }
            return true;
        }
        return false;
    }

    static boolean victoryBySecondaryD(Tictactoe ttt) {
        int tileIndex = 2;
        ArrayList<String> moves = new ArrayList<>();
        for (ArrayList<JButton> line : ttt.getBoard()) {
            moves.add(line.get(tileIndex).getText());
            tileIndex-=1;
        }
        if (match(moves, ttt)) {
            tileIndex = 2;
            for (ArrayList<JButton> line : ttt.getBoard()) {
                line.get(tileIndex).setBackground(new Color(0xF6E794));
                line.get(tileIndex).setForeground(new Color(0x1F0164));
                tileIndex-=1;
            }
            return true;
        }
        return false;
    }

}
