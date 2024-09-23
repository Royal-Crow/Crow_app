package br.edu.games.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;


final class ResultChecker {
    private ResultChecker() {}

    protected static void verify(Board board) {
        if (!victoryByLine(board)) {
            if (!victoryByColumn(board)) {
                if (!victoryByPrincipalD(board)) {
                    victoryBySecondaryD(board);
                }
            }
        }
    }

    private static boolean match(ArrayList<String> moves, Board board) {
        if (Collections.frequency(moves, "X") == 3) {
            board.result = Result.PX;
            board.setTitleLabelText("X WINS !!");
            board.xCount += 1;
            return true;
        } else if (Collections.frequency(moves, "O") == 3) {
            board.result = Result.PO;
            board.setTitleLabelText("O WINS !!");
            board.oCount += 1;
            return true;
        }
        return false;
    }

    private static boolean victoryByLine(Board board) {
        for (ArrayList<JButton> line : board.getMatrice()) {
            ArrayList<String> moves = new ArrayList<>(3);
            for (JButton tile : line) {
                String move = tile.getText();
                if (!move.isEmpty()){
                    moves.add(move);
                }
            }
            if (match(moves, board)) {
                for (JButton tile : line) {
                    tile.setBackground(new Color(0xF6E794));
                    tile.setForeground(new Color(0x1F0164));
                }
                return true;
            }
        }
        return false;
    }

    private static boolean victoryByColumn(Board board) {
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            ArrayList<String> columnElms = new ArrayList<>();
            for (ArrayList<JButton> line : board.getMatrice()) {
                JButton tile = line.get(columnIndex);
                String move = tile.getText();
                if (!move.isEmpty()) {
                    columnElms.add(move);
                }
            }
            if (match(columnElms, board)) {
                for (ArrayList<JButton> line : board.getMatrice()) {
                    line.get(columnIndex).setBackground(new Color(0xF6E794));
                    line.get(columnIndex).setForeground(new Color(0x1F0164));
                }
                return true;
            }
        }
        return false;
    }


    private static boolean victoryByPrincipalD(Board board) {
        ArrayList<String> moves = new ArrayList<>();
        int tileIndex = 0;
        for (ArrayList<JButton> line : board.getMatrice()) {
            moves.add(line.get(tileIndex).getText());
            tileIndex+=1;
        }
        if (match(moves, board)) {
            tileIndex = 0;
            for (ArrayList<JButton> line : board.getMatrice()) {
                line.get(tileIndex).setBackground(new Color(0xF6E794));
                line.get(tileIndex).setForeground(new Color(0x1F0164));
                tileIndex+=1;
            }
            return true;
        }
        return false;
    }

    private static boolean victoryBySecondaryD(Board board) {
        int tileIndex = 2;
        ArrayList<String> moves = new ArrayList<>();
        for (ArrayList<JButton> line : board.getMatrice()) {
            moves.add(line.get(tileIndex).getText());
            tileIndex-=1;
        }
        if (match(moves, board)) {
            tileIndex = 2;
            for (ArrayList<JButton> line : board.getMatrice()) {
                line.get(tileIndex).setBackground(new Color(0xF6E794));
                line.get(tileIndex).setForeground(new Color(0x1F0164));
                tileIndex-=1;
            }
            return true;
        }
        return false;
    }

}
