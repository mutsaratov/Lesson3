package org.example;

import java.util.Scanner;

public class Minesweeper {
    public static void PaintMap(int linesCount, int columnsCount, int minesCount){

        Scanner in = new Scanner(System.in);
        String[][] map = new String[linesCount][columnsCount];

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                map[i][j] = "?";
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }

        int line;
        int column;
        for (int i = 0; i < minesCount; i++) {
            line = in.nextInt() - 1;
            column = in.nextInt() - 1;
            map[line][column] = "*";
        }

        int upperLine;
        int lowerLine;
        int leftColumn;
        int rightColumn;
        int num = 0;
        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (!map[i][j].equals("*")){
                    if (i == 0){
                        upperLine = i;
                        lowerLine = i+1;
                        if (j == 0){
                            leftColumn = j;
                            rightColumn = j+1;
                        } else if (j == columnsCount - 1) {
                            leftColumn = j - 1;
                            rightColumn = j;
                        } else {
                            leftColumn = j - 1;
                            rightColumn = j + 1;
                        }
                    } else if (i == linesCount - 1) {
                        upperLine = i-1;
                        lowerLine = i;
                        if (j == 0){
                            leftColumn = j;
                            rightColumn = j+1;
                        } else if (j == columnsCount - 1) {
                            leftColumn = j - 1;
                            rightColumn = j;
                        } else {
                            leftColumn = j - 1;
                            rightColumn = j + 1;
                        }
                    } else {
                        upperLine = i - 1;
                        lowerLine = i + 1;
                        if (j == 0){
                            leftColumn = j;
                            rightColumn = j+1;
                        } else if (j == columnsCount - 1) {
                            leftColumn = j - 1;
                            rightColumn = j;
                        } else {
                            leftColumn = j - 1;
                            rightColumn = j + 1;
                        }
                    }

                    for (int k = upperLine; k <= lowerLine; k++) {
                        for (int l = leftColumn; l <= rightColumn; l++) {
                            if (map[k][l].equals("*")){
                                num++;
                            }
                        }
                    }
                    map[i][j] = String.valueOf(num);
                    num =0;
                }
            }
        }

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
